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
        setTitle("Data e Hora"); // nome da janela
        setSize(400, 200); // resolução da janela
        setContentPane(panel1); // deixa os conteúdos do painel visíveis
        setVisible(true); // deixa a janela visível
        setLocationRelativeTo(null); // na sua ausência, coloca a janela no canto da dela. com o valor null, no meio
        setDefaultCloseOperation(EXIT_ON_CLOSE); // escolhe uma ação que ocorre quando fechar a janela

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
