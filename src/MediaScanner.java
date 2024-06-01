import java.util.Scanner;

public class MediaScanner {
    public static void main(String[] args) {
        Scanner entradaNota = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        // TODO for (int notas = 0; notas < 4; notas++)
        System.out.println("Digite a 1 nota");
        //nota1 = Double.parseDouble(System.console().readLine());
        nota1 = entradaNota.nextInt();
        System.out.println("Digite a 2 nota");
        nota2 = entradaNota.nextInt();
        System.out.println("Digite a 3 nota");
        nota3 = entradaNota.nextInt();
        System.out.println("Digite a 4 nota");
        nota4 = entradaNota.nextInt();
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A sua média final é: " + media);
    }
}

//class MediaConsole{
//    public static void main(String[] args) {
//        double n1,n2,n3,n4,media;
//        n1 = Double.parseDouble(System.console().readLine());
//        System.out.println(n1);
//    }
//}