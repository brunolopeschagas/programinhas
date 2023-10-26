package br.com.programinhas;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(1998, 01, 12);
        LocalDate dataApocalipse = LocalDate.of(1999, 01, 1);

        System.out.println("DATA BASE: " + data);

        System.out.println(data.plusDays(10));
        System.out.println(data.minusDays(10));
        System.out.println(data.plusMonths(1));
        System.out.println(data.minusMonths(1));
        System.out.println(data.plusYears(1));
        System.out.println(data.minusYears(1));

        System.out.println(data.getDayOfWeek());
        System.out.println(data.getDayOfMonth());
        System.out.println(data.getYear());
        System.out.println(data.getMonth());
        System.out.println(data.getMonthValue());
        System.out.println(data.lengthOfMonth());
        System.out.println(data.isLeapYear());

        List<Object> datasAteOApocalipse = data.datesUntil(dataApocalipse).collect(Collectors.toList());
        datasAteOApocalipse.forEach(data2 -> {System.out.println(data2.toString());});

    }
}
