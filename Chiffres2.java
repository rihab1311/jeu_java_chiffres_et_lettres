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

public class Chiffres2 extends JFrame {

	
	//  declaration :
	
	private JPanel contentPane;
	private JTextField chiffre;
	public  JTextField r;
	public static JTextField s;
	private JTextField textField_3;
	public static JTextField s2;
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
	 * Launch the application. (pour tester chaque classe)
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
	
	
	
	public Chiffres2() {
		
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 590);
		
		// declaration de panel:
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// icone :
	      Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bayou\\OneDrive\\Bureau\\2IDSD\\Cours java avancée\\projet\\icone.png");  
		setIconImage(icon);
		
		//titre :
		setTitle("LES CHIFFRES");
		
		// background :
		getContentPane().setBackground(new Color(200, 200, 255));

		
		
		//bouton P1:
		JButton P1 = new JButton("P1");
		P1.setForeground(Color.BLACK);
		P1.setFont(new Font("Tahoma", Font.BOLD, 16));
		P1.setBackground(new Color(255, 192, 203));
		P1.setBounds(10, 282, 99, 58);
		contentPane.add(P1);
		
		
		//bouton P2:
		JButton p2 = new JButton("P2");
		p2.setForeground(Color.BLACK);
		p2.setFont(new Font("Tahoma", Font.BOLD, 16));
		p2.setBackground(new Color(255, 192, 203));
		p2.setBounds(348, 282, 99, 58);
		contentPane.add(p2);
		
		
		//submit de P1  :
		JButton submit2 = new JButton("Submit");
		submit2.setForeground(Color.WHITE);
		submit2.setBackground(new Color(0, 0, 128));
		submit2.setBounds(557, 282, 89, 23);
		contentPane.add(submit2);

		
		// donner a chaque bouton un chiffre randomise a partir du classe random 
		
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
		
		
		
		//  Declaration des  cases des players (ou ils vont ecrire leurs chiffres) 
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
		
		//saufgarder les nomnres aléatoires
		String a=bn1.getText();
		String b = bn2.getText();
		String c=bn3.getText();
		String d=bn4.getText();
		String e1 = bn5.getText();
		String f =bn6.getText();
		
		n8 = new JTextField();
		n8.setHorizontalAlignment(SwingConstants.CENTER);
		n8.setEditable(false);
		n8.setBackground(Color.WHITE);
		n8.setColumns(10);
		n8.setBounds(606, 378, 40, 35);
		contentPane.add(n8);
		
