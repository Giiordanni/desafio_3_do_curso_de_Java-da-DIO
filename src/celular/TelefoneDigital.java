package celular;

import java.util.Scanner;

public class TelefoneDigital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Iphone iphone = new Iphone();
		
		System.out.println("-------Iphone----------");
		
		int acao = 0;
	
		do{
			System.out.println("\n1- Fazer uma ligação(1)\n2- Ouvir uma música(2)\n3- Navegar na internet(3)\n0- Desligar aparelho");
			acao = sc.nextInt();
			switch(acao){
			  case 1: 
				System.out.println("---------Ligação---------");
				iphone.ligar();
				iphone.atender();
				iphone.iniciarCorreiodeVoz();
				break;
			  case 2:
				  System.out.println("---------Música---------");
				  iphone.tocar();
				  iphone.pausar();
				  iphone.selecionarMusica();
				  break;
			  case 3: 
				  System.out.println("---------Internet---------");
				  iphone.adicionarNovaPagina();
				  iphone.exibirPagina();
				  iphone.atualizarPagina();
				  break;
			  case 0: 
				  break;
			  default:
				System.out.println("Opcao inválida");
				
			}
			
		}while(acao != 0);
		System.out.println("Desligando aparelho");
		
	}

}
