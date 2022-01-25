package intidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	
	private Date parcela;
	private Double motante;
	
	private static SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcela() {
		
	}
	
	public Parcela(Date parcela, Double motante) {
		this.parcela = parcela;
		this.motante = motante;
	}

	public Date getParcela() {
		return parcela;
	}

	public void setParcela(Date parcela) {
		this.parcela = parcela;
	}

	public Double getMotante() {
		return motante;
	}

	public void setMotante(Double motante) {
		this.motante = motante;
	}

	@Override
	public String toString() {
		return simple.format(parcela) + " motante: " + this.motante;
	}
	
}
