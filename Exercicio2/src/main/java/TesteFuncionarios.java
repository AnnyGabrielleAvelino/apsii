public class TesteFuncionarios {

    public static void main(String[] args) {
        // 1. Criando um Funcionario padrão
        Funcionario f1 = new Funcionario("Ana Costa", "F001", 2500.0, "01/03/2020");

        // 2. Criando um FuncionarioCLT
        FuncionarioCLT f2 = new FuncionarioCLT("Bruno Reis", "C001", 3000.0, "10/06/2021", 220.0, 400.0);

        // 3. Criando um Gerente (Equipe: 12 pessoas, Bônus: 20% -> 0.20)
        Gerente f3 = new Gerente("Carla Mendes", "G001", 8000.0, "15/01/2018", 300.0, 500.0, 12, 0.20);

        // 4. Criando um Estagiario
        Estagiario f4 = new Estagiario("Diego Alves", "E001", 0.0, "05/08/2024", 1500.0, 20);

        // Imprimindo as informações de cada um no console
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }
}