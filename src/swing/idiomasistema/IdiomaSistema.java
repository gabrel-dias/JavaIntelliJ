package swing.idiomasistema;

import javax.swing.*;

public class IdiomaSistema extends JFrame {
    private JLabel lblImagem;
    private JLabel lblIdiomaSistema;
    private JButton mostrarIdiomaButton;
    private JPanel pnlIdioma;

    public IdiomaSistema() {
        setTitle("Idioma do sistema");
        setContentPane(pnlIdioma);
        setVisible(true);
        setSize(450,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IdiomaSistema();
    }
}
