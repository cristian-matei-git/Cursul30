package exercise3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		String text = "";
		
		while(true) {
			String currentWord = sc.nextLine();
			
			if(currentWord.equals("quit")) break;
			
			text += currentWord + "\n";
		}
		
		List<String> words = Arrays.asList(text.split("\n"));
		Collections.sort(words);
		
		String shortestWord = words.stream().min(
                Comparator.comparing(
                word -> word.length()))
               .get();
		
		String longestWord = words.stream().max(
                Comparator.comparing(
                word -> word.length()))
               .get();
		
		String firstWord = words.get(0);
		String lastWord = words.get(words.size() - 1);
		
		
		BufferedWriter br = new BufferedWriter(new FileWriter("result.txt"));
		
		br.write("1. Cel mai scurt cuvant: " + shortestWord + "\n");
		br.write("2. Cel mai lung cuvant: " + longestWord + "\n");
		br.write("3. Primul cuvant in ordine alfabetica: " + firstWord + "\n");
		br.write("4. Ultimul cuvant in ordine alfabetica: " + lastWord + "\n");
		br.write("5. Numarul total de cuvinte: " + words.size() + "\n");
		
		br.close();
		
	}

}
