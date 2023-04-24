import java.util.Scanner;

public class ATM {
    public static void main(String[] args){

        System.out.println("Welcome!\n");
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the pin: ");
        int PIN = input1.nextInt();

        client Kithuni = new client("Kithuni", new String[]{"Savings account", "Current account"}, 1);
        client Pramidu = new client("Pramidu",new String[]{"Savings account"}, 2);
        client Venuli = new client("Venuli", new String[]{"Current account"}, 3);

        
        if (PIN == Kithuni.PIN) {
            String[] accounts = Kithuni.access_ATM(PIN);
        } else if (PIN == Pramidu.PIN) {
            String[] account = Pramidu.access_ATM(PIN);
        } else if (PIN == Venuli.PIN) {
            String[] accounts= Venuli.access_ATM(PIN);
        } else {
            System.out.println("Invalid PIN. Exiting...");
            return;
        }
         
        System.out.println("\n1.View balance. \n2.Withdraw money. \n3.Deposit money. \n4.Exit \n" );
        System.out.println("Enter the choice: \n");
        int choice = input1.nextInt();

        if (choice == 2  || choice == 3){
            System.out.println("Enter the amount: ");
            int amount = input1.nextInt();
            
            if (choice == 2){
                //int amountt = input1.nextInt();
                withdrawals withdrawal1 = new withdrawals();
                withdrawal1.transaction_amount(amount);
            }

            else{
                //int amountt = input1.nextInt();
                deposits deposit1 = new deposits();
                deposit1.transaction_amount(amount);
            }
        }
    }
}


class client {
    public int id;
    public String name;
    public String nationality;
    public String occupation;
    public String address;
    public int age;
    public String gender;
    public int PIN = 0;
    String[] accounts ;

    public client(String name ,String[] accounts, int PIN){
        this.name = name;
        this.accounts = accounts;
        this.PIN = PIN;

    }

    public String[] access_ATM(int PIN){
        return accounts;
    }
}


class account {
    public int accountNumber ;
    public String currency;
    public String branch;
    public int balance;

    public account(int accountNumber, String currency, String branch, int balance) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.branch = branch;
        this.balance = balance;
    }

    public void loan(){

    }
        
}

class savingsAccount extends account {

    public savingsAccount(int accountNumber, String currency, String branch, int balance) {
        super(accountNumber, currency, branch, balance);
    }
    
    public void interest(int amount){

    }

    
}

class currentAccount extends account{
    public currentAccount(int accountNumber, String currency, String branch, int balance) {
        super(accountNumber, currency, branch, balance);
    }   
}

class transactions {
    public int id;
    public int bank_account_id;
    public int date;
    public String status;
    public int balance;

}

class deposits extends transactions{
    public void transaction_amount(int amount){
        balance += amount;
        System.out.println(balance);
    }
}


class withdrawals extends transactions{
    public void transaction_amount(int amount){
        balance -= amount;
        System.out.println(balance);
    }
}

class balance_inquiries extends transactions{
    public void balance(){
        
    }
}

class loans{
    public int amount;
    public int interest;
    public int duration;
    public String payment_method;
}
