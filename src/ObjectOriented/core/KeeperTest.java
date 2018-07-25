package ObjectOriented.core;

import org.codehaus.jackson.map.ObjectMapper;

public class KeeperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ObjectMapper mapper = new ObjectMapper();
AddressBookManager    man = new AddressBookManager();
man.manager();
	}

}
