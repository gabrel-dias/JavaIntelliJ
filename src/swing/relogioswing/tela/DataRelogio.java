package swing.relogioswing.tela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DataRelogio extends JFrame { // A CLASSE DEVE HERDAR O JFRAME
    // atributos que são gerados no painel .form
    private JButton btnDataHora;
    private JPanel panel1;
    private JLabel lblHora;

    //construtor do painel
    public DataRelogio() {
        setTitle("Data e Hora"); //nome da janela
        setSize(300, 200);
        setContentPane(panel1);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ação do botão
        btnDataHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                lblHora.setText(relogio.toString());
            }
        });
    }

    public static void main(String[] args) {
        new DataRelogio();
    }
}
