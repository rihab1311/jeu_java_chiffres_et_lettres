import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Resultat extends JFrame {

	private JPanel contentPane;
	private JTextField score1;
	private JTextField score2;
	private JTextField gagnant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultat frame = new Resultat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Resultat() throws IOException {
		// declaration de la fenetre Resultat  elle est resizable et elle a une fermeture par defaut
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 300);
		
		contentPane = new JPanel();  
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/// choisir du couleur de background 
		
		getContentPane().setBackground(new Color(200, 200, 255));

		//choisir de l'icone
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bayou\\OneDrive\\Bureau\\2IDSD\\Cours java avancée\\projet\\icone.png");  
		setIconImage(icon);
		
		// donner un titre au fenetre
		setTitle("LA RESULTAT");

		
		// ecrire score final : 
		JLabel lblNewLabel = new JLabel("LE SCORE FINAL:"); 
		lblNewLabel.setForeground(new Color(0, 0, 128)); // choisir le couleur de l'ecriture
		lblNewLabel.setBounds(30, 11, 286, 42); // dimension et position
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 30)); //choisir la police 
		contentPane.add(lblNewLabel); // ajouter le label au contentPane
		
		JLabel lblNewLabel_1 = new JLabel("Score P1:"); 
		lblNewLabel_1.setBounds(30, 84, 93, 19); 
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Score P2:");
		lblNewLabel_1_1.setBounds(250, 84, 93, 19);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		contentPane.add(lblNewLabel_1_1);
		
		
		score1 = new JTextField(); // declaration de textField ou on va mettre le score du P1 
		score1.setHorizontalAlignment(SwingConstants.CENTER);
		score1.setEditable(false);
		score1.setBackground(new Color(255, 255, 255));
		score1.setBounds(30, 114, 86, 20);
		contentPane.add(score1);
		score1.setColumns(10);
		
		
		
		
		// Calculer le score final
		
		String sp1;
		String sp2;
		
		
		if ( projet.s1.getText().equals(null) )
		{ sp1="0";}
		else { sp1=projet.s1.getText();}
		
		if (projet.s2.getText().equals(null) )
		{sp2="0";}
		else { sp2=projet.s2.getText();}
		
		int sco1 =0;
		int sco2=0;
		
		score2 = new JTextField(); // declaration du text field ou on va mettre score 2
		score2.setText("0"); // mettre 0 par defaut omme score
		score2.setHorizontalAlignment(SwingConstants.CENTER); // ecriture au centre 
		score2.setBackground(new Color(255, 255, 255)); // couleur de la case blanc 
		score2.setBounds(250, 114, 86, 20);
		score2.setEditable(false); // mettre la case enaditable 
		score2.setColumns(10);
		contentPane.add(score2);
		
		
		// calcul des deux scores  :
		
		sco1= sco1+(Integer.parseInt(sp1)+Integer.parseInt(Les_chiffres.s.getText())+Integer.parseInt(Les_lettres2.s1.getText())+Integer.parseInt(Chiffres2.s.getText())); 
		  
		sco2= sco2+ (Integer.parseInt(sp2)+Integer.parseInt(Les_chiffres.s2.getText())+Integer.parseInt(Les_lettres2.s2.getText())+Integer.parseInt(Chiffres2.s2.getText())); 
		
			
		score1.setText(sco1+"");
		score2.setText(sco2+"");
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Le Player gangnant est :");
		lblNewLabel_2.setBounds(30, 170, 195, 35);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2);
		
		gagnant = new JTextField(); // declaration du text field qui contient le nom de gagnant
		gagnant.setHorizontalAlignment(SwingConstants.CENTER); // mettre l'ecriture au milieu 
		gagnant.setBackground(new Color(255, 255, 255)); // mettre le couleur de textfield blanc
		gagnant.setBounds(257, 170, 86, 30); // choisir les dimensions et l'emplacement du text field
		gagnant.setEditable(false); // mettre le textfield enaditable
		contentPane.add(gagnant); // ajout du textfield au content Pane
		
		
		
		
		//comparer les scores et choisir le player gagnant el l'afficher
		
		if (Integer.parseInt(score1.getText()) > Integer.parseInt(score2.getText())) {
			gagnant.setText("P1");
		}
		else if (Integer.parseInt(score1.getText()) < Integer.parseInt(score2.getText()))
		{
			gagnant.setText("P2");
		}
		else 
		{
			gagnant.setText("P1 et P2");
		}
		
		
		// Repeter le game
		JButton PASSERAUCHIFFRES = new JButton("RESTART"); //declaration du bouton Restart
		PASSERAUCHIFFRES.setForeground(new Color(255, 255, 255)); //couleur de l'ecriture
		PASSERAUCHIFFRES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				projet p= new projet();
				p.setVisible(true);
			}
		});
		
		
		PASSERAUCHIFFRES.setFont(new Font("Tahoma", Font.BOLD, 25)); //choisir du police  
		PASSERAUCHIFFRES.setBackground(new Color(0, 0, 128)); //couleur de bouton 
		PASSERAUCHIFFRES.setBounds(76, 209, 238, 51); //dimension et emplacement du bouton 
		contentPane.add(PASSERAUCHIFFRES); //ajouter le bouton au content Pane
		
	}

}
