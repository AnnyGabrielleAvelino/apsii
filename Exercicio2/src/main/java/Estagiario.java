public class Estagiario extends Funcionario {
    private double bolsaAuxilio;
    private int cargaHorariaSemanal;

    // Construtor repassando os dados básicos para o Funcionario
    public Estagiario(String nome, String matricula, double salarioBase, String dataAdmissao, 
                      double bolsaAuxilio, int cargaHorariaSemanal) {
        super(nome, matricula, salarioBase, dataAdmissao);
        this.bolsaAuxilio = bolsaAuxilio;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    // Sobrescreve o salário para retornar apenas o valor da bolsa
    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    // Sobrescreve o desconto para retornar zero
    @Override
    public double calcularDesconto() {
        return 0.0;
    }

    // Getters
    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }
}