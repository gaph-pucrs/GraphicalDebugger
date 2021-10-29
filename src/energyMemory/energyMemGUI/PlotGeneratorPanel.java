/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyMemory.energyMemGUI;

import java.awt.Dimension;

/**
 *
 * @author ruaro
 */
public class PlotGeneratorPanel extends javax.swing.JPanel {
    
    public enum PlotGeneratorType {
        ENERGY,
        MEMORY
    }
    
    public enum EnergyStatisticType {
        TOTAL_ENERGY("Total Energy");
        
        private final String text;
        public static final int SIZE = 12;

        EnergyStatisticType(final String text) {
            this.text = text;
        }
    }
    
    public enum MemoryStatisticType {
        L1_D_ACCESS("L1-D access number"),
        L1_D_MISS("L1-D miss number"),
        L1_D_MISS_RATE("L1-D miss rate"),
        L1_I_ACCESS("L1-I access number"),
        L1_I_MISS("L1-I miss number"),
        L1_I_MISS_RATE("L1-I miss rate"),
        L2_ACCESS("L2 access number"),
        L2_MISS("L2 miss number"),
        L2_MISS_RATE("L2 miss rate"),
        AMO_ACCESS("AMO access number"),
        LOAD_MEM_ACCESS("Load Memory number"),
        DRAM_ACCESS("DRAM access");
        
        public final String text;
        public static final int SIZE = 12;

        MemoryStatisticType(final String text) {
            this.text = text;
        }
    }

    private PlotGeneratorMainTab mainPlotPanel;
    private PlotGeneratorType type;

    public PlotGeneratorPanel(PlotGeneratorMainTab mainPlotPanel, PlotGeneratorType type, int XDIM, int YDIM) {
        this.mainPlotPanel = mainPlotPanel;
        this.type = type;
        initComponents();
        this.setPreferredSize(new Dimension(100, 60));
        this.setMinimumSize(new Dimension(100, 60));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        
        switch(type){
            case ENERGY:
                setOptionsEnergy();
                break;
            case MEMORY:
                setOptionsMemory();
        }
        
        jComboBoxToWho.removeAllItems();
        jComboBoxToWho.addItem("All System");
        for (int x = 0; x < XDIM; x++) {
            for (int y = 0; y < YDIM; y++) {
                jComboBoxToWho.addItem("Tile "+x+"x"+y);
            }
        }
        
        jCheckBoxPerWindow.setSelected(false);
        jCheckBoxPerWindow.setText("No");
        jCheckBoxNormalized.setSelected(false);
        jCheckBoxNormalized.setText("No");
        
    }
    
    private void setOptionsEnergy(){
        this.setBorder(javax.swing.BorderFactory.createTitledBorder("Energy"));
        jComboBoxWhat.removeAllItems();
        for (EnergyStatisticType option: EnergyStatisticType.values()) { 
            jComboBoxWhat.addItem(option.text);
        }
        jComboBoxWhat.setEnabled(false);
        
    }
    
    private void setOptionsMemory(){
        this.setBorder(javax.swing.BorderFactory.createTitledBorder("Memory"));
        jComboBoxWhat.removeAllItems();
        for (MemoryStatisticType option: MemoryStatisticType.values()) { 
            jComboBoxWhat.addItem(option.text);
        }
        jLabelNormalized.setVisible(false);
        jCheckBoxNormalized.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNormalized = new javax.swing.JLabel();
        jComboBoxWhat = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxToWho = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxNormalized = new javax.swing.JCheckBox();
        jButtonGenerate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBoxPerWindow = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Energy"));
        setLayout(null);

        jLabelNormalized.setText("Normalized?");
        add(jLabelNormalized);
        jLabelNormalized.setBounds(200, 90, 90, 17);

        jComboBoxWhat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBoxWhat);
        jComboBoxWhat.setBounds(20, 110, 170, 27);

        jLabel2.setText("To who?");
        add(jLabel2);
        jLabel2.setBounds(20, 30, 80, 17);

        jComboBoxToWho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBoxToWho);
        jComboBoxToWho.setBounds(20, 50, 170, 27);

        jLabel3.setText("What?");
        add(jLabel3);
        jLabel3.setBounds(20, 90, 80, 17);

        jCheckBoxNormalized.setText("Yes");
        jCheckBoxNormalized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNormalizedActionPerformed(evt);
            }
        });
        add(jCheckBoxNormalized);
        jCheckBoxNormalized.setBounds(200, 110, 51, 24);

        jButtonGenerate.setText("Generate Plot - Matplotlib");
        jButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateActionPerformed(evt);
            }
        });
        add(jButtonGenerate);
        jButtonGenerate.setBounds(20, 150, 250, 29);

        jLabel4.setText("Per Window?");
        add(jLabel4);
        jLabel4.setBounds(200, 30, 90, 17);

        jCheckBoxPerWindow.setText("Yes");
        jCheckBoxPerWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPerWindowActionPerformed(evt);
            }
        });
        add(jCheckBoxPerWindow);
        jCheckBoxPerWindow.setBounds(200, 50, 51, 24);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateActionPerformed
        
        new Thread() {
            @Override
            public void run() {
                generate(true);
            }
        }.start();
       
    }//GEN-LAST:event_jButtonGenerateActionPerformed

    
    private void generate(boolean newWindow){
        int tileAddr = -1;
        String toWho = jComboBoxToWho.getSelectedItem().toString();
        if (!toWho.equals("All System")){
            String [] addr = toWho.split(" ")[1].split("x");
            tileAddr = Integer.parseInt(addr[0]) << 8 | Integer.parseInt(addr[1]);
        }
        
        switch(type){
            case ENERGY:
                for (EnergyStatisticType option: EnergyStatisticType.values()) { 
                    if (jComboBoxWhat.getSelectedItem().toString() == option.text){
                        mainPlotPanel.generateEnergy(tileAddr, option, jCheckBoxNormalized.isSelected(), jCheckBoxPerWindow.isSelected(), newWindow);
                        break;
                     }
                }
                break;
            case MEMORY:
                for (MemoryStatisticType option: MemoryStatisticType.values()) { 
                    if (jComboBoxWhat.getSelectedItem().toString() == option.text){
                        mainPlotPanel.generateMemory(tileAddr, option, jCheckBoxNormalized.isSelected(), jCheckBoxPerWindow.isSelected(), newWindow);
                        break;
                     }
                }
                break;
        }
    }
    
    private void jCheckBoxPerWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPerWindowActionPerformed
        if (jCheckBoxPerWindow.isSelected()){
            jCheckBoxPerWindow.setText("Yes");
        } else {
            jCheckBoxPerWindow.setText("No");
        }
    }//GEN-LAST:event_jCheckBoxPerWindowActionPerformed

    private void jCheckBoxNormalizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNormalizedActionPerformed
        if (jCheckBoxNormalized.isSelected()){
            jCheckBoxNormalized.setText("Yes");
        } else {
            jCheckBoxNormalized.setText("No");
        }
    }//GEN-LAST:event_jCheckBoxNormalizedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JCheckBox jCheckBoxNormalized;
    private javax.swing.JCheckBox jCheckBoxPerWindow;
    private javax.swing.JComboBox<String> jComboBoxToWho;
    private javax.swing.JComboBox<String> jComboBoxWhat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNormalized;
    // End of variables declaration//GEN-END:variables
}