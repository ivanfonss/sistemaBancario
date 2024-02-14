public class GerenciaBanco {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;
 
    public GerenciaBanco(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
 
    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }
 
    public void fazerDeposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " efetuado com sucesso!");
    }
 
    public void fazerSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " efetuado com sucesso!");
        } else {
            System.out.println("Seu saldo é insuficiente para realizar o saque.");
        }
    }
}