import java.util.Scanner;

public class Exercicio3 {

    public static int somaTresNumeros(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        int resultado = somaTresNumeros(n1, n2, n3);
        System.out.println("A soma dos três números é: " + resultado);

        sc.close();
    }
}
