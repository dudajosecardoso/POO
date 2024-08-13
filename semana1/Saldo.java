import java.util.Scanner;
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
        scanner.close();
    }
}

// Uma pessoa aplicou um valor em um determinado banco. Fazer um algoritmo que leia o valor inicial
// aplicado, o percentual de juros pago pelo banco (fixo para todos os meses) e a quantidade de meses que a
// pessoa deixou este valor aplicado, após calcule e escreva o saldo final desta aplicação.
