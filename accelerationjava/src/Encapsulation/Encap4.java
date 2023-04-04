package Encapsulation;

class Account {

	private long acc_no;

	private float amount;

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}

public class Encap4 {

	public static void main(String[] args) {

		Account acc = new Account();

		System.out.println(acc.getAcc_no());

		System.out.println(acc.getAmount());

		acc.setAcc_no(7560504000L);

		acc.setAmount(500000f);

		System.out.println(acc.getAcc_no());

		System.out.println(acc.getAmount());

	}

}
