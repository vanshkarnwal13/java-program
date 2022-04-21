import java.util.Scanner;
class Logic
{
	int n;
	int nums[];
	Logic(int n)
	{
		this.n = n;
	}
	public void readNumbers()
	{
		Scanner input = new Scanner(System.in);
		nums = new int[n];
		System.out.println("Enter " + n + " numbers");
		for(int i = 0; i < n; i++)
		{
			nums[i] = input.nextInt();
		}
	}
	public void printEvenNumbers()
	{
		System.out.println("Even numbers from the array are: ");
		for(int i = 0; i < n; i++)
		{
			if(nums[i] % 2 == 0)
			{
				System.out.println(nums[i]);
			}
		}
	}
	public void printOddNumbers()
	{
		System.out.println("Odd numbers from the array are: ");
		for(int i = 0; i < n; i++)
		{
			if(nums[i] % 2 != 0)
			{
				System.out.println(nums[i]);
			}
		}
	}
}
 
class MyThread1 implements Runnable
{
	Thread t;
	Logic l;
	MyThread1(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		l.readNumbers();
	}
}
 
class MyThread2 implements Runnable
{
	Thread t;
	Logic l;
	MyThread2(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		l.printEvenNumbers();
	}
}
 
class MyThread3 implements Runnable
{
	Thread t;
	Logic l;
	MyThread3(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		l.printOddNumbers();
	}
}
 

public class three_thread
{	
	public static void main(String[] args) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		Logic l = new Logic(n);
		MyThread1 t1 = new MyThread1(l);
		t1.t.join();
		MyThread2 t2 = new MyThread2(l);
		MyThread3 t3 = new MyThread3(l);
	}
}