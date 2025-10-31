import java.util.Scanner;

public class Exercicio6 {

    public static int converterHora(int hora24) {
        if (hora24 == 0)
            return 12;
        else if (hora24 > 12)
            return hora24 - 12;
        else
            return hora24;
    }

    public static char obterPeriodo(int hora24) {
        return (hora24 < 12) ? 'A' : 'P';
    }

    public static void mostrarHora(int hora24, int minuto) {
        int hora12 = converterHora(hora24);
        char periodo = obterPeriodo(hora24);
        System.out.printf("Hora convertida: %d:%02d %s.M.\n",
                hora12, minuto, (periodo == 'A' ? "A" : "P"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Digite a hora (0–23): ");
            int hora = sc.nextInt();

            System.out.print("Digite os minutos (0–59): ");
            int minuto = sc.nextInt();

            mostrarHora(hora, minuto);

            System.out.print("Deseja converter outra hora? (S/N): ");
            repetir = sc.next().toUpperCase().charAt(0);

        } while (repetir == 'S');

        sc.close();
    }
}
