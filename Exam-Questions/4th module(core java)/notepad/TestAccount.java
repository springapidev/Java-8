public class TestAccount{


public static void main(String[]args){

	/*Accounts account=new Accounts();*/

		/*account.setAccountNo(1001);
		account.setTitle("xyz....");
		account.setAmount(5000.00);*/

	Accounts account=new Accounts(1020,"Reza",5000);
		account.getAccountDetail();
		account.deposite(5050);
		account.getAccountDetail();

System.out.println(account.getAccountNo()+","+account.getTitle()+","+account.getAmount());
	}

}