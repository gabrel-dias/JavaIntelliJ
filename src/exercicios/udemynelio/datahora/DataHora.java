package exercicios.udemynelio.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse(d1.toString());
        LocalDateTime d5 = LocalDateTime.parse("21/05/2000 20:55", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d6 = LocalDate.of(2000,5,21);

        System.out.println("Data 1: " + d1);
        System.out.println("Data 2: " + d2);
        System.out.println("Data 3: " + d3);
        System.out.println("Data 4: " + d4);
        System.out.println("Data 5: " + d5);
        System.out.println("Data 6: " + d6);
    }
}
