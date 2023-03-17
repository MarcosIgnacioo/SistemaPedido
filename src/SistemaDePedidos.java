import javax.swing.*;
import java.awt.*;

public class SistemaDePedidos extends JFrame {//popo
    public SistemaDePedidos(){
        this.setSize(900,700);
        this.getContentPane().setBackground(Color.decode("#eeeeed"));
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.repaint();

        JTabbedPane tab1 = new JTabbedPane();
        tab1.setOpaque(true);
        tab1.setPreferredSize(new Dimension(500,20));
        this.add(tab1);

            JPanel panelFondo = new JPanel();
            panelFondo.setBackground(Color.pink);
            panelFondo.setLayout(new BorderLayout());

            tab1.add("Interfaz.java", panelFondo);



                JPanel datosPanel=  new JPanel();
                datosPanel.setPreferredSize(new Dimension(300,150));
                datosPanel.setLayout(new GridLayout(4,4));
                datosPanel.setBackground(Color.red);
                panelFondo.add(datosPanel,BorderLayout.NORTH);

                    JLabel titulo = new JLabel("popo", JLabel.CENTER);
                    titulo.setFont(new Font("Arial", Font.BOLD, 24));
                    titulo.setPreferredSize(new Dimension(100,100));

                    JLabel titulo2 = new JLabel("popo2");
                    titulo2.setFont(new Font("Arial", Font.BOLD, 24));
                    titulo2.setPreferredSize(new Dimension(100,100));

                    JLabel titulo3 = new JLabel("");
                    titulo3.setFont(new Font("Arial", Font.BOLD, 24));
                    titulo3.setPreferredSize(new Dimension(100,100));

                    JLabel titulo4 = new JLabel("popo4");
                    titulo4.setFont(new Font("Arial", Font.BOLD, 24));
                    titulo4.setPreferredSize(new Dimension(100,100));

                    JLabel titulo5 = new JLabel("popo5");
        titulo5.setFont(new Font("Arial", Font.BOLD, 24));
        titulo5.setPreferredSize(new Dimension(100,100));

                    JLabel titulo6 = new JLabel("popo6");
        titulo6.setFont(new Font("Arial", Font.BOLD, 24));
        titulo6.setPreferredSize(new Dimension(100,100));

                    JLabel titulo7 = new JLabel("popo7");
        titulo7.setFont(new Font("Arial", Font.BOLD, 24));
        titulo7.setPreferredSize(new Dimension(100,100));

                    JLabel titulo8 = new JLabel("popo8");
        titulo8.setFont(new Font("Arial", Font.BOLD, 24));
        titulo8.setPreferredSize(new Dimension(100,100));

                    GridBagConstraints gbcDatos = new GridBagConstraints();
                    gbcDatos.gridx = 0;
                    gbcDatos.gridy = 0;
                    datosPanel.add(titulo,gbcDatos);
                    gbcDatos.gridx = 2;
                    gbcDatos.gridy = 0;
                    datosPanel.add(titulo3,gbcDatos);
                    gbcDatos.gridx = 3;
                    gbcDatos.gridy = 0;
                    datosPanel.add(titulo4,gbcDatos);
                    gbcDatos.gridx = 4;
                    gbcDatos.gridy = 0;
                    datosPanel.add(titulo5,gbcDatos);
                    gbcDatos.gridx = 1;
                    gbcDatos.gridy = 1;
                    datosPanel.add(titulo6,gbcDatos);
                    gbcDatos.gridx = 2;
                    gbcDatos.gridy = 1;
                    datosPanel.add(titulo7,gbcDatos);
                    gbcDatos.gridx = 3;
                    gbcDatos.gridy = 1;
                    datosPanel.add(titulo8,gbcDatos);



        JPanel listaProductosPanel=  new JPanel();
                listaProductosPanel.setPreferredSize(new Dimension(200,150));
                listaProductosPanel.setLayout(new GridLayout(2,4));
                listaProductosPanel.setBackground(Color.green);
                panelFondo.add(listaProductosPanel, BorderLayout.CENTER);

                JPanel botonesPanel=  new JPanel();
                botonesPanel.setPreferredSize(new Dimension(200,150));
                botonesPanel.setLayout(new GridLayout(2,4));
                botonesPanel.setBackground(Color.white);
                panelFondo.add(botonesPanel, BorderLayout.SOUTH);

        this.revalidate();
        this.setVisible(true);
    }

}
