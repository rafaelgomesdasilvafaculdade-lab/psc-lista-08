import java.util.Scanner;

public class Exercicio4 {

    public static char verificarNumero(int n) {
        if (n > 0)
            return 'P';
        else
            return 'N';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        char resultado = verificarNumero(numero);
        System.out.println("O resultado é: " + resultado);

        sc.close();
    }
}
