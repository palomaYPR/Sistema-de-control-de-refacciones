/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refaccionaria;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chuky
 */
public class Ventas_1 extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    Calendar cal;
    ArrayList<String> venta;

    /**
     * Creates new form Ventas
     */
    public Ventas_1() {
        initComponents();
        PanelLogo panel = new PanelLogo(111, 57);
        jLabel79.add(panel);
        panel.setVisible(true);
        modelo = (DefaultTableModel) jTable1.getModel();
        cal = new GregorianCalendar();
        //combo();
        combo2();
        llenartabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel25 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel26 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ventas");

        jPanel25.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel80.setFont(new java.awt.Font("Audi Type Extended", 3, 18)); // NOI18N
        jLabel80.setText("Vender");

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));

        jLabel78.setText("Pieza");

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/acep_norm.png"))); // NOI18N
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusPainted(false);
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/save_press.png"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "Marca", "Existencias", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Cantidad a vender");

        jLabel2.setText("Fecha de la venta:");

        jLabel3.setText("Hora de la venta:");

        jLabel4.setText("Codigo:");

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel26Layout.createSequentialGroup()
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addComponent(jLabel78)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txHora, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        // TODO add your handling code here:
        try {
            MyConection bd = new MyConection();
            bd.Miconexion();
            String fecha = "", hora = "";
            int vendidas = 0;
            fecha = txFecha.getText().toString();
            hora = txHora.getText().toString();
            String pieza = jComboBox2.getSelectedItem().toString();
            vendidas = Integer.parseInt(jTextField1.getText());
            //Se crea la sentencia, y se ejecuta 
            String sql = "INSERT INTO ventas "
                    + "(prodcuto, fecha, hora,pzas_vendidas)"
                    + " VALUES (?,?,?,?)";
            PreparedStatement sentencia = bd.conexion.prepareStatement(sql);
            sentencia.setString(1, pieza);
            sentencia.setString(2, fecha);
            sentencia.setString(3, hora);
            sentencia.setInt(4, vendidas);
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(this, "Venta Exitosa");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton13MousePressed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        try {            
            MyConection bd = new MyConection();
            bd.Miconexion();
            String index = (String) jComboBox1.getSelectedItem();
            String query = "Select c.cod_pieza,c.marca,i.existencias,p.precio FROM catalogo as c, inventario as i, precios as p"
                    + " where "
                    + index + "=i.cod_pieza and " + index + "=p.cod_pieza and " + index + "=c.cod_pieza";
            //Crear setencia y ejecutar
            bd.comando = bd.conexion.createStatement();
            bd.registro = bd.comando.executeQuery(query);
            //Imprmir cada uno de los registros de la tabla
            modelo.setRowCount(0);
            if (bd.registro.next()) {
                Object model[] = new Object[]{bd.registro.getString(1), bd.registro.getString(2), bd.registro.getString(3), bd.registro.getString(4)};
                modelo.addRow(model);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        try {            
            MyConection bd = new MyConection();
            bd.Miconexion();
            String index2 = jComboBox2.getSelectedItem().toString();
            String query = "Select c.cod_pieza FROM catalogo as c"
                    + " where "
                    + "nom_pieza='" + index2 + "'";
            //Crear setencia y ejecutar
            bd.comando = bd.conexion.createStatement();
            bd.registro = bd.comando.executeQuery(query);
            //Imprmir cada uno de los registros de la tabla
            jComboBox1.removeAllItems();
            if (bd.registro.next()) {
              jComboBox1.addItem(bd.registro.getString(1));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    public void combo() {
        try {
            MyConection bd = new MyConection();
            bd.Miconexion();
            String query = "Select c.cod_pieza  FROM catalogo as c";
            //Crear setencia y ejecutar
            bd.comando = bd.conexion.createStatement();
            bd.registro = bd.comando.executeQuery(query);
            //Imprmir cada uno de los registros de la tabla
            jComboBox1.removeAllItems();
            while (bd.registro.next()) {
                jComboBox1.addItem(bd.registro.getString(1));
            }
            //Cargar fecha y hora
            int dia = 0, mes = 0, anio = 0, hora = 0, min = 0;
            dia = cal.get(Calendar.DAY_OF_MONTH);
            mes = cal.get(Calendar.MONTH);
            anio = cal.get(Calendar.YEAR);
            hora = cal.get(Calendar.HOUR_OF_DAY);
            min = cal.get(Calendar.MINUTE);
            txFecha.setText(dia + "-" + mes + "-" + anio);
            txHora.setText(hora + ":" + min);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    public void combo2() {
        try {
            MyConection bd = new MyConection();
            bd.Miconexion();
            String query = "Select c.nom_pieza  FROM catalogo as c";
            //Crear setencia y ejecutar
            bd.comando = bd.conexion.createStatement();
            bd.registro = bd.comando.executeQuery(query);
            //Imprmir cada uno de los registros de la tabla
            jComboBox2.removeAllItems();
            while (bd.registro.next()) {
                jComboBox2.addItem(bd.registro.getString(1));
            }
             //Cargar fecha y hora
            int dia = 0, mes = 0, anio = 0, hora = 0, min = 0;
            dia = cal.get(Calendar.DAY_OF_MONTH);
            mes = cal.get(Calendar.MONTH);
            anio = cal.get(Calendar.YEAR);
            hora = cal.get(Calendar.HOUR_OF_DAY);
            min = cal.get(Calendar.MINUTE);
            txFecha.setText(dia + "-" + mes + "-" + anio);
            txHora.setText(hora + ":" + min);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void llenartabla() {
        // TODO add your handling code here:
        try {
            MyConection bd = new MyConection();
            bd.Miconexion();
            String query = "Select c.cod_pieza,c.nom_pieza,c.marca,i.existencias,p.precio FROM catalogo as c, inventario as i, precios as p"
                    + " Where "
                    + "c.cod_pieza=i.cod_pieza and c.cod_pieza=p.cod_pieza";
            //Crear setencia y ejecutar
            bd.comando = bd.conexion.createStatement();
            bd.registro = bd.comando.executeQuery(query);
            //Imprmir cada uno de los registros de la tabla
            while (bd.registro.next()) {
                Object model[] = new Object[]{bd.registro.getString(1), bd.registro.getString(2), bd.registro.getString(3), bd.registro.getString(4), bd.registro.getString(5)};
                modelo.addRow(model);
            }
            //Cargar fecha y hora
            int dia = 0, mes = 0, anio = 0, hora = 0, min = 0;
            dia = cal.get(Calendar.DAY_OF_MONTH);
            mes = cal.get(Calendar.MONTH);
            anio = cal.get(Calendar.YEAR);
            hora = cal.get(Calendar.HOUR_OF_DAY);
            min = cal.get(Calendar.MINUTE);
            txFecha.setText(dia + "-" + mes + "-" + anio);
            txHora.setText(hora + ":" + min);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    /*
    Consulta simple
    SELECT campo1,campo2 from nombretabla;
    SELECT campo1,campo2 from nombretabla where campo=valor;
    
    consulta anidada
    select.tab1.campo,tab1.campo2,tab2.campo1,tap2.campo2
    
    
    
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txFecha;
    private javax.swing.JTextField txHora;
    // End of variables declaration//GEN-END:variables

}
