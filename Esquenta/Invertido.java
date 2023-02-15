import java.util.Scanner;

public class Invertido {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero de tres algarismos:");
		int a = in.nextInt();
		int f = a/100;
		int s = (a - (f*100))/10;
		int t = a - (f*100) - (s*10);
		System.out.println(t+""+s+""+f);
	}
}
