import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 1;
        do{ //Criar um loop no código
            Scanner input = new Scanner(System.in);

            System.out.println("SELECIONE SEU COMBO");
            System.out.println("-------------------");
            System.out.println("1. Combo Master");
            System.out.println("2. Super Combo");
            System.out.println("-------------------");
            System.out.print(": ");
            int tipo = input.nextInt(); //Captura a opção do cliente

            Facade.Combo combo = new Facade.Combo(tipo);    //Envia a opção escolhida pelo usuário para o Combo
            System.out.println("\nBuguer: " + combo.getBuguer());
            System.out.println("Sobremesa: " + combo.getSobremesa());
            System.out.println("Bebida: " + combo.getBebida());

            System.out.println("\nDeseja reiniciar? [0] Sair | [1] Continuar");
            opcao = input.nextInt();    //Captura a opção do usuário
        }while(opcao != 0); //O loop continuará enquanto opção for diferente de 0
    }
}
