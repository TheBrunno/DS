import java.util.Scanner;

public class Calc {
  Scanner in = new Scanner(System.in);

  public double somar(){
    System.out.println("Digite um numero para fazer a soma: ");
    double n1 = in.nextInt();
    System.out.println("Digite outro numero: ");
    double n2 = in.nextInt();
    return n1+n2;
  }
  public double subtrair() {
    System.out.println("Digite um numero para fazer a subtração: ");
    double n1 = in.nextInt();
    System.out.println("Digite outro numero: ");
    double n2 = in.nextInt();
    return n1-n2;
  }
  public double multiplicar() {
    System.out.println("Digite um numero para fazer a multiplicação: ");
    double n1 = in.nextInt();
    System.out.println("Digite outro numero: ");
    double n2 = in.nextInt();
    return n1*n2;
  }
  public double dividir() {
    System.out.println("Digite um numero para fazer a divisão: ");
    double n1 = in.nextInt();
    System.out.println("Digite outro numero: ");
    double n2 = in.nextInt();
    return n1/n2;
  }
}
