import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Time in 12 hour format like 12:01:00PM");
        String time = scanner.nextLine();
        String period=time.substring(8);
        int hour = Integer.parseInt(time.substring(0,2));
        String minSec=time.substring(3, 8);
        if(period.equals("AM"))
        {
            if(hour == 12)
            {
                hour = 00;
            }
        }
        else
        {
            if(hour != 12)
            {
                hour = hour + 12;
            }
        }
        String result = String.format("%02d:%s", hour, minSec);
        System.out.println(result);
        
    }
}
