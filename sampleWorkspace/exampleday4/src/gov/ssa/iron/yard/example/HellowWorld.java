package gov.ssa.iron.yard.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.util.List;

public class HellowWorld {
	

	public static void main(String[] args) {
		List<String> lines = null;
		String currentPath = null;
		try {
			currentPath = new java.io.File(".").getCanonicalPath();
			System.out.println("Current Path : " + currentPath);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			lines = Files.readAllLines(Paths.get("word.txt"), StandardCharsets.UTF_8);
			int i =0;
			for (String s : lines){
				System.out.println( i + " : " + s);
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Printing Stack Trace Again without System.Err --");
			e.printStackTrace(System.err);
		}
		
		lines.size();
	}
}