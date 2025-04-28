import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DemoDate {
public static void main(String[] args) {
    // 2025 4 28
     int year = 2025;
     int month = 4;
     int date = 28;

     // Store date value
     // LocalDate (2014)
    LocalDate ld1 = LocalDate.of(2025, 4, 28); //LocalDate 唔可以用new
    LocalDate ld2 = LocalDate.of(2025, 3, 30);
    System.out.println(ld1.isAfter(ld2));
    System.out.println(ld2.isBefore(ld1));
    System.out.println(ld2.isEqual(ld1));

    LocalDate newDate = ld1.plusDays(7);
    System.out.println(newDate);

    System.out.println(LocalDate.of(2024, 12, 20).plusMonths(2));
    // plusweek

    // LocalDaate.of(2025, 1, 32); // Invalid value for DayOfMonth (vaild values 1 - 28/31): 32
    System.out.println(LocalDate.of(2025, 1, 31).minusDays(60)); // 2024-12-02

    Month m1 = LocalDate.of(2025, 1, 2).getMonth();
    System.out.println(m1.getValue()); // 1
    System.out.println(m1.toString()); // JANUARY
    System.out.println(LocalDate.of(2025, 1, 2).getYear()); // 2025

    System.out.println(LocalDate.of(2025, 1, 2).getDayOfWeek()); // THURSDAY

    // Try yourself for LocalDateTime
    LocalDateTime dateTime = LocalDateTime.of(2025, 11, 1, 23, 59, 59);
    System.out.println(dateTime.toString()); // "2025-11-01T23:59:59"
  }
}
