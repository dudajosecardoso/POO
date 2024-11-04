//Classe Eletroposto
public class Eletroposto {
    private String id;
    private String local;
    private int vagasDisponiveis;
    private double tempoMedioCarregamento;

    // Método Construtor
    public Eletroposto(String id, String local, int vagasDisponiveis, double tempoMedioCarregamento) {
        this.id = id;
        this.local = local;
        this.vagasDisponiveis = vagasDisponiveis;
        this.tempoMedioCarregamento = tempoMedioCarregamento;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getLocal() {
        return local;
    }

    public double getTempoMedioCarregamento() {
        return tempoMedioCarregamento;
    }

    // Método de verificar as vagas disponíveis
    public boolean ocuparVaga() {
        if (vagasDisponiveis > 0) {
            vagasDisponiveis--;
            return true;
        }
        return false;
    }

    // Método de liberação de vaga
    public void liberarVaga() {
        vagasDisponiveis++;
    }
}
