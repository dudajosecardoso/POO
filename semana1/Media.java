import java.util.Scanner;
public class Media{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a sua segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a sua terceira nota:");
        double nota3 = scanner.nextDouble();
        double mediaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média final é: " + mediaFinal);
        scanner.close();
    }
}

// Fazer um algoritmo que leia três notas de um aluno, calcule e escreva a sua média aritmética conforme
// equação.
