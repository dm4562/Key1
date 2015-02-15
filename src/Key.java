import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
			
		class SingleKey extends JButton {
			
			String keyName = null;
					
			public SingleKey(String key) {
				super(key);
			}

			void setKeyName(String letter) {
				keyName = letter;
			}
		}
		
	
		String keyBoard[][]= {
				{"Q","W","E","R","T","Y","U","I","O","P"},
				{"A","S","D","F","G","H","J","K","L"},
				{"Z","X","C","V","B","N","M"}
				};
		

		
		int x[] = {0,1,2};
		ArrayList<ArrayList<SingleKey>> keyLayout = new ArrayList<ArrayList<SingleKey>>();
		
		for (int rowNum:x) {
			int count = 0;
			ArrayList<SingleKey> k1 = new ArrayList<SingleKey>();
			for (String key:keyBoard[rowNum]) {
				k1.add(count, new SingleKey(key));
				k1.get(count).setKeyName(key);
				constraints0.gridx = count;
				constraints0.gridy = rowNum;
				panel0.add(k1.get(count),constraints0);
				count++;
			}
			keyLayout.add(k1);
		}
			
				
		/*for (int rowNum: x){
			int counter0 = 0;
			for(String key: keyBoard[rowNum]){
				JButton name = new JButton(key);
				constraints0.gridx = counter0;
				constraints0.gridy = rowNum;
				panel0.add(name,constraints0);
				counter0++;								
			}	*/
		}
	}

