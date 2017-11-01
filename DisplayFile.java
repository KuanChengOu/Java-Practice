import java.io.*;
import java.util.*;

public class DisplayFile {
	
    public void main(String[] args)throws Exception {
    	
        Scanner scannerIn = new Scanner(new File("D:\\Java_Workspace\\CS430Summer\\src\\test.txt"));
        ArrayList<String> getFileContent = new ArrayList<String>();
        
        while (scannerIn.hasNext()) {
        	getFileContent.add(scannerIn.next());
        }
        scannerIn.close();
        
        Collections.sort(getFileContent);
        
        System.out.println("Display words in ascending order : ");
        for(String s : getFileContent) {
        	System.out.println(s);
        }      
    }
}
