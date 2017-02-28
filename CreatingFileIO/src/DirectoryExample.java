
import java.io.*;

public class DirectoryExample {

	public static void main(String[] args) {
		boolean dirFlag = false;
		boolean flag = false;

		// create File object
		File iodata = new File("M:/IOFlies/iodata ");

		try {
			dirFlag = iodata.mkdir();
		} catch (SecurityException Se) {
			System.out.println("Error while creating directory in Java:" + Se);
		}

		if (dirFlag)
			System.out.println("Directory created successfully");
		else
			System.out.println("Directory was not created successfully");
		
		

		
		// create File object
		File inputoutdata = new File("M:/IOFlies/iodata/inputoutdata.txt");

		try {
			flag = inputoutdata.createNewFile();
		} catch (IOException ioe) {
			System.out.println("Error while Creating File in Java" + ioe);
		}

		System.out.println("stock file" + inputoutdata.getPath() + " created ");

	}

}
