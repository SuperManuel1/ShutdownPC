import java.io.*;

// Shuts down the computer using the runtime method to pass the CMD command
//to shutdown the computer
public class shutDownPC
{


	public static void main(String[] args)
	{
		String osName = System.getProperty("os.name").toLowerCase();

		System.out.println("The Operating System Installed is : " + osName);

		/* CMD Comands to shutdown PC
			Shudown -s
			Restart -r
			Logoff  -l
			Hibernate -h
			
		
		*/
		try
		{
		
		Runtime run = Runtime.getRuntime();
		//run.exec("shutdown -s");
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
			
		}



	}



}