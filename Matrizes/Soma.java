import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int mat[][] = new int[4][2];
		int i, j;
		int soma[] = new int[4];
		for(i=0; i<4; i++) {
			for(j=0;j<2;j++) {
				System.out.print("Digite o "+i+"x"+j+" numero: ");
				mat[i][j] = in.nextInt();
			}
		}
		
		for(i=0; i<4; i++) {
			soma[i] = mat[i][0] + mat[i][1];
		}
		
		for(i=0; i<4; i++) {
			System.out.println(soma[i]);
		}
	}
}
