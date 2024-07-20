package swing.telasoma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomaValores extends JFrame {
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;
    private JLabel lblResultado;
    private JPanel pnlSomador;

    public SomaValores() {

        setContentPane(pnlSomador);
        setTitle("Somador de valores");
        pack();
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                lblResultado.setText(Integer.toString(n1 + n2));
            }
        });
    }

    public static void main(String[] args) {
        new SomaValores();
    }
}