		//Button RESET du P2 
		JButton reset2 = new JButton("Reset");
		reset2.addActionListener(new ActionListener() {
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
		reset2.setForeground(Color.WHITE);
		reset2.setBackground(new Color(0, 0, 128));
		reset2.setBounds(557, 328, 89, 23);
		contentPane.add(reset2);
		
		
		JButton resultatfinal = new JButton("Resultat final");
		resultatfinal.setForeground(new Color(255, 255, 255));
		resultatfinal.setFont(new Font("Tahoma", Font.BOLD, 15));
		resultatfinal.setBackground(new Color(0, 0, 128));
		resultatfinal.setEnabled(false);
		
		
		
		// Passer au 2eme tour
		resultatfinal.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//pour ouvrir la fenetre de score:
				Resultat R;
				try {
					R = new Resultat();
					R.setVisible(true);

				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		resultatfinal.setBounds(249, 514, 168, 36);
		contentPane.add(resultatfinal);
		
		
		// les chiffres titre
		JLabel lblNewLabel = new JLabel("LES CHIFFRES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 43));
		lblNewLabel.setBounds(158, 24, 344, 118);
		contentPane.add(lblNewLabel);
		
		
		
	// le chiffre randomisé :
		chiffre = new JTextField();
		chiffre.setHorizontalAlignment(SwingConstants.CENTER);
		chiffre.setBackground(new Color(255, 255, 255));
		chiffre.setEditable(false);
		chiffre.setBounds(10, 177, 64, 44);
		chiffre.setText(Integer.toString(new Lettres().RandomCH(10,250)));
		contentPane.add(chiffre);
		chiffre.setColumns(10);
		
		
		//boutons + ,* , / -
		
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
		div.setBounds(597, 203, 49, 32);
		contentPane.add(div);
		
		
		// mettre tous les boutons enable(false)
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
		JButton reset1 = new JButton("Reset");
		reset1.setForeground(new Color(255, 255, 255));
		reset1.setEnabled(false);
    
		
		// lorsque on appuie sur reset du p1 chaque bouton recoit son val  et les cases reront vides	
		reset1.addActionListener(new ActionListener() {
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
		reset1.setBackground(new Color(0, 0, 128));
		reset1.setBounds(213, 328, 89, 23);
		contentPane.add(reset1);
		
		
		
		//Button SUBMIT du P1
		JButton submit1 = new JButton("Submit");
		submit1.setForeground(new Color(255, 255, 255));
		submit1.setEnabled(false);
		submit1.addActionListener(new ActionListener() {
			//  submit de player 1 permet de calculer le resultat des nombres
			public void actionPerformed(ActionEvent e) {
				bn1.setText(a);
				bn2.setText(b);
				bn3.setText(c);
				bn4.setText(d);
				bn5.setText(e1);
				bn6.setText(f);
				
				//calcul  resultat
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
				
				// apres le clique sur submit tous le boutons seront enable (false) 
				// le player ne peut rien changer
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
		
		submit1.setBackground(new Color(0, 0, 128));
		submit1.setBounds(213, 282, 89, 23);
		contentPane.add(submit1);
		
		
		// resultat P1 texte
		JLabel lblResultatP = new JLabel("RESULTAT P1:");
		lblResultatP.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResultatP.setBounds(34, 424, 118, 17);
		contentPane.add(lblResultatP);
		
		
		//score P1 texte
		JLabel lblScoreP_1 = new JLabel("SCORE P1:");
		lblScoreP_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScoreP_1.setBounds(34, 472, 89, 17);
		contentPane.add(lblScoreP_1);
		
		
		// resultat p2 texte
		JLabel lblResultatP_1 = new JLabel("RESULTAT P2 :");
		lblResultatP_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResultatP_1.setBounds(383, 424, 119, 17);
		contentPane.add(lblResultatP_1);
		
		
		// score P2 texte :
		JLabel lblScoreP = new JLabel("SCORE P2:");
		lblScoreP.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScoreP.setBounds(383, 475, 89, 17);
		contentPane.add(lblScoreP);
		
		
		//  jTextField result P1
		r = new JTextField();
		r.setText("0");
		r.setHorizontalAlignment(SwingConstants.CENTER);
		r.setEditable(false);
		r.setColumns(10);
		r.setBackground(Color.WHITE);  //Resultat P1
		r.setBounds(192, 424, 86, 20);
		contentPane.add(r);
		
		
		//  jTextField score P1
		s = new JTextField();
		s.setHorizontalAlignment(SwingConstants.CENTER);
		s.setText("0");
		s.setEditable(false);
		s.setColumns(10);
		s.setBackground(Color.WHITE);  //Score P1
		s.setBounds(192, 472, 86, 20);
		contentPane.add(s);
		
		//  jTextField result P2
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);  // Resultat P2
		textField_3.setBounds(555, 424, 86, 20);
		contentPane.add(textField_3);
		
		
		//  jTextField score P2
		s2 = new JTextField();
		s2.setHorizontalAlignment(SwingConstants.CENTER);
		s2.setText("0");
		s2.setEditable(false);
		s2.setColumns(10);
		s2.setBackground(Color.WHITE);  //Score P2
		s2.setBounds(555, 472, 86, 20);
		contentPane.add(s2);
		
		
		// mettre les boutons (enable (false))
		p2.setEnabled(false);
		submit2.setEnabled(false);//submit de P2
		reset2.setEnabled(false);
		
		
		
		// round 2
		JLabel lblNewLabel_2 = new JLabel("ROUND 2");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 53, 108, 58);
		contentPane.add(lblNewLabel_2);
		
		// Button de P1 pour commencer le game
		P1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p2.setEnabled(false);
				submit2.setEnabled(false);//submit de P2
				reset2.setEnabled(false);
				
				submit1.setEnabled(true);
				reset1.setEnabled(true);
				
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
		
				
				
				/// les boutons + ,- , * ,/ et les chiffres randomisées  
				// lorsque on clique sur chacun il prend une place bien determiné 
				
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
						reset1.addActionListener(new ActionListener() {
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
				
				reset1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				
				
				
				//Lorsque on appuie sur Submir de P1
				submit1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						p2.setEnabled(true);
						P1.setEnabled(false);
						submit1.setEnabled(false);
						reset1.setEnabled(false);
						
						// les cases seront non editables 
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
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				P1.setEnabled(false);
				submit1.setEnabled(false);//submit de P1
				reset1.setEnabled(false);//reset de P1
				
				submit2.setEnabled(true);
				reset2.setEnabled(true);
				
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
				submit2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						p2.setEnabled(false);
						submit2.setEnabled(false);
						reset2.setEnabled(false);
						
						resultatfinal.setEnabled(true);

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
