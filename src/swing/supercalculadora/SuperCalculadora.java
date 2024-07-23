package swing.supercalculadora;

import swing.calculadoraidade.CalculaIdade;

import javax.swing.*;

public class SuperCalculadora extends JFrame {
    private JPanel pnlCalculadora;
    private JSpinner spnValor;
    private JButton btnCalcular;
    private JLabel lblResto2;
    private JLabel lblCubo;
    private JLabel lblRaizQuadrada;
    private JLabel lblRaizCubica;
    private JLabel lblValorAbsoluto;

    public SuperCalculadora(){
        setContentPane(pnlCalculadora);
        setVisible(true);
        setSize(450,230);
    }

    public static void main(String[] args) {
        new SuperCalculadora();
    }
}
