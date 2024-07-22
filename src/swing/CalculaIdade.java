package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class CalculaIdade extends JFrame {
    private JPanel pnlCalcula;
    private JSpinner spnAno;
    private JButton btnCalculaIdade;
    private JLabel lblAnos;

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
                int anoNascimento = (int) spnAno.getValue();
                lblAnos.setText(Integer.toString(anoAtual.get(Calendar.YEAR) - anoNascimento));
            }
        });
    }

    public static void main(String[] args) {
        new CalculaIdade();
    }
}
