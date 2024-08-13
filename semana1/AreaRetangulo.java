import java.util.Scanner;
public class AreaRetangulo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura do retângulo:" );
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura do seu retângulo: ");
        double altura = scanner.nextDouble();
        double area = largura * altura;
        System.out.println("A área do retângulo é: " + area);
        scanner.close();
    }
}
