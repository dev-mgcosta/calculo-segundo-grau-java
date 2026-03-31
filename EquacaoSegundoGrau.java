import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            double a, b, c, delta, x1, x2;

            System.out.print("Digite o valor de a: ");
            a = sc.nextDouble();
            
            System.out.print("Digite o valor de b: ");
            b = sc.nextDouble();

            System.out.print("Digite o valor de c: ");
            c = sc.nextDouble();

            delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Nao existem raizes reais.");
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);
            }

            System.out.print("Deseja calcular novamente? (s/n): ");
            opcao = sc.next();

        } while (opcao.equalsIgnoreCase("s"));

        sc.close();
    }
}