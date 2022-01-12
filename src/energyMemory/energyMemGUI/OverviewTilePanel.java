/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyMemory.energyMemGUI;

import energyMemory.energyMemGUI.ControlPanel.TilePlotType;
import java.awt.Dimension;
import java.util.ArrayList;
import energyMemory.monitoredData.EnergyInfo;
import javax.swing.JOptionPane;

/**
 *
 * @author ruaro
 */
public class OverviewTilePanel extends javax.swing.JPanel {

    /**
     * Creates new form EnergyTilePanel
     */
    private int tileAddr;
    
    private ControlPanel controlPanel;
    private OverviewTilePlotPanel plotPanel;
    private TilePlotType tilePlotType;
    private EnergyInfo energyInfo;
    
    private ArrayList<Float> window_values_list;
    
    public OverviewTilePanel(ControlPanel controlPanel, EnergyInfo energyInfo, int tileAddr, TilePlotType tilePlotType) {
        this.controlPanel = controlPanel;
        this.energyInfo = energyInfo;
        this.tileAddr = tileAddr;
        this.tilePlotType = tilePlotType;
        
        window_values_list = new ArrayList<>();
        
        initComponents();
        plotPanelAux.setVisible(false);
        
        
        plotPanel = new OverviewTilePlotPanel(this, controlPanel, window_values_list, tilePlotType);
        this.add(plotPanel);
        
        
        this.setMinimumSize(new Dimension(170, 170));
        this.setPreferredSize(new Dimension(170, 170));
        
        int xAddr = (tileAddr >> 8);
        int yAddr = (tileAddr & 0xFF);
        
        if (xAddr == 0)
            linkWestPanel.setVisible(false);
        else if (xAddr+1 == controlPanel.getXDIM())
            linkEastPanel.setVisible(false);
        
        if (yAddr == 0)
            linkNorthPanel.setVisible(false);
        else if (yAddr+1 == controlPanel.getYDIM())
            linkSouthPanel.setVisible(false);
        
        jLabelName.setText(xAddr+"x"+yAddr);
        
        switch(tilePlotType){
            case PLOT_ENERGY:
                jLabelYname.setText("nJ");
                break;
            case PLOT_MEMORY:
                jLabelYname.setText("#");
                break;
        }
    }
    
    public void resetValueList(){
        window_values_list.clear();
    }
    
    public int getAddr(){
        return tileAddr;
    }
    
    public void addWindowEnergyValue(float window_energy, float total_energy) {
        window_values_list.add(window_energy);
        
        String unit = "uJ";
        total_energy = total_energy / 1000f;
        
        if (total_energy >= 1000){
            total_energy = total_energy / 1000f;
            unit = "mJ";
            
            if (total_energy >= 1000){
                total_energy = total_energy / 1000f;
                unit = "J";
                
                if (total_energy >= 1000){
                    total_energy = total_energy / 1000f;
                    unit = "kJ";
                } 
            } 
        }  
        
        
        String t_energy = "T: "+String.format("%.2f", (total_energy))+unit;
        
        
        totalValueLabel.setText(t_energy);
        totalValueLabel.setToolTipText(t_energy);
        plotPanel.repaint();
        
    }
    
    public void addWindowMemoryValue(float window_memory, float total_memory) {
        window_values_list.add(window_memory);
        String t_energy = "T: "+String.format("%.2f", total_memory);
        
        totalValueLabel.setText(t_energy);
        totalValueLabel.setToolTipText(t_energy);
        plotPanel.repaint();
        
    }
    
