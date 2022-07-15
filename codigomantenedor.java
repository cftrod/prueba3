package prueba_3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo
 */
public class mantenedor extends javax.swing.JFrame {

    ArrayList<Medicamento> lista = new ArrayList<>();
    public mantenedor() {
        initComponents();
        //revisar tablamedicamentos.addMouseListener(new MouseAdapter());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablamedicamentos = new javax.swing.JTable();
        textonombre = new javax.swing.JTextField();
        textoncientifico = new javax.swing.JTextField();
        textocodigomed = new javax.swing.JTextField();
        textocategoria = new javax.swing.JTextField();
        textovencimiento = new javax.swing.JTextField();
        textolaboratorio = new javax.swing.JTextField();
        textodosis = new javax.swing.JTextField();
        textoprecio = new javax.swing.JTextField();
        textostock = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textobuscar = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 51, 51));

        btneliminar.setBackground(new java.awt.Color(255, 0, 0));
        btneliminar.setText("Eliminar Medicamento");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar Medicamento");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        tablamedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nombre Cientifico", "Codigo Medicamento", "Categoria", "Fecha de Vencimiento", "Laboratorio", "Dosis Medicamento", "Precio", "Cantidad en Stock"
            }
        ));
        jScrollPane1.setViewportView(tablamedicamentos);

        textonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textonombreActionPerformed(evt);
            }
        });

        textoncientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoncientificoActionPerformed(evt);
            }
        });

        textoprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoprecioActionPerformed(evt);
            }
        });

        jLabel1.setText("Laboratorio");

        jLabel2.setText("Dosis (mg)");

        jLabel3.setText("Precio");

        jLabel4.setText("Cantidad en Stock");

        jLabel5.setText("Nombre");

        jLabel6.setText("Nombre Cientifico");

        jLabel7.setText("Código Medicamento");

        jLabel8.setText("Categoria");

        jLabel9.setText("Fecha de Vencimiento");

        jLabel10.setText("Buscar medicamento por codigo");

        textobuscar.setText("Ingresar codigo medicamento....");
        textobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textobuscarActionPerformed(evt);
            }
        });

        btnagregar.setBackground(new java.awt.Color(0, 204, 0));
        btnagregar.setText("Agregar Medicamento");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Mantenedor de Medicamentos");

        btnlimpiar.setText("Limpiar Formulario");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textobuscar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel6))
                                                            .addGap(0, 0, Short.MAX_VALUE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(5, 5, 5)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textonombre)
                                                .addComponent(textocategoria)
                                                .addComponent(textocodigomed)
                                                .addComponent(textoncientifico)
                                                .addComponent(textovencimiento)
                                                .addComponent(textolaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(textodosis)
                                                .addComponent(textoprecio)
                                                .addComponent(textostock)))
                                        .addComponent(jLabel8)
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btneditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(446, 446, 446))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoncientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textocodigomed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textovencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textolaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textodosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textostock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        textonombre.setText("");
        textoncientifico.setText("");
        textocodigomed.setText("");
        textocategoria.setText("");
        textovencimiento.setText("");
        textolaboratorio.setText("");
        textodosis.setText("");
        textoprecio.setText("");
        textostock.setText("");
        textobuscar.setText("");

    }                                          

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int proceder=0;
        int validados=0;
        if((textonombre.getText().length()==0)||(textoncientifico.getText().length()==0)||(textocodigomed.getText().length()==0)||(textocategoria.getText().length()==0)||(textovencimiento.getText().length()==0)||(textolaboratorio.getText().length()==0)||(textodosis.getText().length()==0)||(textoprecio.getText().length()==0)||(textostock.getText().length()==0)){
        proceder=0;  
        }else
        proceder=1;
        if(proceder==0){

        JOptionPane.showMessageDialog(null,"Campos vacios en formulario, intente nuevamente"); 
        textonombre.setText("");
        textoncientifico.setText("");
        textocodigomed.setText("");
        textocategoria.setText("");
        textovencimiento.setText("");
        textolaboratorio.setText("");
        textodosis.setText("");
        textoprecio.setText("");
        textostock.setText("");
        textobuscar.setText("");
        }else{
        Medicamento medicamento = new Medicamento(textonombre.getText(),textoncientifico.getText(),textocodigomed.getText(),textocategoria.getText(),textovencimiento.getText(),textolaboratorio.getText(),textodosis.getText(),textoprecio.getText(),textostock.getText());
        lista.add(medicamento);
        mostrarMedicamento();
        JOptionPane.showMessageDialog(null,"Registro Agregado a tabla exitosamente"); 
        textonombre.setText("");
        textoncientifico.setText("");
        textocodigomed.setText("");
        textocategoria.setText("");
        textovencimiento.setText("");
        textolaboratorio.setText("");
        textodosis.setText("");
        textoprecio.setText("");
        textostock.setText("");
        textobuscar.setText("");
    }
    }                                          

