//Classe Motorista
public class Motorista {
    private String nome;
    private String id;
    private String numeroCNH;
    private String nivelExperiencia;

    // Método Construtor
    public Motorista(String nome, String id, String numeroCNH, String nivelExperiencia) {
        this.nome = nome;
        this.id = id;
        this.numeroCNH = numeroCNH;
        this.nivelExperiencia = nivelExperiencia;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }
}
