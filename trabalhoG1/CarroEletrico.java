// Classe CarroEletrico
public abstract class CarroEletrico {
    protected String id;
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected double capacidadeBateria; // Capacidade total da bateria em kWh
    protected double autonomiaMaxima; // Autonomia máxima em km
    protected double autonomiaAtual; // Autonomia atual em km

    // Método Construtor
    public CarroEletrico(String id, String marca, String modelo, int anoFabricacao, double capacidadeBateria,
            double autonomiaMaxima) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeBateria = capacidadeBateria;
        this.autonomiaMaxima = autonomiaMaxima;
        this.autonomiaAtual = autonomiaMaxima; // Inicializa a autonomia atual com a máxima
    }

    // Getters
    public String getId() {
        return id;
    }

    public double getAutonomiaAtual() {
        return autonomiaAtual;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    // Método para recarregar a autonomia (em km)
    public void recarregar(double km) {
        // Recarregar a autonomia com base na autonomia máxima
        this.autonomiaAtual = Math.min(this.autonomiaMaxima, this.autonomiaAtual + km);
    }

    // Método para realizar uma viagem (reduz a autonomia atual)
    public void realizarViagem(double distancia) {
        if (distancia <= autonomiaAtual) {
            autonomiaAtual -= distancia;
        } else {
            System.out.println("Autonomia insuficiente para a viagem.");
        }
    }

    // Método para verificar se o carro tem autonomia inferior a 20% da capacidade
    public boolean temAutonomiaBaixa() {
        return autonomiaAtual < 0.2 * autonomiaMaxima;
    }

    // Método para verificar se o carro precisa de manutenção
    public boolean precisaDeManutencao() {
        return autonomiaAtual < 0.1 * autonomiaMaxima || autonomiaAtual < 50;
    }
}
