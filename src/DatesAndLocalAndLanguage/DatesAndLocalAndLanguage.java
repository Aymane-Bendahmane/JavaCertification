package DatesAndLocalAndLanguage;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatesAndLocalAndLanguage {
    public static void main(String[] args) {
        Locale locale = Locale.US;
        NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        NumberFormat compactFormat = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);

        percentageFormat.setMaximumFractionDigits(2);

        System.out.println("Current currency: " + currency.format(BigDecimal.valueOf(1.75)));
        System.out.println("Percentage format: " + percentageFormat.format(BigDecimal.valueOf(0.065)));
        System.out.println("Compact format: " + compactFormat.format(100000));


        //Dates and Zones practice
        localDatesAndZonePractice();

        timeZonesPractice();
    }

    static void localDatesAndZonePractice() {
        System.out.println("LocalDates Practice");
        LocalDate today = LocalDate.now();
        today = today.plusDays(1);
        System.out.println(today);

        LocalTime teamTime = LocalTime.of(17, 30);
        System.out.println(teamTime);

        Duration timeGap = Duration.between(LocalTime.now(),teamTime);
        System.out.println(timeGap);



        Period daysGap = Period.between(today, LocalDate.now().plusDays(7));
        System.out.println(daysGap.getDays());


        LocalDateTime time = LocalDateTime.of(today, teamTime);
        System.out.println(time);
    }

    static void timeZonesPractice() {
        System.out.println("Time and Zones Practice");
        ZoneId london = ZoneId.of("America/Los_Angeles");
        System.out.println(london);

        ZonedDateTime londonTime = ZonedDateTime.of(LocalDateTime.now(), london);
        System.out.println(londonTime);

        ZoneId katmandu = ZoneId.of("Asia/Katmandu");
        ZonedDateTime katmanduTime = londonTime.withZoneSameInstant(katmandu);
        System.out.println(katmanduTime);
        System.out.println(katmanduTime.getOffset());

        String datePattern = "EE', 'd' of 'MMMM yyyy' at 'HH:mm z";

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, Locale.UK);
        String timeTxt = dateFormat.format(katmanduTime);
        System.out.println(timeTxt);


    }
}
