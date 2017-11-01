import static java.lang.System.*;

import java.security.KeyStore.Entry;
import java.util.*;


public class StudentScores {

	public static void main(String[] args) {

	    Scanner scannerIn = new Scanner(in);
	    out.print("Enter the number of students : ");
	    int studentCount = scannerIn.nextInt();

	    Map<String, Float> studentsGrades = new HashMap<String, Float>();

	    for (int i = 0; i < studentCount; i++) {
	        out.print("Enter a student first name " + (i + 1) + " : ");
	        String studentName = scannerIn.next();

	        out.print("Enter a student score " + (i + 1) + " : ");
	        float studentScore = scannerIn.nextFloat();

	        studentsGrades.put(studentName, studentScore);
	    }

	    scannerIn.close();
	    
	    
	    Set<Map.Entry<String, Float>> set = studentsGrades.entrySet();
        List<Map.Entry<String, Float>> sortedStudentsGrades = new ArrayList<Map.Entry<String, Float>>(set);
        Collections.sort(sortedStudentsGrades, new Comparator<Map.Entry<String, Float>>()
	        {
	            public int compare(Map.Entry<String, Float> entry1, Map.Entry<String, Float> entry2)
	            {
	                return (entry2.getValue()).compareTo(entry1.getValue()); // ¥¿¶¶§Ç first entry2 second entry1, ¤Ï¶¶§Ç first entry1 second entry2.
	            }
	        }
        );
        
        /*for(Map.Entry<String, Float> entry : sortedStudentsGrades){
            System.out.println(entry.getKey()+" is "+entry.getValue());
        }*/
	    
	    String name1 = "";
	    String name2 = "";
	    String name3 = "";
	    float topScore1 = 0.0f;
	    float topScore2 = 0.0f;
	    float secondScore = 0.0f;
	    //final StringBuilder gradesList = new StringBuilder();
	    
		for (Map.Entry entry : sortedStudentsGrades) {
			if((float)entry.getValue() == topScore1) {
				topScore2 = (float)entry.getValue();
				name2 = (String)entry.getKey();
			}
			else if((float)entry.getValue() > topScore1) {
				secondScore = topScore1;
				topScore1 = (float)entry.getValue();
				name1 = (String)entry.getKey();
				
			}else if((float)entry.getValue() > secondScore) {
				secondScore = (float)entry.getValue();
				name3 = (String)entry.getKey();
			}
		}

		System.out.println(name1 + " Student's Score is " + topScore1 + "\n" 
						   + name2 + " Student's Score is " + topScore2 + "\n"
				           + name3 + " Student's Score is " + secondScore + "\n");
	}
	
}
