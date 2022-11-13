package smartphone;

import smartphone.navegador.Navegador;
import smartphone.reprodutor.ReprodutorMusical;
import smartphone.telefone.Aparelho;

public class Iphone implements Navegador, ReprodutorMusical, Aparelho{

	@Override
	public void ligar() {
		System.out.println("Fazendo uma ligação");		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma ligação");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o Correio de Voz");		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a Música no iMusic");		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a Música no iMusic");		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando a Música no iMusic");		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a Página no Chrome");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba no Chrome");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a Página no Chrome");		
	}

}
