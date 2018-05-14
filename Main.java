package gameoriginal;


import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
              
            Player w = new Player();
                    
                if(w.getStatePlayer() == 1){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.getContentPane().setLayout(new BorderLayout());
		
		SpaceShip v = new SpaceShip(200, 550, 20, 20);
                SpaceShip2 v1 = new SpaceShip2(160, 550, 20, 20);
                
		GamePanel gp = new GamePanel();
                
		GameEngine engine = new GameEngine(gp, v);
                GameEngine2 engine1 = new GameEngine2(gp, v1);
		frame.addKeyListener(engine);
                frame.addKeyListener(engine1);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
                }
		//engine.start();
	}
}
