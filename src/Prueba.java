import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

class Ventana extends JFrame{
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();
	public Ventana() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Actividad 3");
		//setSize(650,475);	
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel label1=new JLabel("The Classic Form includes all visible fields for");
		llenado(GridBagConstraints.HORIZONTAL, 0,0, 1, 3, label1);
		
		JLabel label2=new JLabel("this list");
		llenado(GridBagConstraints.HORIZONTAL, 0, 1, 1, 1, label2);
		
		JLabel label3=new JLabel("incluide the folowing");
		llenado(GridBagConstraints.HORIZONTAL, 0,4, 1, 2, label3);
		
		JCheckBox check1=new JCheckBox("a title you form");
		llenado(GridBagConstraints.HORIZONTAL, 0, 5, 1, 2, check1);
		
		JLabel label4=new JLabel("FORM OPTIONS");
		llenado(GridBagConstraints.HORIZONTAL, 0, 3, 1, 1, label4);
		
		JTextField caja1=new JTextField("Suscribe to our mailing list",20);
		llenado(GridBagConstraints.HORIZONTAL, 0,6,1, 3, caja1);
		
		JLabel epacio=new JLabel("                   ");
		llenado(GridBagConstraints.HORIZONTAL, 0, 7, 1, 2, epacio);
		ButtonGroup bg=new ButtonGroup();
		JRadioButton radio1=new JRadioButton("Only required fields");
		JRadioButton radio2=new JRadioButton("All fields");
		bg.add(radio1);
		bg.add(radio2);
		llenado(GridBagConstraints.HORIZONTAL, 0, 8, 1, 2, radio1);
		llenado(GridBagConstraints.HORIZONTAL, 0, 9, 1, 1, radio2);
		
		JLabel label5=new JLabel("Edit requiered in the form builder");
		llenado(GridBagConstraints.HORIZONTAL, 0, 10, 1, 2, label5);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 11, 1, 2, new JLabel("             "));
		
		JCheckBox check2=new JCheckBox("interest group fields");
		JCheckBox check3=new JCheckBox("required field indicators");
		llenado(GridBagConstraints.HORIZONTAL, 0, 13, 1, 2, check2);
		llenado(GridBagConstraints.HORIZONTAL, 0, 14, 1, 2, check3);
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 15, 1, 2, new JLabel("             "));
		
		JLabel label6=new JLabel("Set form width");
		llenado(GridBagConstraints.HORIZONTAL, 0, 16, 1, 2, label6);
		
		JTextField caja2=new JTextField(20);
		llenado(GridBagConstraints.HORIZONTAL, 0, 17, 1, 2, caja2);
		
		JCheckBox check4=new JCheckBox("enable evil popup mode");
		JCheckBox check5=new JCheckBox("disable all JavaScrip");
		JCheckBox check6=new JCheckBox("incluide archive link");
		JCheckBox check7=new JCheckBox("incluide MonkeyRewards link");
		
		llenado(GridBagConstraints.HORIZONTAL, 0, 19, 1, 2, check4);
		llenado(GridBagConstraints.HORIZONTAL, 0, 20, 1, 2, check5);
		llenado(GridBagConstraints.HORIZONTAL, 0, 21, 1, 2, check6);
		llenado(GridBagConstraints.HORIZONTAL, 0, 22, 1, 3, check7);
		
		//------------------------------------------------------------------
		llenado(GridBagConstraints.HORIZONTAL, 4, 0, 1, 4, new JLabel("                 "));
		JPanel panel1=new JPanel();
		//panelIzq.setBackground(Color.orange);
		panel1.setLayout(new FlowLayout());
		panel1.setBorder(BorderFactory.createTitledBorder("Preview"));
		panel1.setPreferredSize(new Dimension(225,200));
		llenado(GridBagConstraints.WEST,5,1,10,18, panel1);//<----------------------------------
		
		JLabel label7=new JLabel("Email Adress");
		panel1.add(label7).setBounds(0, 0, 10, 15);;
		MaskFormatter formatter=null;
		try {
			formatter=new MaskFormatter("@outlook.com");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JFormattedTextField ftf = new JFormattedTextField(formatter);
		panel1.add(ftf);
		
		JLabel label8=new JLabel("First Name");
		panel1.add(label8);
		
		JTextField caja3=new JTextField(10);
		panel1.add(caja3);
		
		JLabel label9=new JLabel("Last Name");
		panel1.add(label9);
		
		JTextField caja4=new JTextField(10);
		panel1.add(caja4);
		
		JButton boton=new JButton();
		boton.setBounds(10, 100, 90, 30);
		ImageIcon icono=new ImageIcon("boton.png");
		boton.setIcon(new ImageIcon(icono.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
		panel1.add(boton);
		
		JTextArea escribir=new JTextArea("Escribe aqui...",10,25);
		JScrollPane scroll=new JScrollPane(escribir);
		llenado(GridBagConstraints.HORIZONTAL,4,11,30,30, scroll);
		pack();
	}
	public void llenado(int rellenado,int x, int y,int altura,int largo,Component componente) {
		gbc.gridx= x;
		gbc.gridy=y;
		gbc.gridheight=altura;
		gbc.gridwidth=largo;
		gbc.fill=rellenado;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
	
}
public class Prueba {

	public static void main(String[] args) {

			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Ventana();
					
				}
			});

	}

}
