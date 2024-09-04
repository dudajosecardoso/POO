public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        // Criar funcionários
        Funcionario funcionario1 = new Funcionario(1, 40, 20);
        Funcionario funcionario2 = new Funcionario(2, 30, 25);
        Funcionario funcionario3 = new Funcionario(3, 50, 30);

        // Adicionar funcionários à folha de pagamento
        folha.addFuncionario(funcionario1);
        folha.addFuncionario(funcionario2);
        folha.addFuncionario(funcionario3);

        // Calcular salário de cada funcionário
        funcionario1.calcularSalario();
        funcionario2.calcularSalario();
        funcionario3.calcularSalario();

        // Ordenar funcionários por salário
        folha.ordenar();

        // Exibir funcionários ordenados
        folha.exibir();
    }
}
