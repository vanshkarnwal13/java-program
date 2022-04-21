import java.util.Scanner;
class OddThread extends Thread
{
    int num;
    Print print;
    public OddThread(int num, Print print)
    {
        this.num = num;
        this.print = print;
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

class EvenThread extends Thread
{
    int num;
    Print print;
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
public class a4_01 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Print print = new Print();
        OddThread oddThread = new OddThread(n, print);
        oddThread.setName("Odd-Thread");
        EvenThread evenThread = new EvenThread(n, print);
        evenThread.setName("Even-Thread");
        oddThread.start();
        evenThread.start();
        input.close();
    }
}