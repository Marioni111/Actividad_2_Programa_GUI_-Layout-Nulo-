import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
	
	public Main(){
	
		getContentPane().setLayout(null);
		setSize(800, 540);
		setLocationRelativeTo(null);
		setBackground(Color.white);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Font negrita = new Font("Arial", Font.BOLD, 12);
		
		JLabel label1 = new JLabel("The");
		label1.setBounds(10, 5, 272, 25);
		add(label1);
		JLabel label2 = new JLabel("Classic Form");
		label2.setFont(negrita);
		label2.setBounds(34, 5, 272, 25);
		add(label2);
		JLabel label3 = new JLabel("includes all visible fields for");
		label3.setBounds(110, 5, 272, 25);
		add(label3);	
		JLabel label4 = new JLabel("this list");
		label4.setBounds(10, 20, 272, 25);
		add(label4);
		
		JLabel label5 = new JLabel("Form options");
		label5.setBounds(10, 50, 272, 25);
		add(label5);
		JLabel label6 = new JLabel("Include the following:");
		label6.setBounds(10, 70, 272, 25);
		add(label6);
		JCheckBox checkBox1 = new JCheckBox("a title for you form");
		checkBox1.setBounds(10, 90, 272, 25);
		add(checkBox1);
		JTextField textField1 = new JTextField("Subscribe to our mailing list", 10);
		textField1.setBounds(10, 115, 272, 25);
		add(textField1);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioButton1 = new JRadioButton("only required fields");
		bg.add(radioButton1);
		radioButton1.setBounds(10, 170, 272, 25);
		add(radioButton1);
		JRadioButton radioButton2 = new JRadioButton("all fields");
		bg.add(radioButton2);
		radioButton2.setBounds(10, 190, 272, 25);
		add(radioButton2);
		JLabel label7 = new JLabel("(edit required fields in");
		label7.setBounds(25, 210, 272, 25);
		add(label7);
		Color c2 = new Color(64, 224, 208);
		JLabel editRequired2 = new JLabel("the form builder");
		editRequired2.setForeground(c2);
		editRequired2.setBounds(132, 210, 272, 25);
		add(editRequired2);
		JLabel editRequired3 = new JLabel();
		editRequired3.setText(")");
		editRequired3.setBounds(208, 210, 272, 25);
		add(editRequired3);
		
		JCheckBox checkBox2 = new JCheckBox("interest group fields");
		checkBox2.setBounds(10, 260, 272, 25);
		add(checkBox2);
		JCheckBox checkBox3 = new JCheckBox("required field indicators");
		checkBox3.setBounds(10, 280, 272, 25);
		add(checkBox3);
		
		JLabel label8 = new JLabel("Set form width");
		label8.setBounds(10, 320, 282, 25);
		add(label8);
		JTextField textFile1 = new JTextField("", 10);
		textFile1 .setBounds(10, 345, 272, 25);
		add(textFile1 );
		
		JLabel label9 = new JLabel("Enhance your form");
		label9.setBounds(10, 385, 272, 25);
		add(label9);
		JCheckBox checkBox4 = new JCheckBox("enable");
		checkBox4.setBounds(10, 405, 60, 25);
		add(checkBox4);
		JLabel label10 = new JLabel("evil");
		label10.setFont(negrita);
		label10.setBounds(73, 405, 100, 25);
		add(label10);
		JLabel label11 = new JLabel("popup mode");
		label11.setBounds(95, 405, 272, 25);
		add(label11);
		JCheckBox checkBox5 = new JCheckBox("disable all");
		checkBox5.setBounds(10, 425, 80, 25);
		add(checkBox5);
		JLabel label12 = new JLabel("JavaScript");
		label12.setFont(negrita);
		label12.setBounds(90, 425, 272, 25);
		add(label12);
		JCheckBox checkBox6 = new JCheckBox("include archive link");
		checkBox6.setBounds(10, 445, 272, 25);
		add(checkBox6);
		JCheckBox checkBox7 = new JCheckBox("include");
		checkBox7.setBounds(10, 465, 60, 25);
		add(checkBox7);
		JLabel label13 = new JLabel("MonkeyRewards link");
		label13.setForeground(c2);
		label13.setBounds(70, 465, 272, 25);
		add(label13);
		JLabel label14 = new JLabel("Preview");
		label14.setFont(new Font("Arial", Font.BOLD, 14));
		label14.setBounds(350, 5, 272, 25);
		add(label14);
		
		Color c1 = new Color(255, 255, 255);//inicio del panel
		JPanel panel1 = new JPanel();
			panel1.setLayout(null);
			panel1.setBackground(c1);
			panel1.setSize(400, 225);
			panel1.setLocation(350, 30); 
			
			JLabel asterisco = new JLabel("*");
			asterisco.setFont(new Font("Arial", Font.BOLD, 14));
			asterisco.setForeground(Color.ORANGE);
			asterisco.setBounds(323, 3, 200, 20);
			panel1.add(asterisco);
			JLabel indicatesRequired = new JLabel("indicates required");
			indicatesRequired.setFont(new Font("Arial", Font.BOLD, 8));
			indicatesRequired.setBounds(328, 5, 200, 20);
			panel1.add(indicatesRequired);
			
			JLabel emailAddress = new JLabel("Email Address");
			emailAddress.setBounds(5, 10, 200, 20);
			panel1.add(emailAddress);
			JFormattedTextField cajaEmailAddress = new JFormattedTextField();
			cajaEmailAddress.setBounds(5, 30, 390, 20);
			panel1.add(cajaEmailAddress);
			
			JLabel firstName = new JLabel("First Name");
			firstName.setBounds(5, 60, 200, 20);
			panel1.add(firstName);
			JTextField cajaTextoVacia3 = new JTextField(35);
			cajaTextoVacia3.setBounds(5, 80, 390, 20);
			panel1.add(cajaTextoVacia3);
			
			JLabel lastName = new JLabel("Last Name");
			lastName.setBounds(5, 115, 390, 20);
			panel1.add(lastName);
			JTextField cajaTextoVacia4 = new JTextField(35);
			cajaTextoVacia4.setBounds(5, 135, 390, 20);
			panel1.add(cajaTextoVacia4);
			
			JButton btnSubscribe = new JButton("Subscribe", new ImageIcon("imagenes/índice.jpg"));
			btnSubscribe.setEnabled(true);
			btnSubscribe.setBounds(5, 175, 100, 20);
			panel1.add(btnSubscribe);
			
		add(panel1);//final del panel
		
		JLabel copyPaste = new JLabel("Copy/paste onto your site");
		copyPaste.setBounds(350, 270, 272, 25);
		add(copyPaste);
		
		JTextArea areaTexto = new JTextArea(10, 20);
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(areaTexto);
		add(scroll);
		scroll.setBounds(350, 300, 400, 150);
		
	}//Método crear componentes

	public static void main(String[] args){
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new Main();
			}
		});
	}
}