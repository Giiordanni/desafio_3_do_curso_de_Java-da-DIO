package celular;

public class Iphone implements Reprodutor_Musical, Aparelho_Telefonico, Navegador_na_Internet{


	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Página");
	}

	@Override
	public void adicionarNovaPagina() {
		System.out.println("Adicionando nova página");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo o telefone");
	}

	@Override
	public void iniciarCorreiodeVoz() {
		System.out.println("Iniciando o correio de voz");		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música");
		
	}
	

}
