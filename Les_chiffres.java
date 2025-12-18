import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Les_chiffres extends JFrame {
	
	// declaration des variables :

	private JPanel contentPane;
	private JTextField chiffre;
	public  JTextField r;
	public static JTextField s; // score static pour calculer le score final  
	private JTextField textField_3;
	public static JTextField s2;  // score static pour calculer le score final  
	private JTextField n1;
	private JTextField b1;
	private JTextField n2;
	private JTextField b2;
	private JTextField n3;
	private JTextField b3;
	private JTextField n4;
	private JTextField n5;
	private JTextField b4;
	private JTextField n6;
	private JTextField b5;
	private JTextField n7;
	private JTextField n8;
	private JTextField b6;
	

	/**
	 * Launch the application. (Pour tester chaque classe a part)
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Les_chiffres frame = new Les_chiffres();
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
	
	public Les_chiffres() {
		
		setResizable(false); // n'est pas resizable 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fermeture par defaut 
		setBounds(100, 100, 685, 590); 
		
		
		contentPane = new JPanel(); // declaration du panel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		setContentPane(contentPane); 
		contentPane.setLayout(null);
		
		// declaration de l'icone
	    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bayou\\OneDrive\\Bureau\\2IDSD\\Cours java avancée\\projet\\icone.png");  
		setIconImage(icon);
		
		// declaration du titre
		setTitle("LES CHIFFRES");
		
		// choisir le couleur de background
		
		getContentPane().setBackground(new Color(200, 200, 255));
		
		
		
		// Pour passer au round 2
		
		JButton btnNewButton = new JButton("ROUND 2");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setEnabled(false);

		
		// declaration des boutons de P1 et P2 
		JButton btnNewButton_1_2 = new JButton("P1");
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2.setBackground(new Color(255, 192, 203));
		btnNewButton_1_2.setBounds(10, 282, 99, 58);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("P2");
		btnNewButton_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2_1.setBackground(new Color(255, 192, 203));
		btnNewButton_1_2_1.setBounds(348, 282, 99, 58);
		contentPane.add(btnNewButton_1_2_1);
		
		// declaration du bouton submit
		
		JButton btnNewButton_1_1_1 = new JButton("Submit");
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1_1_1.setBounds(557, 282, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
		
		
		// mettre de valeurs randomisées dans chaque boutons des chiffres ( 6 boutons) 
		JButton bn1 = new JButton(Integer.toString(new Lettres().RandomCH(1,25)));
		bn1.setBackground(Color.WHITE);
		bn1.setBounds(398, 181, 54, 37);
		contentPane.add(bn1);
		
		JButton bn3 = new JButton(Integer.toString(new Lettres().RandomCH(1,25)));
		bn3.setBackground(Color.WHITE);
		bn3.setBounds(148, 181, 54, 37);
		contentPane.add(bn3);
		
		JButton bn5 = new JButton(Integer.toString(new Lettres().RandomCH(1,25)));
		bn5.setBackground(Color.WHITE);
		bn5.setBounds(207, 181, 54, 37);
		contentPane.add(bn5);
		
		JButton bn2 = new JButton(Integer.toString(new Lettres().RandomCH(1,25)));
		bn2.setBackground(Color.WHITE);
		bn2.setBounds(270, 181, 54, 37);
		contentPane.add(bn2);
		
		JButton bn4 = new JButton(Integer.toString(new Lettres().RandomCH(1,25)));
		bn4.setBackground(Color.WHITE);
		bn4.setBounds(334, 181, 54, 37);
		contentPane.add(bn4);
		
		JButton bn6 = new JButton(Integer.toString(new Lettres().RandomCH(1,25)));
		bn6.setBackground(Color.WHITE);
		bn6.setBounds(463, 181, 54, 37);
		contentPane.add(bn6);
		
		
		 // declaration des textes fields (n pour mettre les chiffres et b pour + , -, * ,/ )
		n1 = new JTextField();
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setEditable(false);
		n1.setBackground(Color.WHITE);
		n1.setBounds(10, 378, 40, 35);
		contentPane.add(n1);
		n1.setColumns(10);
		
		b1 = new JTextField();
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setEditable(false);
		b1.setBackground(new Color(255, 250, 240));
		b1.setColumns(10);
		b1.setBounds(53, 378, 40, 35);
		contentPane.add(b1);
		
		n2 = new JTextField();
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setEditable(false);
		n2.setBackground(Color.WHITE);
		n2.setColumns(10);
		n2.setBounds(96, 378, 40, 35);
		contentPane.add(n2);
		
		b2 = new JTextField();
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		b2.setEditable(false);
		b2.setColumns(10);
		b2.setBackground(new Color(255, 250, 240));
		b2.setBounds(139, 378, 40, 35);
		contentPane.add(b2);
		
		n3 = new JTextField();
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setEditable(false);
		n3.setBackground(Color.WHITE);
		n3.setColumns(10);
		n3.setBounds(182, 378, 40, 35);
		contentPane.add(n3);
		
		b3 = new JTextField();
		b3.setHorizontalAlignment(SwingConstants.CENTER);
		b3.setEditable(false);
		b3.setColumns(10);
		b3.setBackground(new Color(255, 250, 240));
		b3.setBounds(225, 378, 40, 35);
		contentPane.add(b3);
		
		n4 = new JTextField();
		n4.setHorizontalAlignment(SwingConstants.CENTER);
		n4.setEditable(false);
		n4.setBackground(Color.WHITE);
		n4.setColumns(10);
		n4.setBounds(268, 378, 40, 35);
		contentPane.add(n4);
		
		n5 = new JTextField();
		n5.setHorizontalAlignment(SwingConstants.CENTER);
		n5.setEditable(false);
		n5.setBackground(Color.WHITE);
		n5.setColumns(10);
		n5.setBounds(348, 378, 40, 35);
		contentPane.add(n5);
		
		b4 = new JTextField();
		b4.setHorizontalAlignment(SwingConstants.CENTER);
		b4.setEditable(false);
		b4.setColumns(10);
		b4.setBackground(new Color(255, 250, 240));
		b4.setBounds(391, 378, 40, 35);
		contentPane.add(b4);
		
		n6 = new JTextField();
		n6.setHorizontalAlignment(SwingConstants.CENTER);
		n6.setEditable(false);
		n6.setBackground(Color.WHITE);
		n6.setColumns(10);
		n6.setBounds(434, 378, 40, 35);
		contentPane.add(n6);
		
		b5 = new JTextField();
		b5.setHorizontalAlignment(SwingConstants.CENTER);
		b5.setEditable(false);
		b5.setColumns(10);
		b5.setBackground(new Color(255, 245, 238));
		b5.setBounds(477, 378, 40, 35);
		contentPane.add(b5);
		
		n7 = new JTextField();
		n7.setHorizontalAlignment(SwingConstants.CENTER);
		n7.setEditable(false);
		n7.setBackground(Color.WHITE);
		n7.setColumns(10);
		n7.setBounds(520, 378, 40, 35);
		contentPane.add(n7);
		
		b6 = new JTextField();
		b6.setHorizontalAlignment(SwingConstants.CENTER);
		b6.setEditable(false);
		b6.setColumns(10);
		b6.setBackground(new Color(255, 245, 238));
		b6.setBounds(563, 378, 40, 35);
		contentPane.add(b6);
		
		
		n8 = new JTextField();
		n8.setHorizontalAlignment(SwingConstants.CENTER);
		n8.setEditable(false);
		n8.setBackground(Color.WHITE);
		n8.setColumns(10);
		n8.setBounds(606, 378, 40, 35);
		contentPane.add(n8);
		
		
		
		//sauvgarder les nombres aléatoires
		
		String a=bn1.getText();
		String b = bn2.getText();
		String c=bn3.getText();
		String d=bn4.getText();
		String e1 = bn5.getText();
		String f =bn6.getText();
		
		
		
		//Button RESET du P2 
		JButton btnNewButton_1_3 = new JButton("Reset");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				bn1.setText(a);
				bn2.setText(b);
				bn3.setText(c);
				bn4.setText(d);
				bn5.setText(e1);
				bn6.setText(f);
				
				n5.setText("");
				n6.setText("");
				n7.setText("");
				n8.setText("");
				
				b4.setText("");
				b5.setText("");
				b6.setText("");
				
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setBackground(new Color(0, 0, 128));
		btnNewButton_1_3.setBounds(557, 328, 89, 23);
		contentPane.add(btnNewButton_1_3);
		
		
		
		
		
		// Passer au 2eme tour
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//pour ouvrir la fenetre de lettres de round 2:
				Les_lettres2 L;
				L = new Les_lettres2();
				L.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(249, 514, 168, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("LES CHIFFRES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 43));
		lblNewLabel.setBounds(158, 24, 344, 118);
		contentPane.add(lblNewLabel);
		
		
		
		chiffre = new JTextField();
		chiffre.setHorizontalAlignment(SwingConstants.CENTER);
		chiffre.setBackground(new Color(255, 255, 255));
		chiffre.setEditable(false);
		chiffre.setBounds(10, 177, 64, 44);
		chiffre.setText(Integer.toString(new Lettres().RandomCH(10,250)));
		contentPane.add(chiffre);
		chiffre.setColumns(10);
		
		
		// declaration des boutons +,-,*,/
		JButton plus = new JButton("+");
		plus.setForeground(new Color(255, 255, 255));
		plus.setBackground(new Color(0, 0, 128));
		plus.setFont(new Font("Tahoma", Font.BOLD, 15));
		plus.setBounds(597, 160, 49, 32);
		contentPane.add(plus);
		
		JButton fois = new JButton("*");
		fois.setForeground(new Color(255, 255, 255));
		fois.setBackground(new Color(0, 0, 128));
		fois.setFont(new Font("Tahoma", Font.BOLD, 15));
		fois.setBounds(538, 203, 49, 32);
		contentPane.add(fois);
		
		JButton moins = new JButton("-");
		moins.setForeground(new Color(255, 255, 255));
		moins.setBackground(new Color(0, 0, 128));
		moins.setFont(new Font("Tahoma", Font.BOLD, 15));
		moins.setBounds(538, 160, 49, 32);
		contentPane.add(moins);
		
		JButton div = new JButton("/");
		div.setForeground(new Color(255, 255, 255));
		div.setBackground(new Color(0, 0, 128));
		div.setFont(new Font("Tahoma", Font.BOLD, 15));
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		div.setBounds(597, 203, 49, 32);
		contentPane.add(div);
		
		
		// au debut tous les boutons sont enables(false sauf le bouton P1 )
		bn1.setEnabled(false);
		bn2.setEnabled(false);
		bn3.setEnabled(false);
		bn4.setEnabled(false);
		bn5.setEnabled(false);
		bn6.setEnabled(false);
		
		plus.setEnabled(false);
		moins.setEnabled(false);
		fois.setEnabled(false);
		div.setEnabled(false);
		
		
		
		//Button RESET du P1
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setEnabled(false);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bn1.setText(a);
				bn2.setText(b);
				bn3.setText(c);
				bn4.setText(d);
				bn5.setText(e1);
				bn6.setText(f);
				
				
				n1.setText("");
				n2.setText("");
				n3.setText("");
				n4.setText("");
				
				b1.setText("");
				b2.setText("");
				b3.setText("");
			}
		});
		btnNewButton_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1.setBounds(213, 328, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		//Button SUBMIT du P1
		JButton btnNewButton_1_1 = new JButton("Submit");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setEnabled(false);
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				bn1.setText(a);
				bn2.setText(b);
				bn3.setText(c);
				bn4.setText(d);
				bn5.setText(e1);
				bn6.setText(f);
				
				int res=0;
				if((!n1.getText().equals("")) && (!n2.getText().equals("")) && (!b1.getText().contentEquals(""))) {	
					if (b1.getText().equals("+") ){ res =res+ Integer.parseInt(n1.getText())+ Integer.parseInt(n2.getText()) ; }
					if (b1.getText().equals("-") ){ res =res+ Integer.parseInt(n1.getText())- Integer.parseInt(n2.getText()) ; }
					if (b1.getText().equals("*") ){ res =res+ Integer.parseInt(n1.getText())*Integer.parseInt(n2.getText()) ; }
					if (b1.getText().equals("/") ){ res =res+ Integer.parseInt(n1.getText())/ Integer.parseInt(n2.getText()) ; }
				} 
				
				if((!n3.getText().contentEquals("")) && (!b2.getText().equals(""))) {
					if (b2.getText().equals("+") ){ res += Integer.parseInt(n3.getText()) ; }
					if (b2.getText().equals("-") ){ res -=  Integer.parseInt(n3.getText()) ; }
					if (b2.getText().equals("*") ){ res *= Integer.parseInt(n3.getText()); }
					if (b2.getText().equals("/") ){ res /= Integer.parseInt(n3.getText()) ; }
				} 
				
				if((!n4.getText().contentEquals("")) && (!b3.getText().equals(""))) {
					if (b3.getText().equals("+") ){ res += Integer.parseInt(n4.getText()) ; }
					if (b3.getText().equals("-") ){ res -=  Integer.parseInt(n4.getText()) ; }
					if (b3.getText().equals("*") ){ res *= Integer.parseInt(n4.getText()); }
					if (b3.getText().equals("/") ){ res /= Integer.parseInt(n4.getText()) ; }
				} 

				r.setText(res+"");
				
				bn1.setEnabled(false);
				bn2.setEnabled(false);
				bn3.setEnabled(false);
				bn4.setEnabled(false);
				bn5.setEnabled(false);
				bn6.setEnabled(false);
				
				plus.setEnabled(false);
				moins.setEnabled(false);
				fois.setEnabled(false);
				div.setEnabled(false);

				
			}
		});
		btnNewButton_1_1.setBackground(new Color(0, 0, 128));
		btnNewButton_1_1.setBounds(213, 282, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		
		// resultat P1 
		JLabel lblResultatP = new JLabel("RESULTAT P1:");
		lblResultatP.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResultatP.setBounds(34, 424, 118, 17);
		contentPane.add(lblResultatP);
		
		
		//score P1
		JLabel lblScoreP_1 = new JLabel("SCORE P1:");
		lblScoreP_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScoreP_1.setBounds(34, 472, 89, 17);
		contentPane.add(lblScoreP_1);
		
		
		// resultat P2
		JLabel lblResultatP_1 = new JLabel("RESULTAT P2 :");
		lblResultatP_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResultatP_1.setBounds(383, 424, 119, 17);
		contentPane.add(lblResultatP_1);
		
		
		// Score P2
		JLabel lblScoreP = new JLabel("SCORE P2:");
		lblScoreP.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScoreP.setBounds(383, 475, 89, 17);
		contentPane.add(lblScoreP);
		
		
		 // JtextField de Resultat P1
		r = new JTextField();
		r.setText("0");
		r.setHorizontalAlignment(SwingConstants.CENTER);
		r.setEditable(false);
		r.setColumns(10);
		r.setBackground(Color.WHITE); 
		r.setBounds(192, 424, 86, 20);
		contentPane.add(r);
		
		
		 // JtextField de score P1
		s = new JTextField();
		s.setHorizontalAlignment(SwingConstants.CENTER);
		s.setText("0");
		s.setEditable(false);
		s.setColumns(10);
		s.setBackground(Color.WHITE);  
		s.setBounds(192, 472, 86, 20);
		contentPane.add(s);
		
		
		 // JtextField de Resultat P2
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);  
		textField_3.setBounds(555, 424, 86, 20);
		contentPane.add(textField_3);
	
		
		 // JtextField de score P2
		s2 = new JTextField();
		s2.setHorizontalAlignment(SwingConstants.CENTER);
		s2.setText("0");
		s2.setEditable(false);
		s2.setColumns(10);
		s2.setBackground(Color.WHITE);  
		s2.setBounds(555, 472, 86, 20);
		contentPane.add(s2);
		
		
		btnNewButton_1_2_1.setEnabled(false);
		btnNewButton_1_1_1.setEnabled(false);
		btnNewButton_1_3.setEnabled(false);
		
		JLabel lblNewLabel_2 = new JLabel("ROUND 1");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 45, 108, 58);
		contentPane.add(lblNewLabel_2);		
		
		
		
		// Button de P1 pour commencer le game
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_1_2_1.setEnabled(false);
				btnNewButton_1_1_1.setEnabled(false);//submit de P2
				btnNewButton_1_3.setEnabled(false);
				
				btnNewButton_1_1.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				
				bn1.setEnabled(true);
				bn2.setEnabled(true);
				bn3.setEnabled(true);
				bn4.setEnabled(true);
				bn5.setEnabled(true);
				bn6.setEnabled(true);
				
				plus.setEnabled(true);
				moins.setEnabled(true);
				fois.setEnabled(true);
				div.setEnabled(true);
				
				bn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if (n1.getText().equals("")) { n1.setText(bn1.getText()); bn1.setText(null);}
						else if (n2.getText().equals("")) { n2.setText(bn1.getText()); bn1.setText(null);}
						else if (n3.getText().equals("")) { n3.setText(bn1.getText()); bn1.setText(null);}
						else if (n4.getText().equals("")) { n4.setText(bn1.getText()); bn1.setText(null);}
						
					}
				});
				
				
				bn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n1.getText().equals("")) { n1.setText(bn3.getText()); bn3.setText(null);}
						else if (n2.getText().equals("")) { n2.setText(bn3.getText()); bn3.setText(null);}
						else if (n3.getText().equals("")) { n3.setText(bn3.getText()); bn3.setText(null);}
						else if (n4.getText().equals("")) { n4.setText(bn3.getText()); bn3.setText(null);}
						
					}
				});
				
				bn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n1.getText().equals("")) { n1.setText(bn5.getText()); bn5.setText(null);}
						else if (n2.getText().equals("")) { n2.setText(bn5.getText()); bn5.setText(null);}
						else if (n3.getText().equals("")) { n3.setText(bn5.getText()); bn5.setText(null);}
						else if (n4.getText().equals("")) { n4.setText(bn5.getText()); bn5.setText(null);}
						
						}
					
				});
				
				bn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n1.getText().equals("")) { n1.setText(bn2.getText()); bn2.setText(null);}
						else if (n2.getText().equals("")) { n2.setText(bn2.getText()); bn2.setText(null);}
						else if (n3.getText().equals("")) { n3.setText(bn2.getText()); bn2.setText(null);}
						else if (n4.getText().equals("")) { n4.setText(bn2.getText()); bn2.setText(null);}
						
					}
				});
				
				bn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n1.getText().equals("")) { n1.setText(bn4.getText()); bn4.setText(null);}
						else if (n2.getText().equals("")) { n2.setText(bn4.getText()); bn4.setText(null);}
						else if (n3.getText().equals("")) { n3.setText(bn4.getText()); bn4.setText(null);}
						else if (n4.getText().equals("")) { n4.setText(bn4.getText()); bn4.setText(null);}
						
						
						
					}
				});
				
				bn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n1.getText().equals("")) { n1.setText(bn6.getText()); bn6.setText(null);}
						else if (n2.getText().equals("")) { n2.setText(bn6.getText()); bn6.setText(null);}
						else if (n3.getText().equals("")) { n3.setText(bn6.getText()); bn6.setText(null);}
						else if (n4.getText().equals("")) { n4.setText(bn6.getText()); bn6.setText(null);}
						
					}
				});
				
				plus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (b1.getText().equals("")) { b1.setText(plus.getText()); 
						btnNewButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								plus.setText(b1.getText());
								b1.setText(null);}
						});}
						else if (b2.getText().equals("")) { b2.setText(plus.getText()); }
						else if (b3.getText().equals("")) { b3.setText(plus.getText()); }
						
					}
				});
				
				moins.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (b1.getText().equals("")) { b1.setText(moins.getText()); }
						else if (b2.getText().equals("")) { b2.setText(moins.getText()); }
						else if (b3.getText().equals("")) { b3.setText(moins.getText()); }
						
					}
				});
				
				fois.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (b1.getText().equals("")) { b1.setText(fois.getText()); }
						else if (b2.getText().equals("")) { b2.setText(fois.getText()); }
						else if (b3.getText().equals("")) { b3.setText(fois.getText()); }
						
					}
				});
				
				div.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (b1.getText().equals("")) { b1.setText(div.getText()); }
						else if (b2.getText().equals("")) { b2.setText(div.getText()); }
						else if (b3.getText().equals("")) { b3.setText(div.getText()); }
						
					}
				});
				
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				
				//Fin du P1
				btnNewButton_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnNewButton_1_2_1.setEnabled(true);
						
						btnNewButton_1_2.setEnabled(false);
						btnNewButton_1_1.setEnabled(false);
						btnNewButton_1.setEnabled(false);
						
						n1.setEditable(false);
						n2.setEditable(false);
						n3.setEditable(false);
						n4.setEditable(false);
						b1.setEditable(false);
						b2.setEditable(false);
						b3.setEditable(false);
						
						
						bn1.setText(a);
						bn2.setText(b);
						bn3.setText(c);
						bn4.setText(d);
						bn5.setText(e1);
						bn6.setText(f);
						
						
						
						
			//Calculer resultat du P1
			
						int res=0;
						
						if((!n1.getText().equals("")) && (!n2.getText().equals("")) && (!b1.getText().contentEquals(""))) {	 
							if (b1.getText().equals("+") ){ res =res+ Integer.parseInt(n1.getText())+ Integer.parseInt(n2.getText()) ; }
							if (b1.getText().equals("-") ){ res =res+ Integer.parseInt(n1.getText())- Integer.parseInt(n2.getText()) ; }
							if (b1.getText().equals("*") ){ res =res+ Integer.parseInt(n1.getText())*Integer.parseInt(n2.getText()) ; }
							if (b1.getText().equals("/") ){ res =res+ Integer.parseInt(n1.getText())/ Integer.parseInt(n2.getText()) ; }
						}  
						
						if((!n3.getText().contentEquals("")) && (!b2.getText().equals(""))) {
							if (b2.getText().equals("+") ){ res += Integer.parseInt(n3.getText()) ; }
							if (b2.getText().equals("-") ){ res -=  Integer.parseInt(n3.getText()) ; }
							if (b2.getText().equals("*") ){ res *= Integer.parseInt(n3.getText()); }
							if (b2.getText().equals("/") ){ res /= Integer.parseInt(n3.getText()) ; }
						}  
							
						if((!n4.getText().contentEquals("")) && (!b3.getText().equals(""))) {
							if (b3.getText().equals("+") ){ res += Integer.parseInt(n4.getText()) ; }
							if (b3.getText().equals("-") ){ res -=  Integer.parseInt(n4.getText()) ; }
							if (b3.getText().equals("*") ){ res *= Integer.parseInt(n4.getText()); }
							if (b3.getText().equals("/") ){ res /= Integer.parseInt(n4.getText()) ; }
						}  
							
						r.setText(res+"");	
							
						bn1.setEnabled(false);
						bn2.setEnabled(false);
						bn3.setEnabled(false);
						bn4.setEnabled(false);
						bn5.setEnabled(false);
						bn6.setEnabled(false);
							
						plus.setEnabled(false);
						moins.setEnabled(false);
						fois.setEnabled(false);
						div.setEnabled(false);
					}
				});	
			}
		});
		
		
		
		// Button de P2 pour commencer le game
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_1_2.setEnabled(false);
				btnNewButton_1_1.setEnabled(false);//submit de P1
				btnNewButton_1.setEnabled(false);//reset de P1
				
				btnNewButton_1_1_1.setEnabled(true);
				btnNewButton_1_3.setEnabled(true);
				
				bn1.setEnabled(true);
				bn2.setEnabled(true);
				bn3.setEnabled(true);
				bn4.setEnabled(true);
				bn5.setEnabled(true);
				bn6.setEnabled(true);
				
				plus.setEnabled(true);
				moins.setEnabled(true);
				fois.setEnabled(true);
				div.setEnabled(true);
				
				
				
				bn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n5.getText().equals("")) { n5.setText(bn1.getText()); bn1.setText(null);}
						else if (n6.getText().equals("")) { n6.setText(bn1.getText()); bn1.setText(null);}
						else if (n7.getText().equals("")) { n7.setText(bn1.getText()); bn1.setText(null);}
						else if (n8.getText().equals("")) { n8.setText(bn1.getText()); bn1.setText(null);}
						
					}
				});
				
				bn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n5.getText().equals("")) { n5.setText(bn3.getText()); bn3.setText(null);}
						else if (n6.getText().equals("")) { n6.setText(bn3.getText()); bn3.setText(null);}
						else if (n7.getText().equals("")) { n7.setText(bn3.getText()); bn3.setText(null);}
						else if (n8.getText().equals("")) { n8.setText(bn3.getText()); bn3.setText(null);}
						
					}
				});
				
				bn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n5.getText().equals("")) { n5.setText(bn5.getText()); bn5.setText(null);}
						else if (n6.getText().equals("")) { n6.setText(bn5.getText()); bn5.setText(null);}
						else if (n7.getText().equals("")) { n7.setText(bn5.getText()); bn5.setText(null);}
						else if (n8.getText().equals("")) { n8.setText(bn5.getText()); bn5.setText(null);}
						
					
					}
				});
				
				bn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n5.getText().equals("")) { n5.setText(bn2.getText()); bn2.setText(null);}
						else if (n6.getText().equals("")) { n6.setText(bn2.getText()); bn2.setText(null);}
						else if (n7.getText().equals("")) { n7.setText(bn2.getText()); bn2.setText(null);}
						else if (n8.getText().equals("")) { n8.setText(bn2.getText()); bn2.setText(null);}
						
					}
				});
				
				bn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n5.getText().equals("")) { n5.setText(bn4.getText()); bn4.setText(null);}
						else if (n6.getText().equals("")) { n6.setText(bn4.getText()); bn4.setText(null);}
						else if (n7.getText().equals("")) { n7.setText(bn4.getText()); bn4.setText(null);}
						else if (n8.getText().equals("")) { n8.setText(bn4.getText()); bn4.setText(null);}
						
					}
				});
				
				bn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//****************************************
						if (n5.getText().equals("")) { n5.setText(bn6.getText()); bn6.setText(null);}
						else if (n6.getText().equals("")) { n6.setText(bn6.getText()); bn6.setText(null);}
						else if (n7.getText().equals("")) { n7.setText(bn6.getText()); bn6.setText(null);}
						else if (n8.getText().equals("")) { n8.setText(bn6.getText()); bn6.setText(null);}
						
					}
				});
				
				plus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (b4.getText().equals("")) { b4.setText(plus.getText()); }
						else if (b5.getText().equals("")) { b5.setText(plus.getText()); }
						else if (b6.getText().equals("")) { b6.setText(plus.getText()); }
						
					}
				});
				
				moins.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (b4.getText().equals("")) { b4.setText(moins.getText()); }
						else if (b5.getText().equals("")) { b5.setText(moins.getText()); }
						else if (b6.getText().equals("")) { b6.setText(moins.getText()); }
						
					}
				});
				
				fois.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (b4.getText().equals("")) { b4.setText(fois.getText()); }
						else if (b5.getText().equals("")) { b5.setText(fois.getText()); }
						else if (b6.getText().equals("")) { b6.setText(fois.getText()); }
						
					}
				});
				
				div.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (b4.getText().equals("")) { b4.setText(div.getText()); }
						else if (b5.getText().equals("")) { b5.setText(div.getText()); }
						else if (b6.getText().equals("")) { b6.setText(div.getText()); }
						
					}
				});
				 //Fin du P2
				btnNewButton_1_1_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						btnNewButton_1_2_1.setEnabled(false);
						btnNewButton_1_1_1.setEnabled(false);
						btnNewButton_1_3.setEnabled(false);
						
						btnNewButton.setEnabled(true);

						// Calcul resultat du P2
						int res=0;
						if((!n5.getText().equals("")) && (!n6.getText().equals("")) && (!b4.getText().contentEquals(""))) {	
							if (b4.getText().equals("+") ){ res =res+ Integer.parseInt(n5.getText())+ Integer.parseInt(n6.getText()) ; }
							if (b4.getText().equals("-") ){ res =res+ Integer.parseInt(n5.getText())- Integer.parseInt(n6.getText()) ; }
							if (b4.getText().equals("*") ){ res =res+ Integer.parseInt(n5.getText())*Integer.parseInt(n6.getText()) ; }
							if (b4.getText().equals("/") ){ res =res+ Integer.parseInt(n5.getText())/ Integer.parseInt(n6.getText()) ; }
						}
						
						if((!n7.getText().contentEquals("")) && (!b5.getText().equals(""))) {
							if (b5.getText().equals("+") ){ res += Integer.parseInt(n7.getText()) ; }
							if (b5.getText().equals("-") ){ res -=  Integer.parseInt(n7.getText()) ; }
							if (b5.getText().equals("*") ){ res *= Integer.parseInt(n7.getText()); }
							if (b5.getText().equals("/") ){ res /= Integer.parseInt(n7.getText()) ; }
						}
						
						if((!n8.getText().contentEquals("")) && (!b6.getText().equals(""))) {
							if (b6.getText().equals("+") ){ res += Integer.parseInt(n8.getText()) ; }
							if (b6.getText().equals("-") ){ res -=  Integer.parseInt(n8.getText()) ; }
							if (b6.getText().equals("*") ){ res *= Integer.parseInt(n8.getText()); }
							if (b6.getText().equals("/") ){ res /= Integer.parseInt(n8.getText()) ; }
						}
						 // Calculer les differences des resultats du P1 et P2
						textField_3.setText(res+"");	
						String abs1=String.valueOf(Math.abs(Integer.parseInt(chiffre.getText()) - Integer.parseInt(r.getText())));

						String abs2 =String.valueOf(Math.abs(Integer.parseInt(chiffre.getText()) - Integer.parseInt(textField_3.getText())));

						if (Integer.parseInt(abs2)>Integer.parseInt(abs1) )
						{s.setText("10");
						s2.setText("5");
						}
						else if (Integer.parseInt(abs2)<Integer.parseInt(abs1) ){
							s.setText("5");
							s2.setText("10");
						}
						else {s.setText("0"); s2.setText("0");}
					
						// mettre les boutons enable false 
						
						bn1.setEnabled(false);
						bn2.setEnabled(false);
						bn3.setEnabled(false);
						bn4.setEnabled(false);
						bn5.setEnabled(false);
						bn6.setEnabled(false);
						
						// mettre les boutons des + , - ,* ,/ enable(false)
						plus.setEnabled(false);
						moins.setEnabled(false);
						fois.setEnabled(false);
						div.setEnabled(false);
						
						
						//remettre les valeurs dans les boutons des vals randomisées
						bn1.setText(a);
						bn2.setText(b);
						bn3.setText(c);
						bn4.setText(d);
						bn5.setText(e1);
						bn6.setText(f);
					}
				
				});
				
			}
		});
		
	}
}
