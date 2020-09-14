package cardapio.main;

import java.util.Scanner;

import cardapio.menu.MenuCardapio;

public class Cardapio {


	public void menuInicial() {
		Scanner teclado = new Scanner(System.in);
		MenuCardapio menucardapio = new MenuCardapio();
		int opcao = 0;
		
		do {
			System.out.println("---------Restaurante--------");
			System.out.println("---------Cardapio-----------");
			System.out.println("1 - Vinhos                  ");
			System.out.println("2 - Bebidas                 ");
			System.out.println("3 - Pratos                  ");
			opcao = teclado.nextInt(); 
			
			switch (opcao) {
			case 1:
				menucardapio.visualizarVinhos();
				break;
			}
			
		}while(opcao != 1);
	}
	
	
	public static void main(String[] args) {
		
		Cardapio c = new Cardapio();
		c.menuInicial();
	}
}
