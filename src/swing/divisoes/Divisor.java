package swing.divisoes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Divisor extends JFrame {
    private JTextField txtNumeradorTextField;
    private JTextField txtDenominadorTextField;
    private JButton dividirButton;
    private JLabel lblDiv;
    private JLabel lblRes;
    private JPanel pnlDivisor;

    public Divisor() {
        setContentPane(pnlDivisor);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setResizable(true);
        setVisible(true);
        setName("Divisor e resto");
        setLocationRelativeTo(null);
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numerador = Float.parseFloat(txtNumeradorTextField.getText());
                float denominador = Float.parseFloat(txtDenominadorTextField.getText());

                lblDiv.setText(Float.toString(numerador / denominador));
                lblRes.setText(Float.toString(numerador % denominador));
            }
        });
    }

    public static void main(String[] args) {
        new Divisor();
    }
}
