package udemy.nelio.composicao.exercicio2.entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post pt1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", formatter), "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
        Post pt2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", formatter), "Good night guys", "See you tomorrow", 5);

        Comment cmt1 = new Comment("Have a nice trip");
        Comment cmt2 = new Comment("Wow that's awesome!");
        pt1.addComments(cmt1);
        pt1.addComments(cmt2);

        Comment cmt3 = new Comment("Good night");
        Comment cmt4 = new Comment("May the Force be with you");
        pt2.addComments(cmt3);
        pt2.addComments(cmt4);

        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
    }
}
