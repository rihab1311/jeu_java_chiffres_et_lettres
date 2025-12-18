import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class a {
 // declaration
	
	   private JFrame mainFrame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel; 
	   private JButton btnHelp;

	   
	/**
	 * Launch the application.
	 */
	   
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					a window = new a();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public a() throws IOException {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() throws IOException {
		mainFrame = new JFrame("Des Chiffres et des lettres");
		// Cette Frame ne peut pas etre resizable
		mainFrame.setResizable(false);
	    // La taille de cette frame est (782,700)  
		mainFrame.setSize(782,700);
	      // la localisation de cette window est null 
	      mainFrame.setLocationRelativeTo(null);
	 

	      /// On a mis une image comme fond d'ecran 
	      BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\bayou\\OneDrive\\Bureau\\2IDSD\\Cours java avancée\\projet\\bienvenu.png"));
	      mainFrame.getContentPane().setLayout(null);
	      JLabel picLabel = new JLabel(new ImageIcon(myPicture));
	      picLabel.setLocation(0, 0);
	      picLabel.setVerticalAlignment(SwingConstants.TOP);
	      picLabel.setHorizontalAlignment(SwingConstants.LEFT);
	      picLabel.setBackground(Color.WHITE);
	      picLabel.setSize(787,596);
	      mainFrame.getContentPane().add(picLabel);
	      
	      controlPanel = new JPanel();
	      controlPanel.setBounds(0, 0, 8, 10);
	      controlPanel.setLayout(new FlowLayout());
	      mainFrame.getContentPane().add(controlPanel);
	      
	      headerLabel = new JLabel("",JLabel.CENTER );
	      headerLabel.setBounds(0, 0, 0, 0);
	      mainFrame.getContentPane().add(headerLabel);
	      
	      Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\bayou\\OneDrive\\Bureau\\2IDSD\\Cours java avancée\\projet\\icone.png");  
		  mainFrame.setIconImage(icon);   

	      //fermeture:
	      mainFrame.addWindowListener(new WindowAdapter() {
	    	  // lorsque le player ferme cette page au revoir va s'afficher 
	         public void windowClosing(WindowEvent windowEvent){
	        	 JOptionPane.showMessageDialog(null, "Au revoir");
	            System.exit(0);
	         }        
	      });    
	      statusLabel = new JLabel("",JLabel.CENTER);
	      statusLabel.setBounds(782, 0, 5, 661);
	      mainFrame.getContentPane().add(statusLabel);
	      
	      // Declaration du bouton play 
	      JButton btnNewButton = new JButton("Play");
	      btnNewButton.setForeground(new Color(0, 0, 128));
	      btnNewButton.addActionListener(new ActionListener() {
	      	
	    	  // Lorsque j'applique sur play il va lancer le window lettres
	    	  public void actionPerformed(ActionEvent e) {
	      	
	      		    projet p= new projet();
					p.setVisible(true);
	      	
	      	}
	      });
	      btnNewButton.setBackground(Color.WHITE); // couleur du bouton blanc
	      btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 46)); // police de l'ecriture 
	      btnNewButton.setBounds(0, 594, 398, 67); 
	      mainFrame.getContentPane().add(btnNewButton); 
	      // declaration du bouton help
	      btnHelp = new JButton("Help"); // declaration du bouton help
	      btnHelp.setBackground(new Color(255, 255, 255));//couleur de bouton 
	      btnHelp.setForeground(new Color(0, 0, 128)); // couleur de l'ecriture1
	      btnHelp.setFont(new Font("Sitka Small", Font.BOLD, 46));
	      btnHelp.addActionListener(new ActionListener() {
	    	  
	    	  // Lorsque j'appuie sur help cette boite de dialogue se lance 
	      	public void actionPerformed(ActionEvent e) {
	      		JFrame frame = new JFrame();
	      	  JOptionPane.showMessageDialog(frame,"Bienvenue au jeu Des Chiffres et Des Lettres. \n\n "
	      	    		+ "Ce jeu est composé de deux parties : partie chiffres et partie lettres. \n\n"
	      	    		+ "Partie lettres :\n Les 10 lettres sont aléatoires. \n"
	      	    		+ "Il suffit de fournir un longueur du mot à construire. \n"
	      	    		+ "Le joueur qui donne un nombre de lettres plus grand va construire un mot qui a \nun sens et avec un nombre de lettres proposé par lui. \n"
	      	    		+ "Son score va être selon la longueur du mot proposée, et l'autre va prendre un 0. \n"
	      	    		
	      	    		+ " \n\n Partie chiffres : \n"
	      	    		+ "On vous propose un nombre et 6 autres de manière aléatoire, à partir des 6 nombres proposés, \n"
	      	    		+ "vous devez composer un nombre très proche du nombre proposé aléatoirement en utilisant les \nopérations +, -, x et /."
	      	    		+ " \n Le joueur qui formule le nombre le plus proche va prendre 10 points et l'autre joueur prend 5 \ncomme score."
	      	    		+ "\n\n Pour Chaque partie, on a  2 tours.\n"
	      	    		+ "\n \n Bon courage !!!");
	      	}
	      });
	      btnHelp.setBounds(399, 594, 388, 67);
	      mainFrame.getContentPane().add(btnHelp); // ajout du bouton au au content pane
	      mainFrame.setVisible(true);  // mettre le mainFrame visible
	}

}
