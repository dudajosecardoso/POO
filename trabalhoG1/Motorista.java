import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Motorista {
    private String nome;
    private String numeroIdentificacao;
    private String numeroCNH; 
    private String nivelExperiencia; 

    private static List<Motorista> motoristas = new ArrayList<>();

    public Motorista(String nome, String numeroIdentificacao, String numeroCNH, String nivelExperiencia) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.numeroCNH = numeroCNH;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNome(){
        return nome;
    }

    public String getNumeroIdentificacao(){
        return numeroIdentificacao;
    }

    public String getNumeroCNH(){
        return numeroCNH;
    }

    public String getNivelExperiencia(){
        return nivelExperiencia;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setNumeroIdentificacao (String numeroIdentificacao){
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public void setNumeroCNH (String numeroCNH){
        this.numeroCNH = numeroCNH;
    }

    public void setNivelExperiencia (String nivelExperiencia){
        this.nivelExperiencia = nivelExperiencia;
    }

    public static void cadastrarMotorista(String nome, String numeroIdentificacao, String numeroCNH, String nivelExperiencia) {
        Motorista motorista = new Motorista(nome, numeroIdentificacao, numeroCNH, nivelExperiencia);
        motoristas.add(motorista);
        System.out.println("Motorista cadastrado com sucesso!");
    }

    public static void listarMotoristas() {
        if (motoristas.isEmpty()) {
            System.out.println("Nenhum motorista cadastrado.");
        } else {
            System.out.println("Lista de Motoristas:");
            for (Motorista motorista : motoristas) {
                System.out.println(motorista);
            }
        }
    }

    public static void preencherDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do motorista: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de identificação: ");
        String numeroIdentificacao = scanner.nextLine();

        System.out.print("Digite o número da CNH: ");
        String numeroCNH = scanner.nextLine();

        System.out.print("Digite o nível de experiência (iniciante, intermediário, avançado): ");
        String nivelExperiencia = scanner.nextLine();

        cadastrarMotorista(nome, numeroIdentificacao, numeroCNH, nivelExperiencia);

        scanner.close();
    }

    public void exibir() {
        System.out.println("Motorista{" +
                "nome='" + nome + '\'' +
                ", numeroIdentificacao='" + numeroIdentificacao + '\'' +
                ", numeroCNH='" + numeroCNH + '\'' +
                ", nivelExperiencia='" + nivelExperiencia + '\'' +
                '}');
    }
    
}
