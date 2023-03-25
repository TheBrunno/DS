import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("escolha a operação:");
    System.out.println("1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão");
    int res = in.nextInt();
    if(res > 4 || res < 1){
      System.out.println("numero invalido");
    }else{
      Calc calc = new Calc();
      if(res == 1) calc.somar();
      else if(res == 2) calc.subtrair();
      else if(res == 3) calc.multiplicar();
      else if(res == 4) calc.dividir();
    }
    in.close();
  }
}
