import java.util.Scanner;
import math.pow;
public class Saldo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite se saldo inicial");
        double saldoInicial = scanner.nextDouble();
        System.out.println("Digite a quantidade de meses");
        int meses = scanner.nextInt();
        double juros = 20.00;
        double aux = saldoInicial * ( 1 + (juros / 100));
        double total = Math.pow(aux, meses);
        System.out.println("O total é: " + total);
    }
}
