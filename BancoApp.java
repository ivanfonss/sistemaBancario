import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao banco XYZ!");
        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println(nome + " " + sobrenome + ", você está acessando o sistema do Banco XYZ");
        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        GerenciaBanco conta = new GerenciaBanco(nome, sobrenome, cpf);

        while (true) {
            System.out.println("\nPara continuar, escolha uma opção:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depósito");
            System.out.println("3. Saque");
            System.out.println("4. Investimentos");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    try {
                        System.out.print("Digite o valor do depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.fazerDeposito(valorDeposito);
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Valor de depósito inválido. Certifique-se de usar o formato correto (por exemplo, 273.50).");
                        scanner.nextLine(); // Limpar o buffer
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.fazerSaque(valorSaque);
                    break;
                case 4:
                    abrirModuloInvestimentos(scanner);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar os serviços do Banco XYZ!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    public static void abrirModuloInvestimentos(Scanner scanner) {
        System.out.println("\nMódulo de Investimentos");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Investir em CDB (10% ao ano)");
        System.out.println("2. Investir em LCI (8% ao ano)");
        System.out.println("3. Calculadora de Investimentos");
        System.out.println("4. Voltar ao menu principal");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        switch (opcao) {
            case 1:
                GerenciaBanco2.investirCDB(scanner);
                break;
            case 2:
                GerenciaBanco2.investirLCI(scanner);
                break;
            case 3:
                CalculadoraInvestimentos.abrirModuloInvestimentos(scanner);
                break;
            case 4:
                return;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }
}