    public void openTileDetailsFrame(){
        if (controlPanel.getSimultime_cycles() == 0){
            JOptionPane.showMessageDialog(this, "No data to show. Please first simulate the system or click in <Update>", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        switch(tilePlotType){
            case PLOT_ENERGY:
                new TileEnergyDetailsFrame(tileAddr, energyInfo, controlPanel);
                break;
            case PLOT_MEMORY:
                new TileMemDetailsFrame(tileAddr, energyInfo, controlPanel);
                break;
        }
    }
    
    /*public void printPDF(JFrame frame) {
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("/home/ruaro/Downloads/jar_files/teste.pdf"));
            
            doc.open();
            
            doc.add(new TileEnergyDetailsFrame(tileAddr, energyInfo, controlPanel));
            
            doc.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OverviewTilePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(OverviewTilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    /*@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.gray);
        g.drawLine(0, 0, 20, 20);
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plotPanelAux = new javax.swing.JPanel();
        linkWestPanel = new javax.swing.JPanel();
        linkEastPanel = new javax.swing.JPanel();
        linkNorthPanel = new javax.swing.JPanel();
        linkSouthPanel = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        totalValueLabel = new javax.swing.JLabel();
        jLabelYname = new javax.swing.JLabel();
        jLabelXname = new javax.swing.JLabel();

        setBackground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(170, 170));
        setMinimumSize(new java.awt.Dimension(170, 170));
        setLayout(null);

        plotPanelAux.setBackground(java.awt.Color.orange);
        plotPanelAux.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout plotPanelAuxLayout = new javax.swing.GroupLayout(plotPanelAux);
        plotPanelAux.setLayout(plotPanelAuxLayout);
        plotPanelAuxLayout.setHorizontalGroup(
            plotPanelAuxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        plotPanelAuxLayout.setVerticalGroup(
            plotPanelAuxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        add(plotPanelAux);
        plotPanelAux.setBounds(20, 20, 130, 130);

        linkWestPanel.setBackground(new java.awt.Color(222, 222, 222));
        linkWestPanel.setForeground(java.awt.Color.lightGray);

        javax.swing.GroupLayout linkWestPanelLayout = new javax.swing.GroupLayout(linkWestPanel);
        linkWestPanel.setLayout(linkWestPanelLayout);
        linkWestPanelLayout.setHorizontalGroup(
            linkWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        linkWestPanelLayout.setVerticalGroup(
            linkWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(linkWestPanel);
        linkWestPanel.setBounds(0, 70, 20, 30);

        linkEastPanel.setBackground(new java.awt.Color(222, 222, 222));

        javax.swing.GroupLayout linkEastPanelLayout = new javax.swing.GroupLayout(linkEastPanel);
        linkEastPanel.setLayout(linkEastPanelLayout);
        linkEastPanelLayout.setHorizontalGroup(
            linkEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        linkEastPanelLayout.setVerticalGroup(
            linkEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(linkEastPanel);
        linkEastPanel.setBounds(150, 70, 20, 30);

        linkNorthPanel.setBackground(new java.awt.Color(222, 222, 222));
        linkNorthPanel.setForeground(java.awt.Color.lightGray);

        javax.swing.GroupLayout linkNorthPanelLayout = new javax.swing.GroupLayout(linkNorthPanel);
        linkNorthPanel.setLayout(linkNorthPanelLayout);
        linkNorthPanelLayout.setHorizontalGroup(
            linkNorthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        linkNorthPanelLayout.setVerticalGroup(
            linkNorthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(linkNorthPanel);
        linkNorthPanel.setBounds(70, 0, 30, 20);

        linkSouthPanel.setBackground(new java.awt.Color(222, 222, 222));
        linkSouthPanel.setForeground(new java.awt.Color(224, 222, 222));

        javax.swing.GroupLayout linkSouthPanelLayout = new javax.swing.GroupLayout(linkSouthPanel);
        linkSouthPanel.setLayout(linkSouthPanelLayout);
        linkSouthPanelLayout.setHorizontalGroup(
            linkSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        linkSouthPanelLayout.setVerticalGroup(
            linkSouthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(linkSouthPanel);
        linkSouthPanel.setBounds(70, 150, 30, 20);

        jLabelName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelName.setText("10x10");
        add(jLabelName);
        jLabelName.setBounds(20, 5, 38, 15);

        totalValueLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        totalValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalValueLabel.setText("T:");
        add(totalValueLabel);
        totalValueLabel.setBounds(100, 5, 70, 15);

        jLabelYname.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelYname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelYname.setText("nJ");
        add(jLabelYname);
        jLabelYname.setBounds(0, 130, 20, 15);

        jLabelXname.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelXname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelXname.setText("t(cc)");
        add(jLabelXname);
        jLabelXname.setBounds(110, 150, 40, 15);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelXname;
    private javax.swing.JLabel jLabelYname;
    private javax.swing.JPanel linkEastPanel;
    private javax.swing.JPanel linkNorthPanel;
    private javax.swing.JPanel linkSouthPanel;
    private javax.swing.JPanel linkWestPanel;
    private javax.swing.JPanel plotPanelAux;
    private javax.swing.JLabel totalValueLabel;
    // End of variables declaration//GEN-END:variables

}
