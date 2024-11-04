//Classe Filha da classe CarroEletrico
public class SuvEletrico extends CarroEletrico {
    public SuvEletrico(String id, String marca, String modelo, int anoFabricacao, double capacidadeBateria) {
        super(id, marca, modelo, anoFabricacao, capacidadeBateria, 600); // Exemplo de autonomia acima de 400 km
    }
}
