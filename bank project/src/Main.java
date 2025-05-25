import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Bank Management we need to add features like
        * deposit
        * withdraw
        * multiple accounts
        * loan
        * we need to make pin for security
        * pin number*/

        Scanner in = new Scanner(System.in);
        Bank b = new Bank();
        b.display();
        System.out.println("Setup Pin Number");
        b.pin = in.nextInt();
        System.out.println("Enter Inital Amount in bank");
        int initial = in.nextInt();

        System.out.println("Enter the what do you want \n 1.Deposit \n 2.Withdraw");
        int select = in.nextInt();
        switch (select){

            case 1:
                System.out.println("You had Selected to Deposit amount");
                System.out.println("Enter pin number to proceed");
                int choice1 = in.nextInt();

                if(choice1 == b.pin){
                    System.out.println("Enter Amount to be Deposit");
                    int amount=in.nextInt();
                    b.deposit(amount);
                }else {
                    System.out.println("Invalid Pin");
                    System.out.println("Enter Again");
                }
                break;
            case 2:
                System.out.println("You had Selected to Withdraw Amount");
                System.out.println("Enter pin number to proceed");
                int choice2 = in.nextInt();
                if (choice2 == b.pin){
                    System.out.println("Enter Amount to be withdraw");
                    int amount2 = in.nextInt();
                    b.withdraw(amount2);
                }
                break;
        }
        b.loandisplay();

        }
}
class Bank{
    String name;
    long    accountno;
    float balance;
    int pin;
    Bank(){
        this.name = name;
        this.balance = balance;
        this.accountno = accountno;
        this.pin = pin;
    }
    Scanner in = new Scanner(System.in);
    void display(){
        System.out.println("Welcome to jashvanth bank as you already opened account enter your details for setup of pin number");
        System.out.println("Enter Name");
        name = in.next();
        System.out.println("Enter Account no");
        accountno = in.nextInt();


    }

    void deposit(int amount){
        System.out.println("Enter Pin for Withdraw");
        balance += amount;
        System.out.println("Balance :    " +balance);
    }

    void withdraw(int amount){
        balance -= amount;
        System.out.println("Balance :    " +balance);
    }
    void loandisplay(){
        System.out.println("Have a great day if you want any loan please free to ask press 0 or press 1");
        int choice = in.nextInt();
        if (choice == 0){
            System.out.println("As you asked for loan ");
            System.out.println("Enter Amount of loan you want ");
            float loan = in.nextFloat();
            if (loan > 700000){
                System.out.println("Amount need to repayed is ");
                loan *= loan + loan*0.25;
                System.out.println("%f "+loan);
            }else
                System.out.println("Amount need to be repayed is");
            loan *= loan*0.15;
            System.out.println(" %f "+loan);
        }else
            System.out.println("Okay thank you for using our serivices");


    }

}