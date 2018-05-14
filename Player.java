/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoriginal;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Player extends JFrame{
    private int statePlay = 0;
    private String a;
    public Player(){
        super("Space War"); 
        while(statePlay == 0){
       
            setSize(400,600);
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setLayout(new BorderLayout());
        
            GridLayout g = new GridLayout(15,1);
            
         
            JPanel x = new JPanel();
            x.setLayout(g);
         
            JButton play = new JButton("Start");
            play.addActionListener(new ActionListener(){
            
                public void actionPerformed(ActionEvent ae) {
                    statePlay =1;
                }
            });
            
            x.add(play);
          
            getContentPane().add(x, BorderLayout.PAGE_END);
                
            setVisible(true);
        }
        
    }
    public int getStatePlayer(){
        return statePlay;
    }
        
}
