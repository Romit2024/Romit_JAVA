import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Date_Time {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.ofYearDay(2015, 26));
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.now());
        /*for(String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now(ZoneId.of("Europe/London")));
    }
}
