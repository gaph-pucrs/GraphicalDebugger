/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyMemory.energyMemGUI;

import java.awt.Dimension;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import energyMemory.monitoredData.EnergyInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author ruaro
 */
public class MainEnergyMemoryFrame extends javax.swing.JFrame{

    
    private ControlPanel controlPanel;
    private EnergyInfo energyInfo;
    private OverviewEnergyTab energyOverviewPanel;
    private OverviewMemoryTab memoryOverviewPanel;

    //Default Constructor for test
    public MainEnergyMemoryFrame() {
        this(3, 3, "/home/ruaro/openpiton/build/debug");
        //this.setTitle("Energy and Memory Profiler [v1.0] - Default Mode");
    }
    
    public MainEnergyMemoryFrame(int XDIM, int YDIM, String debugPath) {
        initComponents();
        
        this.setTitle("Energy and Memory Profiler [OpenPiton-v1.0]");
        
        controlPanel = new ControlPanel(XDIM, YDIM, debugPath);
        
        //freqjTextField.setText(Integer.toString(controlPanel.getFreq_MHz()));
        //voltjTextField.setText(Float.toString(controlPanel.getVoltagem_V()));
        windowSizejTextField.setText(Integer.toString(controlPanel.getWindowSize_Kcyles()));
        simulTimejLabel.setText(Integer.toString(controlPanel.getSimultime_cycles()));
        
        
        this.setPreferredSize(new Dimension(XDIM*100, YDIM*100+500));
        this.setMinimumSize(new Dimension(XDIM*200,YDIM*100+500));
        
        String simLogPath = debugPath+"/../mem_cpu_log.txt";
        String nocPath = debugPath+"/traffic_router.txt";
        
        try {
            energyInfo = new EnergyInfo(simLogPath, nocPath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Log file not found in:" + simLogPath +"\nThis file must be in the debug folder.\n\nPlease try reaload the tool with Ctrl+R ", "File not found", JOptionPane.ERROR_MESSAGE);
        }
        
        energyOverviewPanel = new OverviewEnergyTab(this.getPreferredSize(), controlPanel, energyInfo);
        memoryOverviewPanel = new OverviewMemoryTab(this.getPreferredSize(), controlPanel, energyInfo);
        
        jTabbedPaneEnergy.addTab("Energy", energyOverviewPanel);
        jTabbedPaneEnergy.add("Memory", memoryOverviewPanel);
        jTabbedPaneEnergy.addTab("Plot Generator", new PlotGeneratorMainTab(controlPanel, energyInfo));
        
        jCheckBoxNormalized.setSelected(true);
        jCheckBoxNormalized.setToolTipText("Normilized to the worst result among all tiles.");
        maxEnergyjTextField.setEnabled(false);
        
       
        jTabbedPaneEnergy.setSelectedComponent(energyOverviewPanel);
        //this.setLocationRelativeTo(null);
        
    }
    
    private void setTabEnergyEnabled(){
        controlPanel.setTab_energy_enabled();
        y_axis_label.setText("nJoules");
        energyOverviewPanel.refreshPlots();
        if (!jCheckBoxNormalized.isSelected()){
            maxEnergyjTextField.setText(Integer.toString((int)controlPanel.getMaxValueEnergyTile_nJ()));
        }

    }
    
    private void setTabMemEnabled(){
        controlPanel.setTab_memory_enabled();
        y_axis_label.setText("# access");
        memoryOverviewPanel.refreshPlots();
        if (!jCheckBoxNormalized.isSelected()){
            maxEnergyjTextField.setText(Integer.toString((int)controlPanel.getMaxMemoryNumber()));
        }
    }
    
    public void resetAll(){
        energyInfo.reset();
        controlPanel.resetWindow();
        energyOverviewPanel.resetTileGrid();
        memoryOverviewPanel.resetTileGrid();
        updateButton.setEnabled(true);
        stopButton.setEnabled(false);
        simulTimejLabel.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneEnergy = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        applyButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelMaxTile = new javax.swing.JLabel();
        maxEnergyjTextField = new javax.swing.JTextField();
        y_axis_label = new javax.swing.JLabel();
        windowSizejTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        simulTimejLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stopButton = new javax.swing.JButton();
        jCheckBoxNormalized = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuReset = new javax.swing.JMenu();
        jMenuItemReset = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);

        jTabbedPaneEnergy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneEnergyStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });
        jPanel1.setLayout(null);

        applyButton.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(applyButton);
        applyButton.setBounds(360, 5, 70, 27);

        updateButton.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton);
        updateButton.setBounds(5, 10, 55, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("clock cycles (cc)");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 42, 140, 15);

        jLabelMaxTile.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelMaxTile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMaxTile.setText("Max. y-axis/tile");
        jPanel1.add(jLabelMaxTile);
        jLabelMaxTile.setBounds(120, 38, 100, 15);

        maxEnergyjTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        maxEnergyjTextField.setText("500");
        jPanel1.add(maxEnergyjTextField);
        maxEnergyjTextField.setBounds(220, 34, 80, 20);

        y_axis_label.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        y_axis_label.setText("nJoules");
        jPanel1.add(y_axis_label);
        y_axis_label.setBounds(300, 38, 60, 15);

        windowSizejTextField.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        windowSizejTextField.setText("50");
        jPanel1.add(windowSizejTextField);
        windowSizejTextField.setBounds(220, 9, 80, 20);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Kcycles");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 10, 50, 15);

        simulTimejLabel.setBackground(java.awt.Color.white);
        simulTimejLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        simulTimejLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        simulTimejLabel.setText("999999999");
        simulTimejLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Simulation Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11))); // NOI18N
        jPanel1.add(simulTimejLabel);
        simulTimejLabel.setBounds(445, 6, 160, 40);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Window Size");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(140, 10, 80, 15);

        stopButton.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });
        jPanel1.add(stopButton);
        stopButton.setBounds(65, 10, 55, 40);

        jCheckBoxNormalized.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBoxNormalized.setText("Normal.");
        jCheckBoxNormalized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNormalizedActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxNormalized);
        jCheckBoxNormalized.setBounds(360, 34, 74, 24);

        jMenuReset.setText("File");

        jMenuItemReset.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemReset.setText("Reset");
        jMenuItemReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemResetActionPerformed(evt);
            }
        });
        jMenuReset.add(jMenuItemReset);

        jMenuBar1.add(jMenuReset);

        jMenu2.setText("Edit");

        jMenuAbout.setText("About");
        jMenu2.add(jMenuAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneEnergy, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneEnergy, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateTiles(){
        if (controlPanel.isTab_energy_enabled()){
            energyOverviewPanel.updateTiles();
        } else if (controlPanel.isTab_memory_enabled()){
            memoryOverviewPanel.updateTiles();
            //memoryOverviewPanel.refreshPlots();
        }
    }
    
    private void stopRunning(){
        controlPanel.setUpdate(false);
        stopButton.setEnabled(false);
        updateButton.setEnabled(true);
    }
    
    private void jMenuItemResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemResetActionPerformed
        stopRunning();
        resetAll();
    }//GEN-LAST:event_jMenuItemResetActionPerformed

    private void jTabbedPaneEnergyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneEnergyStateChanged
        boolean resumeRun = false;
        if (controlPanel.isUpdate()){
            resumeRun = true;
            stopRunning();
        }
        
        if (jTabbedPaneEnergy.getSelectedComponent() == energyOverviewPanel){
            setTabEnergyEnabled();
        } else if (jTabbedPaneEnergy.getSelectedComponent() == memoryOverviewPanel){
            setTabMemEnabled();
        }
        
        if (resumeRun)
            runSimul();
    }//GEN-LAST:event_jTabbedPaneEnergyStateChanged

    private void runSimul(){
        stopButton.setEnabled(true);
        updateButton.setEnabled(false);
        controlPanel.setUpdate(true);

        new Thread() {
            @Override
            public void run() {
                int time;
                while (controlPanel.isUpdate()) {

                    time = energyInfo.getNextEvent();

                    if (time == 0){
                        try { sleep(200); } catch (Exception ex) {}
                        continue;
                    }

                    controlPanel.setSimultime_cycles(time);

                    if (time > controlPanel.getMax_window_time()){
                        updateTiles();
                        controlPanel.advanceWindow();
                        //try { sleep(500); } catch (Exception ex) {}
                    }
                    simulTimejLabel.setText(String.valueOf(time));
                    //simulTimejLabel.setText(new DecimalFormat("0.00000").format(((float) (time * controlPanel.getClockPeriodInNs() / 1000.0f / 1000.0f))) + " ms");
                    //try { sleep(200); } catch (Exception ex) {}
                    //break;
                }
                updateTiles();
            }
        }.start();
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        runSimul();
    }//GEN-LAST:event_updateButtonActionPerformed

    
    private void applyMainWindow(){
        try{
            int new_value = Integer.parseInt(windowSizejTextField.getText());
            if (new_value <= 0 || (new_value*1000) > controlPanel.getSimultime_cycles()){
                throw new Exception();
            } 
            
            if (!controlPanel.isNormalize_window()){
                if (controlPanel.isTab_energy_enabled()){
                    controlPanel.setMaxValueEnergyTile_nJ(Float.parseFloat(maxEnergyjTextField.getText()));
                } else {
                    controlPanel.setMaxMemoryNumber(Float.parseFloat(maxEnergyjTextField.getText()));
                }
            }
            
            controlPanel.recalculateWindow(new_value);
            if (controlPanel.isTab_energy_enabled()){
                energyOverviewPanel.refreshPlots();
            } else {
                memoryOverviewPanel.refreshPlots();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Window Size must be a real number:\n- Higher than 0,\n- Lower than (simulation time/1000).", "Attention", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        applyMainWindow();
    }//GEN-LAST:event_applyButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        stopRunning();
    }//GEN-LAST:event_stopButtonActionPerformed

    private void jCheckBoxNormalizedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNormalizedActionPerformed
        if (jCheckBoxNormalized.isSelected()){
            maxEnergyjTextField.setEnabled(false);
            maxEnergyjTextField.setText("100%");
            controlPanel.setNormalize_window(true);
        } else {
            controlPanel.setNormalize_window(false);
            maxEnergyjTextField.setEnabled(true);
            if (controlPanel.isTab_energy_enabled()){
                maxEnergyjTextField.setText(String.format("%.2f", controlPanel.getMaxValueEnergyTile_nJ()));
            } else if (controlPanel.isTab_memory_enabled()){
                maxEnergyjTextField.setText(String.format("%.2f", controlPanel.getMaxMemoryNumber()));
            } else {
                maxEnergyjTextField.setText("null");
            }
        }
    }//GEN-LAST:event_jCheckBoxNormalizedActionPerformed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        //Not working
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            applyMainWindow();
        }
    }//GEN-LAST:event_jPanel1KeyTyped

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainEnergyMemoryFrame().setVisible(true);
            }
        });
        
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JCheckBox jCheckBoxNormalized;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMaxTile;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemReset;
    private javax.swing.JMenu jMenuReset;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPaneEnergy;
    private javax.swing.JTextField maxEnergyjTextField;
    private javax.swing.JLabel simulTimejLabel;
    private javax.swing.JButton stopButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField windowSizejTextField;
    private javax.swing.JLabel y_axis_label;
    // End of variables declaration//GEN-END:variables
}
