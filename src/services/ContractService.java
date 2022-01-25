package services;

import java.util.Calendar;
import java.util.Date;

import intidade.Contrato;
import intidade.Parcela;

public class ContractService {
	
	private OnlinePaymentServices onlinePaymentServices;
	
	public ContractService(OnlinePaymentServices onlinePaymentServices) {
		this.onlinePaymentServices = onlinePaymentServices;
	}
	
	public void processContract(Contrato contrato, int months) {
		double basicQuota = contrato.getTotalValor() / months;
		for(int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + onlinePaymentServices.interset(basicQuota, i);
			
			double fullQuota = updatedQuota + onlinePaymentServices.payment(updatedQuota);
			Date dueDate = addMonths(contrato.getData(), i);
			contrato.getParcelas().add(new Parcela(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date data, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(calendar.MONTH, N);
		return calendar.getTime();
	}

}
