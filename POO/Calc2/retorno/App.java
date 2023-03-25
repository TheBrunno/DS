import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double resTotal = 0;
    System.out.println("escolha a operação:");
    System.out.println("1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão");
    int res = in.nextInt();
    if(res > 4 || res < 1){
      System.out.println("numero invalido");
    }else{
      Calc calc = new Calc();
      if(res == 1){
        resTotal = calc.somar();
      }else if(res == 2){
        resTotal = calc.subtrair();
      }else if(res == 3){
        resTotal = calc.multiplicar();
      }else if(res == 4){
        resTotal = calc.dividir();
      }
      System.out.println("o resultado da operação é: "+resTotal);
    }
    in.close();
  }
}
