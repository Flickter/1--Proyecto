/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Cordinador;
import pkAsignatura.*;
import administra_horarios.*;
import pkPersona.*;;
/**
 *
 * @author Alonso
 */
public class viewCordModificarMat extends javax.swing.JFrame {

    public static int indiceProfe;
    /**
     * Creates new form viewCordModificarMat
     */
    public viewCordModificarMat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpProfesor = new javax.swing.JLabel();
        cpMatApo = new javax.swing.JLabel();
        cpCreditos = new javax.swing.JLabel();
        cpModNombre = new javax.swing.JLabel();
        cpNombre = new javax.swing.JLabel();
        cpSOPgW = new javax.swing.JLabel();
        cpModCreditos = new javax.swing.JLabel();
        jTFSOPagWeb = new javax.swing.JTextField();
        jTFMatApoy = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jBListo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cpProfesor.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N
        cpProfesor.setText("Profesor:");

        cpMatApo.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N
        cpMatApo.setText("Material de Apoyo:");

        cpCreditos.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N
        cpCreditos.setText("Creditos:");

        cpModNombre.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N
        cpModNombre.setText("|");

        cpNombre.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N
        cpNombre.setText("Nombre:");

        cpSOPgW.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N
        cpSOPgW.setText("SO o PagWeb: ");

        cpModCreditos.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N
        cpModCreditos.setText("|");

        jTFSOPagWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSOPagWebActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("High Tower Text", 0, 16)); // NOI18N

        jBListo.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        jBListo.setText("Listo");
        jBListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpModNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpCreditos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpModCreditos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpMatApo)
                            .addComponent(cpSOPgW))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFMatApoy, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jTFSOPagWeb))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBListo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpNombre)
                    .addComponent(cpModNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpCreditos)
                    .addComponent(cpModCreditos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTFSOPagWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cpSOPgW))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpMatApo)
                    .addComponent(jTFMatApoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpProfesor)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jBListo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFSOPagWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSOPagWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSOPagWebActionPerformed

    private void jBListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListoActionPerformed
        // TODO add your handling code here:
        String nombreProfe = (String)jComboBox1.getSelectedItem();
        Profesor profeCambio = Administra_horarios.AsignaturaSemetreActual.getProfesorAsig();
        
        for(int i=0; i<Administra_horarios.ListaProfesores.size(); i++){
            if(Administra_horarios.ListaProfesores.get(i).getNombre().equals(nombreProfe)){
                profeCambio = Administra_horarios.ListaProfesores.get(i);
            }
        }
        
        String tipoClase = Administra_horarios.AsignaturaSemetreActual.getAsignaturaAsig().getClass().getCanonicalName();
            if (tipoClase.equals("pkAsignatura.Asig_Teorica")){
                Asig_Teorica asigTeo = (Asig_Teorica)Administra_horarios.AsignaturaSemetreActual.getAsignaturaAsig();
                String PagWeb = jTFSOPagWeb.getText();
                asigTeo.setPaginaWeb(PagWeb);
                Administra_horarios.AsignaturaSemetreActual.setProfesorAsig(profeCambio);
            
            }
            if (tipoClase.equals("pkAsignatura.Asig_practica")){
                Asig_practica asigPrac = (Asig_practica)Administra_horarios.AsignaturaSemetreActual.getAsignaturaAsig();
                String SisOpe = jTFSOPagWeb.getText();
                String MateApoy = jTFMatApoy.getText();
                asigPrac.setSistema(SisOpe);
                asigPrac.setMaterial(MateApoy);
                Administra_horarios.AsignaturaSemetreActual.setProfesorAsig(profeCambio);
            }
        
           this.hide();
    }//GEN-LAST:event_jBListoActionPerformed

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
            java.util.logging.Logger.getLogger(viewCordModificarMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCordModificarMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCordModificarMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCordModificarMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCordModificarMat().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpCreditos;
    public static javax.swing.JLabel cpMatApo;
    public static javax.swing.JLabel cpModCreditos;
    public static javax.swing.JLabel cpModNombre;
    private javax.swing.JLabel cpNombre;
    private javax.swing.JLabel cpProfesor;
    public static javax.swing.JLabel cpSOPgW;
    private javax.swing.JButton jBListo;
    public static javax.swing.JComboBox jComboBox1;
    public static javax.swing.JTextField jTFMatApoy;
    public static javax.swing.JTextField jTFSOPagWeb;
    // End of variables declaration//GEN-END:variables
}
