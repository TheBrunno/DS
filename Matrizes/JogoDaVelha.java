import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String mat[][] = new String[3][3];
		int i=0, j=0, k=0;
		int vitoria=2;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				mat[i][j] = "A";
			}
		}
		for(i=0;i<9;i++) {
			if(i%2==0) {
				System.out.println("Linha de X:");
				k = in.nextInt();
				System.out.println("Coluna de X:");
				j = in.nextInt();
				mat[j][k] = "X";
			} else {
				System.out.println("Linha de O:");
				k = in.nextInt();
				System.out.println("Coluna de O:");
				j = in.nextInt();
				mat[j][k] = "O";
			}
			for(j=0;j<3;j++) {
				for(k=0;k<3;k++) {
					if(mat[j][0].equalsIgnoreCase(mat[j][1]) && mat[j][0].equalsIgnoreCase(mat[j][2]) && mat[j][0].equalsIgnoreCase("O") ||
					mat[0][k].equalsIgnoreCase(mat[1][k]) && mat[1][k].equalsIgnoreCase(mat[2][k]) && mat[0][k].equalsIgnoreCase("O") ||
					mat[0][0].equalsIgnoreCase(mat[1][1]) && mat[0][0].equalsIgnoreCase(mat[2][2]) && mat[0][0].equalsIgnoreCase("O") ||
					mat[0][2].equalsIgnoreCase(mat[1][1]) && mat[0][2].equalsIgnoreCase(mat[2][0]) && mat[0][2].equalsIgnoreCase("O")) {
						vitoria = 0;
					} else if(mat[j][0].equalsIgnoreCase(mat[j][1]) && mat[j][0].equalsIgnoreCase(mat[j][2]) && mat[j][0].equalsIgnoreCase("X") ||
					mat[0][k].equalsIgnoreCase(mat[1][k]) && mat[1][k].equalsIgnoreCase(mat[2][k]) && mat[0][k].equalsIgnoreCase("X")
					|| mat[0][0].equalsIgnoreCase(mat[1][1]) && mat[0][0].equalsIgnoreCase(mat[2][2]) && mat[0][0].equalsIgnoreCase("X") ||
					mat[0][2].equalsIgnoreCase(mat[1][1]) && mat[0][2].equalsIgnoreCase(mat[2][0]) && mat[0][2].equalsIgnoreCase("X")){
						vitoria = 1;
					}
				}
			}
			if(vitoria!=2) {
				break;
			}
		}
		if(vitoria==1) {
			System.out.println("X vence");
		} else if(vitoria==0) {
			System.out.println("O vence");
		} else {
			System.out.println("Empate");
		}
	}
}
