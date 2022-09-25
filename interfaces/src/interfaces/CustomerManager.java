package interfaces;

public class CustomerManager {
	iCustomerDal customerDal;
	public CustomerManager(iCustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		//iş kodları yazılır
		customerDal.add();
	}
}
