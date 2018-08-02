package ObjectOriented.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectReader;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.type.TypeReference;

import DataStructure.core.customLinkedList;
import ObjectOriented.core.ObjectsUtil;

public class util {
	private static Scanner scan = new Scanner(System.in);
	public List<ObjectsUtil> cs = new ArrayList<ObjectsUtil>();
	public static int getIntcust()
	{
		return scan.nextInt();
	}
	public static String getStringcust()
	{
		return scan.next();
	}
	public static String getStr()
	{
		return scan.next();
	}
	
	  public static List<String> allFilesInFolder(String path) {
	        File folder = new File(path);
	        File[] allFiles = folder.listFiles(new FilenameFilter() {
	            @Override
	            public boolean accept(File dir, String name) {
	                return name.toLowerCase().endsWith(".json");
	            }
	        });
	        List<String> Files = new ArrayList<>();
	        for (int i = 0; i < allFiles.length; i++) {
	            Files.add(allFiles[i].getName());
	        }
	        return Files;
	    }
	public void writeToFile(File fileName) throws JsonGenerationException , JsonMappingException , IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(cs);
		System.out.println("JSON String "+jsonString);
		ObjectWriter writer = mapper.writer();
		writer.writeValue(new File("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/OOPs.json"), cs);
	}
	public void ReadFromFile()
	{
		try{
			
		ObjectMapper mapper = new ObjectMapper();
		cs = mapper.readValue(new File("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/OOPs.json"), new TypeReference<ArrayList<ObjectsUtil>>() {});
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("file empty");
		}
	}

	public static double getRandomDoubleBetweenRange(double min, double max){
	    double x = (Math.random()*((max-min)+1))+min;
	    return x;
	}
	public static long getLong() {
		// TODO Auto-generated method stub
		return scan.nextLong();
	}
}
