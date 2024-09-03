package cdl.mobile;

import java.util.Scanner;

public class DisciplinaMobile4 {
    public static void main(String[] args) {
        imprimir();
    }

    public static void imprimir() {
        System.out.println("Digite algo");
        Scanner sc = new Scanner(System.in);
        String algo = sc.nextLine();
        sc.close();
        System.out.println(algo);
    }

}