public void mostrarMedicamento(){
String matriz[][] = new String[lista.size()][9];
for (int i=0;i<lista.size(); i++)
{
    matriz[i][0]=lista.get(i).getNombre();
    matriz[i][1]=lista.get(i).getNombreCientifico();
    matriz[i][2]=lista.get(i).getCodigoMedicamento();
    matriz[i][3]=lista.get(i).getCategoria();
    matriz[i][4]=lista.get(i).getFechaVencimiento();
    matriz[i][5]=lista.get(i).getLaboratorio();
    matriz[i][6]=lista.get(i).getDosisMedicamento();
    matriz[i][7]=lista.get(i).getPrecio();
    matriz[i][8]=lista.get(i).getCantidadStock();
}
tablamedicamentos.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[] {"Nombre","NombreCientifico","CodigoMedicamento","Categoria","FechaVencimiento","Laboratorio","DosisMedicamento","Precio","CantidadStock"}));

}

    private void textobuscarActionPerformed(java.awt.event.ActionEvent evt) {                                            
  
    // TODO add your handling code here:
    }                                           

    private void textoprecioActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void textoncientificoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void textonombreActionPerformed(java.awt.event.ActionEvent evt) {                                            
    
    

    // TODO add your handling code here:
    }                                           

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
    int numElementos=lista.size();
    int marcador=0;
    if (marcador==0){
    for(int i=0;i<numElementos;i++){
        String temporal=lista.get(i).getCodigoMedicamento();
        marcador=0;
        if(temporal.equals(textobuscar.getText())){
            textonombre.setText(lista.get(i).getNombre());
            textoncientifico.setText(lista.get(i).getNombreCientifico());
            textocodigomed.setText(lista.get(i).getCodigoMedicamento());
            textocategoria.setText(lista.get(i).getCategoria());
            textovencimiento.setText(lista.get(i).getFechaVencimiento());
            textolaboratorio.setText(lista.get(i).getLaboratorio());
            textodosis.setText(lista.get(i).getDosisMedicamento());
            textoprecio.setText(lista.get(i).getPrecio());
            textostock.setText(lista.get(i).getCantidadStock());       
            break;
        }
    marcador=1;
    }

}if(marcador==1){
        JOptionPane.showMessageDialog(null,"Medicamento no existe en la tabla."); 
        textonombre.setText("");
        textoncientifico.setText("");
        textocodigomed.setText("");
        textocategoria.setText("");
        textovencimiento.setText("");
        textolaboratorio.setText("");
        textodosis.setText("");
        textoprecio.setText("");
        textostock.setText("");
        textobuscar.setText("");
    }
    }                                         

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
    int numElementos=lista.size();
    
    for(int i=0;i<numElementos;i++){
    String temporal=lista.get(i).getCodigoMedicamento();
    if(temporal.equals(textobuscar.getText())){    
    lista.remove(i).setCategoria("");
    mostrarMedicamento();
    JOptionPane.showMessageDialog(null,"El medicamento "+(textobuscar.getText())+", se elimino exitosamente");

}

}
        // TODO add your handling code here:
    }                                           

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
    int numElementos=lista.size();
    int marcador=0;
    if (marcador==0){   
    for(int i=0;i<numElementos;i++){    
        String temporal=lista.get(i).getCodigoMedicamento();
        if(temporal.equals(textobuscar.getText())){
            lista.get(i).setNombre(textonombre.getText());
            lista.get(i).setNombreCientifico(textoncientifico.getText());
            lista.get(i).setCodigoMedicamento(textocodigomed.getText());
            lista.get(i).setCategoria(textocategoria.getText());
            lista.get(i).setFechaVencimiento(textovencimiento.getText());
            lista.get(i).setLaboratorio(textolaboratorio.getText());
            lista.get(i).setDosisMedicamento(textodosis.getText());
            lista.get(i).setPrecio(textoprecio.getText());
            lista.get(i).setCantidadStock(textostock.getText());
            marcador=1;  
            break;
        }           
      
    }
    mostrarMedicamento();
    }
   
    if(marcador==1){
        JOptionPane.showMessageDialog(null,"Medicamento modificado."); 
        textonombre.setText("");
        textoncientifico.setText("");
        textocodigomed.setText("");
        textocategoria.setText("");
        textovencimiento.setText("");
        textolaboratorio.setText("");
        textodosis.setText("");
        textoprecio.setText("");
        textostock.setText("");
        textobuscar.setText("");
    }else{
    JOptionPane.showMessageDialog(null,"Medicamento no existe en la tabla."); 
        textonombre.setText("");
        textoncientifico.setText("");
        textocodigomed.setText("");
        textocategoria.setText("");
        textovencimiento.setText("");
        textolaboratorio.setText("");
        textodosis.setText("");
        textoprecio.setText("");
        textostock.setText("");
        textobuscar.setText("");
}

 
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mantenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mantenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mantenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mantenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mantenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablamedicamentos;
    private javax.swing.JTextField textobuscar;
    private javax.swing.JTextField textocategoria;
    private javax.swing.JTextField textocodigomed;
    private javax.swing.JTextField textodosis;
    private javax.swing.JTextField textolaboratorio;
    private javax.swing.JTextField textoncientifico;
    private javax.swing.JTextField textonombre;
    private javax.swing.JTextField textoprecio;
    private javax.swing.JTextField textostock;
    private javax.swing.JTextField textovencimiento;
    // End of variables declaration                   
}