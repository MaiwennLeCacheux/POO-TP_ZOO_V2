import java.io.FileInputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream file;

	      try {
	          XStream xstream = new XStream();
	          file = new FileInputStream("zoo.xml");
	          Zoo zoo = (Zoo) xstream.fromXML(file);
	          file.close();
	          System.out.println("nombre d'animaux : "+zoo.nombreAnimaux());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}

}
