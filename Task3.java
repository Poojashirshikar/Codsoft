import java.util.Scanner;

public class Task3
{
    public static void main(String args[] )
    {
        int balance = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM Machine Interface:");
            System.out.println("1.Withdraw Money:");
            System.out.println("2.Deposit Money:");
            System.out.println("3.Check Your Corrent Balance:");
            System.out.println("4.Exit");
            System.out.println("Choose The Operation WhaT you want to perform");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter money to be withdraw:");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw)
                        {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                         }
                    else    
                        {
                            System.out.println("Insufficient balance");
                        }
                    System.out.println("");
                    break;

                case 2:

                    System.out.println("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been SUCCESSFULLY depositd");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("balance : "+balance);
                     System.out.println("");
                     break;

                case 4:
                    System.out.println("status:0");
        

            }
        }
    }
}
