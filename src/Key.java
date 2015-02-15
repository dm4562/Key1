import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key {

	public static void main(String args[]){
	
		JFrame frame = new JFrame("Keyboard?");
		frame.setSize(800,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel0 = new JPanel(new GridBagLayout());
		JPanel panel1 = new JPanel(new GridBagLayout());
		JPanel panel2 = new JPanel(new GridBagLayout());
		frame.add(panel0);
		frame.add(panel1);
		frame.add(panel2);
		GridBagConstraints constraints0  = new GridBagConstraints();
		GridBagConstraints constraints1  = new GridBagConstraints();
		GridBagConstraints constraints2  = new GridBagConstraints();
		frame.getContentPane().add(panel0, BorderLayout.NORTH);
		frame.getContentPane().add(panel1, BorderLayout.CENTER);
		frame.getContentPane().add(panel2, BorderLayout.SOUTH);
		
			
		/*class SingleKey {
			String letter = null;
			SingleKey(){
				
			}
			
			void setLetter(String letter) {
				this.letter = letter;
			}
		}*/
		
	
		String keyBoard[][]= {
				{"Q","W","E","R","T","Y","U","I","O","P"},
				{"A","S","D","F","G","H","J","K","L"},
				{"Z","X","C","V","B","N","M"}
				};
		
		int x[] = {0,1,2};
				
		for (int rowNum: x){
			int counter0 = 0;
			for(String key: keyBoard[rowNum]){
				JButton name = new JButton(key);
				constraints0.gridx = counter0;
				constraints0.gridy = rowNum;
				panel0.add(name,constraints0);
				counter0++;								
			}	
		}
	}
}
