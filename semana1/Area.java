import java.util.Scanner;
public class Area{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Base do seu triângulo");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do seu triângulo");
        double altura = scanner.nextDouble();
        double areaTotal = (base * altura) / 2;
        System.out.println("A área do triângulo é:" + areaTotal);
        scanner.close();
    }
}
