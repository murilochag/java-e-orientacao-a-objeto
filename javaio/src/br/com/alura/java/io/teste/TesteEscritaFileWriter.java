package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {

		// OutputStream fos = new FileOutputStream("arquivo2.txt");
		// Writer osw = new OutputStreamWriter(fos);
		// BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("arquivo2.txt"); // pode usar somente esse tambem
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt")); // usar caso quaisa ultilizar o metodo newLine()

		bw.write("Que eu me torne em todos os momentos, agora e para sempre,");
		bw.write(System.lineSeparator());
		bw.newLine();
		bw.write("Um protetor para os sem proteção,");

		bw.close();
		
		// 

	}
}
