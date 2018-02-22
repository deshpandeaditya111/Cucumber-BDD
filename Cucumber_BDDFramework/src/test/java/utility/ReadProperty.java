package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	public static Properties prop;
	public Properties read() throws IOException
	{  
		FileInputStream file = new FileInputStream(Constant.Path_Config_File);
		prop = new Properties();
		prop.load(file);        //Load the pro
		return prop;
	 	
	}

}
