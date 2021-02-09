import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
		llenado(GridBagConstraints.HORIZONTAL, 0, 14, 1, 3, check3);
		
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
		//llenado(GridBagConstraints.CENTER, 4,0,1,4, check7);
		JLabel label=new JLabel("Preview");
		llenado(GridBagConstraints.HORIZONTAL, 8, 0, 1, 1, label);
		
		JLabel label7=new JLabel("Email Adress");
		llenado(GridBagConstraints.HORIZONTAL, 6, 2, 1, 4, label7);
		
		MaskFormatter formatter=null;
		try {
			formatter=new MaskFormatter("@outlook.com");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		JFormattedTextField ftf = new JFormattedTextField(formatter);
		llenado(GridBagConstraints.HORIZONTAL, 6, 3, 1, 5, ftf);
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
