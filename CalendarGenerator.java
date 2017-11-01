import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormatSymbols;


public class CalendarGenerator {
	
	//以下排版為 3(空白)為一個間隔, 所以"字元量"不能超過 3(空白). [依自己喜好要多大就多大, 要 4 或 5 以此類推都可]
	
	//定義成 static final 為不可被更改. [以下依照個人要先定義或不用都可]
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
        	String getCal = formateCalendar(Integer.parseInt(inputYears), Integer.parseInt(inputDays)); //調用函式, 並賦予使用者所 input 的值.
        	System.out.println(getCal); //get return 後, 把他print出來.
        }
    }
	
	private static String formateCalendar(final int getYears, int getDays)
    {
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, getYears); 
        
        final StringBuilder calendar = new StringBuilder(); //定義一個 StringBuilder.(StringBuilder 可以任由字串改變長度).
        int spacing = 0;
        
        for(int i = 1; i <= 12; i++)
        {
        	cal.set(Calendar.MONTH, i - 1); //i - 1 是因為資料陣列起始都為 0.
            int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //get Calendar 裡面的每個月份天數.
            String months = new DateFormatSymbols().getMonths()[i - 1]; //get 月份的名子.
            calendar.append(newLine).append(newLine).append(months).append(emptyCount_3).append(getYears).append(newLine);
            calendar.append(weekDays).append(newLine); //使用append 增加 String 至最後面.
                  
            if (i > 1) //會判斷 > 1 的原因是因為剛開始是自己 input 天數. 後面2月開始就不一樣了, 就是要依照結束天為"起始".
			{
            	System.out.println("空格次數 : " + spacing);
				getDays = (spacing % 7); //重新獲取起始天數. 會 % 7 是因為一個禮拜有7天(我已每3個空白為1格 for example:Su Mo Tu...會看到Su=2字元 + 他後面一個空白 = 3 [以此類推])
				System.out.println("餘數 : " + getDays);
				spacing = 0; //每個月計算"空格"幾次後記得歸零, 好讓重新計算當天月份的起始點.
			}
            
            for (int beginDay = 1; beginDay <= getDays; beginDay++)
            {
            	calendar.append(emptyCount_3); //起始頭的空白次數. 如果 input 5 = "星期五"開始 共會空5次到"星期五"為起頭.
            	spacing++; //為了記錄"空格"幾次.
            }
    
            for (int j = 1; j <= days; j++) //去判斷每月有幾天,所以 <= days.
			{
            	spacing++; //為了記錄"空格"幾次.
            	
				if (j / 10 >= 1) //判斷 j / 10 原因是因為只有 10 以上是 2 字元, 1~9 都是為 1 字元.
				{
					calendar.append(j).append(emptyCount_1); //如果是 10 以上的話, 就只要再 + 1(空白).
				} 
				else 
				{
					calendar.append(emptyCount_1).append(j).append(emptyCount_1); //相反的 1~9, 就要 + 2(空白).
				}
				
				if(spacing % 7 == 0 ) //每 7 row 就斷到下一行. [1 row 我已經設定為 3(空白)]
				{
					calendar.append(newLine); //append 一個 /n.
				}
			}
        }
		return calendar.toString(); //最後計算排版好完畢後  return.
    }
}
