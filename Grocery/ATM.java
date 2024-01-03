import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        double balance = 5000;
        int pin = 1234;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount to withdraw:");
        int amount = scanner.nextInt();
        System.out.println("enter the pin:");
        int userpin = scanner.nextInt();
        if(userpin==pin){
            System.out.println("invalid pin");

        }
        else if(amount>balance)
        {
            System.out.println("insufficient balance");
        }
        else
        {
            balance-=amount;
            System.out.println("amount withdrawn:"+amount);
            System.out.println("remaining balance:"+balance);
        }
    }
    
}
