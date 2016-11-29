public class Account {

	private String id = new String;
	private String name = new String;
	private int balance = 0;
	
	public Account(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getID(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public int credit(int amount){
		System.out.println(balance"\n");
		balance = balance + amount;
		return this.balance;
	}
	
	public void debit(int amount){
		if(amount <= balance){
			balance = balance - amount;
		} else {
			System.out.println("Amount exceeds balance!");
		}
		return balance;
	}
	
	public void transferTo(Account another, int amount){
		if(amount <= balance){
			balance = balance - amount;
			another = another + amount;
		} else {
			System.out.println("Amount exceeds balance!");
		}
		return balance;
	}
	
	public String toString(){
		return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
	}
	
	
}