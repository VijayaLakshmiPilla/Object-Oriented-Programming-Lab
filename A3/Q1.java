
import java.util.*;

class Threads extends Thread{
	String tname;
	int max_count;
	static int i=0;
	Threads(int num,int max){
		this.tname="Thread "+num;
		this.max_count=max;
	}
	public void run() {
		while(true) {
			if(i>=max_count) {
				i=0;
				//Thread.yield();
			}
			System.out.println(Thread.currentThread().getName()+ " "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class Q1 {
	public static void main(String[] args) {
		int n,N;
		System.out.println("Enter number of threads");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter maximum count");
		s=new Scanner(System.in);
		N=s.nextInt();
		Threads t[]=new Threads[n];
		for(int i=0;i<n;i++) {
			t[i]=new Threads(i,N);
			t[i].start();
		}
		
	}
}

