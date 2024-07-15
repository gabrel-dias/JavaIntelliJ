package exercicios;

import java.util.Date;

public class HoraSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora atual do sistema é: " + relogio.toString()); //toString opcional, acredito que depois
        // do Java 8 a classe Date tenha recebido alguma atualização
    }
}
