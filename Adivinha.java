import java.util.Scanner;
import java.util.Random;


public class Adivinha {
    public static void main(String[] args) {

        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha a dificuldade");
        System.out.println("1 - Fácil");
        System.out.println("2 - Médio");
        System.out.println("3 - Difícil");
        System.out.println("Digite o valor desejado: ");

        int numero1 = entrada1.nextInt();
        Random gerador = new Random();

        switch (numero1) {

            case 1:
                System.out.println("Selecionou a dificuldade FÁCIL, selecine um valor de 0 a 10");

                int valor = gerador.nextInt(10);
                System.out.println("Adivinhe o número sorteado, digite aqui: ");
                int numero = entrada.nextInt();

                if (numero == valor) {
                    System.out.println("Você acertou!! Avance de nível! ");
                }
                else{
                    System.out.println("Você perdeu!");
                    System.out.println("O valor é " + valor);
            }
            break;

            case 2:
                System.out.println("Selecionou a dificuldade MÉDIA, selecine um valor de 0 a 50");

                int valor2 = gerador.nextInt(50);

                System.out.println("Adivinhe o número sorteado, digite aqui: ");
                int numero2 = entrada.nextInt();

                if (numero2 == valor2) {
                    System.out.println("Você acertou!! Avance de nível! ");
                }
                else{
                    System.out.println("Você perdeu!");
                    System.out.println("O valor é " + valor2);

                }
            break;

            case 3:
                System.out.println("Selecionou a dificuldade DIFÍCIL, selecine um valor de 0 a 100");

                int valor3 = gerador.nextInt(100);

                System.out.println("Adivinhe o número sorteado, digite aqui: ");
                int numero3 = entrada.nextInt();

                if (numero3 == valor3) {
                    System.out.println("Você acertou!! Avance de nível! ");
                }
                else{
                    System.out.println("Você perdeu!");
                    System.out.println("O valor é " + valor3);
                }
            break;
            default:
                System.out.println("O número é inválido.");
        }

    }
}
