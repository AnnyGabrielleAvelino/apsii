public class FuncionarioCLT extends Funcionario {
    private double valeTransporte;
    private double valeAlimentacao;

    // Construtor usando o super para chamar o construtor do Funcionario
    public FuncionarioCLT(String nome, String matricula, double salarioBase, String dataAdmissao, 
                          double valeTransporte, double valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }

    // Sobrescreve o cálculo do salário adicionando os benefícios ao salário base
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valeTransporte + valeAlimentacao;
    }

    // Sobrescreve o cálculo do desconto aproveitando o cálculo da mãe + R$ 50,00
    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + 50.0;
    }

    // Getters para os novos atributos
    public double getValeTransporte() {
        return valeTransporte;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }
}