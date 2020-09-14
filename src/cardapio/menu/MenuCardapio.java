package cardapio.menu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MenuCardapio {

	static StringBuffer memoria = new StringBuffer();

	public void visualizarPratos() throws FileNotFoundException {
		java.io.File file = new java.io.File("/home/debian/produtos/");
		try {
			FileReader reader = new FileReader(file);
			BufferedReader input = new BufferedReader(reader);
			String linha;
			while ((linha = input.readLine()) != null) {
				System.out.println(linha);
			}
			input.close();
		} catch (IOException ioe) {
			System.out.println(ioe);
		}

	}

	public void visualizarBebidas() {
		java.io.File file = new java.io.File("/home/debian/produtos/");
		try {
			FileReader reader = new FileReader(file);
			BufferedReader input = new BufferedReader(reader);
			String linha;
			while ((linha = input.readLine()) != null) {
				System.out.println(linha);
			}
			input.close();
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}

	public void visualizarVinhos() {
		java.io.File file = new java.io.File("/home/debian/produtos/vinhos-tabulados.txt");
		try {
			FileReader reader = new FileReader(file);
			BufferedReader input = new BufferedReader(reader);
			String linha;
			while ((linha = input.readLine()) != null) {
				System.out.println(linha);
			}
			input.close();
		} catch (IOException ioe) {
			System.out.println(ioe);
		}

	}

	public void comprarVinhos() {
		
	}
}
