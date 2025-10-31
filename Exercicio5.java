import java.util.Scanner;

public class Exercicio5 {

    public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * (taxaImposto / 100));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a taxa de imposto (%): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite o custo do produto: ");
        double custo = sc.nextDouble();

        double custoFinal = somaImposto(taxa, custo);
        System.out.printf("O custo final com imposto é: R$ %.2f\n", custoFinal);

        sc.close();
    }
}
