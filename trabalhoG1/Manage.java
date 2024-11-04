import java.util.List;
import java.util.Scanner;

public class Manage {
    public static void main(String[] args) {
        GestaoFrota gestaoFrota = new GestaoFrota();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Sistema de Gestão de Frota de Carros Elétricos ===");
            System.out.println("1. Adicionar Carro Elétrico");
            System.out.println("2. Adicionar Motorista");
            System.out.println("3. Adicionar Eletroposto");
            System.out.println("4. Registrar Viagem");
            System.out.println("5. Realizar Recarga");
            System.out.println("6. Gerar Relatórios");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do carro: ");
                    String idCarro = scanner.nextLine();
                    System.out.print("Digite a marca do carro: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o ano de fabricação: ");
                    int anoFabricacao = scanner.nextInt();
                    System.out.print("Digite a capacidade da bateria (kWh): ");
                    double capacidadeBateria = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Escolha a categoria do carro:");
                    System.out.println("1. Carro Compacto");
                    System.out.println("2. Carro Sedan");
                    System.out.println("3. SUV Elétrico");
                    int categoria = scanner.nextInt();
                    scanner.nextLine();

                    CarroEletrico carro;
                    switch (categoria) {
                        case 1:
                            carro = new CarroCompacto(idCarro, marca, modelo, anoFabricacao, capacidadeBateria);
                            break;
                        case 2:
                            carro = new CarroSedan(idCarro, marca, modelo, anoFabricacao, capacidadeBateria);
                            break;
                        case 3:
                            carro = new SuvEletrico(idCarro, marca, modelo, anoFabricacao, capacidadeBateria);
                            break;
                        default:
                            System.out.println("Categoria inválida.");
                            continue;
                    }
                    gestaoFrota.adicionarCarro(carro);
                    System.out.println("Carro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do motorista: ");
                    String nomeMotorista = scanner.nextLine();
                    System.out.print("Digite o ID do motorista: ");
                    String idMotorista = scanner.nextLine();
                    System.out.print("Digite o número da CNH: ");
                    String numeroCNH = scanner.nextLine();
                    System.out.print("Digite o nível de experiência (Iniciante, Intermediário, Avançado): ");
                    String nivelExperiencia = scanner.nextLine();

                    Motorista motorista = new Motorista(nomeMotorista, idMotorista, numeroCNH, nivelExperiencia);
                    gestaoFrota.adicionarMotorista(motorista);
                    System.out.println("Motorista adicionado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o ID do eletroposto: ");
                    String idEletroposto = scanner.nextLine();
                    System.out.print("Digite o local do eletroposto: ");
                    String localEletroposto = scanner.nextLine();
                    System.out.print("Digite o número de vagas disponíveis: ");
                    int vagasDisponiveis = scanner.nextInt();
                    System.out.print("Digite o tempo médio de carregamento (horas): ");
                    double tempoMedioCarregamento = scanner.nextDouble();
                    scanner.nextLine();

                    Eletroposto eletroposto = new Eletroposto(idEletroposto, localEletroposto, vagasDisponiveis,
                            tempoMedioCarregamento);
                    gestaoFrota.adicionarEletroposto(eletroposto);
                    System.out.println("Eletroposto adicionado com sucesso!");
                    break;

                case 4:
                    System.out.print("Digite o ID do motorista: ");
                    String idMotoristaViagem = scanner.nextLine();
                    System.out.print("Digite o ID do carro: ");
                    String idCarroViagem = scanner.nextLine();
                    System.out.print("Digite a distância percorrida (km): ");
                    double distanciaPercorrida = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite o destino: ");
                    String destino = scanner.nextLine();

                    Motorista motoristaViagem = null;
                    for (Motorista motoristaIter : gestaoFrota.getMotoristas()) {
                        if (motoristaIter.getId().equals(idMotoristaViagem)) {
                            motoristaViagem = motoristaIter;
                            break;
                        }
                    }
                    if (motoristaViagem == null) {
                        System.out.println("Motorista não encontrado.");
                        continue;
                    }

                    CarroEletrico carroViagem = null;
                    for (CarroEletrico carroIter : gestaoFrota.getCarros()) {
                        if (carroIter.getId().equals(idCarroViagem)) {
                            carroViagem = carroIter;
                            break;
                        }
                    }
                    if (carroViagem == null) {
                        System.out.println("Carro não encontrado.");
                        continue;
                    }

                    Viagem viagem = new Viagem(motoristaViagem, carroViagem, distanciaPercorrida, destino);
                    gestaoFrota.adicionarViagem(viagem);
                    System.out.println("Viagem registrada com sucesso!");
                    break;

                case 5:
                    System.out.print("Digite o ID do carro: ");
                    String idCarroRecarga = scanner.nextLine();
                    System.out.print("Digite o ID do eletroposto: ");
                    String idEletropostoRecarga = scanner.nextLine();
                    System.out.print("Digite a quantidade recarregada (kWh): ");
                    double quantidadeRecarregada = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a data da recarga (YYYY-MM-DD): ");
                    String dataRecarga = scanner.nextLine();

                    CarroEletrico carroRecarga = null;
                    for (CarroEletrico carroIter : gestaoFrota.getCarros()) {
                        if (carroIter.getId().equals(idCarroRecarga)) {
                            carroRecarga = carroIter;
                            break;
                        }
                    }
                    if (carroRecarga == null) {
                        System.out.println("Carro não encontrado.");
                        continue;
                    }

                    Eletroposto eletropostoRecarga = null;
                    for (Eletroposto eletropostoIter : gestaoFrota.getEletropostos()) {
                        if (eletropostoIter.getId().equals(idEletropostoRecarga)) {
                            eletropostoRecarga = eletropostoIter;
                            break;
                        }
                    }
                    if (eletropostoRecarga == null) {
                        System.out.println("Eletroposto não encontrado.");
                        continue;
                    }

                    Recarga recarga = new Recarga(carroRecarga, eletropostoRecarga, quantidadeRecarregada, dataRecarga);
                    for (Viagem viagemIter : gestaoFrota.getViagens()) {
                        if (viagemIter.getCarro().equals(carroRecarga)) {
                            viagemIter.adicionarRecarga(recarga);
                            break;
                        }
                    }
                    System.out.println("Recarga realizada com sucesso!");
                    break;

                case 6:
                    System.out.println("Relatórios:");
                    System.out.println("1. Carros com autonomia baixa");
                    System.out.println("2. Viagens de um motorista");
                    System.out.println("3. Recargas de um carro");
                    System.out.println("4. Carros que precisam de manutenção");
                    int opcaoRelatorio = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoRelatorio) {
                        case 1:
                            List<CarroEletrico> carrosComAutonomiaBaixa = gestaoFrota.getCarrosComAutonomiaBaixa();
                            System.out.println("Carros com autonomia baixa:");
                            for (CarroEletrico carros : carrosComAutonomiaBaixa) {
                                System.out.println(carros.getId());
                            }
                            break;

                        case 2:
                            List<Viagem> viagensDeMotorista = gestaoFrota
                                    .getViagensDeMotorista(gestaoFrota.getMotoristas());
                            System.out.println(" Viagens do motorista:");
                            for (Viagem viagens : viagensDeMotorista) {
                                System.out.println(viagens.getDestino());
                            }
                            break;

                        case 3:
                            List<Recarga> recargasDeCarro = gestaoFrota.getRecargasDeCarro(gestaoFrota.getCarros());
                            System.out.println("Recargas do carro:");
                            for (Recarga recargas : recargasDeCarro) {
                                System.out.println(recargas.getDataRecarga());
                            }
                            break;

                        case 4:
                            List<CarroEletrico> carrosQuePrecisamDeManutencao = gestaoFrota
                                    .getCarrosQuePrecisamDeManutencao();
                            System.out.println("Carros que precisam de manutenção:");
                            for (CarroEletrico carros : carrosQuePrecisamDeManutencao) {
                                System.out.println(carros.getId());
                            }
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
