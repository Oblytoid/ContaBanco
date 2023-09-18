import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        double saldo = 1320.00;
        Scanner Conta = new Scanner(System.in);
        
        System.out.println("Bem vindo ao banco (Maracatu)\n Por favor insira sua agência:");
        String agencia = Conta.nextLine();
        
        System.out.println("Agora digite o número da conta:");
        int numeroConta = Conta.nextInt();
        
        Conta.nextLine();
        
        System.out.println("Agora digite seu nome:");
        String nome = Conta.nextLine();
        
        Conta.close();
        
        System.out.println("Agência: " + agencia + "\nNúmero da conta: " + numeroConta + "\nBem vindo: " + nome + "\nVocê tem R$" + saldo + " em sua conta");
    }
}
