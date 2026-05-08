import java.time.temporal.chronoUnit;
import java.time.LocalDate;
public class timw {
    Public static void main (String[] args){
        LocalDate Date1 = localDate.now();
        System.out.println("System zone: "+ Date1);
        LocalDate Date2 = LocalDate.of(2026);
        System.out.println("INDIA time : " + Date2); 
        long Days = chronounit.Days.between(Date1,Date2)
    }
}
