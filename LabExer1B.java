import java.util.Scanner;
public class LabExer1B{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		int a = scan.nextInt();
		
		showNumberPlus10(a);
		showNumberPlus100(a);
		showNumberPlus1000(a);	
		
	}
	public static int showNumberPlus10(int x){
		int aa = 10;
		int p;
		p = aa+x;
		System.out.println(x+" plus 10 is "+p);
		return x;
	}
	public static int showNumberPlus100(int y){
		int aa = 100;
		int o;
		o = aa+y;
		System.out.println(y+" plus 100 is "+o);
		return y;
	}
	public static int showNumberPlus1000(int z){
		int aaa = 1000;
		int b;
		b = aaa+z;
		System.out.println(z+" plus 1000 is "+b);
		return z;
	}
}