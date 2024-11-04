
//Classe Viagem
import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private Motorista motorista;
    private CarroEletrico carro;
    private double distanciaPercorrida;
    private String destino;
    private List<Recarga> recargas;

    // Método Construtor
    public Viagem(Motorista motorista, CarroEletrico carro, double distanciaPercorrida, String destino) {
        this.motorista = motorista;
        this.carro = carro;
        this.distanciaPercorrida = distanciaPercorrida;
        this.destino = destino;
        this.recargas = new ArrayList<>();
    }

    // Getters
    public Motorista getMotorista() {
        return motorista;
    }

    public CarroEletrico getCarro() {
        return carro;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public String getDestino() {
        return destino;
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }

    // Método de adicionar recarga
    public void adicionarRecarga(Recarga recarga) {
        recargas.add(recarga);
    }
}
