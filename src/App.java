/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;

/**
 *
 * @author bala
 */
public class App {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        gameplay gameplay = new gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("bala'sBrickBreaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
    
}