package ObjectOriented.core;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockAccount {

	private static String path = "/home/bridgelabz/workspace/demo1/src/ObjectOriented/core/StockReport";
	private List<CompanyShares> sharesOfPerson = new ArrayList<>();
	private List<Stock> sharesAvailable = sharesAvailable();
	private Date date = new Date();

	public List<String> allFiles() {
		List<String> allFiles = new ArrayList<String>();
		File folder = new File(path);
		File[] files = folder.listFiles();
		for (File x : files) {
			allFiles.add(x.getName());
		}
		return allFiles;
	}

	public List<Stock> sharesAvailable() throws JsonParseException, JsonMappingException, IOException {
		List<Stock> sharesAvailable = StockPortfolio.readFromFile();
		return sharesAvailable;
	}

	public StockAccount(String filename) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<String> allFiles = allFiles();
		filename = filename.toLowerCase();
		File file = new File(path + "/" + filename);
		if (allFiles.contains(filename + ".json")) {
			String data = new String(Files.readAllBytes(Paths.get(path + "/" + filename + ".json")));
			sharesOfPerson = mapper.readValue(data, new TypeReference<ArrayList<CompanyShares>>() {
			});
			return;
		}
		file.createNewFile();
	}

	public double valueOf() {
		int amount = 0;
		for (CompanyShares shareOfPerson : sharesOfPerson) {
			for (Stock stockOfCompany : sharesAvailable) {
				amount += shareOfPerson.getNumberOfShares() * stockOfCompany.getPrice();
			}
		}
		return amount;
	}

	public void buy(int amount, String symbol) throws JsonParseException, JsonMappingException, IOException {
		for (Stock x : sharesAvailable) {
			if ((x.getName().toLowerCase().equals(symbol.toLowerCase()))
					&& (x.getPrice() * x.getQuantity() >= amount)) {
				CompanyShares share = new CompanyShares();
				share.setSymbol(x.getName());
				share.setDate(date.toString());
				if (companyPresent(symbol) != null) {
					share = companyPresent(symbol);
					share.setNumberOfShares(share.getNumberOfShares() + (int) (amount / x.getPrice()));
					sharesOfPerson.remove(companyPresent(symbol));
					sharesOfPerson.add(share);
				} else {
					share.setNumberOfShares((int) (amount / x.getPrice()));
					sharesOfPerson.add(share);
				}
				x.setQuantity(x.getQuantity() - (int) (amount / x.getPrice()));
			}
		}
	}

	public CompanyShares companyPresent(String symbol) {
		for (CompanyShares x : sharesOfPerson) {
			if (x.getSymbol().toLowerCase().equals(symbol.toLowerCase())) {
				return x;
			}
		}
		return null;
	}

	public void sell(int amount, String symbol) {
		boolean companyFound = false;
		for (CompanyShares x : sharesOfPerson) {
			if (x.getSymbol().toLowerCase().equals(symbol.toLowerCase())) {
				companyFound = true;
				float price = 0;
				for (Stock stock : sharesAvailable) {
					if (stock.getName().toLowerCase().equals(x.getSymbol().toLowerCase())) {
						price = stock.getPrice();
						float value = price * x.getNumberOfShares();
						if (value >= amount) {
							x.setNumberOfShares(x.getNumberOfShares() - (int) (amount / price));
							x.setDate(date.toString());
						}
						stock.setQuantity(stock.getQuantity() + (int) (amount / price));
						break;
					}
				}
			}
		}
		if (!companyFound) {
			System.out.print("Company does not exist!");
			return;
		}
	}

	public void save(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sharesOfPerson);
		FileWriter file = new FileWriter(path + "/" + filename + ".json");
		file.write(json);
		file.close();
		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sharesAvailable);
		file = new FileWriter(path + "/stocks.json");
		file.write(json);
		file.close();
		System.out.print("\nData saved successfully!\n");
	}

	public void printReport() {


		System.out.print("\nAccount Details:\n");
		int i = 1;
		for (CompanyShares x : sharesOfPerson) {
			System.out.print("\n");
			System.out.print(i + ". " + x.getSymbol() + " : " + x.getNumberOfShares() + "\n");
			i++;
		}

		
		System.out.print("\nShares Available :\n\n");
		for (i=0; i<sharesAvailable.size(); i++)
		{
			System.out.print(sharesAvailable.get(i).getName());
			if (i!=sharesAvailable.size()-1)
			{
				System.out.print(" , ");
			}
		}
System.out.println("\n\n");
	}
}