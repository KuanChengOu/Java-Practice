import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormatSymbols;


public class CalendarGenerator {
	
	//�H�U�ƪ��� 3(�ť�)���@�Ӷ��j, �ҥH"�r���q"����W�L 3(�ť�). [�̦ۤv�ߦn�n�h�j�N�h�j, �n 4 �� 5 �H���������i]
	
	//�w�q�� static final �����i�Q���. [�H�U�̷ӭӤH�n���w�q�Τ��γ��i]
	private static final String weekDays = "Su Mo Tu We Th Fr Sa";
	private static final String newLine = "\n";
	private static final String emptyCount_1 = " ";
	private static final String emptyCount_3 = "   ";
	
	public static void main(final String[] args) 
    {
    	Scanner scannerIn = new Scanner(System.in);
    	
    	System.out.print("Enter the year which you wanna search: ");
        String inputYears = scannerIn.next();
        
        System.out.print("Enter the first day of year (0Sun-6Sat): ");
        String inputDays= scannerIn.next();
        
        scannerIn.close();
        
        if (Integer.parseInt(inputDays) > 6)
        {
        	System.out.println("out of range value. please input 0 - 6...");
        }
        else
        {
        	String getCal = formateCalendar(Integer.parseInt(inputYears), Integer.parseInt(inputDays)); //�եΨ禡, �ýᤩ�ϥΪ̩� input ����.
        	System.out.println(getCal); //get return ��, ��Lprint�X��.
        }
    }
	
	private static String formateCalendar(final int getYears, int getDays)
    {
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, getYears); 
        
        final StringBuilder calendar = new StringBuilder(); //�w�q�@�� StringBuilder.(StringBuilder �i�H���Ѧr����ܪ���).
        int spacing = 0;
        
        for(int i = 1; i <= 12; i++)
        {
        	cal.set(Calendar.MONTH, i - 1); //i - 1 �O�]����ư}�C�_�l���� 0.
            int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //get Calendar �̭����C�Ӥ���Ѽ�.
            String months = new DateFormatSymbols().getMonths()[i - 1]; //get ������W�l.
            calendar.append(newLine).append(newLine).append(months).append(emptyCount_3).append(getYears).append(newLine);
            calendar.append(weekDays).append(newLine); //�ϥ�append �W�[ String �̫ܳ᭱.
                  
            if (i > 1) //�|�P�_ > 1 ����]�O�]����}�l�O�ۤv input �Ѽ�. �᭱2��}�l�N���@�ˤF, �N�O�n�̷ӵ����Ѭ�"�_�l".
			{
            	System.out.println("�Ů榸�� : " + spacing);
				getDays = (spacing % 7); //���s����_�l�Ѽ�. �| % 7 �O�]���@��§����7��(�ڤw�C3�Ӫťլ�1�� for example:Su Mo Tu...�|�ݨ�Su=2�r�� + �L�᭱�@�Ӫť� = 3 [�H������])
				System.out.println("�l�� : " + getDays);
				spacing = 0; //�C�Ӥ�p��"�Ů�"�X����O�o�k�s, �n�����s�p���Ѥ�����_�l�I.
			}
            
            for (int beginDay = 1; beginDay <= getDays; beginDay++)
            {
            	calendar.append(emptyCount_3); //�_�l�Y���ťզ���. �p�G input 5 = "�P����"�}�l �@�|��5����"�P����"���_�Y.
            	spacing++; //���F�O��"�Ů�"�X��.
            }
    
            for (int j = 1; j <= days; j++) //�h�P�_�C�릳�X��,�ҥH <= days.
			{
            	spacing++; //���F�O��"�Ů�"�X��.
            	
				if (j / 10 >= 1) //�P�_ j / 10 ��]�O�]���u�� 10 �H�W�O 2 �r��, 1~9 ���O�� 1 �r��.
				{
					calendar.append(j).append(emptyCount_1); //�p�G�O 10 �H�W����, �N�u�n�A + 1(�ť�).
				} 
				else 
				{
					calendar.append(emptyCount_1).append(j).append(emptyCount_1); //�ۤϪ� 1~9, �N�n + 2(�ť�).
				}
				
				if(spacing % 7 == 0 ) //�C 7 row �N�_��U�@��. [1 row �ڤw�g�]�w�� 3(�ť�)]
				{
					calendar.append(newLine); //append �@�� /n.
				}
			}
        }
		return calendar.toString(); //�̫�p��ƪ��n������  return.
    }
}
