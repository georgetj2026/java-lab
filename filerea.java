import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class filerea {
    public static void main(String[]args) {
    	char[]data=new char[50];
    	FileReader input=null;
    	FileWriter output=null;
    	String value="Experiment in java lab";
    	FileWriter inputdata=null;
    	try
    	{
    		inputdata=new FileWriter("F1.txt");
    		inputdata.write(value);
    		inputdata.flush();
    		inputdata.close();
    		input=new FileReader("F1.txt");
    		int bytes=input.read(data);
    		input.close();
    		output=new FileWriter("F2.txt");
    		output.write(data,0,bytes);
    		output.flush();
    		output.close();
    	}
    	catch(IOException e) {
    		System.out.println("An error exixts");
    		e.printStackTrace();
    	}

    }
    
}