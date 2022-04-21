import java.util.Scanner;
class withdraw extends Thread
{
    String name;
    int total;
    int withdrawal;
    public withdraw(String name, int total, int withdrawal )
    {
        this.name = name;
        this.total = total;
        this.withdrawal = withdrawal;
    }
    @Override
    public void run() 
    {
        int oddNumber = 1;        
        while (oddNumber <= num)
        {
            print.printOdd(oddNumber);       
            oddNumber = oddNumber + 2;         
        }
    }
}

void withdrawn()
    {
        
    }




class EvenThread extends Thread
{
    String name;
    int total;
    int deposit;
    public EvenThread(int num, Print print)
    {
        this.num = num;
        this.print = print;
    }
    @Override
    public void run() 
    {
        int evenNumber = 2;           
        while (evenNumber <= num)
        {
        print.printEven(evenNumber);          
        evenNumber = evenNumber + 2;           
        }
    }
}
class Print
{
    boolean isOddPrinted = false;
    synchronized void printOdd(int number)
    {
        while (isOddPrinted)
        {
            try
            {
                wait();
            } 
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : "+number);
        isOddPrinted = true;
        try
        {
            Thread.sleep(500);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        notify();
    }
    synchronized void printEven(int number)
    {
        while (! isOddPrinted)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" : "+number);
        isOddPrinted = false;
        try
        {
            Thread.sleep(500);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        notify();
    }
}

































class Bank {
    
    
    void deposit()
    {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "+ total);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class a4_02 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Bank obj = new Bank();        
        // obj.withdrawn("Arnab",1000, 200);
        // obj.withdrawn("Monodwip",2000, 400);
        // obj.deposit("Mukta",5000,3500);
        // obj.deposit("Rinkel",8000, 800);
        // obj.withdrawn("Shubham",2000, 4000);
        Bank[] obj = new Bank[3];
        for(int i=0;i<3;i++){
            obj[i]=new Bank();
            System.out.println("press 0 for withdrawn or 1 for deposit");
            int n = input.nextInt();
            obj[i].name = input.next();
            obj[i].total = input.nextInt();
            if(n==0){
                obj[i].withdrawal = input.nextInt();
                obj[i].withdrawn();
            }
            else if(n==1){
                obj[i].deposit = input.nextInt();
                obj[i].deposit();
            }
            else{
                S
            }

        }
        input.close();
    }
}