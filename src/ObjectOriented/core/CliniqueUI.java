package ObjectOriented.core;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import ObjectOriented.utility.util;



public class CliniqueUI {
	private static List<Doctors> allDoctors;
	private static List<Patient> allPatients;
	private static Map<Doctors, ArrayList<Patient>> appointments = new HashMap<>();

	static public List<Doctors> readDoctorData() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		allDoctors = mapper.readValue(
				new File("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/Doctors.json"),
				new TypeReference<ArrayList<Doctors>>() {
				});
		return allDoctors;
	}

	static public List<Patient> readPatientData() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			allPatients = mapper.readValue(
					new File("/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/Patients.json"),
					new TypeReference<ArrayList<Patient>>() {
					});
		} catch (Exception e) {
			allPatients = new ArrayList<Patient>();
		}
		return allPatients;
	}

	static public Doctors searchDoctor(int id) {
		util.getStringcust();
		for (Doctors doctor : allDoctors) {
			if (doctor.Id == id) {
				return doctor;
			}
		}
		return null;
	}

	static public Doctors searchDoctor(int type, String data) {
		switch (type) {
		case 1: {
			for (Doctors doctor : allDoctors) {
				if (doctor.Name.equals(data)) {
					return doctor;
				}
			}
			break;
		}
		case 2: {
			for (Doctors doctor : allDoctors) {
				if (doctor.Specialization.equals(data)) {
					return doctor;
				}
			}
			break;
		}
		case 3: {
			for (Doctors doctor : allDoctors) {
				if (doctor.Availability.equals(data)) {
					return doctor;
				}
			}
			break;
		}
		}
		return null;
	}

	static public Patient searchPatient(String data) {
		for (Patient patient : allPatients) {
			if (patient.Name.equals(data)) {
				return patient;
			}
		}
		return null;
	}

	static public Patient searchPatient(int type, int data) {
		switch (type) {
		case 2: {
			for (Patient patient : allPatients) {
				if (patient.ID == data) {
					return patient;
				}
			}
			break;
		}
		case 3: {
			for (Patient patient : allPatients) {
				if (patient.MobileNumber == data) {
					return patient;
				}
			}
			break;
		}
		}
		return null;
	}

	static public void printDoctorDetails(Doctors doctor) {
		System.out.print("\nName: " + doctor.getName());
		System.out.print("\nID: " + doctor.getId());
		System.out.print("\nSpecialization: " + doctor.getSpecialization());
		System.out.print("\nAvailability: " + doctor.getAvailability());
	}

	static public void printPatientDetails(Patient patient) {
		System.out.print("\nName: " + patient.getName());
		System.out.print("\nID: " + patient.getID());
		System.out.print("\nSpecialization: " + patient.getMobileNumber());
		System.out.print("\nAvailability: " + patient.getAge());
	}

	static public Doctors setDoctorDetails() {
		Doctors doctor = new Doctors();
		System.out.print("\nEnter the name:");
		doctor.setName(util.getStringcust());
		System.out.print("\nEnter the specialization:");
		doctor.setSpecialization((util.getStringcust()));
		System.out.print("\nEnter the ID:");
		doctor.setId(util.getIntcust());
	System.out.print("\nEnter the availability:");
		doctor.setAvailability(util.getStringcust());
		return doctor;
	}

	static public Patient setPatientDetails() {
		Patient patient = new Patient();
		System.out.print("\nPatient Details");
		System.out.print("\nEnter name:");
		patient.setName(util.getStringcust());
		System.out.print("\nEnter ID:");
		patient.setID(util.getIntcust());
		System.out.print("\nEnter mobile number:");
		patient.setMobileNumber(util.getLong());
		System.out.print("\nEnter age");
		patient.setAge(util.getIntcust());
		return patient;
	}

	static public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException {
		allDoctors.add(setDoctorDetails());
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(allDoctors);
		String path = "/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/Doctors.json";
		FileWriter file = new FileWriter(path);
		file.write(json);
		file.close();
	}

	static public void addPatient() throws JsonGenerationException, JsonMappingException, IOException {
		allPatients.add(setPatientDetails());
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(allPatients);
		String path = "/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/Patients.json";
		FileWriter file = new FileWriter(path);
		file.write(json);
		file.close();
	}

	static public void askAppointmentDetails() {
		System.out.print("\nEnter the specialization:");
		String specialization = util.getStringcust();
		System.out.print("\nEnter the time (am/pm/any) :");
		String time = util.getStringcust();
		ArrayList<Doctors> doctor = new ArrayList<>();
		for (Doctors x : allDoctors) {
			if (x.getSpecialization().equals(specialization) && x.getAvailability().equals(time)) {
				doctor.add(x);
			}
		}
		if (doctor.size() == 0) {
			System.out.print("\nNo doctor found with this specialization!");
			return;
		}

		for (Doctors x : doctor) {
			if (appointments.containsKey(x)) {
				ArrayList<Patient> patientsWithAppointment = appointments.get(x);
				if (patientsWithAppointment.size() < 5) {
					patientsWithAppointment.add(setPatientDetails());
					appointments.put(x, patientsWithAppointment);
					System.out.print("\nAppointment set");
					return;
				}
			} else {
				ArrayList<Patient> patientsWithAppointment = new ArrayList<>();
				patientsWithAppointment.add(setPatientDetails());
				appointments.put(x, patientsWithAppointment);
				System.out.print("\nAppointment set");
				return;
			}
		}
		System.out.print("\ndoctor NA");
		return;
	}

	static public void bookAppointment() {
		System.out.print("\n1. specific doctor");
		System.out.print("\n2.  any doctor");
		int choice = util.getIntcust();
		util.getStringcust();
		int choice2;
		switch (choice) {
		case 1: {
			System.out.print("\nEnter the name of Doctor:");
			String name = util.getStringcust();
			Doctors doctor = searchDoctor(1, name);
			if (appointments.containsKey(doctor)) {
				int size = appointments.get(doctor).size();
				if (size < 5) {
					ArrayList<Patient> patientsWithAppointment = appointments.get(doctor);
					patientsWithAppointment.add(setPatientDetails());
					appointments.put(doctor, patientsWithAppointment);
				} else {
					System.out.print("\nThe doctor is not avail");
					System.out.print("\n1. Book an appointment with another doctor");
					System.out.print("\n2. Exit without booking");
					System.out.print("\nEnter choice:");
					choice2 = util.getIntcust();
					util.getStringcust();
					if (choice2 == 2) {
						break;
					}
					switch (choice2) {
					case 1: {
						askAppointmentDetails();
						break;
					}
					}
				}
			} else {
				ArrayList<Patient> patientsWithAppointment = new ArrayList<>();
				patientsWithAppointment.add(setPatientDetails());
				appointments.put(doctor, patientsWithAppointment);
			}
			break;
		}
		case 2: {
			askAppointmentDetails();
			break;
		}
		}
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		//allDoctors = readDoctorData();
	//	allPatients = readPatientData();

	

		while (true) {
			System.out.print("\n1. Add entry");
			System.out.print("\n2. Search a Doctor");
			System.out.print("\n3. Search a Patient");
			System.out.print("\n4. Book an appointment");
			System.out.print("\n5. Exit");
			System.out.print("\nEnter choice :");
			int choice = util.getIntcust();
		//	util.getStringcust();
			if (choice == 5) {
				break;
			}
			int choice2;
			switch (choice) {
			case 1: {
				while (true) {
					System.out.print("\n1. Add Doctor");
					System.out.print("\n2. Add Patient");
					System.out.print("\n3. Exit");
					System.out.print("\nEnter choice :");
					choice2 = util.getIntcust();
				
					if (choice2 == 3) {
						break;
					}
					switch (choice2) {
					case 1: {
						addDoctor();
						break;
					}
					case 2: {
						addPatient();
						break;
					}
					}
				}
				break;
			}
			case 2: {
				while (true) {
					System.out.print("\n1. Search by name");
					System.out.print("\n2. Search by specialization");
					System.out.print("\n3. Search by availability");
					System.out.print("\n4. Search by ID");
					System.out.print("\n5. Exit");
					choice2 = util.getIntcust();
				//	util.getStringcust();
					if (choice2 == 5) {
						break;
					}
					switch (choice2) {
					case 1: {
						System.out.print("\nEnter the doctor's name:");
						printDoctorDetails(searchDoctor(choice2, util.getStringcust()));
						break;
					}
					case 2: {
						System.out.print("\nEnter the specialization:");
						printDoctorDetails(searchDoctor(choice2, util.getStringcust()));
						break;
					}
					case 3: {
						System.out.print("\nEnter the availability time:");
						printDoctorDetails(searchDoctor(choice2, util.getStringcust()));
						break;
					}
					case 4: {
						System.out.print("\nEnter the ID:");
						printDoctorDetails(searchDoctor(util.getIntcust()));
						break;
					}
					}
				}
				break;
			}
			case 3: {
				while (true) {
					System.out.print("\n1. Search by name");
					System.out.print("\n2. Search by ID");
					System.out.print("\n3. Search by mobileNumber");
					System.out.print("\n4. Exit");
					choice2 = util.getIntcust();
					util.getStringcust();
					if (choice2 == 4) {
						break;
					}
					switch (choice2) {
					case 1: {
						System.out.print("\nEnter the patient's name:");
						System.out.print(searchPatient(util.getStringcust()).getName());
						break;
					}
					case 2: {
						System.out.print("\nEnter the ID:");
						System.out.print(searchPatient(util.getStringcust()).getID());
						break;
					}
					case 3: {
						System.out.print("\nEnter the mobile number:");
						System.out.print(searchPatient(util.getStringcust()).getMobileNumber());
						break;
					}
					}
				}
				break;
			}
			case 4: {
				bookAppointment();
				break;
			}
			}
		}
	}
}