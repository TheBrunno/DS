import java.util.Scanner;
public class Vetores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		int i;
		for(i=0;i<10;i++) {
			System.out.println("Digite o valor de A n."+(i+1)+":");
			a[i] = in.nextInt();
		}
		for(i=0;i<10;i++) {
			System.out.println("Digite o valor de B n."+(i+1)+":");
			b[i] = in.nextInt();
		}
		
		for(i=0; i<10; i++) {
			c[i] = a[i] + b[i];
		}
		
		for(i=0; i<10; i++) {
			if(i!=9) {
				System.out.print(c[i]+", ");
			} else {
				System.out.print(c[i]);
			}
		}
	}
}
