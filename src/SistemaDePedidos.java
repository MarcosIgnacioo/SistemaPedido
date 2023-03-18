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
            botonesArribaPanel.setPreferredSize(new Dimension(900,20));
            botonesArribaPanel.setBackground(Color.red);
            botonesArribaPanel.setLayout(new BoxLayout(botonesArribaPanel, BoxLayout.X_AXIS));
            panelFondo.add(botonesArribaPanel, BorderLayout.NORTH);

            String nombresImagenesBotones[] = {"mouseCuadrado.png","ojoConLaVentana.png","cambiarVentana.png","g1.png","g2.png","g3.png","g4.png","g5.png","g6.png","flechaH.png","flechaV.png"};
            String nombresBotones[] = {"Source", "Design", "History", };
            JButton botonesArriba[] = new JButton[11];
            JButton botonesArribaIzq[] = new JButton[3];
                for (int i = 0; i<botonesArribaIzq.length; i++){
                    botonesArribaIzq[i] = new JButton(nombresBotones[i]);
                    botonesArribaIzq[i].setMaximumSize(new Dimension(90, 20));// POWER UP AL SIZEAR COSAS LOCOO
                    botonesArribaPanel.add(botonesArribaIzq[i]);
                    botonesArribaPanel.add(Box.createHorizontalStrut(1));// horizontal slut el mejor filler de todos
                }
        botonesArribaPanel.add(Box.createHorizontalStrut(20));
            for (int i = 0; i<botonesArriba.length; i++){
                int separacion = 1;
                java.net.URL imgURL = getClass().getResource(nombresImagenesBotones[i]);
                botonesArriba[i] = new JButton();
                botonesArriba[i].setIcon(new ImageIcon(imgURL));
                botonesArriba[i].setMaximumSize(new Dimension(20, 20));
                // POWER UP AL SIZEAR COSAS LOCOO
                botonesArribaPanel.add(botonesArriba[i]);
                if (i == 3 || i ==8){
                    separacion = 15;
                }
                botonesArribaPanel.add(Box.createHorizontalStrut(separacion));// horizontal slut el mejor filler de todos
            }
            JPanel fondoSistema = new JPanel();
            fondoSistema.setBackground(Color.white);
            fondoSistema.setLayout(new GridBagLayout());
            //gbcSis.insets = new Insets(200,200,200,200);
            //fondoSistema.setLayout(new BorderLayout());
            panelFondo.add(fondoSistema, BorderLayout.CENTER);

                JLabel titulo = new JLabel("S I S T E M A  D E  P E D I D O", JLabel.CENTER);
                titulo.setFont(new Font("Arial", Font.BOLD, 24));
                titulo.setPreferredSize(new Dimension(500,50));

                GridBagConstraints gbcDat = new GridBagConstraints();
                gbcDat.gridx = 0;
                gbcDat.gridy = 0;
                fondoSistema.add(titulo, gbcDat);

                    JPanel datosCliente = new JPanel();
                    datosCliente.setBackground(Color.pink);
                    datosCliente.setLayout(new GridBagLayout());
                    datosCliente.setPreferredSize(new Dimension(500,500));
                    GridBagConstraints gbcSis = new GridBagConstraints();
                    gbcSis.gridwidth = this.getWidth()/4;
                    gbcSis.gridheight = this.getHeight()/4;
                    gbcSis.gridx = 0;
                    gbcSis.gridy = 1;
                    fondoSistema.add(datosCliente, gbcSis);



        this.revalidate();
        this.setVisible(true);
    }

}
