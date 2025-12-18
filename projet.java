import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class projet extends JFrame {
	
	//declarations :
	
	public static JTextField s1; 
	public  static JTextField s2;
     //le s1 est le score 1 et s2 est score 2 sont mis static car on dois les 
	// ajouter aux autres scores et obtenir le resultat a la  fin de notre jeu
	
	private JButton btnNewButton_2;
	private JTextField n1;
	private JTextField n2;
	private JTextField mot1;
	private JTextField mot2;
	
	
	/**
	 * Launch the application. (pour tester chaque classe a part à chaque fois on utilise une classe)
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projet frame = new projet();
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
	
	public projet() {
		
		// choisir un background
		getContentPane().setBackground(new Color(200, 200, 255));
 
		setResizable(false); // on ne peut pas modifier le size 
		setTitle("LES LETTRES"); // choisir le titre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // la fermeture standard
		setBounds(100, 100, 683, 564); 
		getContentPane().setLayout(null);
		
		//choisir de l'icone
				Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bayou\\OneDrive\\Bureau\\2IDSD\\Cours java avancée\\projet\\icone.png");  
				setIconImage(icon);
				
		
		// Round 1:
		JLabel lblNewLabel_2 = new JLabel("ROUND 1");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 21, 108, 58);
		getContentPane().add(lblNewLabel_2);
		
		
		
		// definir du case de score 1 et le mettre par defaut =0 
		n1 = new JTextField();
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setText("0");
		n1.setBounds(145, 355, 86, 20);
		getContentPane().add(n1);
		
		//definir de case de score 2 et le mettre par defaut =0 
		n2 = new JTextField();
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setText("0");
		n2.setColumns(10);
		n2.setBounds(548, 355, 86, 20);
		getContentPane().add(n2);
		
		// donner les titres a chaque cases
		
		JLabel lblNewLabel_1 = new JLabel("nbre de lettres :"); //Player 1
		lblNewLabel_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_1.setBounds(20, 353, 120, 29);
		getContentPane().add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_1_2 = new JLabel("nbre de lettres :"); //Player2
		lblNewLabel_1_2.setForeground(new Color(0, 0, 139));
		lblNewLabel_1_2.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(411, 353, 120, 29);
		getContentPane().add(lblNewLabel_1_2);
		
		
		
		// definir des boutons randomisées  des lettres 
		JButton b1 = new JButton(new Lettres().RandomL());
		b1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b1.setBackground(Color.WHITE);
		b1.setBounds(10, 154, 50, 58);
	    getContentPane().add(b1);
		
		JButton b2 = new JButton(new Lettres().RandomL());
		b2.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b2.setBackground(Color.WHITE);
		b2.setBounds(68, 154, 50, 58);
		getContentPane().add(b2);
		
		JButton b3 = new JButton(new Lettres().RandomL());
		b3.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b3.setBackground(Color.WHITE);
		b3.setBounds(126, 154, 50, 58);
		getContentPane().add(b3);
		
		JButton b4 = new JButton(new Lettres().RandomL());
		b4.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b4.setBackground(Color.WHITE);
		b4.setBounds(183, 154, 50, 58);
		getContentPane().add(b4);
		
		JButton b5 = new JButton(new Lettres().RandomL());
		b5.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b5.setBackground(Color.WHITE);
		b5.setBounds(241, 154, 50, 58);
		getContentPane().add(b5);
		
		JButton b6 = new JButton(new Lettres().RandomL());
		b6.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b6.setBackground(Color.WHITE);
		b6.setBounds(299, 154, 50, 58);
		getContentPane().add(b6);
		
		JButton b7 = new JButton(new Lettres().RandomL());
		b7.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b7.setBackground(Color.WHITE);
		b7.setBounds(357, 154, 50, 58);
		getContentPane().add(b7);
		
		JButton b8 = new JButton(new Lettres().RandomL());
		b8.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b8.setBackground(Color.WHITE);
		b8.setBounds(415, 154, 50, 58);
		getContentPane().add(b8);
		
		JButton b9 = new JButton(new Lettres().RandomL());
		b9.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b9.setBackground(Color.WHITE);
		b9.setBounds(473, 154, 50, 58);
		getContentPane().add(b9);
		
		JButton b10 = new JButton(new Lettres().RandomL());
		b10.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 15));
		b10.setBackground(Color.WHITE);
		b10.setBounds(531, 154, 50, 58);
		getContentPane().add(b10);
		
		
		// le textField qui contient la première mot
		mot1 = new JTextField();
		mot1.setBackground(Color.WHITE);
		mot1.setEditable(false);
		mot1.setBounds(145, 383, 86, 20);
		getContentPane().add(mot1);
		mot1.setColumns(10);
		
		// le textField qui contient la deuxième mot 
		mot2 = new JTextField();
		mot2.setBackground(Color.WHITE);
		mot2.setEditable(false);
		mot2.setColumns(10);
		mot2.setBounds(548, 386, 86, 20);
		getContentPane().add(mot2);
		
		// donner à chaque variable un contenu du bouton , pour le reaffecter à ce bouton après le reset
		String a1=b1.getText();
		String a2=b2.getText();
		String a3 =b3.getText();
		String a4 =b4.getText();
		String a5=b5.getText();
		String a6=b6.getText();
		String a7=b7.getText();
		String a8=b8.getText();
		String a9= b9.getText();
		String a10=b10.getText();
		
		// Button pour comparer les nombre de mots pour chaque player
		JButton compar = new JButton("Verifier");
		compar.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		compar.setForeground(new Color(255, 255, 255));
		compar.setBackground(new Color(139, 0, 139));
		
		// Button RESET du P1
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setEnabled(false);
		
		// lorsque on appuie sur reset chaque bouton vide va reprendre son valeur et les boutons seront enable
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		b1.setText(a1);
		b2.setText(a2);
		b3.setText(a3);
		b4.setText(a4);
		b5.setText(a5);
		b6.setText(a6);
		b7.setText(a7);
		b8.setText(a8);
		b9.setText(a9);
		b10.setText(a10);
		
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		b10.setEnabled(true);
				
		mot1.setText(null);

			}
		});
		btnNewButton.setBounds(129, 275, 89, 23);
		getContentPane().add(btnNewButton);
		
		// Button SUBMIT de P1
		JButton submit = new JButton("Submit");
		submit.setForeground(new Color(255, 255, 255));
		submit.setBackground(new Color(0, 0, 128));
		submit.setEnabled(false);
		
		// Verifier la validité du mot 
		JCheckBox ver = new JCheckBox("v\u00E9rification de la mot");
		ver.setBackground(new Color(200, 200, 255));
		ver.setBounds(499, 245, 150, 23);
		getContentPane().add(ver);
		
		// Button pour passer au 2eme partie du game (les chiffres)
		JButton PASSERAUCHIFFRES = new JButton("Passer aux chiffre");
		PASSERAUCHIFFRES.setForeground(new Color(255, 255, 255));
		PASSERAUCHIFFRES.setBackground(new Color(0, 0, 128));
		PASSERAUCHIFFRES.setFont(new Font("Tahoma", Font.BOLD, 25));
		PASSERAUCHIFFRES.setEnabled(false);
		
		// SUBMIT de P1
		submit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
						// si on appuie a submit et le champs est vide : on va voir un message
				if (mot1.getText().length() == 0) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame," Le champs mot est vide !!!\n");
					
				}

				else {
				//if la case de verification est selectionnée , le score va ajouté sinon il va attendre une autre mot de meme longueur de lettres mais valide cette fois ci
				if( ver.isSelected()==true)
					   
				{ if (mot1.getText().length() !=Integer.parseInt(n1.getText()))
				{ 
					// si la longueur du mot est different du longueur donnée on va recoit le messge verifier la longueur!!
				JFrame frame = new JFrame();
	      	    JOptionPane.showMessageDialog(frame," verifier la longueur du mot !!");}
				
				
				else {
					
					// sinon il va ajouter le score et tous le boutons seront (enable (false)) sauf le bouton  aceder au chiffres
					s1.setText(""+(Integer.parseInt(s1.getText())+Integer.parseInt(n1.getText()))); 
					submit.setEnabled(false);
					btnNewButton.setEnabled(false);
					PASSERAUCHIFFRES.setEnabled(true);
					
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
					b10.setEnabled(false);

				      }}
				
				else {
					
					if (mot1.getText().length() !=Integer.parseInt(n1.getText()))
					{
					JFrame frame = new JFrame();
		      	    JOptionPane.showMessageDialog(frame," verifier la longueur du mot !!");}
		      	    
					else 
					{
					s1.setText(s1.getText());
					s2.setText("0");					
					}
					
				}
			
				}
				
			}
		});
		submit.setBounds(126, 319, 89, 23);
		getContentPane().add(submit);
		
		

		JLabel lblNewLabel_3 = new JLabel("LES LETTRES");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.ITALIC, 43));
		lblNewLabel_3.setBounds(162, 11, 419, 99);
		getContentPane().add(lblNewLabel_3);

		
		// le  score de P1
		
		JLabel lblNewLabel = new JLabel("SCORE 1 :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 415, 89, 17);
		getContentPane().add(lblNewLabel);
		
		s1 = new JTextField();
		s1.setHorizontalAlignment(SwingConstants.CENTER);
		s1.setText("0");
		s1.setBackground(new Color(255, 255, 255));
		s1.setEditable(false);
		s1.setBounds(145, 415, 86, 20);
		getContentPane().add(s1);
		s1.setColumns(10);
		
		
		
		// le score de P2:
		
		JLabel lblScore = new JLabel("SCORE 2 :");
		lblScore.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScore.setBounds(411, 415, 89, 17);
		getContentPane().add(lblScore);
		
		s2 = new JTextField();
		s2.setHorizontalAlignment(SwingConstants.CENTER);
		s2.setText("0");
		s2.setEditable(false);
		s2.setBackground(new Color(255, 255, 255));
		s2.setColumns(10);
		s2.setBounds(548, 413, 86, 20);
		getContentPane().add(s2);
		
		PASSERAUCHIFFRES.addActionListener(new ActionListener() {
		
			
			
		//pour ouvrir la fenetre des chiffres:
			public void actionPerformed(ActionEvent e) {
				Les_chiffres C;
				C = new Les_chiffres();
				C.setVisible(true);
				
			}
		});
		PASSERAUCHIFFRES.setBounds(196, 457, 297, 51);
		getContentPane().add(PASSERAUCHIFFRES);
		
		
		
		JButton btnNewButton_1 = new JButton("P1");
		btnNewButton_1.setBackground(new Color(255, 192, 203));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(25, 275, 64, 67);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("P2");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.setBounds(418, 284, 64, 58);
		getContentPane().add(btnNewButton_2);
		
		// Button RESET du P2
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				b1.setText(a1);
				b2.setText(a2);
				b3.setText(a3);
				b4.setText(a4);
				b5.setText(a5);
				b6.setText(a6);
				b7.setText(a7);
				b8.setText(a8);
				b9.setText(a9);
				b10.setText(a10);
				
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				b10.setEnabled(true);


				
				mot2.setText(null);
			}
		});
		
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(0, 0, 128));
		btnNewButton_3.setBounds(545, 275, 89, 23);
		getContentPane().add(btnNewButton_3);
		
		// Button SUBMIT de P2
		JButton submit_1 = new JButton("Submit");
		submit_1.setForeground(Color.WHITE);
		submit_1.setBackground(new Color(0, 0, 128));
		submit_1.setBounds(545, 319, 89, 23);
		submit_1.setEnabled(false);
		getContentPane().add(submit_1);
		
		submit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (mot2.getText().length() == 0) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame," Le champs mot est vide !!!\n");
				}

				else {
				if( ver.isSelected()==true)
				   
				{ if (mot2.getText().length() !=Integer.parseInt(n2.getText()))
				{
				JFrame frame = new JFrame();
	      	    JOptionPane.showMessageDialog(frame," verifier la longueur du mot !!");}
				
				else 
					
					{s2.setText(""+(Integer.parseInt(s2.getText())+Integer.parseInt(n2.getText()))); 
					submit_1.setEnabled(false);
					btnNewButton_3.setEnabled(false);
					PASSERAUCHIFFRES.setEnabled(true);
					
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
					b10.setEnabled(false);
				      }}
				
				else {
					
					if (mot2.getText().length() !=Integer.parseInt(n2.getText()))
					{
					JFrame frame = new JFrame();
		      	    JOptionPane.showMessageDialog(frame," verifier la longueur du mot !!");}
		      	    
					else 
					{
					s2.setText(s2.getText());
					s1.setText("0");
					}
					
				}}
			}
		});
		
		
		// Comparer les longeurs du mots pour decider le winner (on a un seul player qui va jouer ce tour)
		compar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (Integer.parseInt(n1.getText())== Integer.parseInt(n2.getText())  &&  Integer.parseInt(n2.getText()) !=0 )
				{
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame," Donnez d'autres nombres !!!\n");
				}
				
				else if (Integer.parseInt(n1.getText())== 0 ||  Integer.parseInt(n2.getText()) ==0 )
				{
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame," Donnez des nombres valides !!!\n");
				}
				else if (Integer.parseInt(n1.getText())> 10 ||  Integer.parseInt(n2.getText()) >10 ) {
					
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame," Donnez des nombres inférieures à 10 !!!\n");
					
				}
				
				
				else if (Integer.parseInt(n1.getText())> Integer.parseInt(n2.getText())) {
					// Donner le main au P1 seulement
					n2.setEditable(false);
					n1.setEditable(false);
					submit.setEnabled(true);
					btnNewButton.setEnabled(true);
					
					compar.setText("P1");
					compar.setEnabled(false);
					n2.setEditable(false);
					b1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b1.getText());
							b1.setText(null);
							b1.setEnabled(false);
							
							
						}
					});
					
					b2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b2.getText());
							b2.setText(null);
							b2.setEnabled(false);

							
						}
					});
					
					b3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b3.getText());
							b3.setText(null);
							b3.setEnabled(false);

							
						}
					});
					
					b4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b4.getText());
							b4.setText(null);
							b4.setEnabled(false);

							
						}
					});
					
					b5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b5.getText());
							b5.setText(null);
							b5.setEnabled(false);

							
						}
					});
					
					b6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b6.getText());
							b6.setText(null);
							b6.setEnabled(false);

						}
					});
					
					b7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b7.getText());
							b7.setText(null);
							b7.setEnabled(false);

							
						}
					});
					
					b8.addActionListener(new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b8.getText());
							b8.setText(null);
							b8.setEnabled(false);

							
						}
					});
					
					b9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b9.getText());
							b9.setText(null);
							b9.setEnabled(false);

							
						}
					});
					
					b10.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot1.setText(mot1.getText()+b10.getText());
							b10.setText(null);
							b10.setEnabled(false);

							
						}
					});
				} else {
					
					//Donner le main au P2 seulement
					n1.setEditable(false);
					n2.setEditable(false);
					submit_1.setEnabled(true);
					btnNewButton_3.setEnabled(true);
					
					compar.setText("P2");
					compar.setEnabled(false);
					n1.setEditable(false);

					b1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b1.getText());
							b1.setText(null);
							b1.setEnabled(false);
							
						}
					});
					
					b2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b2.getText());
							b2.setText(null);						
							b2.setEnabled(false);

							
						}
					});
					
					b3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b3.getText());
							b3.setText(null);
							b3.setEnabled(false);

							
						}
					});
					
					b4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b4.getText());
							b4.setText(null);
							b4.setEnabled(false);

							
						}
					});
					
					b5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b5.getText());
							b5.setText(null);
							b5.setEnabled(false);

							
						}
					});
					
					b6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b6.getText());
							b6.setText(null);
							b6.setEnabled(false);

							
						}
					});
					
					b7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b7.getText());
							b7.setText(null);
							b7.setEnabled(false);

							
						}
					});
					
					b8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b8.getText());
							b8.setText(null);
							b8.setEnabled(false);

							
						}
					});
					
					b9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b9.getText());
							b9.setText(null);
							b9.setEnabled(false);

							
						}
					});
					
					b10.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mot2.setText(mot2.getText()+b10.getText());
							b10.setText(null);
							b10.setEnabled(false);

							
						}
					});
					
				}
			}
		});
		compar.setBounds(262, 292, 119, 40);
		getContentPane().add(compar);
		
		
		
		// le mot obtenu du P1
		
		JLabel lblNewLabel_1_3 = new JLabel("Mot obtenu:");
		lblNewLabel_1_3.setForeground(new Color(0, 0, 139));
		lblNewLabel_1_3.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(20, 381, 120, 29);
		getContentPane().add(lblNewLabel_1_3);
		
		// le mot obtenu du P2
		JLabel lblNewLabel_1_3_1 = new JLabel("Mot obtenu:");
		lblNewLabel_1_3_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1_3_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(411, 381, 120, 29);
		getContentPane().add(lblNewLabel_1_3_1);
		
		
	}
}
