package exercise2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner br1 = new Scanner(new FileReader("Numbers1.txt"));
		Scanner br2 = new Scanner(new FileReader("Numbers2.txt"));
		FileWriter output = new FileWriter("NumbersMerge.txt");
		
		int i = 0;
		int j = 0;
		
		String[] numbers1 = br1.nextLine().split(" ");
		String[] numbers2 = br2.nextLine().split(" ");
		
		while (i < numbers1.length && j < numbers2.length) {
	         if (Integer.parseInt(numbers1[i]) < Integer.parseInt(numbers2[j])) output.write(numbers1[i++] + " ");
	         else output.write(numbers2[j++] + " ");
	      }
	      while (i < numbers1.length) output.write(numbers1[i++] + " ");
	      while (j < numbers2.length) output.write(numbers2[j++] + " ");
	      
	      output.flush();
	      output.close();
	      br1.close();
	      br2.close();
	      
	}

}
