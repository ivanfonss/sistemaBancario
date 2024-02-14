import java.util.Scanner;

public class GerenciaBanco2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao módulo de investimentos do Banco XYZ!");
        
        // Menu de opções
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Investir em CDB (10% ao ano)");
            System.out.println("2. Investir em LCI (8% ao ano)");
            System.out.println("3. Sair");
            
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
                    System.out.println("Obrigado por utilizar o módulo de investimentos do Banco XYZ!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
    
    public static void investirCDB(Scanner scanner) {
        System.out.println("\nInvestimento em CDB (10% ao ano)");
        System.out.print("Digite o valor a ser investido: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade de parcelas (em meses): ");
        int parcelas = scanner.nextInt();
        
        double rendimentoAnual = valor * 0.10; // Rendimento anual do CDB
        double rendimentoTotal = rendimentoAnual * (parcelas / 12.0); // Rendimento total ao longo das parcelas
        
        System.out.println("O rendimento desse investimento no ano é: R$" + rendimentoAnual);
        System.out.println("Quantidade de parcelas: " + parcelas + " meses");
        System.out.println("Valor total investido acrescido do rendimento obtido: R$" + (valor + rendimentoTotal));
    }
    
    public static void investirLCI(Scanner scanner) {
        System.out.println("\nInvestimento em LCI (8% ao ano)");
        System.out.print("Digite o valor a ser investido: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade de parcelas (em meses): ");
        int parcelas = scanner.nextInt();
        
        double rendimentoAnual = valor * 0.08; // Rendimento anual da LCI
        double rendimentoTotal = rendimentoAnual * (parcelas / 12.0); // Rendimento total ao longo das parcelas
        
        System.out.println("O rendimento desse investimento no ano é: R$" + rendimentoAnual);
        System.out.println("Quantidade de parcelas: " + parcelas + " meses");
        System.out.println("Valor total investido acrescido do rendimento obtido: R$" + (valor + rendimentoTotal));
    }
}