import java.util.Scanner;

public class App {
    public static final double taxaPorKM = 2.00;
    public static final double valorMinimoFreteGratis = 80.00;

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: ");
        double valorTotal = entrada.nextDouble();
        System.out.print("Digite a distância para entrega em km: ");
        double distancia = entrada.nextDouble();

        double valorFrete = distancia * taxaPorKM;

        if (valorTotal >= valorMinimoFreteGratis) {
            valorFrete = 0.00;
        }
        double valorFinal = valorTotal + valorFrete;

        System.out.println("\nResumo da Compra:");
        System.out.printf("Valor total da compra: R$ " + valorTotal);
        System.out.println();
        System.out.printf("Valor total do frete: R$ " + valorFrete);
        System.out.println();
        System.out.printf("Valor final a ser pago: R$ " + valorFinal);

        entrada.close();
    }
}
