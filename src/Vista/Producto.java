/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Logica.Operaciones;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crani
 */
public class Producto extends javax.swing.JFrame {

    private DefaultTableModel inf;
    private Object [] matriz =new Object[5];
    
    public Producto() {
        initComponents();
        inf = (DefaultTableModel) Inventario.getModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PedirNombre = new javax.swing.JLabel();
        PedirDias = new javax.swing.JLabel();
        PedirPrecio = new javax.swing.JLabel();
        PedirTipo = new javax.swing.JLabel();
        NombreProd = new javax.swing.JTextField();
        Pedirprecio = new javax.swing.JTextField();
        Opciones = new javax.swing.JComboBox<>();
        AgregarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Inventario = new javax.swing.JTable();
        CalcularProd = new javax.swing.JButton();
        DiasCadu = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PedirNombre.setText("Nombre Producto:");

        PedirDias.setText("Dias a caducar:");

        PedirPrecio.setText("Precio:");

        PedirTipo.setText("Tipo de producto:");

        NombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreProdActionPerformed(evt);
            }
        });

        Pedirprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedirprecioActionPerformed(evt);
            }
        });

        Opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Perecedero", "No perecedero" }));
        Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionesActionPerformed(evt);
            }
        });

        AgregarProd.setText("Agregar");
        AgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProdActionPerformed(evt);
            }
        });

        Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio base", "Caducidad", "Tipo producto", "Precio con descuento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Inventario);

        CalcularProd.setText("Calcular");
        CalcularProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(AgregarProd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CalcularProd)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NombreProd)
                                        .addComponent(PedirNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PedirPrecio)
                                        .addComponent(Pedirprecio))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PedirTipo)
                                        .addComponent(Opciones, 0, 147, Short.MAX_VALUE)
                                        .addComponent(PedirDias)
                                        .addComponent(DiasCadu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PedirNombre)
                            .addComponent(PedirDias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DiasCadu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PedirTipo)
                    .addComponent(PedirPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pedirprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgregarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(CalcularProd)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreProdActionPerformed

    private void PedirprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedirprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PedirprecioActionPerformed

    private void OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionesActionPerformed

    private void AgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProdActionPerformed
        
    
        
        matriz[0]= NombreProd.getText().trim();
        matriz[1]= Pedirprecio.getText().trim();
        matriz[2]= DiasCadu.getDate();
        matriz[3]= Opciones.getSelectedItem().toString();
        
        // Convertir el precio a un valor numérico
    double precio = Double.parseDouble(Pedirprecio.getText().trim());
    
    // Obtener la cantidad de días restantes para la caducidad
    Date fechaCaducidad = DiasCadu.getDate();
    Date fechaActual = new Date();  // Fecha actual
    
    // Calcular los días restantes
    long diferent = fechaCaducidad.getTime() - fechaActual.getTime();  // Diferencia en milisegundos
    long diasRestantes = diferent / (1000 * 60 * 60 * 24);  // Convertir a días
    
    // Crear una instancia de Operaciones
    Operaciones operaciones = new Operaciones();
    
    // Calcular el precio con descuento
    double PrecioConDescuento = operaciones.PrecioDescuento(precio, (int) diasRestantes);
    
    // Añadir el precio con descuento a la tabla
        matriz[4] = String.valueOf(PrecioConDescuento);  // Precio con descuento
        
        inf.addRow(matriz);
        
        // Limpiar los campos después de añadir el servicio
        NombreProd.setText("");
        DiasCadu.setDate(null);
        Pedirprecio.setText("");
        Opciones.setSelectedIndex(0);
        
        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "Servicio añadido con éxito.", "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AgregarProdActionPerformed

    private void CalcularProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalcularProdActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AgregarProd;
    public javax.swing.JButton CalcularProd;
    public com.toedter.calendar.JDateChooser DiasCadu;
    public javax.swing.JTable Inventario;
    public javax.swing.JTextField NombreProd;
    public javax.swing.JComboBox<String> Opciones;
    public javax.swing.JLabel PedirDias;
    public javax.swing.JLabel PedirNombre;
    public javax.swing.JLabel PedirPrecio;
    public javax.swing.JLabel PedirTipo;
    public javax.swing.JTextField Pedirprecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
