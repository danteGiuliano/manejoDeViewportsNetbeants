/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Dantesito
 */
public class activity_Principal extends javax.swing.JFrame {
    private int acum=0;
    private String array[][];
    private DefaultTableModel matriz ;
   

    /**
     * Creates new form NewJFrame
     */
    public activity_Principal() {
        initComponents();

        this.array=new String[32][3];
        this.matriz = new DefaultTableModel();
        this.matriz.addColumn("Instruccion");
        this.matriz.addColumn("PC");
        this.matriz.addColumn("IR");
        this.tabla.setModel(matriz);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDinamico = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        agregar = new javax.swing.JButton();
        cargaIR = new javax.swing.JTextField();
        cargaPC = new javax.swing.JTextField();
        modificador = new javax.swing.JButton();
        modIR = new javax.swing.JTextField();
        modPC = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        seleccionador = new javax.swing.JComboBox<>();
        borrarFila = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mostrarArray = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        realizarTraza = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        panelDinamico.setViewportView(tabla);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        cargaIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaIRActionPerformed(evt);
            }
        });

        modificador.setText("Modificar");
        modificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificadorActionPerformed(evt);
            }
        });

        modIR.setText("Valor IR");

        modPC.setText("Valor PC");

        titulo.setText("Programa MCBE");

        seleccionador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionadorActionPerformed(evt);
            }
        });

        borrarFila.setText("Borrar Fila");
        borrarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarFilaActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar Todo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        mostrarArray.setText("Mostrar array");
        mostrarArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarArrayActionPerformed(evt);
            }
        });

        jLabel1.setText("Modificar IR");

        jLabel2.setText("Modificar PC");

        jLabel3.setText("Agregar PC");

        jLabel4.setText("Agregar IR");

        realizarTraza.setText("Realizar Traza");
        realizarTraza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarTrazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(modificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(modIR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(modPC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(seleccionador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(agregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(borrarFila))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cargaPC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cargaIR, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(realizarTraza, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(mostrarArray))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargaPC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargaIR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(borrarFila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrarArray)
                .addGap(42, 42, 42)
                .addComponent(seleccionador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(realizarTraza, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargaIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaIRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaIRActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String PC, IR;
        String arrayAux[]=new String[3];
        //Legivilidad de codigo
        PC = cargaPC.getText();
        IR = cargaIR.getText();
        if(acum<31){  
        // Evitar nulos
        if (!PC.isEmpty() && !IR.isEmpty()) {
            //Valores para llenar en el Jtable
            arrayAux[0]=String.valueOf(acum);
            arrayAux[1]=PC;
            arrayAux[2]=IR;
            //Valores a guardar-------------------------------
            this.array[acum][0]=String.valueOf(acum);
            this.array[acum][1]=PC;
            this.array[acum][2]=IR;
            ////Añadir en el Jtable los valores pedidos en los JTextFields
            ///AddRow (Añadir Fila)
            this.matriz.addRow(arrayAux);
            this.seleccionador.addItem(""+acum);
            //---------- Incremento 
            acum++;    
            }    
        }
        else{
            JOptionPane.showMessageDialog(null, "LLeno las posiciones de memoria disponible"); 
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void modificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificadorActionPerformed
        int sel = this.seleccionador.getSelectedIndex();
        String PC = this.modPC.getText();
        String IR = this.modIR.getText();
        this.array[sel][1] = PC;
        this.array[sel][2] = IR;
        this.seleccionador.updateUI();
        actualizarJtable();
        actualizarJCombox();


    }//GEN-LAST:event_modificadorActionPerformed

    private void borrarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarFilaActionPerformed
        int row = tabla.getSelectedRow();
        if (row != -1) {
            acum--;
            this.matriz.removeRow(row);
            eliminarFila(row);           
        }
        else {
            if (acum >= 1) {
                acum--;
                row = acum ;
                this.matriz.removeRow(row);
                eliminarFila(row);
            } else {
                JOptionPane.showMessageDialog(null, "no hay filas que borrar ");
            }
        }
         actualizarJtable();
    }//GEN-LAST:event_borrarFilaActionPerformed

    private void mostrarArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarArrayActionPerformed
        for (int i = 0; i < acum; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }//GEN-LAST:event_mostrarArrayActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        borrarJtable();
        String auxArray[][]=new String [32][3];
        this.acum=0;
        this.array=auxArray;
        actualizarJtext();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void seleccionadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionadorActionPerformed
int sel= this.seleccionador.getSelectedIndex();
       this.seleccionador.updateUI();
       String PC=this.array[sel][1];
       String IR=this.array[sel][2];
       this.modPC.setText(PC);
       this.modIR.setText(IR);
       this.seleccionador.updateUI(); 
       
       
        
    }//GEN-LAST:event_seleccionadorActionPerformed

    private void realizarTrazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarTrazaActionPerformed
    Traza unaTraza = new Traza();
        unaTraza.setVisible(true);
    }//GEN-LAST:event_realizarTrazaActionPerformed
    public void eliminarFila(int ind) {
       String aux[][]=new String [32][3];
        for (int i = 0; i < ind; i++) {
            aux[i][0]=this.array[i][0];
            aux[i][1]=this.array[i][1];
            aux[i][2]=this.array[i][2];
        }
        for (int i = ind; i < acum; i++) {
            aux[i][0]=this.array[i+1][0];
            aux[i][1]=this.array[i+1][1];
            aux[i][2]=this.array[i+1][2]; 
        }
        for (int i = 0; i < acum; i++) {
            aux[i][0]=""+i;
        }
        this.array=aux;
        actualizarJCombox();
        }
    public void actualizarJtable(){
        String auxArray[]=new String [3];
        int cantidad=this.tabla.getRowCount();
        for (int i = cantidad-1; i>=0; i--) {
            this.matriz.removeRow(i);
        }
        for (int i = 0; i < acum; i++) {
            auxArray[0]=this.array[i][0];
            auxArray[1]=this.array[i][1];
            auxArray[2]=this.array[i][2];
            this.matriz.addRow(auxArray);
        }
       actualizarJCombox();
            
        }
    public void borrarJtable(){
        int cantidad=this.tabla.getRowCount();
        for (int i = cantidad-1; i>=0; i--) {
            this.matriz.removeRow(i);
        }
        actualizarJCombox();
    }
    public void actualizarJCombox(){
            for (int i = 0; i <this.seleccionador.getItemCount(); i++) {
            this.seleccionador.remove(i);
        }
            for (int i = 0; i < acum-1; i++) {
            this.seleccionador.addItem(this.array[i][0]);
        }
            this.seleccionador.updateUI();
            
        
    }
  public void actualizarJtext(){
      this.seleccionador.removeAllItems();
      this.modIR.setText(" ");
      this.modPC.setText(" ");
      this.cargaIR.setText(" ");
      this.cargaPC.setText(" ");
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
            java.util.logging.Logger.getLogger(activity_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(activity_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(activity_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(activity_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new activity_Principal().setVisible(true);
            }
        });
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton borrarFila;
    private javax.swing.JTextField cargaIR;
    private javax.swing.JTextField cargaPC;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField modIR;
    private javax.swing.JTextField modPC;
    private javax.swing.JButton modificador;
    private javax.swing.JButton mostrarArray;
    private javax.swing.JScrollPane panelDinamico;
    private javax.swing.JButton realizarTraza;
    private javax.swing.JComboBox<String> seleccionador;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
