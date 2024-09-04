public class Funcionario {
    private int codigo;
    private double quantidadeHoras;
    private double valorHora;
    private double valorSalario;
    private double quantidadeHorasExtras;

    // Construtor
    public Funcionario(int codigo, double quantidadeHoras, double valorHora) {
        this.codigo = codigo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
        this.valorSalario = 0;
        this.quantidadeHorasExtras = 0;
    }

    public int getcodigo(){
        return codigo;
    }

    public double getquantidadeHoras(){
        return quantidadeHoras;
    }

    public double getvalorHora(){
        return valorHora;
    }

    public double getvalorSalario(){
        return valorSalario;
    }

    public double getquantidadeHorasExtras(){
        return quantidadeHorasExtras;
    }

    // Método calcularHoraExtra
    public double calcularHoraExtra() {
        return (valorHora * quantidadeHorasExtras) * 1.5;
    }

    // Método calcularSalario
    public void calcularSalario() {
        valorSalario = valorHora * quantidadeHoras + calcularHoraExtra();
    }

    // Método exibir
    public void exibir() {
        System.out.println("Código: " + codigo);
        System.out.println("Salário: " + valorSalario);
        System.out.println("Quantidade de horas trabalhadas: " + quantidadeHoras);
    }
}
