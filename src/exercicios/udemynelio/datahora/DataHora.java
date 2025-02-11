package exercicios.udemynelio.datahora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
        // instanciando DateTimes
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse(d1.toString());
        LocalDateTime d5 = LocalDateTime.parse("21/05/2000 20:55", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d6 = LocalDate.of(2000, 5, 21);

        System.out.println("instanciando DateTimes");
        System.out.println("Data 1: " + d1);
        System.out.println("Data 2: " + d2);
        System.out.println("Data 3: " + d3);
        System.out.println("Data 4: " + d4);
        System.out.println("Data 5: " + d5);
        System.out.println("Data 6: " + d6);

        System.out.println("convertendo DateTimes em texto");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm B").withZone(ZoneId.systemDefault());
        LocalDate d7 = LocalDate.now();
        System.out.println("Data 7: " + d7.format(fmt1));
        System.out.println("Data 8: " + fmt2.format(d3));

        System.out.println("convertendo DateTimes globais em locais");
        LocalDate d10 = LocalDate.ofInstant(d3, ZoneId.systemDefault());

        System.out.println(d10);
        System.out.println(d10.getDayOfMonth());
        System.out.println(d10.getMonthValue());
        System.out.println(d10.getYear());

        System.out.println("operações com datas");
        LocalDate inicioNamoro = LocalDate.parse("2019-10-05");
        LocalDate d11 = inicioNamoro.minusMonths(5);
        System.out.println("Data 9: " + d11.format(fmt1));
        Duration tempoNamoro = Duration.between(inicioNamoro.atStartOfDay(), LocalDateTime.now());
        long diasNamoro = tempoNamoro.toDays();
        LocalDate dataFim = inicioNamoro.plusDays(diasNamoro);
        System.out.println("Data 10: " + dataFim.format(fmt1));


    }
}
