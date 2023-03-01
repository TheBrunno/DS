import java.util.Scanner;

public class DiagPrinc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mat[][] = new int[5][5];
		int diag[] = new int[5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Digite o numero da posicao "+i+"x"+j);
				mat[i][j] = in.nextInt();
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i == j) {
					diag[i] = mat[i][j];
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(diag[i]+" ");
		}
	}
}
