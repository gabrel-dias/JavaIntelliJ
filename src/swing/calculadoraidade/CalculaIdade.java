package swing.calculadoraidade;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class CalculaIdade extends JFrame {
    private JPanel pnlCalcula;
    private JButton btnCalculaIdade;
    private JLabel lblAnos;
    private JTextField txtAno;

    public CalculaIdade() {
        setContentPane(pnlCalcula);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setTitle("Calculadora de idade");

        btnCalculaIdade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar anoAtual = Calendar.getInstance();
                int anoNascimento = Integer.parseInt(txtAno.getText());
                lblAnos.setText(Integer.toString(anoAtual.get(Calendar.YEAR) - anoNascimento));
            }
        });
    }

    public static void main(String[] args) {
        new CalculaIdade();
    }
}
