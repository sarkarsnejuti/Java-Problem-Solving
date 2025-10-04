package Abstraction;

public class mainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new HDFCBank();
		b1.bankName("HDFC");
		System.out.println("Interest's of Hdfc bank is :" +b1.calculateInterest(20000));
		Bank b2 = new PUNBank();
		b2.bankName("Pubjab Bank");
		System.out.println("Interest of Punjab bank is: " +b2.calculateInterest(20000));
		Bank b3 = new INDIANBank();
		b3.bankName("Indian Bank");
		System.out.println("Interest of Indian bank is: " +b3.calculateInterest(20000));
		
	}
}
