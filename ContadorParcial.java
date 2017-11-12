package prueba;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Parcial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//A string with all alphabet
		String alphabet = "abcdefghijklmnñopqrstuvwxyz";
		String input = br.readLine();
		
		char result = '1';
		int max = 0;
		
		for(int i = 0; i < alphabet.length(); i++)
			if(counterCharacters(input, alphabet.charAt(i))> max)
			{
      //Character counter
				result = alphabet.charAt(i);
				max = counterCharacters(input, alphabet.charAt(i));
			}
		
		bw.write("El caracter que mas se repite es " + result + " y aparece " + max + " veces\n");
		
		bw.flush();
	}
	public static int counterCharacters(String input, char character)
	{
		int counter = 0;
				
		for(int i= 0; i< input.length(); i++)
				counter += input.charAt(i) == character ? 1 : 0;
		//More repeated character
		return counter;
	}

}
