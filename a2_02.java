import java.util.Scanner;
class account{
    private int acc_num;
    private float acc_balance;
    account(int number, float balance){
        acc_num = number;
        acc_balance = balance;
    }
    account(){
        input();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number:");
        acc_num = sc.nextInt();
        System.out.println("Enter account balance:");
        acc_balance = sc.nextFloat();
    }

    public void transaction(char a, float bal) {
        if(a=='D' || a=='d'){
            acc_balance = acc_balance + bal;

        }
        else if(a=='W' || a=='w'){
            acc_balance = acc_balance - bal;
        }
        System.out.println("account updated");
        
    }
    void display()
    {
    System.out.println("Account number: "+ acc_num);
    System.out.println("Account balance: "+ acc_balance);
    }  
}
public class a2_02{
    public static void main(String args[]) {
        char c;
        float bal;
        Scanner sc = new Scanner(System.in);
        account obj = new account();
        obj.display();
        System.out.println("enter type of transaction you want to perform W-withdraw D-deposit ");
        c = sc.next().charAt(0);
        System.out.println("enter amount");
        bal = sc.nextFloat();
        obj.transaction(c, bal);
        obj.display();
        System.out.println("\n");
        account obj1 = new account(4563,1500);
        obj1.display();
        System.out.println("enter type of transaction you want to perform W-withdraw D-deposit ");
        c = sc.next().charAt(0);
        System.out.println("enter amount");
        bal = sc.nextFloat();
        sc.close();
        obj1.transaction(c, bal);
        obj1.display();
    }
}
