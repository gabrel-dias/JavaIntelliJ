package swing.resolucao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaResolucao extends JFrame {
    private JLabel lblResolucaoMostrada;
    private JButton btnMostraResolucao;
    private JPanel pnlResolucao;

    public telaResolucao() {
        setContentPane(pnlResolucao);
        setVisible(true);
        setSize(430, 170);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnMostraResolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                lblResolucaoMostrada.setText("Sua resolução é: " + (int) tela.getWidth() + "x" + (int) tela.getHeight());
            }
        });
    }

    public static void main(String[] args) {
        new telaResolucao();
    }
}
