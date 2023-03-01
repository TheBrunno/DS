import java.util.Scanner;
public class Exemplo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matriz[][] = new int[3][5];
		int i, j;
		for(i=0;i<3;i++) {
			for(j=0;j<5;j++) {
				System.out.println(i+"x"+j+" = ");
				matriz[i][j] = in.nextInt();
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<5;j++) {
				System.out.println(i+"x"+j+" = "+matriz[i][j]);
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<5;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}
