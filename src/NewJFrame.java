import javax.swing.ImageIcon;
/**
 * @author Angeles Fuentes Exposito
 */
public class NewJFrame extends javax.swing.JFrame {
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Autor = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        infoDatos = new javax.swing.JLabel();
        infoResultado = new javax.swing.JLabel();
        Notas = new javax.swing.JLabel();
        Resetear = new javax.swing.JButton();
        nombreCampo1 = new javax.swing.JLabel();
        nombreCampo2 = new javax.swing.JLabel();
        pasar = new javax.swing.JLabel();
        Datos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Temperatura");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(300, 100));

        Autor.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Autor.setText("Hecho por Ángeles Fuentes Expósito para DIU");

        Resultado.setEditable(false);
        Resultado.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        Resultado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Resultado.setEnabled(false);
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        Calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        Calcular.setBorderPainted(false);
        Calcular.setContentAreaFilled(false);
        Calcular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        infoDatos.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        infoDatos.setText("Temperatura Celsius");

        infoResultado.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        infoResultado.setText("Temperatura Fahrenheit");

        Notas.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        Notas.setForeground(new java.awt.Color(204, 0, 0));

        Resetear.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Resetear.setIcon(new javax.swing.ImageIcon("/home/angeles/NetBeansProjects/ConversorTemperatura2/src/clear.png")); // NOI18N
        Resetear.setBorderPainted(false);
        Resetear.setContentAreaFilled(false);
        Resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetearActionPerformed(evt);
            }
        });

        nombreCampo1.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        nombreCampo1.setText("Dato");

        nombreCampo2.setFont(new java.awt.Font("Purisa", 0, 12)); // NOI18N
        nombreCampo2.setText("Resultado");

        pasar.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        pasar.setForeground(new java.awt.Color(0, 204, 51));
        pasar.setText("pasar a");

        Datos.setFont(new java.awt.Font("Ubuntu Mono", 0, 18)); // NOI18N
        Datos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Datos.setToolTipText("");
        Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(infoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombreCampo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pasar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreCampo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infoResultado))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Notas, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(pasar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(infoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreCampo2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(infoDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreCampo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Notas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(Autor)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        if (NewJFrame.isNumeric(Datos.getText())) {
            Double.parseDouble(Datos.getText());
            Double Tcel = Double.valueOf(Datos.getText());
            Double Tfah = 1.8 * Tcel + 32.0;
            Resultado.setText(Tfah.toString());
            Notas.setText("");
        } else if (Datos.getText().isEmpty()) {
            Resultado.setText("");
            Datos.setText("");
            Notas.setText("Notas: El campo Dato está vacío, por favor vuelva a intentarlo.");
        } else {
            Notas.setText("Notas: No ha introducido un número, por favor vuelva a intentarlo.");
            Resultado.setText("");
            Datos.setText("");
        }
    }//GEN-LAST:event_CalcularActionPerformed

    private void ResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetearActionPerformed
        // TODO add your handling code here:
        Resultado.setText("");
        Datos.setText("");
        Notas.setText("");
    }//GEN-LAST:event_ResetearActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoActionPerformed

    private void DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatosActionPerformed

    private static boolean isNumeric(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField Datos;
    private javax.swing.JLabel Notas;
    private javax.swing.JButton Resetear;
    private javax.swing.JTextField Resultado;
    private javax.swing.JLabel infoDatos;
    private javax.swing.JLabel infoResultado;
    private javax.swing.JLabel nombreCampo1;
    private javax.swing.JLabel nombreCampo2;
    private javax.swing.JLabel pasar;
    // End of variables declaration//GEN-END:variables
}
