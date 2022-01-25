package services;

public class PaypalServices implements OnlinePaymentServices {

	
	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	
	@Override
	public double payment(double amount) {
		// TODO Auto-generated method stub
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interset(double amount, int months) {
		// TODO Auto-generated method stub
		return amount * months * MONTHLY_INTEREST;
	}
	
	

}
