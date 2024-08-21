import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Agora, o número da conta: ");
        int conta = scanner.nextInt();

        String usuario = "Diego Lima Tavares Ursini";
        float saldo = 10420.50f;

        System.out.printf("Olá, %s! Sua Agência é %d, conta %d e seu saldo de R$ %.2f já está disponível para saque.", 
            usuario, agencia, conta, saldo);
            }
    }
