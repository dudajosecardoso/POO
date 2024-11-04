
// Classe GestaoFrota
import java.util.ArrayList;
import java.util.List;

public class GestaoFrota {
    private List<CarroEletrico> carros;
    private List<Motorista> motoristas;
    private List<Eletroposto> eletropostos;
    private List<Viagem> viagens;

    // Método Construtor
    public GestaoFrota() {
        this.carros = new ArrayList<>();
        this.motoristas = new ArrayList<>();
        this.eletropostos = new ArrayList<>();
        this.viagens = new ArrayList<>();
    }

    // Métodos de Adição e Remoção de itens dos Arrays
    public void adicionarCarro(CarroEletrico carro) {
        carros.add(carro);
    }

    public void removerCarro(CarroEletrico carro) {
        carros.remove(carro);
    }

    public void adicionarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void removerMotorista(Motorista motorista) {
        motoristas.remove(motorista);
    }

    public void adicionarEletroposto(Eletroposto eletroposto) {
        eletropostos.add(eletroposto);
    }

    public void removerEletroposto(Eletroposto eletroposto) {
        eletropostos.remove(eletroposto);
    }

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public void removerViagem(Viagem viagem) {
        viagens.remove(viagem);
    }

    // Getters
    public List<CarroEletrico> getCarros() {
        return carros;
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public List<Eletroposto> getEletropostos() {
        return eletropostos;
    }

    public List<Viagem> getViagens() {
        return viagens;
    }

    // Método para obter carros com autonomia baixa
    public List<CarroEletrico> getCarrosComAutonomiaBaixa() {
        List<CarroEletrico> carrosComAutonomiaBaixa = new ArrayList<>();
        for (CarroEletrico carro : carros) {
            if (carro.temAutonomiaBaixa()) {
                carrosComAutonomiaBaixa.add(carro);
            }
        }
        return carrosComAutonomiaBaixa;
    }

    // Método para obter viagens de um motorista específico
    public List<Viagem> getViagensDeMotorista(String idMotorista) {
        List<Viagem> viagensDeMotorista = new ArrayList<>();
        for (Viagem viagem : viagens) {
            if (viagem.getMotorista().getId().equals(idMotorista)) {
                viagensDeMotorista.add(viagem);
            }
        }
        return viagensDeMotorista;
    }

    // Método para obter recargas de um carro específico
    public List<Recarga> getRecargasDeCarro(String idCarro) {
        List<Recarga> recargasDeCarro = new ArrayList<>();
        for (Viagem viagem : viagens) {
            for (Recarga recarga : viagem.getRecargas()) {
                if (recarga.getCarro().getId().equals(idCarro)) {
                    recargasDeCarro.add(recarga);
                }
            }
        }
        return recargasDeCarro;
    }

    // Método para obter carros que precisam de manutenção
    public List<CarroEletrico> getCarrosQuePrecisamDeManutencao() {
        List<CarroEletrico> carrosQuePrecisamDeManutencao = new ArrayList<>();
        for (CarroEletrico carro : carros) {
            if (carro.precisaDeManutencao()) {
                carrosQuePrecisamDeManutencao.add(carro);
            }
        }
        return carrosQuePrecisamDeManutencao;
    }
}
