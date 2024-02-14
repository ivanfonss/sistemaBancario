import java.util.Scanner;

public class CalculadoraInvestimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        abrirModuloInvestimentos(scanner);
    }

    public static void abrirModuloInvestimentos(Scanner scanner) {
        System.out.println("\nMódulo de Investimentos");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Investir em CDB (10% ao ano)");
        System.out.println("2. Investir em LCI (8% ao ano)");
        System.out.println("3. Voltar ao menu principal");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
            case 1:
                investirCDB(scanner);
                break;
            case 2:
                investirLCI(scanner);
                break;
            case 3:
                return;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }

    public static void investirCDB(Scanner scanner) {
        System.out.print("Digite o valor do investimento em CDB: ");
        double valorInvestimento = scanner.nextDouble();
        System.out.print("Digite a quantidade de parcelas (meses): ");
        int qtdParcelas = scanner.nextInt();
        double rendimentoAnual = 0.10; // 10% ao ano para CDB
        double rendimentoMensal = calcularRendimentoMensal(rendimentoAnual);
        double rendimentoTotal = calcularRendimentoTotal(valorInvestimento, qtdParcelas, rendimentoMensal);
        double totalInvestido = valorInvestimento * qtdParcelas;
        System.out.println("Rendimento total do investimento em CDB após " + qtdParcelas + " meses: " + rendimentoTotal);
        System.out.println("Valor total investido em CDB: " + totalInvestido);
    }

    public static void investirLCI(Scanner scanner) {
        System.out.print("Digite o valor do investimento em LCI: ");
        double valorInvestimento = scanner.nextDouble();
        System.out.print("Digite a quantidade de parcelas (meses): ");
        int qtdParcelas = scanner.nextInt();
        double rendimentoAnual = 0.08; // 8% ao ano para LCI
        double rendimentoMensal = calcularRendimentoMensal(rendimentoAnual);
        double rendimentoTotal = calcularRendimentoTotal(valorInvestimento, qtdParcelas, rendimentoMensal);
        double totalInvestido = valorInvestimento * qtdParcelas;
        System.out.println("Rendimento total do investimento em LCI após " + qtdParcelas + " meses: " + rendimentoTotal);
        System.out.println("Valor total investido em LCI: " + totalInvestido);
    }

    public static double calcularRendimentoMensal(double rendimentoAnual) {
        return Math.pow(1 + rendimentoAnual, 1.0 / 12) - 1;
    }

    public static double calcularRendimentoTotal(double valorInvestimento, int qtdParcelas, double rendimentoMensal) {
        return valorInvestimento * (Math.pow(1 + rendimentoMensal, qtdParcelas) - 1);
    }
}