package atminter;
import java.util.Scanner;
public class ATMInterface{
	private int balance;
	private int pin;
	
	public ATMInterface(int balance, int pin){ 
		this.balance = balance;
		this.pin = pin;
	}
	
	public void menuDisplay() {
		System.out.println("  ATM INTERFACE ");
		System.out.println("1. Check Balance " );
		System.out.println("2. Deposit " );
		System.out.println("3. Withdrawal " );
		System.out.println("4. Exit " );
		System.out.println("Please select any of the below options(1-4): ");
	}

	
	public void deposit(int amount) {
		balance += amount; 
	}
	
	public void withdrawal(int amount) {   
		if(balance<amount) {		
			System.out.println("Insufficient Balance" );
			return; 
		}
		balance -= amount;
	}
	
	public int balanceInquiry() {
		return balance;
	}
	
	public boolean isPinvalid(int pin) {
		return this.pin==pin;
	}
	public static void main(String[] args) {
		ATMInterface atm = new ATMInterface(1000,1234);
		System.out.print("Enter the Pin: ");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		if(atm.isPinvalid(pin)) {
			int option = 0;
			while(option !=4) {
				atm.menuDisplay();
				option = sc.nextInt();
				switch(option) {
				case 1: 
					System.out.println("Current Balance is: "+ atm.balanceInquiry());
					break;
				case 2: 
					System.out.println("Enter the deposit amount: ");
					int amount= sc.nextInt();
					atm.deposit(amount);
					System.out.println("The amount deposited is: "+ amount + "\nCurrent balance: "+ atm.balanceInquiry());
					break;
				case 3: 
					System.out.println("Enter the withdrawal amount: ");
					amount= sc.nextInt();
					atm.withdrawal(amount);
					System.out.println("The amount withdrawn is: "+ amount + "\nCurrent balance: "+ atm.balanceInquiry());
					break;
				case 4: 
					System.out.println("Thank You for using ATM , Have a Nice Day! ");
					break;
				default:
					System.out.println("Only enter options within 1-4");
					break;
				}
			}
		}
		else {
			System.out.println("You have entered incorrect pin");
		}
	}
}