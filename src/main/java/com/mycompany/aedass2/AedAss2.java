/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aedass2;

import com.aed.view.MainFrame;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatXcodeDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkContrastIJTheme;

/**
 *
 * @author yashpawar
 */
public class AedAss2 {
    
    public static void main(String[] args) {
        try{
            //UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
            FlatSolarizedDarkContrastIJTheme.setup();
        }catch(Exception e){
            e.printStackTrace();
        }
        new MainFrame().setVisible(true);
    }
}
