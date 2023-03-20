import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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

                        GridBagConstraints gbcDatos = new GridBagConstraints();
                        gbcDatos.gridx = 0;
                        gbcDatos.gridy = 0;
                        String nombresLabels[] = {"Nombre:","Cedula:","Direccion:","Telefono:"};
                        int x = 0; int y =1; int tfSize = 10; int distIzq = 100; int distDer = 100;
                        JLabel datosClienteLabels[] = new JLabel[4];
                        JTextField datosClienteTF[] = new JTextField[4];
                         for (int i = 0; i<nombresLabels.length; i++){
                            datosClienteLabels[i] = new JLabel(nombresLabels[i]);
                            datosClienteLabels[i].setPreferredSize(new Dimension(200,50));
                            datosClienteLabels[i].setFont(new Font("Arial", Font.BOLD, 12));
                            if (i == 2){
                                x = 0;
                                y++;
                            }
                            tfSize = (i  == 0 || i ==2) ? 30 : 10; // ? la condicion se cumple : si la condicion no se cumple

                            distIzq = (i  == 0 || i ==2) ? 50 : -50;
                            distDer = (i  == 1 || i ==3) ? 100 : 250;
                            datosClienteTF[i] = new JTextField(tfSize);
                            gbcDatos.insets = new Insets(0,0,0,distDer);
                            gbcDatos.gridx = x;
                            gbcDatos.gridy = y;
                            datosClientePanel.add(datosClienteLabels[i], gbcDatos);
                            gbcDatos.gridx = x;
                            gbcDatos.gridy = y;
                            gbcDatos.insets = new Insets(0,distIzq,0,0);
                            datosClientePanel.add(datosClienteTF[i], gbcDatos);
                            x = x+2;
                        }
                    JPanel listaProductos = new JPanel();
                    listaProductos.setBackground(Color.blue);
                    listaProductos.setLayout(new GridBagLayout());
                    listaProductos.setPreferredSize(new Dimension(800,500));
                    GridBagConstraints gbcLista = new GridBagConstraints();
                    gbcLista.gridwidth = 800;
                    gbcLista.gridheight = 250;
                    gbcLista.gridx = 0;
                    gbcLista.gridy = 1;
                    interfazPanel.add(listaProductos, gbcLista);
                        JLabel listaProductosTitulo = new JLabel("Lista de productos", JLabel.LEFT);
                        listaProductosTitulo.setFont(new Font("Arial", Font.BOLD, 20));
                        listaProductosTitulo.setPreferredSize(new Dimension(300,50));
                        GridBagConstraints gbcProductos = new GridBagConstraints();
                        gbcProductos.gridx = 0;
                        gbcProductos.gridy = 0;
                        gbcProductos.insets = new Insets(0,-350,0,0);
                        listaProductos.add(listaProductosTitulo,gbcProductos);

                            JButton botonesLista[] = new JButton[4];


                            String botonesImagenesListaNombres[] = {"guardar.png","salir.png","agregar.png","quitar.png"};
                            GridBagConstraints gbcBotonesLista = new GridBagConstraints();
                            int btnWidth = 121; int btnHeight = 41; int xBtn = 0; int yBtn = 3;
                            for (int i = 0; i<botonesLista.length/2; i++){
                                botonesLista[i] = new JButton();
                                java.net.URL imgURL = getClass().getResource(botonesImagenesListaNombres[i]);
                                botonesLista[i] = new JButton();
                                botonesLista[i].setIcon(new ImageIcon(imgURL));
                                gbcBotonesLista.gridx = xBtn++;
                                gbcBotonesLista.gridy = yBtn;
                                gbcBotonesLista.insets = new Insets(50,0,0,100);
                                listaProductos.add(botonesLista[i], gbcBotonesLista);
                            }
                            xBtn = 4; yBtn = 1;
                            for (int i = 2; i<botonesLista.length; i++){
                                botonesLista[i] = new JButton();
                                java.net.URL imgURL = getClass().getResource(botonesImagenesListaNombres[i]);
                                botonesLista[i] = new JButton();
                                botonesLista[i].setIcon(new ImageIcon(imgURL));
                                gbcBotonesLista.gridx = xBtn;
                                gbcBotonesLista.gridy = yBtn;
                                yBtn+=2;
                                if (i == 3){
                                    gbcBotonesLista.insets = new Insets(-150,-100,0,0);
                                }
                                listaProductos.add(botonesLista[i], gbcBotonesLista);
                            }


        String[] nombresColumnas = {"Producto", "Modelo", "Cantidad", "Precio"};
        Object[][] datos = {
                {1," ",    " ",   ""},
                {2," ",     " ",      ""},
                {3," ", " ", ""},
                {4,"   ",     " ",      ""},
                {5," ",    " ",     ""}
        };
        DefaultTableModel dtm = new DefaultTableModel(datos,nombresColumnas);
        JTable tabla = new JTable(dtm);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(500,100));
        GridBagConstraints gbcTabla = new GridBagConstraints();
        gbcTabla.gridx = 1;
        gbcTabla.gridy = 1;
        gbcTabla.insets = new Insets(150,-350,0,0);
        listaProductos.add(scrollPane,gbcTabla);

        gbcBotonesLista.gridx = 5;
        gbcBotonesLista.gridy = 5;
        JLabel datosDelClienteTitulo = new JLabel("Datos del cliente", JLabel.LEFT);
        datosDelClienteTitulo.setForeground(Color.orange);
        datosDelClienteTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        datosDelClienteTitulo.setPreferredSize(new Dimension(200,50));
        listaProductos.add(datosDelClienteTitulo,gbcBotonesLista);

        this.revalidate();
        this.setVisible(true);
    }

}
