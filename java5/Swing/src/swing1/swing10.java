package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class swing10 extends JFrame {

	private JPanel contentPane;
	public String list[] = {"통신사선택","SKT","KT","LGT","알뜰폰"};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	JLabel msg =null;
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JComboBox cb = new JComboBox(list);
		cb.setFont(new Font("돋움체", Font.PLAIN, 12));
		cb.setBounds(40, 35, 127, 23);
		contentPane.add(cb);
		
		this.msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(42, 80, 328, 23);
		contentPane.add(msg);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(cb.getSelectedIndex());
				//String data = String.valueOf(cb.getSelectedItem());
				//String data = cb.getSelectedItem().toString();
				//String data = String.valueOf(e.getItem());
				String data = e.getItem().toString();
				msg.setText(data);
			}
		});
			
		
	}
}
