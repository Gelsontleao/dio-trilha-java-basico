
public enum EstadosBrasileiros {
	
	SAO_PAULO ("SP","São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
	PIAUI ("PI", "Piauí", 13),
	MARANHAO ("MA","Maranhão", 14),
	PARANA ("PR", "Paraná", 15),
	SANTA_CATARINA ("SC", "Santa Catarina", 16),
	RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul", 17)
	;
	
	private String nome;
	private String sigla;
	private int codigoIbge;
	
	private EstadosBrasileiros(String sigla, String nome, int codigoIbge) {
		this.sigla = sigla;
		this.nome = nome;
		this.codigoIbge = codigoIbge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	public int getCodigoIbge() {
		return codigoIbge;
	}
}
