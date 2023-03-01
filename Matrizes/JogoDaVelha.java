import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String mat[][] = new String[3][3];
		int i, j;
		int vitoria=2;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Digite O ou X");
				mat[i][j] = in.next();
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(mat[i][0].equalsIgnoreCase(mat[i][1]) && mat[i][0].equalsIgnoreCase(mat[i][2]) && mat[i][0].equalsIgnoreCase("O") ||
				mat[0][j].equalsIgnoreCase(mat[1][j]) && mat[1][j].equalsIgnoreCase(mat[2][j]) && mat[0][j].equalsIgnoreCase("O") ||
				mat[0][0].equalsIgnoreCase(mat[1][1]) && mat[0][0].equalsIgnoreCase(mat[2][2]) && mat[0][0].equalsIgnoreCase("O") ||
				mat[0][2].equalsIgnoreCase(mat[1][1]) && mat[0][2].equalsIgnoreCase(mat[2][0]) && mat[0][2].equalsIgnoreCase("O")) {
					vitoria = 0;
				} else if(mat[i][0].equalsIgnoreCase(mat[i][1]) && mat[i][0].equalsIgnoreCase(mat[i][2]) && mat[i][0].equalsIgnoreCase("X") ||
				mat[0][j].equalsIgnoreCase(mat[1][j]) && mat[1][j].equalsIgnoreCase(mat[2][j]) && mat[0][j].equalsIgnoreCase("X")
				|| mat[0][0].equalsIgnoreCase(mat[1][1]) && mat[0][0].equalsIgnoreCase(mat[2][2]) && mat[0][0].equalsIgnoreCase("X") ||
				mat[0][2].equalsIgnoreCase(mat[1][1]) && mat[0][2].equalsIgnoreCase(mat[2][0]) && mat[0][2].equalsIgnoreCase("X")){
					vitoria = 1;
				}
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
