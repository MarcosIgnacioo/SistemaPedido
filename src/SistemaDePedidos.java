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
        panelFondo.setBackground(Color.decode("#eeeeee"));
        panelFondo.setLayout(new BorderLayout());
        tab1.add("Interfaz.java", panelFondo);

            JPanel botonesArribaPanel = new JPanel();
            botonesArribaPanel.setPreferredSize(new Dimension(900,20));
            botonesArribaPanel.setBackground(Color.decode("#ececec"));
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
            fondoSistema.setBackground(Color.decode("#e1e2f6"));
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
                    interfazPanel.setBackground(Color.decode("#eeeeee"));
                    interfazPanel.setLayout(new GridBagLayout());
                    interfazPanel.setPreferredSize(new Dimension(800,500));
                    GridBagConstraints gbcSis = new GridBagConstraints();
                    gbcSis.gridwidth = 800;
                    gbcSis.gridheight = 500;
                    gbcSis.gridx = 0;
                    gbcSis.gridy = 1;
                    fondoSistema.add(interfazPanel, gbcSis);

                    JPanel datosClientePanel = new JPanel();
                    datosClientePanel.setBackground(Color.decode("#b4b5c5"));
                    datosClientePanel.setLayout(new GridBagLayout());
                    datosClientePanel.setPreferredSize(new Dimension(800,200));
                    GridBagConstraints gbcCD = new GridBagConstraints();
                    gbcCD.gridwidth = 800;
                    gbcCD.gridheight = 200;
                    gbcCD.gridx = 0;
                    gbcCD.gridy = 0;
                    interfazPanel.add(datosClientePanel, gbcCD);
                    JLabel datosDelClienteTitulo = new JLabel("Datos del cliente", JLabel.LEFT);
                        datosDelClienteTitulo.setFont(new Font("Arial", Font.BOLD, 20));
                        datosDelClienteTitulo.setPreferredSize(new Dimension(300,50));
                        GridBagConstraints gbcDatos = new GridBagConstraints();
                        gbcDatos.gridx = 0;
                        gbcDatos.gridy = 0;
                        datosClientePanel.add(datosDelClienteTitulo,gbcDatos);
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

                            distIzq = (i  == 0 || i ==2) ? 75 : -25;
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
                    JPanel listaProductosPanel = new JPanel();
                    listaProductosPanel.setBackground(Color.decode("#cbcbdd"));
                    listaProductosPanel.setLayout(new GridBagLayout());
                    listaProductosPanel.setPreferredSize(new Dimension(800,500));
                    GridBagConstraints gbcLista = new GridBagConstraints();
                    gbcLista.gridwidth = 800;
                    gbcLista.gridheight = 250;
                    gbcLista.gridx = 0;
                    gbcLista.gridy = 1;
                    interfazPanel.add(listaProductosPanel, gbcLista);


                        JLabel listaProductosTitulo = new JLabel("        Lista de productos", JLabel.LEFT);
                        listaProductosTitulo.setFont(new Font("Arial", Font.BOLD, 20));
                        listaProductosTitulo.setPreferredSize(new Dimension(500,50));
                        GridBagConstraints gbcProductos = new GridBagConstraints();
                        gbcProductos.gridx = 0;
                        gbcProductos.gridy = 1;
                        gbcProductos.insets = new Insets(100,-260,0,0);
                        listaProductosPanel.add(listaProductosTitulo,gbcProductos);


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
                            gbcTabla.gridx = 0;
                            gbcTabla.gridy = 2;
                            gbcTabla.gridheight = 100; // mvp y el acomodar las cosa de la manera en la que aparecen god
                            gbcTabla.insets = new Insets(0,-260,0,0);
                            listaProductosPanel.add(scrollPane,gbcTabla);

                            String botonesImagenesListaNombres[] = {"guardar.png","salir.png","agregar.png","quitar.png"};
                            GridBagConstraints gbcBotonesLista = new GridBagConstraints();
                            java.net.URL imgURL = getClass().getResource(botonesImagenesListaNombres[0]);

                            JButton guardar = new JButton();
                            guardar.setIcon(new ImageIcon(imgURL));
                            guardar.setPreferredSize(new Dimension(75,75));
                            gbcBotonesLista.gridx = 0;
                            gbcBotonesLista.gridy = 5;
                            gbcBotonesLista.insets = new Insets(0,-500,-300,0);
                            listaProductosPanel.add(guardar,gbcBotonesLista);

                            JButton salir = new JButton();
                            imgURL = getClass().getResource(botonesImagenesListaNombres[1]);
                            salir.setIcon(new ImageIcon(imgURL));
                            salir.setPreferredSize(new Dimension(75,75));
                            gbcBotonesLista.gridx = 1;
                            gbcBotonesLista.gridy = 5;
                            gbcBotonesLista.insets = new Insets(0,-280,-300,0);
                            listaProductosPanel.add(salir,gbcBotonesLista);


                            JButton agregar = new JButton();
                            imgURL = getClass().getResource(botonesImagenesListaNombres[2]);
                            agregar.setIcon(new ImageIcon(imgURL));
                            agregar.setPreferredSize(new Dimension(125,45));
                            gbcBotonesLista.gridx = 3;
                            gbcBotonesLista.gridy = 1;
                            gbcBotonesLista.insets = new Insets(0,0,-195,-200);
                            listaProductosPanel.add(agregar,gbcBotonesLista);

                            JButton eliminar = new JButton();
                            imgURL = getClass().getResource(botonesImagenesListaNombres[3]);
                            eliminar.setIcon(new ImageIcon(imgURL));
                            eliminar.setPreferredSize(new Dimension(125,45));
                            gbcBotonesLista.gridx = 3;
                            gbcBotonesLista.gridy = 2;
                            gbcBotonesLista.insets = new Insets(0,0,-165,-200);
                            listaProductosPanel.add(eliminar,gbcBotonesLista);

        this.revalidate();
        this.setVisible(true);
    }

}
