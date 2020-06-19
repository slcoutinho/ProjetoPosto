
public class PostoTeste {
	public static void main(String args[]) {
		Posto p1 = new Posto ("Gasolina", 4.39);
		
		p1.abastecerPorLitro(45);
		p1.exibirRecibo();
		
		System.out.println("\n\n");
		p1.abastecerPorValor(150.0);
		p1.exibirRecibo();
	}
}