//Classe Recarga
public class Recarga {
    private CarroEletrico carro;
    private Eletroposto eletroposto;
    private double quantidadeRecarregada;
    private String dataRecarga;

    // Método Construtor
    public Recarga(CarroEletrico carro, Eletroposto eletroposto, double quantidadeRecarregada, String dataRecarga) {
        this.carro = carro;
        this.eletroposto = eletroposto;
        this.quantidadeRecarregada = quantidadeRecarregada;
        this.dataRecarga = dataRecarga;
    }

    // Getters
    public CarroEletrico getCarro() {
        return carro;
    }

    public Eletroposto getEletroposto() {
        return eletroposto;
    }

    public double getQuantidadeRecarregada() {
        return quantidadeRecarregada;
    }

    public String getDataRecarga() {
        return dataRecarga;
    }
}
