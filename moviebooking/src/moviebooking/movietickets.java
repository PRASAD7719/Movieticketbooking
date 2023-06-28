package moviebooking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movietickets {

	private JFrame frame;
	private JTextField txttickets;
	private JTextField txttotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movietickets window = new movietickets();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public movietickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 918, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie Tickets");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(336, 21, 373, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(20, 85, 411, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tickets");
		lblNewLabel_1.setBounds(22, 56, 110, 43);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblNewLabel_1);
		
		txttickets = new JTextField();
		txttickets.setText("txt");
		txttickets.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txttickets.setBounds(142, 60, 164, 30);
		panel.add(txttickets);
		txttickets.setColumns(10);
		
		JTextArea txtcount = new JTextArea();
		txtcount.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtcount.setForeground(new Color(0, 0, 255));
		txtcount.setBounds(20, 291, 411, 205);
		frame.getContentPane().add(txtcount);
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(648, 350, 109, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		txttotal = new JTextField();
		txttotal.setForeground(new Color(0, 0, 0));
		txttotal.setFont(new Font("Tahoma", Font.BOLD, 35));
		txttotal.setBounds(536, 397, 297, 87);
		frame.getContentPane().add(txttotal);
		txttotal.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number = Integer.parseInt(txttickets.getText());
				
				for(int x=1; x<=number; x++ )
				{
					
					
				    txtcount.setText(txtcount.getText()  + "Your Ticket No :" + x + "\n");
					
				}
				
				
				int tot = number * 20;
				
				txttotal.setText(String.valueOf(tot));
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(311, 245, 109, 36);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel(" ");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/movie.jpg"));
		lblNewLabel_3.setIcon(img);
		lblNewLabel_3.setBounds(441, 63, 453, 282);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
