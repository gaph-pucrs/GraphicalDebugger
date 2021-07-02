package source;

import componentes.UJPanelImagem;
import java.awt.Color;
import java.awt.Cursor;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import util.MPSoCConfig;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marcelo
 */
public class ChipsetPeripheral extends javax.swing.JPanel {

    private int attached_router_addr;
    private int peripheral_position; //Position realted to CHip (weast, east, north, south)
    private MPSoCConfig mPSoCConfig;
    private MainFrame mainFrame;
    private boolean needReset;

    public ChipsetPeripheral(MainFrame mainFrame, int attached_router_addr, MPSoCConfig mPSoCConfig, int peripheral_position) {
        this.mainFrame = mainFrame;
        this.attached_router_addr = attached_router_addr;
        this.mPSoCConfig = mPSoCConfig;
        this.peripheral_position = peripheral_position;
        this.needReset = true;
        initComponents();
        
        //router.setCursor(new Cursor(Cursor.HAND_CURSOR));

        
        out_east_NoC1.setToolTipText("NoC1");
        out_east_NoC2.setToolTipText("NoC2");
        out_east_NoC3.setToolTipText("NoC3");
        
        out_weast_NoC1.setToolTipText("NoC1");
        out_weast_NoC2.setToolTipText("NoC2");
        out_weast_NoC3.setToolTipText("NoC3");
        
        out_south_NoC1.setToolTipText("NoC1");
        out_south_NoC2.setToolTipText("NoC2");
        out_south_NoC3.setToolTipText("NoC3");
        
        out_north_NoC1.setToolTipText("NoC1");
        out_north_NoC2.setToolTipText("NoC2");
        out_north_NoC3.setToolTipText("NoC3");
        
        in_east_NoC1.setToolTipText("NoC1");
        in_east_NoC2.setToolTipText("NoC2");
        in_east_NoC3.setToolTipText("NoC3");
        
        in_weast_NoC1.setToolTipText("NoC1");
        in_weast_NoC2.setToolTipText("NoC2");
        in_weast_NoC3.setToolTipText("NoC3");
        
        in_south_NoC1.setToolTipText("NoC1");
        in_south_NoC2.setToolTipText("NoC2");
        in_south_NoC3.setToolTipText("NoC3");
        
        in_north_NoC1.setToolTipText("NoC1");
        in_north_NoC2.setToolTipText("NoC2");
        in_north_NoC3.setToolTipText("NoC3");
        
        
        //break; is commented because currently I am not showing bdw utilizaiton in peripheral
        switch(peripheral_position){
            case MPSoCConfig.PERIPH_POS_EAST:
            case MPSoCConfig.PERIPH_POS_WEST: 
                south_NoC1_Label.setText("");
                south_NoC2_Label.setText("");
                south_NoC3_Label.setText("");
                north_NoC1_Label.setText("");
                north_NoC2_Label.setText("");
                north_NoC3_Label.setText("");
                //break;
            case MPSoCConfig.PERIPH_POS_SOUTH:
            case MPSoCConfig.PERIPH_POS_NORTH: 
                weast_NoC1_Label.setText("");
                weast_NoC2_Label.setText("");
                weast_NoC3_Label.setText("");
                east_NoC1_Label.setText("");
                east_NoC2_Label.setText("");
                east_NoC3_Label.setText("");
                break;
        }
        
        //commented because currently I am not showing bdw utilizaiton in peripheral
        /*switch(peripheral_position){
            case MPSoCConfig.PERIPH_POS_EAST:
                east_NoC1_Label.setText("");
                east_NoC2_Label.setText("");
                east_NoC3_Label.setText("");
                break;
            case MPSoCConfig.PERIPH_POS_WEST: 
                weast_NoC1_Label.setText("");
                weast_NoC2_Label.setText("");
                weast_NoC3_Label.setText("");
                break;
            case MPSoCConfig.PERIPH_POS_SOUTH:
                south_NoC1_Label.setText("");
                south_NoC2_Label.setText("");
                south_NoC3_Label.setText("");
                break;
            case MPSoCConfig.PERIPH_POS_NORTH: 
                north_NoC1_Label.setText("");
                north_NoC2_Label.setText("");
                north_NoC3_Label.setText("");
                break;
        }*/
        
        router.setImagem("/images/Router_master.png");
        
        router.repaint();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        router = new componentes.UJPanelImagem();
        north_NoC2_Label = new javax.swing.JLabel();
        south_NoC2_Label = new javax.swing.JLabel();
        south_NoC1_Label = new javax.swing.JLabel();
        weast_NoC2_Label = new javax.swing.JLabel();
        weast_NoC1_Label = new javax.swing.JLabel();
        north_NoC1_Label = new javax.swing.JLabel();
        east_NoC1_Label = new javax.swing.JLabel();
        east_NoC3_Label = new javax.swing.JLabel();
        weast_NoC3_Label = new javax.swing.JLabel();
        north_NoC3_Label = new javax.swing.JLabel();
        south_NoC3_Label = new javax.swing.JLabel();
        east_NoC2_Label = new javax.swing.JLabel();
        periphNamePanel = new javax.swing.JPanel();
        periphNameLabel = new javax.swing.JLabel();
        noc1_label1 = new javax.swing.JLabel();
        out_north_NoC2 = new componentes.UJPanelImagem();
        in_north_NoC2 = new componentes.UJPanelImagem();
        out_weast_NoC1 = new componentes.UJPanelImagem();
        in_weast_NoC1 = new componentes.UJPanelImagem();
        in_east_NoC2 = new componentes.UJPanelImagem();
        out_east_NoC2 = new componentes.UJPanelImagem();
        in_south_NoC1 = new componentes.UJPanelImagem();
        out_south_NoC1 = new componentes.UJPanelImagem();
        in_south_NoC2 = new componentes.UJPanelImagem();
        out_south_NoC2 = new componentes.UJPanelImagem();
        in_east_NoC1 = new componentes.UJPanelImagem();
        out_east_NoC1 = new componentes.UJPanelImagem();
        out_north_NoC1 = new componentes.UJPanelImagem();
        in_north_NoC1 = new componentes.UJPanelImagem();
        in_weast_NoC3 = new componentes.UJPanelImagem();
        out_weast_NoC3 = new componentes.UJPanelImagem();
        in_south_NoC3 = new componentes.UJPanelImagem();
        out_south_NoC3 = new componentes.UJPanelImagem();
        in_north_NoC3 = new componentes.UJPanelImagem();
        out_north_NoC3 = new componentes.UJPanelImagem();
        in_weast_NoC2 = new componentes.UJPanelImagem();
        out_weast_NoC2 = new componentes.UJPanelImagem();
        out_east_NoC3 = new componentes.UJPanelImagem();
        in_east_NoC3 = new componentes.UJPanelImagem();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(170, 170));
        setMinimumSize(new java.awt.Dimension(170, 170));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(170, 170));
        setLayout(null);

        router.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        router.setMinimumSize(new java.awt.Dimension(300, 300));
        router.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                routerMouseReleased(evt);
            }
        });
        router.setLayout(null);

        north_NoC2_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        north_NoC2_Label.setText("00");
        router.add(north_NoC2_Label);
        north_NoC2_Label.setBounds(72, -2, 20, 20);

        south_NoC2_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        south_NoC2_Label.setText("00");
        router.add(south_NoC2_Label);
        south_NoC2_Label.setBounds(55, 112, 20, 20);

        south_NoC1_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        south_NoC1_Label.setText("00");
        router.add(south_NoC1_Label);
        south_NoC1_Label.setBounds(11, 112, 20, 20);

        weast_NoC2_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        weast_NoC2_Label.setText("00");
        router.add(weast_NoC2_Label);
        weast_NoC2_Label.setBounds(1, 50, 20, 20);

        weast_NoC1_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        weast_NoC1_Label.setText("00");
        router.add(weast_NoC1_Label);
        weast_NoC1_Label.setBounds(1, 6, 25, 20);

        north_NoC1_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        north_NoC1_Label.setText("00");
        router.add(north_NoC1_Label);
        north_NoC1_Label.setBounds(29, -2, 20, 20);

        east_NoC1_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        east_NoC1_Label.setText("00");
        router.add(east_NoC1_Label);
        east_NoC1_Label.setBounds(116, 24, 12, 20);

        east_NoC3_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        east_NoC3_Label.setText("00");
        east_NoC3_Label.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        router.add(east_NoC3_Label);
        east_NoC3_Label.setBounds(116, 113, 12, 10);

        weast_NoC3_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        weast_NoC3_Label.setText("00");
        router.add(weast_NoC3_Label);
        weast_NoC3_Label.setBounds(1, 92, 25, 20);

        north_NoC3_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        north_NoC3_Label.setText("00");
        router.add(north_NoC3_Label);
        north_NoC3_Label.setBounds(115, -2, 20, 20);

        south_NoC3_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        south_NoC3_Label.setText("00");
        router.add(south_NoC3_Label);
        south_NoC3_Label.setBounds(93, 112, 20, 20);

        east_NoC2_Label.setFont(new java.awt.Font("Andale Mono", 0, 10)); // NOI18N
        east_NoC2_Label.setText("00");
        router.add(east_NoC2_Label);
        east_NoC2_Label.setBounds(116, 67, 12, 20);

        periphNamePanel.setBackground(new java.awt.Color(157, 189, 253));
        periphNamePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        periphNamePanel.setLayout(null);

        periphNameLabel.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        periphNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        periphNameLabel.setText("DRAM");
        periphNamePanel.add(periphNameLabel);
        periphNameLabel.setBounds(0, 0, 70, 40);

        router.add(periphNamePanel);
        periphNamePanel.setBounds(30, 60, 70, 40);

        noc1_label1.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        noc1_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noc1_label1.setText("Chipset");
        router.add(noc1_label1);
        noc1_label1.setBounds(30, 20, 70, 17);

        add(router);
        router.setBounds(30, 30, 130, 130);

        out_north_NoC2.setBorder(null);

        javax.swing.GroupLayout out_north_NoC2Layout = new javax.swing.GroupLayout(out_north_NoC2);
        out_north_NoC2.setLayout(out_north_NoC2Layout);
        out_north_NoC2Layout.setHorizontalGroup(
            out_north_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        out_north_NoC2Layout.setVerticalGroup(
            out_north_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(out_north_NoC2);
        out_north_NoC2.setBounds(86, 0, 6, 30);

        in_north_NoC2.setBorder(null);

        javax.swing.GroupLayout in_north_NoC2Layout = new javax.swing.GroupLayout(in_north_NoC2);
        in_north_NoC2.setLayout(in_north_NoC2Layout);
        in_north_NoC2Layout.setHorizontalGroup(
            in_north_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        in_north_NoC2Layout.setVerticalGroup(
            in_north_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(in_north_NoC2);
        in_north_NoC2.setBounds(97, 0, 20, 30);

        out_weast_NoC1.setBorder(null);

        javax.swing.GroupLayout out_weast_NoC1Layout = new javax.swing.GroupLayout(out_weast_NoC1);
        out_weast_NoC1.setLayout(out_weast_NoC1Layout);
        out_weast_NoC1Layout.setHorizontalGroup(
            out_weast_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        out_weast_NoC1Layout.setVerticalGroup(
            out_weast_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        add(out_weast_NoC1);
        out_weast_NoC1.setBounds(0, 61, 30, 6);

        in_weast_NoC1.setBorder(null);

        javax.swing.GroupLayout in_weast_NoC1Layout = new javax.swing.GroupLayout(in_weast_NoC1);
        in_weast_NoC1.setLayout(in_weast_NoC1Layout);
        in_weast_NoC1Layout.setHorizontalGroup(
            in_weast_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        in_weast_NoC1Layout.setVerticalGroup(
            in_weast_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(in_weast_NoC1);
        in_weast_NoC1.setBounds(0, 36, 30, 20);

        in_east_NoC2.setBorder(null);

        javax.swing.GroupLayout in_east_NoC2Layout = new javax.swing.GroupLayout(in_east_NoC2);
        in_east_NoC2.setLayout(in_east_NoC2Layout);
        in_east_NoC2Layout.setHorizontalGroup(
            in_east_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        in_east_NoC2Layout.setVerticalGroup(
            in_east_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(in_east_NoC2);
        in_east_NoC2.setBounds(160, 97, 33, 20);

        out_east_NoC2.setBorder(null);

        javax.swing.GroupLayout out_east_NoC2Layout = new javax.swing.GroupLayout(out_east_NoC2);
        out_east_NoC2.setLayout(out_east_NoC2Layout);
        out_east_NoC2Layout.setHorizontalGroup(
            out_east_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        out_east_NoC2Layout.setVerticalGroup(
            out_east_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        add(out_east_NoC2);
        out_east_NoC2.setBounds(160, 86, 33, 6);

        in_south_NoC1.setBorder(null);

        javax.swing.GroupLayout in_south_NoC1Layout = new javax.swing.GroupLayout(in_south_NoC1);
        in_south_NoC1.setLayout(in_south_NoC1Layout);
        in_south_NoC1Layout.setHorizontalGroup(
            in_south_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        in_south_NoC1Layout.setVerticalGroup(
            in_south_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(in_south_NoC1);
        in_south_NoC1.setBounds(36, 160, 20, 30);

        out_south_NoC1.setBorder(null);

        javax.swing.GroupLayout out_south_NoC1Layout = new javax.swing.GroupLayout(out_south_NoC1);
        out_south_NoC1.setLayout(out_south_NoC1Layout);
        out_south_NoC1Layout.setHorizontalGroup(
            out_south_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        out_south_NoC1Layout.setVerticalGroup(
            out_south_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(out_south_NoC1);
        out_south_NoC1.setBounds(61, 160, 6, 30);

        in_south_NoC2.setBorder(null);

        javax.swing.GroupLayout in_south_NoC2Layout = new javax.swing.GroupLayout(in_south_NoC2);
        in_south_NoC2.setLayout(in_south_NoC2Layout);
        in_south_NoC2Layout.setHorizontalGroup(
            in_south_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        in_south_NoC2Layout.setVerticalGroup(
            in_south_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(in_south_NoC2);
        in_south_NoC2.setBounds(79, 160, 20, 30);

        out_south_NoC2.setBorder(null);

        javax.swing.GroupLayout out_south_NoC2Layout = new javax.swing.GroupLayout(out_south_NoC2);
        out_south_NoC2.setLayout(out_south_NoC2Layout);
        out_south_NoC2Layout.setHorizontalGroup(
            out_south_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        out_south_NoC2Layout.setVerticalGroup(
            out_south_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(out_south_NoC2);
        out_south_NoC2.setBounds(104, 160, 6, 30);

        in_east_NoC1.setBorder(null);

        javax.swing.GroupLayout in_east_NoC1Layout = new javax.swing.GroupLayout(in_east_NoC1);
        in_east_NoC1.setLayout(in_east_NoC1Layout);
        in_east_NoC1Layout.setHorizontalGroup(
            in_east_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        in_east_NoC1Layout.setVerticalGroup(
            in_east_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(in_east_NoC1);
        in_east_NoC1.setBounds(160, 54, 33, 20);

        out_east_NoC1.setBorder(null);

        javax.swing.GroupLayout out_east_NoC1Layout = new javax.swing.GroupLayout(out_east_NoC1);
        out_east_NoC1.setLayout(out_east_NoC1Layout);
        out_east_NoC1Layout.setHorizontalGroup(
            out_east_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        out_east_NoC1Layout.setVerticalGroup(
            out_east_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        add(out_east_NoC1);
        out_east_NoC1.setBounds(160, 43, 33, 6);

        out_north_NoC1.setBorder(null);

        javax.swing.GroupLayout out_north_NoC1Layout = new javax.swing.GroupLayout(out_north_NoC1);
        out_north_NoC1.setLayout(out_north_NoC1Layout);
        out_north_NoC1Layout.setHorizontalGroup(
            out_north_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        out_north_NoC1Layout.setVerticalGroup(
            out_north_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(out_north_NoC1);
        out_north_NoC1.setBounds(43, 0, 6, 30);

        in_north_NoC1.setBorder(null);

        javax.swing.GroupLayout in_north_NoC1Layout = new javax.swing.GroupLayout(in_north_NoC1);
        in_north_NoC1.setLayout(in_north_NoC1Layout);
        in_north_NoC1Layout.setHorizontalGroup(
            in_north_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        in_north_NoC1Layout.setVerticalGroup(
            in_north_NoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(in_north_NoC1);
        in_north_NoC1.setBounds(54, 0, 20, 30);

        in_weast_NoC3.setBorder(null);

        javax.swing.GroupLayout in_weast_NoC3Layout = new javax.swing.GroupLayout(in_weast_NoC3);
        in_weast_NoC3.setLayout(in_weast_NoC3Layout);
        in_weast_NoC3Layout.setHorizontalGroup(
            in_weast_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        in_weast_NoC3Layout.setVerticalGroup(
            in_weast_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(in_weast_NoC3);
        in_weast_NoC3.setBounds(0, 122, 30, 20);

        out_weast_NoC3.setBorder(null);

        javax.swing.GroupLayout out_weast_NoC3Layout = new javax.swing.GroupLayout(out_weast_NoC3);
        out_weast_NoC3.setLayout(out_weast_NoC3Layout);
        out_weast_NoC3Layout.setHorizontalGroup(
            out_weast_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        out_weast_NoC3Layout.setVerticalGroup(
            out_weast_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        add(out_weast_NoC3);
        out_weast_NoC3.setBounds(0, 147, 30, 6);

        in_south_NoC3.setBorder(null);

        javax.swing.GroupLayout in_south_NoC3Layout = new javax.swing.GroupLayout(in_south_NoC3);
        in_south_NoC3.setLayout(in_south_NoC3Layout);
        in_south_NoC3Layout.setHorizontalGroup(
            in_south_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        in_south_NoC3Layout.setVerticalGroup(
            in_south_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(in_south_NoC3);
        in_south_NoC3.setBounds(122, 160, 20, 30);

        out_south_NoC3.setBorder(null);

        javax.swing.GroupLayout out_south_NoC3Layout = new javax.swing.GroupLayout(out_south_NoC3);
        out_south_NoC3.setLayout(out_south_NoC3Layout);
        out_south_NoC3Layout.setHorizontalGroup(
            out_south_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        out_south_NoC3Layout.setVerticalGroup(
            out_south_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(out_south_NoC3);
        out_south_NoC3.setBounds(147, 160, 6, 30);

        in_north_NoC3.setBorder(null);

        javax.swing.GroupLayout in_north_NoC3Layout = new javax.swing.GroupLayout(in_north_NoC3);
        in_north_NoC3.setLayout(in_north_NoC3Layout);
        in_north_NoC3Layout.setHorizontalGroup(
            in_north_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        in_north_NoC3Layout.setVerticalGroup(
            in_north_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(in_north_NoC3);
        in_north_NoC3.setBounds(140, 0, 20, 30);

        out_north_NoC3.setBorder(null);

        javax.swing.GroupLayout out_north_NoC3Layout = new javax.swing.GroupLayout(out_north_NoC3);
        out_north_NoC3.setLayout(out_north_NoC3Layout);
        out_north_NoC3Layout.setHorizontalGroup(
            out_north_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        out_north_NoC3Layout.setVerticalGroup(
            out_north_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(out_north_NoC3);
        out_north_NoC3.setBounds(129, 0, 6, 30);

        in_weast_NoC2.setBorder(null);

        javax.swing.GroupLayout in_weast_NoC2Layout = new javax.swing.GroupLayout(in_weast_NoC2);
        in_weast_NoC2.setLayout(in_weast_NoC2Layout);
        in_weast_NoC2Layout.setHorizontalGroup(
            in_weast_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        in_weast_NoC2Layout.setVerticalGroup(
            in_weast_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(in_weast_NoC2);
        in_weast_NoC2.setBounds(0, 79, 30, 20);

        out_weast_NoC2.setBorder(null);

        javax.swing.GroupLayout out_weast_NoC2Layout = new javax.swing.GroupLayout(out_weast_NoC2);
        out_weast_NoC2.setLayout(out_weast_NoC2Layout);
        out_weast_NoC2Layout.setHorizontalGroup(
            out_weast_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        out_weast_NoC2Layout.setVerticalGroup(
            out_weast_NoC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        add(out_weast_NoC2);
        out_weast_NoC2.setBounds(0, 104, 30, 6);

        out_east_NoC3.setBorder(null);

        javax.swing.GroupLayout out_east_NoC3Layout = new javax.swing.GroupLayout(out_east_NoC3);
        out_east_NoC3.setLayout(out_east_NoC3Layout);
        out_east_NoC3Layout.setHorizontalGroup(
            out_east_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        out_east_NoC3Layout.setVerticalGroup(
            out_east_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        add(out_east_NoC3);
        out_east_NoC3.setBounds(160, 129, 30, 6);

        in_east_NoC3.setBorder(null);

        javax.swing.GroupLayout in_east_NoC3Layout = new javax.swing.GroupLayout(in_east_NoC3);
        in_east_NoC3.setLayout(in_east_NoC3Layout);
        in_east_NoC3Layout.setHorizontalGroup(
            in_east_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        in_east_NoC3Layout.setVerticalGroup(
            in_east_NoC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        add(in_east_NoC3);
        in_east_NoC3.setBounds(160, 140, 30, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void routerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routerMouseReleased
         //TODO
        //mainFrame.routerClicked(attached_router_addr);
    }//GEN-LAST:event_routerMouseReleased

    public void updateThroughput(int port, float value){
        
        if (value >= 100) value = 99.99f;
        
        //String text = new DecimalFormat("00.00").format((float)value);
        String text = new DecimalFormat("00").format((float)value);
        //text+="%";
        
        switch (port) {
            case MPSoCConfig.EAST1:
                east_NoC1_Label.setText(text);
                break;
            case MPSoCConfig.EAST2:
                east_NoC2_Label.setText(text);
                break;
            case MPSoCConfig.EAST3:
                east_NoC2_Label.setText(text);
                break;
            case MPSoCConfig.NORTH1:
                north_NoC1_Label.setText(text);
                break;
            case MPSoCConfig.NORTH2:
                north_NoC2_Label.setText(text);
                break;
            case MPSoCConfig.NORTH3:
                north_NoC3_Label.setText(text);
                break;
            case MPSoCConfig.WEST1:
                weast_NoC1_Label.setText(text);
                break;
            case MPSoCConfig.WEST2:
                weast_NoC2_Label.setText(text);
                break;
            case MPSoCConfig.WEST3:
                weast_NoC3_Label.setText(text);
                break;
            case MPSoCConfig.SOUTH1:
                south_NoC1_Label.setText(text);
                break;
            case MPSoCConfig.SOUTH2:
                south_NoC2_Label.setText(text);
                break;
            case MPSoCConfig.SOUTH3:
                south_NoC3_Label.setText(text);
                break;
        }
        
    }
    
    public void resetArrows() {

        int x_dimension = mPSoCConfig.getX_dimension();
        int y_dimension = mPSoCConfig.getY_dimension();
        
        needReset = false;
            
        //Set border black
        //periphNamePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        
        switch(peripheral_position){
            case MPSoCConfig.PERIPH_POS_EAST:
                out_weast_NoC1.setImagem("/images/undirected_h.png");
                out_weast_NoC1.repaint();
                in_weast_NoC1.setImagem("/images/right.png");
                in_weast_NoC1.repaint();
                out_weast_NoC2.setImagem("/images/undirected_h.png");
                out_weast_NoC2.repaint();
                in_weast_NoC2.setImagem("/images/right.png");
                in_weast_NoC2.repaint();
                out_weast_NoC3.setImagem("/images/undirected_h.png");
                out_weast_NoC3.repaint();
                in_weast_NoC3.setImagem("/images/right.png");
                in_weast_NoC3.repaint();
                break;
            case MPSoCConfig.PERIPH_POS_WEST:
                in_east_NoC2.setImagem("/images/left.png");
                in_east_NoC2.repaint();
                out_east_NoC2.setImagem("/images/undirected_h.png");
                out_east_NoC2.repaint();
                in_east_NoC1.setImagem("/images/left.png");
                in_east_NoC1.repaint();
                out_east_NoC1.setImagem("/images/undirected_h.png");
                out_east_NoC1.repaint();
                in_east_NoC3.setImagem("/images/left.png");
                in_east_NoC3.repaint();
                out_east_NoC3.setImagem("/images/undirected_h.png");
                out_east_NoC3.repaint();
                break;
            case MPSoCConfig.PERIPH_POS_NORTH:
                in_south_NoC1.setImagem("/images/up.png");
                in_south_NoC1.repaint();
                out_south_NoC1.setImagem("/images/undirected_v.png");
                out_south_NoC1.repaint();
                in_south_NoC2.setImagem("/images/up.png");
                in_south_NoC2.repaint();
                out_south_NoC2.setImagem("/images/undirected_v.png");
                out_south_NoC2.repaint();
                in_south_NoC3.setImagem("/images/up.png");
                in_south_NoC3.repaint();
                out_south_NoC3.setImagem("/images/undirected_v.png");
                out_south_NoC3.repaint();
                break;
            case MPSoCConfig.PERIPH_POS_SOUTH:
                out_north_NoC2.setImagem("/images/undirected_v.png");
                out_north_NoC2.repaint();
                in_north_NoC2.setImagem("/images/down.png");
                in_north_NoC2.repaint();
                out_north_NoC1.setImagem("/images/undirected_v.png");
                out_north_NoC1.repaint();
                in_north_NoC1.setImagem("/images/down.png");
                in_north_NoC1.repaint();
                out_north_NoC3.setImagem("/images/undirected_v.png");
                out_north_NoC3.repaint();
                in_north_NoC3.setImagem("/images/down.png");
                in_north_NoC3.repaint();
                break;
        }
        
        
        
    }

    public void paintArrow(int arrow) {

        UJPanelImagem panel = null;

        needReset = true;
        
        //Set border red
        //periphNamePanel.setBorder(BorderFactory.createLineBorder(Color.red));
        
        switch (arrow) {
            case MPSoCConfig.EAST_IN_NOC1:
                panel = in_east_NoC1;
                panel.setImagem("/images/red_left.png");
                break;
            case MPSoCConfig.EAST_IN_NOC2:
                panel = in_east_NoC2;
                panel.setImagem("/images/red_left.png");
                break;
            case MPSoCConfig.EAST_IN_NOC3:
                panel = in_east_NoC3;
                panel.setImagem("/images/red_left.png");
                break;
            case MPSoCConfig.EAST_OUT_NOC1:
                panel = out_east_NoC1;
                panel.setImagem("/images/red_undirected_h.png");
                break;
            case MPSoCConfig.EAST_OUT_NOC2:
                panel = out_east_NoC2;
                panel.setImagem("/images/red_undirected_h.png");
                break;
            case MPSoCConfig.EAST_OUT_NOC3:
                panel = out_east_NoC3;
                panel.setImagem("/images/red_undirected_h.png");
                break;
            case MPSoCConfig.NORTH_IN_NOC1:
                panel = in_north_NoC1;
                panel.setImagem("/images/red_down.png");
                break;
            case MPSoCConfig.NORTH_IN_NOC2:
                panel = in_north_NoC2;
                panel.setImagem("/images/red_down.png");
                break;
            case MPSoCConfig.NORTH_IN_NOC3:
                panel = in_north_NoC3;
                panel.setImagem("/images/red_down.png");
                break;
            case MPSoCConfig.NORTH_OUT_NOC1:
                panel = out_north_NoC1;
                panel.setImagem("/images/red_undirected_v.png");
                break;
            case MPSoCConfig.NORTH_OUT_NOC2:
                panel = out_north_NoC2;
                panel.setImagem("/images/red_undirected_v.png");
                break;
            case MPSoCConfig.NORTH_OUT_NOC3:
                panel = out_north_NoC3;
                panel.setImagem("/images/red_undirected_v.png");
                break;
            case MPSoCConfig.WEAST_IN_NOC1:
                panel = in_weast_NoC1;
                panel.setImagem("/images/red_right.png");
                break;
            case MPSoCConfig.WEAST_IN_NOC2:
                panel = in_weast_NoC2;
                panel.setImagem("/images/red_right.png");
                break;
            case MPSoCConfig.WEAST_IN_NOC3:
                panel = in_weast_NoC3;
                panel.setImagem("/images/red_right.png");
                break;
            case MPSoCConfig.WEAST_OUT_NOC1:
                panel = out_weast_NoC1;
                panel.setImagem("/images/red_undirected_h.png");
                break;
            case MPSoCConfig.WEAST_OUT_NOC2:
                panel = out_weast_NoC2;
                panel.setImagem("/images/red_undirected_h.png");
                break;
            case MPSoCConfig.WEAST_OUT_NOC3:
                panel = out_weast_NoC3;
                panel.setImagem("/images/red_undirected_h.png");
                break;
            case MPSoCConfig.SOUTH_IN_NOC1:
                panel = in_south_NoC1;
                panel.setImagem("/images/red_up.png");
                break;
            case MPSoCConfig.SOUTH_IN_NOC2:
                panel = in_south_NoC2;
                panel.setImagem("/images/red_up.png");
                break;
            case MPSoCConfig.SOUTH_IN_NOC3:
                panel = in_south_NoC3;
                panel.setImagem("/images/red_up.png");
                break;
            case MPSoCConfig.SOUTH_OUT_NOC1:
                panel = out_south_NoC1;
                panel.setImagem("/images/red_undirected_v.png");
                break;
            case MPSoCConfig.SOUTH_OUT_NOC2:
                panel = out_south_NoC2;
                panel.setImagem("/images/red_undirected_v.png");
                break;
            case MPSoCConfig.SOUTH_OUT_NOC3:
                panel = out_south_NoC3;
                panel.setImagem("/images/red_undirected_v.png");
                break;
            default:
                needReset = false;
                break;
        }

        panel.repaint();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel east_NoC1_Label;
    private javax.swing.JLabel east_NoC2_Label;
    private javax.swing.JLabel east_NoC3_Label;
    private componentes.UJPanelImagem in_east_NoC1;
    private componentes.UJPanelImagem in_east_NoC2;
    private componentes.UJPanelImagem in_east_NoC3;
    private componentes.UJPanelImagem in_north_NoC1;
    private componentes.UJPanelImagem in_north_NoC2;
    private componentes.UJPanelImagem in_north_NoC3;
    private componentes.UJPanelImagem in_south_NoC1;
    private componentes.UJPanelImagem in_south_NoC2;
    private componentes.UJPanelImagem in_south_NoC3;
    private componentes.UJPanelImagem in_weast_NoC1;
    private componentes.UJPanelImagem in_weast_NoC2;
    private componentes.UJPanelImagem in_weast_NoC3;
    private javax.swing.JLabel noc1_label1;
    private javax.swing.JLabel north_NoC1_Label;
    private javax.swing.JLabel north_NoC2_Label;
    private javax.swing.JLabel north_NoC3_Label;
    private componentes.UJPanelImagem out_east_NoC1;
    private componentes.UJPanelImagem out_east_NoC2;
    private componentes.UJPanelImagem out_east_NoC3;
    private componentes.UJPanelImagem out_north_NoC1;
    private componentes.UJPanelImagem out_north_NoC2;
    private componentes.UJPanelImagem out_north_NoC3;
    private componentes.UJPanelImagem out_south_NoC1;
    private componentes.UJPanelImagem out_south_NoC2;
    private componentes.UJPanelImagem out_south_NoC3;
    private componentes.UJPanelImagem out_weast_NoC1;
    private componentes.UJPanelImagem out_weast_NoC2;
    private componentes.UJPanelImagem out_weast_NoC3;
    private javax.swing.JLabel periphNameLabel;
    private javax.swing.JPanel periphNamePanel;
    private componentes.UJPanelImagem router;
    private javax.swing.JLabel south_NoC1_Label;
    private javax.swing.JLabel south_NoC2_Label;
    private javax.swing.JLabel south_NoC3_Label;
    private javax.swing.JLabel weast_NoC1_Label;
    private javax.swing.JLabel weast_NoC2_Label;
    private javax.swing.JLabel weast_NoC3_Label;
    // End of variables declaration//GEN-END:variables

    public int getAttachedRouterAddress() {
        return attached_router_addr;
    }

    public boolean isNeedReset() {
        return needReset;
    }

    public int getPeripheral_position() {
        return peripheral_position;
    }
}
