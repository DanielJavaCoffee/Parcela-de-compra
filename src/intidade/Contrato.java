package intidade;

import java.util.ArrayList;
import java.util.Date;

public class Contrato {
	
	private Integer numero;
	private Date data;
	private Double totalValor;
	
	private ArrayList<Parcela> parcelas = new ArrayList<>();
	
	public Contrato() {
		
	}
	public Contrato(Integer numero, Date data, Double totalValor) {
		
		this.numero = numero;
		this.data = data;
		this.totalValor = totalValor;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getTotalValor() {
		return totalValor;
	}
	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}
	public ArrayList<Parcela> getParcelas() {
		return parcelas;
	}	
}
