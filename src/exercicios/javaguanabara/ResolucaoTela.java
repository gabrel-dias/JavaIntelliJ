package exercicios.javaguanabara;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("A resolução do sistema é: " + (int) tela.getWidth() + "x" + (int) tela.getHeight());
    }
}
