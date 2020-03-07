package testCases;
import java.io.IOException;

import Utilities.LeerXmls;

public class TC1 {

	public static void main(String[] args) throws IOException {
	
		LeerXmls TC = new LeerXmls();
		
		System.out.println(TC.obtenObjetos("C:\\Users\\Training\\Documents\\TC.xlsx").toString());;
		
		

	}

}
