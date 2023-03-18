import javax.swing.*;
import java.awt.*;

public class SistemaDePedidos extends JFrame {//popo
    public SistemaDePedidos(){
        this.setSize(900,700);
        this.getContentPane().setBackground(Color.decode("#eeeeed"));
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.repaint();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tab1 = new JTabbedPane();
        tab1.setOpaque(true);
        tab1.setPreferredSize(new Dimension(500,100));
        this.add(tab1);

        JPanel panelFondo = new JPanel();
        panelFondo.setBackground(Color.pink);
        panelFondo.setLayout(new BorderLayout());
        tab1.add("Interfaz.java", panelFondo);

            JPanel botonesArribaPanel = new JPanel();
            botonesArribaPanel.setPreferredSize(new Dimension(900,60));
            botonesArribaPanel.setBackground(Color.red);
            botonesArribaPanel.setLayout(new BoxLayout(botonesArribaPanel, BoxLayout.X_AXIS));
            panelFondo.add(botonesArribaPanel, BorderLayout.NORTH);

             JButton botonesArriba2 = new JButton();
             botonesArriba2.setIcon(new ImageIcon("src/mouseCuadrado.png"));
             botonesArribaPanel.add(botonesArriba2);

            String nombresBotones[] = {"Source", "Design", "History", };
            JButton botonesArriba[] = new JButton[14];
            for (int i = 0; i<14; i++){
                botonesArriba[i] = new JButton("");
            }


        this.revalidate();
        this.setVisible(true);
    }

}
