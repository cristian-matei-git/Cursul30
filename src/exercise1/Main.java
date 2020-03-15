package exercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static List<String> readFile() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("TextInput.txt"))){
            List<String> listOfData = new ArrayList<>();
            String d;
            while((d = br.readLine()) != null){
                listOfData.add(d);
            }
            return listOfData;
        }
    }

    public static void writeFile(List<String> listOfData, String wordToSub, String wordToSearch) throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("TextOutput.txt"))){
            for(String str: listOfData){
            	
            	String[] words =  str.split("\\W+");
            	
            	for(String word : words) {
            		
            		if(word.equals(wordToSearch)) {
                		bw.write(wordToSub + " ");
                		continue;
                	}
            		
            		bw.write(word + " ");
            		
            	}
            	
                bw.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> data = readFile();
        Scanner sc = new Scanner(System.in);
        
        String wordToSub = sc.nextLine();
        String wordToSearch = sc.nextLine();
        
        writeFile(data, wordToSub, wordToSearch);
        sc.close();
    }

}
