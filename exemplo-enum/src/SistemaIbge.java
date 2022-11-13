
public class SistemaIbge {

	public static void main(String[] args) {

		for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
			System.out.println(e.getNomeMaiusculo() + " / " + e.getSigla() + " / Código IBGE: " + e.getCodigoIbge());
		}
		
		EstadosBrasileiros eb = EstadosBrasileiros.PARANA;
		
		System.out.println(eb.getSigla());
		System.out.println(eb.getNome());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getCodigoIbge());

	}

}
