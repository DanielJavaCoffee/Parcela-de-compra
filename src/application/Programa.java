package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import intidade.Contrato;
import intidade.Parcela;
import services.ContractService;
import services.PaypalServices;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		
		
		
		Scanner leitor = new Scanner(System.in);
		SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("entre com os dados:");
		System.out.println("numero do contrato:");
		int numero = Integer.parseInt(leitor.nextLine());
		System.out.println("Data: ");
		Date data = simple.parse(leitor.nextLine());
		System.out.println("Valor do contrato:");
		double valor = Double.parseDouble(leitor.nextLine());
		System.out.println("numero de parcelas: ");
		int parcela = Integer.parseInt(leitor.nextLine());

		Contrato contrato = new Contrato(parcela, data, valor);
		
		ContractService cs = new ContractService(new PaypalServices());
		
		cs.processContract(contrato, parcela);
		
		for(Parcela p: contrato.getParcelas()) {
			System.out.println(p);
		}
	}

}
