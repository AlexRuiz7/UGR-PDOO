
package GUI;

import napakalaki.BadConsequence;

/**
 *
 * @author alex
 */
public class BadConsequenceView extends javax.swing.JPanel {
    
    private BadConsequence bcModel;
    
    /**
     * Creates new form BadConsequence
     */
    public BadConsequenceView() {
        initComponents();
    }

    public void setBcModel(BadConsequence bc) {
        bcModel = bc;
        text.setText(bc.getText());
        
        repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        bcLabel = new javax.swing.JLabel();

        bcLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        bcLabel.setText("Mal Rollo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(bcLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(bcLabel)
                .addGap(12, 12, 12)
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bcLabel;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}