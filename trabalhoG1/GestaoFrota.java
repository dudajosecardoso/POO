import java.util.ArrayList;
import java.util.List;

public class GestaoFrota {
    private List<CarroEletrico> carros;
    private List<Motorista> motoristas;
    private List<Eletroposto> eletropostos;
    private List<Viagem> viagens;

    public GestaoFrota() {
        this.carros = new ArrayList<>();
        this.motoristas = new ArrayList<>();
        this.eletropostos = new ArrayList<>();
        this.viagens = new ArrayList<>();
    }

    public void adicionarCarro(CarroEletrico carro) {
        carros.add(carro);
    }

    public void removerCarro(CarroEletrico carro) {
        carros.remove(carro);
    }

    public List<CarroEletrico> getCarros() {
        return carros;
    }

    public void adicionarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void removerMotorista(Motorista motorista) {
        motoristas.remove(motorista);
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public void adicionarEletroposto(Eletroposto eletroposto) {
        eletropostos.add(eletroposto);
    }

    public void removerEletroposto(Eletroposto eletroposto) {
        eletropostos.remove(eletroposto);
    }

    public List<Eletroposto> getEletropostos() {
        return eletropostos;
    }

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public void removerViagem(Viagem viagem) {
        viagens.remove(viagem);
    }

    public List<Viagem> getViagens() {
        return viagens;
    }

    public List<CarroEletrico> getCarrosComAutonomiaBaixa() {
        List<CarroEletrico> carrosComAutonomiaBaixa = new ArrayList<>();
        for (CarroEletrico carro : carros) {
            if (carro.getAutonomiaAtual() < 0.2 * carro.getCapacidadeBateria()) {
                carrosComAutonomiaBaixa.add(carro);
            }
        }
        return carrosComAutonomiaBaixa;
    }

    public List<Viagem> getViagensDeMotorista(List<Motorista> motorista) {
        List<Viagem> viagensDeMotorista = new ArrayList<>();
        for (Viagem viagem : viagens) {
            if (viagem.getMotorista().equals(motorista)) {
                viagensDeMotorista.add(viagem);
            }
        }
        return viagensDeMotorista;
    }

    public List<Recarga> getRecargasDeCarro(List<CarroEletrico> carro) {
        List<Recarga> recargasDeCarro = new ArrayList<>();
        for (Viagem viagem : viagens) {
            for (Recarga recarga : viagem.getRecargas()) {
                if (recarga.getCarro().equals(carro)) {
                    recargasDeCarro.add(recarga);
                }
            }
        }
        return recargasDeCarro;
    }

    public List<CarroEletrico> getCarrosQuePrecisamDeManutencao() {
        List<CarroEletrico> carrosQuePrecisamDeManutencao = new ArrayList<>();
        for (CarroEletrico carro : carros) {
            if (carro.getAutonomiaAtual() < 0.1 * carro.getCapacidadeBateria() || carro.getAutonomiaAtual() < 50) {
                carrosQuePrecisamDeManutencao.add(carro);
            }
        }
        return carrosQuePrecisamDeManutencao;
    }
}
