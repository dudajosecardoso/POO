import java.util.Arrays;
import java.util.Objects;

public class FolhaPagamento {
    private Funcionario[] funcionarios = new Funcionario[50];

    // Método ordenar
public void ordenar() {
    Funcionario[] funcionariosNonNull = Arrays.stream(funcionarios)
            .filter(Objects::nonNull)
            .toArray(Funcionario[]::new);
    Arrays.sort(funcionariosNonNull, (d1, d2) -> Double.compare(d2.getvalorSalario(), d1.getvalorSalario()));
    funcionarios = funcionariosNonNull;
}

    // Método exibir
public void exibir() {
    for (Funcionario funcionario : funcionarios) {
        if (funcionario != null) {
            funcionario.exibir();
            System.out.println();
        }
    }
}

    // Método addFuncionario
    public void addFuncionario(Funcionario funcionario) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = funcionario;
                break;
            }
        }
    }
}
