
public class Moto {
	public class Moto extends Veiculo {
		public int cilindradas;

		public Moto(String modelo, int ano, int cilindradas) {
		super(modelo,ano);
		this.cilindradas = cilindradas;
		}
		@override
		public String imprimeDetalhes() {
		return super.imprimeDetalhes() + "Quantidade de cilindradas: " + this.cilindradas;
		}
		}
}
