package servicios_prevencion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
    public class ventana extends JFrame{
    //valores
    private JPanel panel;
    private JTextField areaTexto3,areaTexto4,areaTexto5,areaTexto6,areaTexto7,areaTexto8,areaTexto9,areaTexto10;
    private JTextArea areaTexto2,areaTexto11,areaTexto12,areaTexto13,areaTexto14,areaTexto15,areaTexto16,areaTexto17;
    private JComboBox lista,lista2;
    private JButton boton;
    private String dato,t1,t2,t3,t4,t5;
    protected Color f1;
    
    //Iniciar vista de ventana
    public ventana (){
        this.setSize(1900,1200); //Etablecemos el tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);// este es para cerrar el programa con la tecla X
        setMinimumSize(new Dimension(1350,750));
        setTitle("Servicios medicos digitales"); // titulo de la ventana
        //setLocation(100,200); // posicion inicial de la ventana
        setBounds(500,500,650,650); // posicion inicial y el tamaño de la ventana
        setLocationRelativeTo(null); //establecemos la ventana en el centro 
        iniciarComponentes();
    }
    
    //Inicio de componentes
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        despegable2();
        colocarBotones();
        colocarBotones2();
        colocarCajaDeTexto2();
        colocarCajaDeTexto3();
        colocarCajaDeTexto4();
        colocarCajaDeTexto5();
        colocarCajaDeTexto6();
        colocarCajaDeTexto7();
        colocarCajaDeTexto8();
        colocarCajaDeTexto9();
        colocarCajaDeTexto10();
        colocarCajaDeTexto11();
        colocarCajaDeTexto12();
        colocarCajaDeTexto13();
        colocarCajaDeTexto14();
        colocarCajaDeTexto15();
        colocarCajaDeTexto16();
        colocarCajaDeTexto17();
        colocarEtiquetas2();
        colocarEtiquetas3();
        colocarEtiquetas4();
        colocarEtiquetas5();
        colocarEtiquetas6();
        colocarEtiquetas7();
        despegable();
        despegable2();
        //Area de texto 4
        areaTexto4.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colocarCajaDeTexto2KeyTyped(evt);
            }
        });
        //Area de texto 5
        areaTexto5.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colocarCajaDeTexto2KeyTyped(evt);
            }
        });
        //Area de texto 6
        areaTexto6.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colocarCajaDeTexto2KeyTyped(evt);
            }
        });
        //Area de texto 7
        areaTexto7.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colocarCajaDeTexto2KeyTyped(evt);
            }
        });
        
    }
    //Paneles
    private void colocarPaneles(){
        panel = new JPanel();//creacion del panel
        //panel.setBackground(new java.awt.Color(153,153,153));// color de panel
        JLabel etiqueta = new JLabel();
        etiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"),"Imagen"));
        panel.add(etiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500,500,5900,5000));
        etiqueta.setBounds(0,0,2900,1200);
        panel.setLayout(null);//desactivando el diseño
        this.getContentPane().add(panel);//agregamos el panel a la ventana
       
    }
    //Etiquetas
    private void colocarEtiquetas(){
        JLabel etiqueta = new JLabel("SMD",SwingConstants.CENTER); //creamos una etiqueta y ubicamos en se ubicara la etiqueta.
        etiqueta.setBounds(30,10,80,35);
        etiqueta.setForeground(Color.BLACK);//estamos dandole color de la letra
        etiqueta.setOpaque(false);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLACK);//establecemos pintar el fondo de la etiqueta
        etiqueta.setFont(new Font("Cambria",0,28));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
    }
    private void colocarEtiquetas2(){
        JLabel etiqueta = new JLabel("Genero",SwingConstants.LEFT); //creamos una etiqueta y ubicamos en se ubicara la etiqueta.
        etiqueta.setBounds(10,40,80,35);
        etiqueta.setForeground(Color.BLACK);//estamos dandole color de la letra
        etiqueta.setOpaque(false);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLACK);//establecemos pintar el fondo de la etiqueta
        etiqueta.setFont(new Font("Cambria",0,18));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
    }
    private void colocarEtiquetas3(){
        JLabel etiqueta = new JLabel("Sistolico",SwingConstants.LEFT); //creamos una etiqueta y ubicamos en se ubicara la etiqueta.
        etiqueta.setBounds(10,110,80,35);
        etiqueta.setForeground(Color.BLACK);//estamos dandole color de la letra
        etiqueta.setOpaque(false);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLACK);//establecemos pintar el fondo de la etiqueta
        etiqueta.setFont(new Font("Cambria",0,18));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
    }
    private void colocarEtiquetas4(){
        JLabel etiqueta = new JLabel("Diastolico",SwingConstants.LEFT); //creamos una etiqueta y ubicamos en se ubicara la etiqueta.
        etiqueta.setBounds(10,180,80,35);
        etiqueta.setForeground(Color.BLACK);//estamos dandole color de la letra
        etiqueta.setOpaque(false);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLACK);//establecemos pintar el fondo de la etiqueta
        etiqueta.setFont(new Font("Cambria",0,18));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
    }
    private void colocarEtiquetas5(){
        JLabel etiqueta = new JLabel("Nivel de glucosa en la sangre",SwingConstants.LEFT); //creamos una etiqueta y ubicamos en se ubicara la etiqueta.
        etiqueta.setBounds(10,250,500,35);
        etiqueta.setForeground(Color.BLACK);//estamos dandole color de la letra
        etiqueta.setOpaque(false);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLACK);//establecemos pintar el fondo de la etiqueta
        etiqueta.setFont(new Font("Cambria",0,18));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
    }
    private void colocarEtiquetas6(){
        JLabel etiqueta = new JLabel("Resultados",SwingConstants.LEFT); //creamos una etiqueta y ubicamos en se ubicara la etiqueta.
        etiqueta.setBounds(350,40,100,35);
        etiqueta.setForeground(Color.BLACK);//estamos dandole color de la letra
        etiqueta.setOpaque(false);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLACK);//establecemos pintar el fondo de la etiqueta
        etiqueta.setFont(new Font("Cambria",0,18));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
    }
    private void colocarEtiquetas7(){
        JLabel etiqueta = new JLabel("Edad",SwingConstants.LEFT); //creamos una etiqueta y ubicamos en se ubicara la etiqueta.
        etiqueta.setBounds(10,320,80,35);
        etiqueta.setForeground(Color.BLACK);//estamos dandole color de la letra
        etiqueta.setOpaque(false);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLACK);//establecemos pintar el fondo de la etiqueta
        etiqueta.setFont(new Font("Cambria",0,18));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta al panel
        
    }
    //Despegables
    private void despegable2(){
        String[] genero = {"Masculino","Femenino","Prefiero no especificar"};
        lista = new JComboBox(genero);
        lista.setBounds(10, 70, 300, 30);
        panel.add(lista);
    }
    //Evento de click
    private void colocarCajaDeTexto2KeyTyped(java.awt.event.KeyEvent evt){
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }
    //Caja de texto
    private void colocarCajaDeTexto2(){
        areaTexto4 = new JTextField();
        areaTexto4.setBounds(10,140,300,30);
        areaTexto4.setText("0");
        panel.add(areaTexto4);
    }
    private void colocarCajaDeTexto3(){
        areaTexto5 = new JTextField();
        areaTexto5.setBounds(10,210,300,30);
        areaTexto5.setText("0");
        panel.add(areaTexto5);
    }
    private void colocarCajaDeTexto4(){
        areaTexto6 = new JTextField();
        areaTexto6.setBounds(10,280,300,30);
        areaTexto6.setText("0");
        panel.add(areaTexto6);
    }
    private void colocarCajaDeTexto5(){
        areaTexto7 = new JTextField();
        areaTexto7.setBounds(10,350,300,30);
        areaTexto7.setText("0");
        panel.add(areaTexto7);
    }
    private void colocarCajaDeTexto6(){
        areaTexto3 = new JTextField();
        areaTexto3.setBounds(350,350,150,30);
        areaTexto3.setText("");
        areaTexto3.setEnabled(false);
        panel.add(areaTexto3);
    }
    private void colocarCajaDeTexto8(){
        areaTexto8 = new JTextField();
        areaTexto8.setBounds(350,140,150,30);
        areaTexto8.setText("");
        areaTexto8.setEnabled(false);
        panel.add(areaTexto8);
    }
    private void colocarCajaDeTexto9(){
        areaTexto9 = new JTextField();
        areaTexto9.setBounds(350,210,150,30);
        areaTexto9.setText("");
        areaTexto9.setEnabled(false);
        panel.add(areaTexto9);
    }
    private void colocarCajaDeTexto10(){
        areaTexto10 = new JTextField();
        areaTexto10.setBounds(350,280,150,30);
        areaTexto10.setText("");
        areaTexto10.setEnabled(false);
        panel.add(areaTexto10);
    }
    private void colocarCajaDeTexto7(){
        areaTexto2 = new JTextArea();
        f1 = new Color(250,0,0);
        areaTexto2.setForeground(f1);
        areaTexto2.setBounds(550,70,250,360);
        areaTexto2.setEditable(false);
        areaTexto2.setLineWrap(true);
        areaTexto2.setWrapStyleWord(true);
        areaTexto2.setFont(new Font("Cambria",0,18));
        panel.add(areaTexto2);
        areaTexto2.setVisible(false);
    }
    private void colocarCajaDeTexto11(){
        areaTexto11 = new JTextArea();
        f1 = new Color(250,0,0);
        areaTexto11.setForeground(f1);
        areaTexto11.setBounds(550,70,250,360);
        areaTexto11.setEditable(false);
        areaTexto11.setLineWrap(true);
        areaTexto11.setWrapStyleWord(true);
        areaTexto11.setFont(new Font("Cambria",0,18));
        panel.add(areaTexto11);
        areaTexto11.setVisible(false);
    }
    private void colocarCajaDeTexto12(){
        areaTexto12 = new JTextArea();
        f1 = new Color(250,0,0);
        areaTexto12.setForeground(f1);
        areaTexto12.setBounds(550,70,250,360);
        areaTexto12.setEditable(false);
        areaTexto12.setLineWrap(true);
        areaTexto12.setWrapStyleWord(true);
        areaTexto12.setFont(new Font("Cambria",0,18));
        panel.add(areaTexto12);
        areaTexto12.setVisible(false);
    }
    private void colocarCajaDeTexto13(){
        areaTexto13 = new JTextArea();
        f1 = new Color(250,0,0);
        areaTexto13.setForeground(f1);
        areaTexto13.setBounds(550,70,250,360);
        areaTexto13.setEditable(false);
        areaTexto13.setLineWrap(true);
        areaTexto13.setWrapStyleWord(true);
        areaTexto13.setFont(new Font("Cambria",0,18));
        panel.add(areaTexto13);
        areaTexto13.setVisible(false);
    }
    private void colocarCajaDeTexto14(){
        areaTexto14 = new JTextArea();
        f1 = new Color(250,0,0);
        areaTexto14.setForeground(f1);
        areaTexto14.setBounds(550,70,250,360);
        areaTexto14.setEditable(false);
        areaTexto14.setLineWrap(true);
        areaTexto14.setWrapStyleWord(true);
        areaTexto14.setFont(new Font("Cambria",0,18));
        panel.add(areaTexto14);
        areaTexto14.setVisible(false);
    }
    private void colocarCajaDeTexto15(){
        areaTexto15 = new JTextArea();
        f1 = new Color(250,0,0);
        areaTexto15.setForeground(f1);
        areaTexto15.setBounds(550,70,250,360);
        areaTexto15.setEditable(false);
        areaTexto15.setLineWrap(true); 
        areaTexto15.setFont(new Font("Cambria",0,18));
        panel.add(areaTexto15);
        areaTexto15.setVisible(false);
    }
    private void colocarCajaDeTexto16(){
        areaTexto16 = new JTextArea();
        f1 = new Color(250,0,0);
        areaTexto16.setForeground(f1);
        areaTexto16.setBounds(550,70,250,360);
        areaTexto16.setEditable(false);
        areaTexto16.setLineWrap(true);
        areaTexto16.setWrapStyleWord(true);
        areaTexto16.setFont(new Font("Cambria",0,18));
        panel.add(areaTexto16);
        areaTexto16.setVisible(false);
    }
    private void colocarCajaDeTexto17(){
        
        areaTexto17 = new JTextArea();
        f1 = new Color(250,0,0);
        areaTexto17.setForeground(f1);
        areaTexto17.setBounds(550,70,250,460);
        areaTexto17.setEditable(false);
        areaTexto17.setLineWrap(true);
        areaTexto17.setWrapStyleWord(true);
        areaTexto17.setFont(new Font("Cambria",0,18));
        panel.add(areaTexto17);
        areaTexto17.setVisible(false);
    }
    private void despegable(){
        String[] datos = {"Diabetes tipo 1","Diabetes tipo 2","Diabetes gestacional","Diastolico","Sistolico","Diabetes tipo LADA","Hiperglusemia","Nomoglusemia","Hipoglusemia","Diabetes"};
        lista2 = new JComboBox(datos);
        lista2.setBounds(350,400,150,30);
        panel.add(lista2);
    }
    //BOtones 
    private void colocarBotones(){
        //boton 1 - boton de texto
        boton = new JButton("Calcular");//establecemos un texto al boton
        boton.setSize(90, 30);
        boton.setLocation(10, 400);
        boton.setEnabled(true);//establecemos el ensendido del boton
        boton.setForeground(Color.BLACK);//establecemos el color de la letra del boton
        boton.setFont(new Font("cambria",0,15));//establecemos la fuente de la letra del boton
        panel.add(boton);
        boton.setBackground(new java.awt.Color(255,255,255));
        
        
        //eventoOyenteDeAccion();
        eventoOyenteDeRaton();
       
    }
    //colores de los botones
    private void colocarBotones2(){
        //boton 1 - boton de texto
        boton = new JButton("Información");//establecemos un texto al boton
        boton.setSize(130, 30);
        boton.setLocation(120, 400);
        boton.setEnabled(true);//establecemos el ensendido del boton
        boton.setForeground(Color.BLACK);//establecemos el color de la letra del boton
        boton.setFont(new Font("cambria",0,15));//establecemos la fuente de la letra del boton
        panel.add(boton);
        boton.setBackground(new java.awt.Color(255,255,255));
        
        //eventoOyenteDeAccion();
        eventoOyenteDeRaton2();
    }
    
        
    //Eventos variables
    private void eventoOyenteDeRaton(){
        
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String respuesta;
                t1 = lista.getSelectedItem().toString();
                t2 = areaTexto4.getText();
                int a = Integer.parseInt(t2);
                t3 = areaTexto5.getText();
                int b = Integer.parseInt(t3);
                t4 = areaTexto6.getText();
                int c = Integer.parseInt(t4);
                t5 = areaTexto7.getText();
                int d = Integer.parseInt(t5);
                switch(t1){
                    case "Masculino","Prefiero no especificar":
                        switch (d){
                            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18:
                                        if (a>=105 && a<=135){
                                            if (b>=60 && b<=86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);        
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<60){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }
                                        else if (a>135){
                                                if (b>=60 && b<=86){
                                                    if (c<90){
                                                        respuesta = "Hipoglusemia";
                                                        areaTexto3.setText(respuesta);
                                                        areaTexto8.setText("Sistolico Alta");
                                                        areaTexto9.setText("Diastolico Normal");
                                                        areaTexto10.setText("Glucosa Minima");
                                                    } else if (c>=90 && c<=130){
                                                        respuesta = "Normoglusemia";
                                                        areaTexto3.setText(respuesta);
                                                        areaTexto8.setText("Sistolico Alta");
                                                        areaTexto9.setText("Diastolico Normal");
                                                        areaTexto10.setText("Glucosa Normal");
                                                    } else if (c>130) {
                                                        respuesta = "Hiperglusemia";
                                                        areaTexto3.setText(respuesta);
                                                        areaTexto8.setText("Sistolico Alta");
                                                        areaTexto9.setText("Diastolico Normal");
                                                        areaTexto10.setText("Glucosa Alta");
                                                    }
                                            } else if(b>86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<60){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<105){
                                            if (b>=60 && b<=86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<60){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        }
                                
                                break;
                        
                                
                            case 19, 20, 21, 22, 23, 24:
                                
                                   
                                        if (a>=105 && a<=139){
                                            if (b>=62 && b<=88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<62){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>139){
                                                if (b>=62 && b<=88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<62){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<105){
                                            if (b>=62 && b<=88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<62){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        }
                                
                                break;
                            case 25,26,27,28,29:
                                
                                    
                                        if (a>=108 && a<=139){
                                            if (b>=65 && b<=89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<65){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>139){
                                                if (b>=65 && b<=89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<65){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<108){
                                            if (b>=65 && b<=89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<65){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                            case 30,31,32,33,34,35,36,37,38,39:
                                    
                                        if (a>=110 && a<=145){
                                            if (b>=68 && b<=92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<68){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>145){
                                                if (b>=68 && b<=92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<68){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<110){
                                            if (b>=68 && b<=92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<68){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                            case 40,41,42,43,44,45,46,47,48,49:
                                        if (a>=110 && a<=150){
                                            if (b>=70 && b<=96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>150){
                                                if (b>=70 && b<=96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<110){
                                            if (b>=70 && b<=96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                            case 50,51,52,53,54,55,56,57,58,59:
                                
                                        if (a>=115 && a<=155){
                                            if (b>=70 && b<=98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>155){
                                                if (b>=70 && b<=98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<115){
                                            if (b>=70 && b<=98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                            default:

                                        if (a>=115 && a<=160){
                                            if (b>=70 && b<=100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                   areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                   areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>160){
                                                if (b>=70 && b<=100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                          }
                                                  } else if(b>100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<115){
                                            if (b>=70 && b<=100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                        }break;
                    case "Femenino":
                        switch (d){
                            case 16, 17, 18:
                                
                                        if (a>=105 && a<=135){
                                            if (b>=60 && b<=86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<60){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>135){
                                                if (b>=60 && b<=86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<60){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<105){
                                            if (b>=60 && b<=86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>86){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<60){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                                break;
                        
                                
                            case 19, 20, 21, 22, 23, 24:
                                
                                        if (a>=105 && a<=139){
                                            if (b>=62 && b<=88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<62){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>139){
                                                if (b>=62 && b<=88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<62){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<105){
                                            if (b>=62 && b<=88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>88){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<62){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                                break;
                            case 25,26,27,28,29:
                                
                                        if (a>=108 && a<=139){
                                            if (b>=65 && b<=89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<65){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>139){
                                                if (b>=65 && b<=89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<65){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<108){
                                            if (b>=65 && b<=89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>89){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<65){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                            case 30,31,32,33,34,35,36,37,38,39:
                                
                                        if (a>=110 && a<=145){
                                            if (b>=68 && b<=92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<68){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>145){
                                                if (b>=68 && b<=92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<68){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<110){
                                            if (b>=68 && b<=92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>92){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<68){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                            case 40,41,42,43,44,45,46,47,48,49:
                                
                                        if (a>=110 && a<=150){
                                            if (b>=70 && b<=96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>150){
                                                if (b>=70 && b<=96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<110){
                                            if (b>=70 && b<=96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>96){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=100){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>100) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                            case 50,51,52,53,54,55,56,57,58,59:
                               
                                        if (a>=115 && a<=155){
                                            if (b>=70 && b<=98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>155){
                                                if (b>=70 && b<=98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<115){
                                            if (b>=70 && b<=98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>98){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<90){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=90 && c<=130){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>130) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        
                                }
                            case 60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94:
                                
                                        if (a>=115 && a<=160){
                                            if (b>=70 && b<=100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                   areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                   areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Normal");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } }else if (a>160){
                                                if (b>=70 && b<=100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Alta");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }}
                                        } else if (a<115){
                                            if (b>=70 && b<=100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Normal");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b>100){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Alta");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            } else if(b<70){
                                                if (c<80){
                                                    respuesta = "Hipoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Minima");
                                                } else if (c>=80 && c<=110){
                                                    respuesta = "Normoglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Normal");
                                                } else if (c>110) {
                                                    respuesta = "Hiperglusemia";
                                                    areaTexto3.setText(respuesta);
                                                    areaTexto8.setText("Sistolico Baja");
                                                    areaTexto9.setText("Diastolico Baja");
                                                    areaTexto10.setText("Glucosa Alta");
                                                }
                                            }
                                        
                                        }
                                }
                        }
                        
                    
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //areaTexto.setText(areaTexto.getText() + "Sostenlo\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //areaTexto.setText(areaTexto.getText() + "Lo soltaste \n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //areaTexto.setText(areaTexto.getText() + "click \n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //areaTexto.setText(areaTexto.getText() + "o \n");
            }
        };
        
        boton.addMouseListener(oyenteDeRaton);
        
    }
    private void eventoOyenteDeRaton2(){
        
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                colocarCajaDeTexto7();
                dato = lista2.getSelectedItem().toString();
        switch (dato){
        case "Diabetes tipo 1":
                areaTexto2.setText("La diabetes tipo 1, antes conocida como diabetes juvenil o diabetes insulinodependiente, es una afección crónica. En esta afección, el páncreas produce poca insulina o no la produce. La insulina es una hormona que el cuerpo usa para permitir que el azúcar (glucosa) ingrese a las células para producir energía.\n\n\n");
                areaTexto2.setVisible(true);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes tipo 2":
                areaTexto11.setText("La diabetes tipo 2 es una enfermedad en la que los niveles de glucosa o azúcar en la sangre son demasiado altos. La glucosa es su principal fuente de energía. Proviene de los alimentos que consume. Una hormona llamada insulina ayuda a que la glucosa ingrese a las células para brindarles energía.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(true);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes gestacional":
                areaTexto12.setText("La diabetes mellitus gestacional se define como cualquier grado de intolerancia a la glucosa, que es reconocido o identificado por primera vez en el embarazo. Antes de la introducción de la insulina, en 1922, las pacientes a menudo morían durante el embarazo. La mortalidad materna llegó a alcanzar de 45 a 65%.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(true);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes tipo LADA":
                areaTexto13.setText("La DM tipo LADA es una patología que podría ser considerada como la expresión menos agresiva de una enfermedad autoinmune, donde destacan los diabéticos tipo 1 clásicos y luego los de aparición tardía. Debe ser considerada en pacientes que se presenten como diabéticos tipo 2 \"atípicos\".");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(true);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Hiperglusemia":
                areaTexto14.setText("Hiperglucemia significa glucosa en sangre alta. Afecta con más frecuencia a personas que tienen diabetes. Cuando tiene diabetes, el cuerpo no produce suficiente insulina, no puede usarla tan bien como debería. Demasiada glucosa permanece en la sangre y no llega a las células.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(true);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Nomoglusemia":
                areaTexto15.setText("Normoglucemia: niveles normales de glucosa en la sangre. En ayunas, entre 70 y 110 miligramos de glucosa, por cada decilitro de sangre. Normopeso: peso normal que debe tener una persona según su edad, sexo y talla.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(true);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Hipoglusemia":
                areaTexto16.setText("La hipoglucemia diabética ocurre cuando una persona con diabetes no tiene suficiente azúcar (glucosa) en la sangre. La glucosa es la principal fuente de combustible para el cuerpo y el cerebro, y no puedes funcionar bien si no tienes suficiente.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(true);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes":
                areaTexto17.setText("Aproximadamente 536 millones de personas a nivel mundial tiene diabetes y se estima que aumentará. En México, la prevalencia en 2018 fue de 16.8%, volviéndola la segunda causa de muerte y la primera de discapacidad en el país. La Encuesta Nacional de Salud y Nutrición 2022, nos actualiza el dato nacional.La diabetes aumenta el riesgo de daño a los ojos, los riñones, los nervios y el corazón. La diabetes también está relacionada con algunos tipos de cáncer. Tomar medidas, para prevenir o manejar la diabetes puede reducir el riesgo de desarrollar problemas de salud relacionados con esta.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(true);
                break;
        }
        
            }

            @Override
            public void mousePressed(MouseEvent e) {
                colocarCajaDeTexto7();
                dato = lista2.getSelectedItem().toString();
        switch (dato){
        case "Diabetes tipo 1":
                areaTexto2.setText("La diabetes tipo 1, antes conocida como diabetes juvenil o diabetes insulinodependiente, es una afección crónica. En esta afección, el páncreas produce poca insulina o no la produce. La insulina es una hormona que el cuerpo usa para permitir que el azúcar (glucosa) ingrese a las células para producir energía.\n\n\n");
                areaTexto2.setVisible(true);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes tipo 2":
                areaTexto11.setText("La diabetes tipo 2 es una enfermedad en la que los niveles de glucosa o azúcar en la sangre son demasiado altos. La glucosa es su principal fuente de energía. Proviene de los alimentos que consume. Una hormona llamada insulina ayuda a que la glucosa ingrese a las células para brindarles energía.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(true);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes gestacional":
                areaTexto12.setText("La diabetes mellitus gestacional se define como cualquier grado de intolerancia a la glucosa, que es reconocido o identificado por primera vez en el embarazo. Antes de la introducción de la insulina, en 1922, las pacientes a menudo morían durante el embarazo. La mortalidad materna llegó a alcanzar de 45 a 65%.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(true);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes tipo LADA":
                areaTexto13.setText("La DM tipo LADA es una patología que podría ser considerada como la expresión menos agresiva de una enfermedad autoinmune, donde destacan los diabéticos tipo 1 clásicos y luego los de aparición tardía. Debe ser considerada en pacientes que se presenten como diabéticos tipo 2 \"atípicos\".");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(true);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Hiperglusemia":
                areaTexto14.setText("Hiperglucemia significa glucosa en sangre alta. Afecta con más frecuencia a personas que tienen diabetes. Cuando tiene diabetes, el cuerpo no produce suficiente insulina, no puede usarla tan bien como debería. Demasiada glucosa permanece en la sangre y no llega a las células.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(true);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Nomoglusemia":
                areaTexto15.setText("Normoglucemia: niveles normales de glucosa en la sangre. En ayunas, entre 70 y 110 miligramos de glucosa, por cada decilitro de sangre. Normopeso: peso normal que debe tener una persona según su edad, sexo y talla.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(true);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Hipoglusemia":
                areaTexto16.setText("La hipoglucemia diabética ocurre cuando una persona con diabetes no tiene suficiente azúcar (glucosa) en la sangre. La glucosa es la principal fuente de combustible para el cuerpo y el cerebro, y no puedes funcionar bien si no tienes suficiente.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(true);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes":
                areaTexto17.setText("Aproximadamente 536 millones de personas a nivel mundial tiene diabetes y se estima que aumentará. En México, la prevalencia en 2018 fue de 16.8%, volviéndola la segunda causa de muerte y la primera de discapacidad en el país. La Encuesta Nacional de Salud y Nutrición 2022, nos actualiza el dato nacional.La diabetes aumenta el riesgo de daño a los ojos, los riñones, los nervios y el corazón. La diabetes también está relacionada con algunos tipos de cáncer. Tomar medidas, para prevenir o manejar la diabetes puede reducir el riesgo de desarrollar problemas de salud relacionados con esta.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(true);
                break;
        }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                colocarCajaDeTexto7();
                dato = lista2.getSelectedItem().toString();
        switch (dato){
        case "Diabetes tipo 1":
                areaTexto2.setText("La diabetes tipo 1, antes conocida como diabetes juvenil o diabetes insulinodependiente, es una afección crónica. En esta afección, el páncreas produce poca insulina o no la produce. La insulina es una hormona que el cuerpo usa para permitir que el azúcar (glucosa) ingrese a las células para producir energía.\n\n\n");
                areaTexto2.setVisible(true);                
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes tipo 2":
                areaTexto11.setText("La diabetes tipo 2 es una enfermedad en la que los niveles de glucosa o azúcar en la sangre son demasiado altos. La glucosa es su principal fuente de energía. Proviene de los alimentos que consume. Una hormona llamada insulina ayuda a que la glucosa ingrese a las células para brindarles energía.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(true);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes gestacional":
                areaTexto12.setText("La diabetes mellitus gestacional se define como cualquier grado de intolerancia a la glucosa, que es reconocido o identificado por primera vez en el embarazo. Antes de la introducción de la insulina, en 1922, las pacientes a menudo morían durante el embarazo. La mortalidad materna llegó a alcanzar de 45 a 65%.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(true);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes tipo LADA":
                areaTexto13.setText("La DM tipo LADA es una patología que podría ser considerada como la expresión menos agresiva de una enfermedad autoinmune, donde destacan los diabéticos tipo 1 clásicos y luego los de aparición tardía. Debe ser considerada en pacientes que se presenten como diabéticos tipo 2 \"atípicos\".");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(true);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Hiperglusemia":
                areaTexto14.setText("Hiperglucemia significa glucosa en sangre alta. Afecta con más frecuencia a personas que tienen diabetes. Cuando tiene diabetes, el cuerpo no produce suficiente insulina, no puede usarla tan bien como debería. Demasiada glucosa permanece en la sangre y no llega a las células.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(true);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Nomoglusemia":
                areaTexto15.setText("Normoglucemia: niveles normales de glucosa en la sangre. En ayunas, entre 70 y 110 miligramos de glucosa, por cada decilitro de sangre. Normopeso: peso normal que debe tener una persona según su edad, sexo y talla.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(true);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(false);
                break;
            case "Hipoglusemia":
                areaTexto16.setText("La hipoglucemia diabética ocurre cuando una persona con diabetes no tiene suficiente azúcar (glucosa) en la sangre. La glucosa es la principal fuente de combustible para el cuerpo y el cerebro, y no puedes funcionar bien si no tienes suficiente.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(true);
                areaTexto17.setVisible(false);
                break;
            case "Diabetes":
                areaTexto17.setText("Aproximadamente 536 millones de personas a nivel mundial tiene diabetes y se estima que aumentará. En México, la prevalencia en 2018 fue de 16.8%, volviéndola la segunda causa de muerte y la primera de discapacidad en el país. La Encuesta Nacional de Salud y Nutrición 2022, nos actualiza el dato nacional.La diabetes aumenta el riesgo de daño a los ojos, los riñones, los nervios y el corazón. La diabetes también está relacionada con algunos tipos de cáncer. Tomar medidas, para prevenir o manejar la diabetes puede reducir el riesgo de desarrollar problemas de salud relacionados con esta.");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(true);
                break;
            case "Diastolico":
                areaTexto17.setText("La palabra \"diastólico\" se refiere a la presión arterial diastólica, que es la presión de la sangre en las arterias cuando el corazón se relaja entre latidos. \n La presión arterial se expresa como dos números, por ejemplo, 120/80, donde el primer número es la presión sistólica y el segundo es la presión diastólica. ");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(true);
                break;  
            case "Sistolico":
                areaTexto17.setText("El término sistólico es a menudo más comúnmente asociado con la presión arterial sistólica, que es la presión máxima en las arterias durante la fase de contracción del corazón. Durante la sístole, los ventrículos del corazón se contraen, impulsando la sangre hacia la aorta y las arterias pulmonares.\n La presión arterial se expresa como dos números, por ejemplo, 120/80, donde el primer número es la presión sistólica y el segundo es la presión diastólica. ");
                areaTexto2.setVisible(false);
                areaTexto11.setVisible(false);
                areaTexto12.setVisible(false);
                areaTexto13.setVisible(false);
                areaTexto14.setVisible(false);
                areaTexto15.setVisible(false);
                areaTexto16.setVisible(false);
                areaTexto17.setVisible(true);
                break;
        }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //areaTexto17.setText(areaTexto17.getText() + "click \n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //areaTexto17.setText(areaTexto17.getText() + "o \n");
            }
        };
        
        boton.addMouseListener(oyenteDeRaton);
        
    }
}