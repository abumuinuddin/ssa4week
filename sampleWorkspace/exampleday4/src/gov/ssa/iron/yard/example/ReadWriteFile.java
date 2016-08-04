package gov.ssa.iron.yard.example;



import java.io.*;

public class ReadWriteFile {

	public static void main(String[] args) {
        
		String readFileName = "words.txt";
		String writeFileName = "sort.txt";

		readFile(readFileName);
		writeFile(writeFileName);        

	}

	private static void writeFile(String fileName) {
		
		try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append("Mode 2 development --");
            bufferedWriter.newLine();
            bufferedWriter.append("Day 1- Java/HTML/JavaScript");
            bufferedWriter.newLine();
            bufferedWriter.append("Day 2 : AJAX");
            bufferedWriter.newLine();
            bufferedWriter.append("Day 3-4: java");
            
            

            // Always close files.
            bufferedWriter.close();
        } catch(IOException ex) {
        	
            System.out.println("Error writing to file '" + fileName + "'");
            ex.printStackTrace(System.err);
            
        }
	}

	private static void readFile(String fileName) {
		String line;
		try {
            FileReader fileReader = new FileReader(fileName);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to locate file :'" + fileName + "'");                
        }
        catch(IOException ex) {
            
        	System.out.println("Unable to Read file : '"  + fileName + "'");                  
            ex.printStackTrace();
            
        }
	}

}