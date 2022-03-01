import java.util.Scanner;
 
public class  TheaterSquare{
 
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);
		double n  = sc.nextDouble();
		double m = sc.nextDouble();
		double a = sc.nextDouble();
		int a1=(int)Math.ceil(n/a);
		int a2=(int)Math.ceil(m/a);
		System.out.println(a1*a2);
	}
}
