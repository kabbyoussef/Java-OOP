package Youssef.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.Registry;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import Youssef.ASTEROID.AsteroidCarbon;
import Youssef.ASTEROID.AsteroidMetal;
import Youssef.ASTEROID.AsteroidSilicon;
import Youssef.ENUMS.Atype;
import Youssef.FACTORY.AsteroidAssembler;

public class YoussefGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YoussefGUI() throws HeadlessException, ClassNotFoundException, SQLException {
		setTitle("Final Exam Fall 2022");
		setSize(920,450);
		setVisible(true);
		setLayout(null);
		
		JButton btn =new JButton("Show Asteroids");
		btn.setBounds(350,5,200,60);
		btn.setFont(new Font(getName(), getFont().BOLD, 14) );
		JTextPane lbl = new JTextPane();
		lbl.setFont(new Font(getName(), getFont().BOLD, 13));
		StyledDocument doc = lbl.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		ArrayList< Color> cl=new ArrayList<Color>();
		cl.add(getBackground().LIGHT_GRAY);
		cl.add(getBackground().green);
		cl.add(getBackground().yellow);
		cl.add(getBackground().orange);
		cl.add(getBackground().gray);
		
	
		lbl.setBounds(2, 80, 900, 300);
	
	
	 	btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
			lbl.setBackground( cl.get(r.nextInt(0, 5)));
				int ind;
				try {
				
					ind = r.nextInt(0,AsteroidAssembler.buildRegistrys().size());
					String rg =  AsteroidAssembler.buildRegistrys().get(ind).getDesignation();
					String ty=AsteroidAssembler.buildRegistrys().get(ind).getAtype().toString();
					if (ty.equals("Carboneous")) {
					
						AsteroidCarbon as = new AsteroidCarbon(rg);
						lbl.setText(as.toString());
					}
					if (ty.equals("Metallic")) {
					
						AsteroidMetal as = new AsteroidMetal(rg);
						lbl.setText(as.toString());
					}
					if (ty.equals("Silicaceous")) {
						System.out.println();
						AsteroidSilicon as = new AsteroidSilicon(rg);
						lbl.setText(as.toString());
					}
				
					
						
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
				
				
			}
		});
		add(btn);
	
		add(lbl);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
