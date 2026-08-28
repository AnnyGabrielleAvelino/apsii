public class Gerente extends FuncionarioCLT {
    private int tamanhoEquipe;
    private double percentualBonus; // Exemplo: 0.20 para 20%

    // Construtor usando super para repassar os dados para FuncionarioCLT
    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    // Soma o cálculo do FuncionarioCLT + (salarioBase * percentualBonus)
    @Override
    public double calcularSalario() {
        double bonus = getSalarioBase() * percentualBonus;
        return super.calcularSalario() + bonus;
    }

    // Mantém o desconto do FuncionarioCLT e adiciona R$ 100 se a equipe tiver > 10 pessoas
    @Override
    public double calcularDesconto() {
        double desconto = super.calcularDesconto();
        if (tamanhoEquipe > 10) {
            desconto += 100.0;
        }
        return desconto;
    }

    // Getters
    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }
}
