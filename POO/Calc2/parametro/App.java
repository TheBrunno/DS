import java.util.Scanner;
public class App{
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
      System.out.println("ok, digite agora dois numeros para fazer a operação escolhida: ");
      int n1 = in.nextInt();
      System.out.println("ok, agora digite o segundo: ");
      int n2 = in.nextInt();
      if(res == 1){
        calc.somar(n1, n2);
      }else if(res == 2){
        calc.subtrair(n1, n2);
      }else if(res == 3){
        calc.multiplicar(n1, n2);
      }else if(res == 4){
        calc.dividir(n1, n2);
      }
    }
    in.close();
  }
}