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
                titulo.setPreferredSize(new Dimension(800,50));

                GridBagConstraints gbcTitu = new GridBagConstraints();
                gbcTitu.gridx = 0;
                gbcTitu.gridy = 0;
                fondoSistema.add(titulo, gbcTitu);

                    JPanel interfazPanel = new JPanel();
                    interfazPanel.setBackground(Color.pink);
                    interfazPanel.setLayout(new GridBagLayout());
                    interfazPanel.setPreferredSize(new Dimension(800,500));
                    GridBagConstraints gbcSis = new GridBagConstraints();
                    gbcSis.gridwidth = 800;
                    gbcSis.gridheight = 500;
                    gbcSis.gridx = 0;
                    gbcSis.gridy = 1;
                    fondoSistema.add(interfazPanel, gbcSis);

                    JPanel datosClientePanel = new JPanel();
                    datosClientePanel.setBackground(Color.orange);
                    datosClientePanel.setLayout(new GridBagLayout());
                    datosClientePanel.setPreferredSize(new Dimension(800,200));
                    GridBagConstraints gbcCD = new GridBagConstraints();
                    gbcCD.gridwidth = 800;
                    gbcCD.gridheight = 200;
                    gbcCD.gridx = 0;
                    gbcCD.gridy = 0;
                    interfazPanel.add(datosClientePanel, gbcCD);
                    /*JLabel datosDelClienteTitulo = new JLabel("Datos del cliente");
                        datosDelClienteTitulo.setFont(new Font("Arial", Font.BOLD, 12));
                        datosDelClienteTitulo.setPreferredSize(new Dimension(300,50));
                        GridBagConstraints gbcDatos = new GridBagConstraints();
                        gbcDatos.gridx = 0;
                        gbcDatos.gridy = 0;
                        datosCliente.add(datosDelClienteTitulo,gbcDatos);
                        String nombresLabels[] = {"Nombre:","Cedula:","Direccion:","Telefono:"};
                        int x = 0; int y =1;
                        JLabel datosClienteLabels[] = new JLabel[4];
                        JTextField datosClienteTF[] = new JTextField[4];
                         for (int i = 0; i<nombresLabels.length; i++){
                            datosClienteLabels[i] = new JLabel(nombresLabels[i]);
                            datosClienteLabels[i].setPreferredSize(new Dimension(200,50));
                            datosClienteLabels[i].setFont(new Font("Arial", Font.BOLD, 12));
                            datosClienteTF[i] = new JTextField(20);
                            datosClienteTF[i].setPreferredSize(new Dimension(100,50));
                            if (i == 2){
                                x = 0;
                                y++;
                            }
                            gbcDatos.gridx = x;
                            gbcDatos.gridy = y;
                            datosCliente.add(datosClienteLabels[i], gbcDatos);
                            gbcDatos.gridx = x+1;
                            gbcDatos.gridy = y;
                            datosCliente.add(datosClienteTF[i], gbcDatos);
                            x = x+2;
                        }*/
                    JPanel listaProductos = new JPanel();
                    listaProductos.setBackground(Color.black);
                    listaProductos.setLayout(new GridBagLayout());
                    listaProductos.setPreferredSize(new Dimension(800,500));
                    GridBagConstraints gbcLista = new GridBagConstraints();
                    gbcLista.gridwidth = 800;
                    gbcLista.gridheight = 250;
                    gbcLista.gridx = 0;
                    gbcLista.gridy = 1;
                    interfazPanel.add(listaProductos, gbcLista);





        this.revalidate();
        this.setVisible(true);
    }

}
