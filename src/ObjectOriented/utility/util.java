package ObjectOriented.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
	static Scanner scan = new Scanner(System.in);
	public List<ObjectsUtil> cs = new ArrayList<ObjectsUtil>();
	public int getIntcust()
	{
		return scan.nextInt();
	}
	public String getStringcust()
	{
		return scan.next();
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

		FileReader reader = new FileReader(new File("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/OOPs.json"));
		BufferedReader bf = new BufferedReader(reader);
		String outputString = "";
		String jsonString = "";
		ObjectsUtil ou = new ObjectsUtil();
		while((outputString = bf.readLine()) != null){
			//String outputString = bf.readLine();
			jsonString = jsonString + outputString;
		}
		
		
		System.out.println(jsonString);
		cs = mapper.readValue(new File("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/OOPs.json"), new TypeReference<ArrayList<ObjectsUtil>>() {});
	System.out.println("Name:" +cs.get(0).getName());
		//ou = mapper.readValue(jsonString, ObjectsUtil.class);
	/*	JsonNode node =  mapper.readTree(fileName);
		
		for(JsonNode obj:node)
		{
			System.out.println(obj);
			ObjectsUtil ob = mapper.treeToValue(obj, ObjectsUtil.class);
			cs.add(ob);
		}*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("file empty");
		}
	}

}
