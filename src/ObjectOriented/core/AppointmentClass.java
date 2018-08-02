package ObjectOriented.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import ObjectOriented.utility.util;

public class AppointmentClass {
	
	private String doctorName;
	private List<Patient> line = new ArrayList<>();
	
	public AppointmentClass(String name)
	{
		this.doctorName = name;
	}
	
	static public List<Doctors> readDoctorData() throws JsonParseException, JsonMappingException, IOException {
	
		ObjectMapper mapper = new ObjectMapper();
		allDoc = mapper.readValue(
				new File("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/Appointment.json"),
				new TypeReference<ArrayList<Doctors>>() {
				});
		return allDoc;
	}
	public boolean totalPatient(String name)
	{
    
	}
		

public void writeToFile()
{
	try {
	ObjectMapper mapper = new ObjectMapper();
AppointmentClass ab = new AppointmentClass(doctorName);
	
		String totalData = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(ab);
		FileWriter file;
		System.out.println(totalData);
		
	
			file = new FileWriter("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/Appointment.json");
			file.write(totalData);
			file.close();
	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
