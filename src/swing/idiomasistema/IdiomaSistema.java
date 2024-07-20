package swing.idiomasistema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class IdiomaSistema extends JFrame {
    private JLabel lblImagem;
    private JLabel lblIdiomaSistema;
    private JButton mostrarIdiomaButton;
    private JPanel pnlIdioma;
    private JLabel lblIdioma;

    public IdiomaSistema() {
        setTitle("Idioma do sistema");
        setContentPane(pnlIdioma);
        setVisible(true);
        setSize(450, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mostrarIdiomaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale idioma = Locale.getDefault();
                lblIdioma.setText("Seu idioma é o" + idioma.getDisplayLanguage());
            }
        });
    }

    public static void main(String[] args) {
        new IdiomaSistema();
    }
}
