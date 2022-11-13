
public class Carro extends Veiculo{
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
		
	private void confereCambio() {
		System.out.println("Câmbio na Posição P");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo Combustível");
	}

}
