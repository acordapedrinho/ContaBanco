import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira os dados da sua conta bancária:");
        Scanner entrada= new Scanner(System.in);
        int numeroAgencia;
        String nome,agencia;
        double saldo;


        System.out.printf("Por Favor,Informe o Nome da Sua agencia :");
        agencia =entrada.next();

        System.out.println("informe o numero da sua agencia: ");
        numeroAgencia=entrada.nextInt();

        System.out.println("Insira o seu Nome :");
        nome=entrada.next();

        System.out.println("Digite o seu saldo :");
        saldo=entrada.nextDouble();



        System.out.println(" Olá "+nome+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroAgencia+" e seu saldo "+saldo+" já está disponível para saque");

        
        



         




    }
}
