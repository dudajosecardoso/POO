import java.util.Scanner;
public class Inteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: "); 
        int numero = scanner.nextInt();
        int contador = 0;
        int aa=0;
        while (contador < 10){
            aa = aa +(numero--);
                contador ++;
        }
        System.out.println(aa);
        scanner.close();
    }
}

// exercicio 8
