package aula03_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        calculadora c = new calculadora();
        Scanner sc = new Scanner(System.in);

        int n1,n2;

        System.out.print("Número 1:");
        c.n1 = sc.nextInt();
        System.out.print("Número 2:");
        c.n2 = sc.nextInt();
         c.somar();

    }

}
