/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyMemory.energyMemGUI;

import energyMemory.energyMemGUI.PlotGeneratorPanel.EnergyStatisticType;
import energyMemory.energyMemGUI.PlotGeneratorPanel.MemoryStatisticType;
import energyMemory.energyMemGUI.PlotGeneratorPanel.PlotGeneratorType;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import energyMemory.monitoredData.EnergyInfo;

/**
 *
 * @author ruaro
 */
public class PlotGeneratorMainTab extends JPanel{
    
    private ControlPanel controlPanel;
    private EnergyInfo energyInfo;
    private JPanel showPanel;
    
    public PlotGeneratorMainTab(ControlPanel controlPanel, EnergyInfo energyInfo){
        this.controlPanel = controlPanel;
        this.energyInfo = energyInfo;
        initComponents();
    }
    
    private void initComponents(){
        
        this.setSize(new Dimension(500, 600));

        this.removeAll();
        
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints cons = new GridBagConstraints();
        
        this.setLayout(gbl);
        
        //Set components to become as width the Jframe
        cons.weightx = 200;
        cons.weighty = 60;
        
        //Set components to fill all cell space
        cons.fill = GridBagConstraints.BOTH;
        
        //cons.weighty = 200;
        //cons.ipady = 180; 
        cons.gridx = 0;
        cons.gridy = 0;
        
        this.add(new PlotGeneratorPanel(this, PlotGeneratorType.ENERGY, controlPanel.getXDIM(), controlPanel.getYDIM()), cons);
        
        //cons.ipady = 0; 
        
        cons.gridx = 1;
        cons.gridy = 0;
        cons.weighty = this.getSize().height;
        
        this.add(new PlotGeneratorPanel(this, PlotGeneratorType.MEMORY, controlPanel.getXDIM(), controlPanel.getYDIM()), cons);
        
        
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 2;
        //cons.weighty = 300;//this.getSize().height;
        
                
        showPanel = new JPanel();
        showPanel.setBackground(Color.WHITE);
        showPanel.setPreferredSize(new Dimension(400, this.getHeight()-300));
        this.add(showPanel, cons);
        
        this.revalidate();
        
    }
    
    
    public void generateEnergy(int tileAddr, EnergyStatisticType energyStatistic, boolean normalized, boolean perWindow, boolean newWindow){
        ArrayList<Float> x_series = new ArrayList<>();
        float max_y = 0f;
        
        int window_size = controlPanel.getWindowSize_Kcyles()*1000;
        float sum = 0f;
        float value = 0f;
        
        for (int w = 0; w < (controlPanel.getNum_windows()*window_size); w+=window_size) {
            switch (energyStatistic) {
                case TOTAL_ENERGY:
                    if (tileAddr == -1){
                        value = (float)energyInfo.computeTotalEnergyWindow(w, w+window_size);
                    } else {
                        value = (float)energyInfo.computeTotalTileWindowEnergy(tileAddr, w, w+window_size);
                    }
                    break;
            }
            if (perWindow){
                x_series.add(value);
                if (max_y < value) max_y = value;
            }  else {
                sum += value;
                x_series.add(sum);
                max_y = sum;
            }
        }
        
        //Normalizes
        if (normalized){
            for (int i = 0; i < x_series.size(); i++) {
                value = x_series.get(i);
                value = value / max_y;
                x_series.set(i, value);
            }
        }
        
        //These are the final values
        System.out.println(x_series);
        System.out.println(max_y);
        
    }
    
    public void generateMemory(int tileAddr, MemoryStatisticType memStatistic, boolean normalized, boolean perWindow, boolean newWindow){
        
        ArrayList<Float> x_series = new ArrayList<>();
        float max_y = 0f;
        
        int window_size = controlPanel.getWindowSize_Kcyles()*1000;
        float sum = 0f;
        float value = 0f;
        
        for (int w = 0; w < (controlPanel.getNum_windows()*window_size); w+=window_size) {
            switch (memStatistic) {
                case L1_D_ACCESS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_L1_D_access(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_L1_D_access(tileAddr, w, w+window_size);
                    }
                    break;
                case L1_D_MISS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_L1_D_miss(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_L1_D_miss(tileAddr, w, w+window_size);
                    }
                    break;
                case L1_D_MISS_RATE:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_L1_D_miss_rate(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().computeTileWindow_L1_D_miss_rate(tileAddr, w, w+window_size);
                    }
                    break;
                case L1_I_ACCESS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_L1_I_access(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_L1_I_access(tileAddr, w, w+window_size);
                    }
                    break;
                case L1_I_MISS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_L1_I_miss(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_L1_I_miss(tileAddr, w, w+window_size);
                    }
                    break;
                case L1_I_MISS_RATE:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_LI_I_miss_rate(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().computeTileWindow_L1_I_miss_rate(tileAddr, w, w+window_size);
                    }
                    break;
                    
                case L2_ACCESS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_L2_access(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_L2_access(tileAddr, w, w+window_size);
                    }
                    break;
                case L2_MISS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_L2_miss(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_L2_miss(tileAddr, w, w+window_size);
                    }
                    break;
                case L2_MISS_RATE:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_L2_miss_rate(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().computeTileWindow_L2_miss_rate(tileAddr, w, w+window_size);
                    }
                    break;
                case AMO_ACCESS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_AMO_access(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_AMO_access(tileAddr, w, w+window_size);
                    }
                    break;
                case LOAD_MEM_ACCESS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_LOAD_MEM(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_LOAD_MEM(tileAddr, w, w+window_size);
                    }
                    break;
                case DRAM_ACCESS:
                    if (tileAddr == -1){
                        value = (float)energyInfo.getEnergyMemory().getSystemWindow_DRAM_acess(w, w+window_size);
                    } else {
                        value = (float)energyInfo.getEnergyMemory().getTileWindow_DRAM_access(tileAddr, w, w+window_size);
                    }
                    break;
            }
            
            if (perWindow){
                x_series.add(value);
                if (max_y < value) max_y = value;
            }  else {
                sum += value;
                x_series.add(sum);
                max_y = sum;
            }
        }
        
        //Normalizes
        if (normalized){
            for (int i = 0; i < x_series.size(); i++) {
                value = x_series.get(i);
                value = value / max_y;
                x_series.set(i, value);
            }
        }
        
        //These are the final values
        System.out.println(x_series);
        System.out.println(max_y);
        
    }
    
}
