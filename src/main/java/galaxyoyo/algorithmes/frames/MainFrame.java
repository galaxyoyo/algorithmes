package galaxyoyo.algorithmes.frames;

import galaxyoyo.algorithmes.models.CodeTreeCellRenderer;
import galaxyoyo.algorithmes.models.CodeTreeModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.NumberFormatter;
import javax.swing.tree.DefaultMutableTreeNode;

@SuppressWarnings("serial")
public class MainFrame extends JFrame
{
	private static MainFrame INSTANCE;
	
	private JMenuItem mntmNouveau;
	private JMenuItem mntmOuvrir;
	private JMenu mnRuecemmentOuverts;
	private JMenuItem mntmSauvegarder;
	private JMenuItem mntmSauvegarderSous;
	private JMenuItem mntmExporterAlgorithmeComplet;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmCopieDcranDe;
	private JMenuItem mntmImprimerAlgorithme;
	private JMenuItem mntmOuvrirUnExemple;
	private JMenuItem mntmQuitter;
	private JMenu mnFichier;
	private JMenu mndition;
	private JMenuItem mntmCopierLigne;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmCouperLigne;
	private JMenu mnModedition;
	private JMenu mnTutoriel;
	private JMenu mnAffichage;
	private JMenu mnExtension;
	private JMenu mnAide;
	private JMenuItem mntmInitiationEnLigne;
	private JCheckBoxMenuItem chckbxmntmBarreDoutils;
	private JCheckBoxMenuItem chckbxmntmNewCheckItem;
	private JMenuItem mntmChangerPoliceInterface;
	private JMenuItem mntmChangerCouleurConsole;
	private JMenuItem mntmChargerUneExtension;
	private JMenuItem mntmAnnulerLutilisationDune;
	private JMenuItem mntmcrireModifier;
	private JMenuBar menuBar;
	private JPanel contentPane;
	private JToolBar toolBar;
	private JButton buttonNew;
	private JButton buttonOpen;
	private JButton buttonSave;
	private JButton buttonTest;
	private JPanel introPanel;
	private JTextArea presentation;
	private JPanel codePanel;
	private JTree codeTree;
	private JPanel optionsPanel;
	private JButton btnModifierLigne;
	private JButton btnSupprimerLigne;
	private JTextPane txtpnPourUtiliser;
	private JButton btnTesterAlgorithme;
	private JButton btnNouvelleLigne;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JButton newVarButton;
	private JButton outVarButton;
	private JButton ifButton;
	private JButton inVarButton;
	private JButton outStrButton;
	private JButton forButton;
	private JButton pauseButton;
	private JButton setValueButton;
	private JButton outCalculButton;
	private JButton foreachButton;
	private JButton commentButton;
	private JPanel panel_1;
	private JCheckBox chckbxUtiliserLaFonction;
	private JList<String> list;
	private JPanel panel_2;
	private JLabel lblFx;
	private JTextPane txtpnFxDottre;
	private JPanel panel_3;
	private JCheckBox chckbxUtiliserLeRepre;
	private JLabel lblXmin;
	private JFormattedTextField formattedTextField;
	private JLabel lblXmax;
	private JLabel lblYmin;
	private JFormattedTextField formattedTextField_1;
	private JLabel lblYmax;
	private ButtonGroup editionMode;
	private JRadioButtonMenuItem rdbtnmntmModeNormal;
	private JRadioButtonMenuItem rdbtnmntmModediteurDe;
	private JFormattedTextField formattedTextField_2;
	private JFormattedTextField formattedTextField_3;
	private JFormattedTextField formattedTextField_4;
	private JFormattedTextField formattedTextField_5;
	private JLabel lblGraduationsX;
	private JLabel lblGraduationsY;
	private JButton btnAjouterTracerPoint;
	private JButton btnAjouterTracerSegment;
	private JButton btnAjouterEffacerGraphique;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JPanel panel_4;
	private JCheckBox chckbxUtiliserLaFonction_1;
	private JLabel lblSi;
	private JLabel lblRenvoyer;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnAjouter;
	private JLabel lblDansLesAutres;
	private JTextField textField_4;
	private JList<String> list_1;
	private JButton btnVersLeHaut;
	private JButton btnVersLeBas;
	private JButton btnSupprimer;
	
	/**
	 * Create the frame.
	 */
	public MainFrame()
	{
		super ("Algorithmes");
		INSTANCE = this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		mntmNouveau = new JMenuItem("Nouveau");
		mntmNouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnFichier.add(mntmNouveau);
		
		mntmOuvrir = new JMenuItem("Ouvrir");
		mntmOuvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFichier.add(mntmOuvrir);
		
		mnRuecemmentOuverts = new JMenu("R\u00e9cemment ouverts");
		mnFichier.add(mnRuecemmentOuverts);
		
		mntmSauvegarder = new JMenuItem("Sauvegarder");
		mntmSauvegarder.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFichier.add(mntmSauvegarder);
		
		mntmSauvegarderSous = new JMenuItem("Sauvegarder Sous ...");
		mntmSauvegarderSous.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnFichier.add(mntmSauvegarderSous);
		
		mnFichier.addSeparator();
		
		mntmExporterAlgorithmeComplet = new JMenuItem("Exporter algorithme complet vers page web");
		mnFichier.add(mntmExporterAlgorithmeComplet);
		
		mntmNewMenuItem = new JMenuItem("Exporter code vers fichier texte");
		mnFichier.add(mntmNewMenuItem);
		
		mntmCopieDcranDe = new JMenuItem("Copie d'\u00e9cran de l'algorithme");
		mnFichier.add(mntmCopieDcranDe);
		
		mnFichier.addSeparator();
		
		mntmImprimerAlgorithme = new JMenuItem("Imprimer algorithme");
		mntmImprimerAlgorithme.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mnFichier.add(mntmImprimerAlgorithme);
		mnFichier.addSeparator();
		
		mntmOuvrirUnExemple = new JMenuItem("Ouvrir un exemple");
		mnFichier.add(mntmOuvrirUnExemple);
		mnFichier.addSeparator();
		
		mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		mntmQuitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnFichier.add(mntmQuitter);
		
		mndition = new JMenu("\u00c9dition");
		menuBar.add(mndition);
		
		mntmCopierLigne = new JMenuItem("Copier Ligne");
		mntmCopierLigne.setEnabled(false);
		mntmCopierLigne.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mndition.add(mntmCopierLigne);
		
		mntmNewMenuItem_1 = new JMenuItem("Coller Ligne");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.setEnabled(false);
		mndition.add(mntmNewMenuItem_1);
		
		mntmCouperLigne = new JMenuItem("Couper Ligne");
		mntmCouperLigne.setEnabled(false);
		mntmCouperLigne.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mndition.add(mntmCouperLigne);
		
		mnModedition = new JMenu("Mode \u00c9dition");
		mndition.add(mnModedition);
		
		editionMode = new ButtonGroup();
		
		rdbtnmntmModeNormal = new JRadioButtonMenuItem("Mode normal");
		rdbtnmntmModeNormal.setSelected(true);
		mnModedition.add(rdbtnmntmModeNormal);
		editionMode.add(rdbtnmntmModeNormal);
		
		rdbtnmntmModediteurDe = new JRadioButtonMenuItem("Mode \u00e9diteur de texte");
		mnModedition.add(rdbtnmntmModediteurDe);
		editionMode.add(rdbtnmntmModediteurDe);
		
		mnTutoriel = new JMenu("Tutoriel");
		menuBar.add(mnTutoriel);
		
		mntmInitiationEnLigne = new JMenuItem("Initiation en ligne \u00e0 l'algorithmique");
		mnTutoriel.add(mntmInitiationEnLigne);
		
		mnAffichage = new JMenu("Affichage");
		menuBar.add(mnAffichage);
		
		chckbxmntmBarreDoutils = new JCheckBoxMenuItem("Barre d'outils");
		chckbxmntmBarreDoutils.setSelected(true);
		mnAffichage.add(chckbxmntmBarreDoutils);
		
		chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Cadre 'Pr\u00e9sentation'");
		chckbxmntmNewCheckItem.setSelected(true);
		mnAffichage.add(chckbxmntmNewCheckItem);
		
		mnAffichage.addSeparator();
		
		mntmChangerPoliceInterface = new JMenuItem("Changer Police interface");
		mnAffichage.add(mntmChangerPoliceInterface);
		mnAffichage.addSeparator();
		
		mntmChangerCouleurConsole = new JMenuItem("Changer Couleur Console 'R\u00e9sultats'");
		mnAffichage.add(mntmChangerCouleurConsole);
		
		mnExtension = new JMenu("Extension");
		menuBar.add(mnExtension);
		
		mntmChargerUneExtension = new JMenuItem("Charger une extension");
		mnExtension.add(mntmChargerUneExtension);
		
		mntmAnnulerLutilisationDune = new JMenuItem("Annuler l'utilisation d'une extension");
		mntmAnnulerLutilisationDune.setEnabled(false);
		mnExtension.add(mntmAnnulerLutilisationDune);
		
		mnExtension.addSeparator();
		
		mntmcrireModifier = new JMenuItem("\u00c9crire / modifier une extension");
		mnExtension.add(mntmcrireModifier);
		
		mnAide = new JMenu("Aide");
		menuBar.add(mnAide);
		
		JMenuItem mntmAide = new JMenuItem("Aide");
		mnAide.add(mntmAide);
		
		mnAide.addSeparator();
		
		JMenuItem mntmAProposD = new JMenuItem("A propos d'" + getTitle());
		mnAide.add(mntmAProposD);
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[] {0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		toolBar = new JToolBar();
		toolBar.setBorderPainted(false);
		toolBar.setFloatable(false);
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.insets = new Insets(0, 0, 5, 0);
		gbc_toolBar.anchor = GridBagConstraints.NORTHWEST;
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 0;
		contentPane.add(toolBar, gbc_toolBar);
		
		buttonNew = new JButton("Nouveau");
		buttonNew.setIcon(new ImageIcon(MainFrame.class.getResource("/images/nouveau22.png")));
		buttonNew.setVerticalTextPosition(SwingConstants.BOTTOM);
	    buttonNew.setHorizontalTextPosition(SwingConstants.CENTER);
	    toolBar.add(buttonNew);

		buttonOpen = new JButton("Ouvrir");
		buttonOpen.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ouvrir22.png")));
		buttonOpen.setVerticalTextPosition(SwingConstants.BOTTOM);
	    buttonOpen.setHorizontalTextPosition(SwingConstants.CENTER);
		toolBar.add(buttonOpen);

		buttonSave = new JButton("Sauver");
		buttonSave.setIcon(new ImageIcon(MainFrame.class.getResource("/images/sauver22.png")));
		buttonSave.setVerticalTextPosition(SwingConstants.BOTTOM);
	    buttonSave.setHorizontalTextPosition(SwingConstants.CENTER);
		toolBar.add(buttonSave);
		
		toolBar.addSeparator();
		
		buttonTest = new JButton("Tester");
		buttonTest.setIcon(new ImageIcon(MainFrame.class.getResource("/images/executer22.png")));
		buttonTest.setVerticalTextPosition(SwingConstants.BOTTOM);
	    buttonTest.setHorizontalTextPosition(SwingConstants.CENTER);
		toolBar.add(buttonTest);
		
		introPanel = new JPanel();
		introPanel.setBorder(BorderFactory.createTitledBorder("Pr\u00e9sentation de l'algorithme"));
		GridBagConstraints gbc_introPanel = new GridBagConstraints();
		gbc_introPanel.insets = new Insets(0, 0, 5, 0);
		gbc_introPanel.fill = GridBagConstraints.BOTH;
		gbc_introPanel.gridx = 0;
		gbc_introPanel.gridy = 1;
		contentPane.add(introPanel, gbc_introPanel);
		
		presentation = new JTextArea();
		presentation.setBorder(new LineBorder(Color.GRAY));
		introPanel.setLayout(new BorderLayout(0, 0));
		introPanel.add(presentation, BorderLayout.CENTER);
		
		codePanel = new JPanel();
		codePanel.setBorder(BorderFactory.createTitledBorder("Code de l'algorithme"));
		
		GridBagConstraints gbc_codePanel = new GridBagConstraints();
		gbc_codePanel.fill = GridBagConstraints.BOTH;
		gbc_codePanel.gridx = 0;
		gbc_codePanel.gridy = 2;
		gbc_codePanel.gridheight = 2;
		contentPane.add(codePanel, gbc_codePanel);
		codePanel.setLayout(new BorderLayout(0, 0));
		
		codeTree = new JTree();
		codeTree.setBorder(new LineBorder(new Color(0, 0, 0)));
		codeTree.setModel(new CodeTreeModel(new DefaultMutableTreeNode()));
		codeTree.setCellRenderer(new CodeTreeCellRenderer());
		codeTree.setRootVisible(false);
		codePanel.add(codeTree, BorderLayout.CENTER);
		
		optionsPanel = new JPanel();
		codePanel.add(optionsPanel, BorderLayout.EAST);
		GridBagLayout gbl_optionsPanel = new GridBagLayout();
		gbl_optionsPanel.columnWidths = new int[] {0, 0};
		gbl_optionsPanel.rowHeights = new int[] {0, 0, 0, 0, 0, 0};
		gbl_optionsPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_optionsPanel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		optionsPanel.setLayout(gbl_optionsPanel);
		
		btnModifierLigne = new JButton("Modifier Ligne");
		btnModifierLigne.setIcon(new ImageIcon(MainFrame.class.getResource("/images/modifier.png")));
		GridBagConstraints gbc_btnModifierLigne = new GridBagConstraints();
		gbc_btnModifierLigne.fill = GridBagConstraints.BOTH;
		gbc_btnModifierLigne.insets = new Insets(0, 0, 5, 0);
		gbc_btnModifierLigne.gridx = 0;
		gbc_btnModifierLigne.gridy = 0;
		optionsPanel.add(btnModifierLigne, gbc_btnModifierLigne);
		
		btnSupprimerLigne = new JButton("Supprimer Ligne / Bloc");
		btnSupprimerLigne.setIcon(new ImageIcon(MainFrame.class.getResource("/images/supprimer.png")));
		GridBagConstraints gbc_btnSupprimerLigne = new GridBagConstraints();
		gbc_btnSupprimerLigne.insets = new Insets(0, 0, 5, 0);
		gbc_btnSupprimerLigne.fill = GridBagConstraints.BOTH;
		gbc_btnSupprimerLigne.gridx = 0;
		gbc_btnSupprimerLigne.gridy = 1;
		optionsPanel.add(btnSupprimerLigne, gbc_btnSupprimerLigne);
		
		txtpnPourUtiliser = new JTextPane();
		txtpnPourUtiliser.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtpnPourUtiliser.setEditable(false);
		txtpnPourUtiliser.setText("- Pour utiliser une variable, il faut d'abord\r\nla d\u00e9clarer (bouton \"D\u00e9clarer nouvelle\r\nvariable\").\r\n- Pour ajouter un nouvel \u00e9l\u00e9ment \u00e0\r\nl'algorithme, il faut d'abord ins\u00e9rer une\r\nnouvelle ligne (bouton \"Nouvelle Ligne\"), puis\r\ncliquer sur un des boutons disponibles\r\ndans les panneaux disponibles en bas de la fen\u00eatre.");
		txtpnPourUtiliser.setBackground(new Color(0xffffb4));
		GridBagConstraints gbc_txtpnPourUtiliser = new GridBagConstraints();
		gbc_txtpnPourUtiliser.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnPourUtiliser.fill = GridBagConstraints.BOTH;
		gbc_txtpnPourUtiliser.gridx = 0;
		gbc_txtpnPourUtiliser.gridy = 2;
		optionsPanel.add(txtpnPourUtiliser, gbc_txtpnPourUtiliser);
		
		btnTesterAlgorithme = new JButton("Tester Algorithme");
		btnTesterAlgorithme.setIcon(new ImageIcon(MainFrame.class.getResource("/images/executer.png")));
		GridBagConstraints gbc_btnTesterAlgorithme = new GridBagConstraints();
		gbc_btnTesterAlgorithme.insets = new Insets(0, 0, 5, 0);
		gbc_btnTesterAlgorithme.fill = GridBagConstraints.BOTH;
		gbc_btnTesterAlgorithme.gridx = 0;
		gbc_btnTesterAlgorithme.gridy = 3;
		optionsPanel.add(btnTesterAlgorithme, gbc_btnTesterAlgorithme);
		
		btnNouvelleLigne = new JButton("Nouvelle Ligne");
		btnNouvelleLigne.setIcon(new ImageIcon(MainFrame.class.getResource("/images/nouvelleligne.png")));
		GridBagConstraints gbc_btnNouvelleLigne = new GridBagConstraints();
		gbc_btnNouvelleLigne.fill = GridBagConstraints.BOTH;
		gbc_btnNouvelleLigne.gridx = 0;
		gbc_btnNouvelleLigne.gridy = 4;
		optionsPanel.add(btnNouvelleLigne, gbc_btnNouvelleLigne);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.white);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 4;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
		panel = new JPanel();
		panel.setBackground(Color.white);
		tabbedPane.addTab("Op\u00e9rations standards", null, panel, null);
		panel.setLayout(new GridLayout(3, 4, 5, 5));
		
		newVarButton = new JButton("D\u00e9clarer nouvelle variable");
		newVarButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				new NewVarDialog(MainFrame.this);
			}
		});
		newVarButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(newVarButton);
		
		outVarButton = new JButton("Output var");
		outVarButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(outVarButton);
		
		JButton whileButton = new JButton("Ajouter 'while'");
		whileButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(whileButton);
		
		ifButton = new JButton("Ajouter 'if'");
		ifButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(ifButton);
		
		inVarButton = new JButton("Input var");
		inVarButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(inVarButton);
		
		outStrButton = new JButton("Output string");
		outStrButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(outStrButton);
		
		forButton = new JButton("Ajouter 'for'");
		forButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(forButton);
		
		pauseButton = new JButton("Ajouter 'Pause'");
		panel.add(pauseButton);
		
		setValueButton = new JButton("Set");
		setValueButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(setValueButton);
		
		outCalculButton = new JButton("Output calcul");
		outCalculButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(outCalculButton);
		
		foreachButton = new JButton("Ajouter 'foreach'");
		foreachButton.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel.add(foreachButton);
		
		commentButton = new JButton("Ajouter commentaire");
		panel.add(commentButton);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.white);
		tabbedPane.addTab("Utiliser une fonction num\u00e9rique", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0};
		gbl_panel_1.rowWeights = new double[]{1.0, 0.0, 1.0};
		panel_1.setLayout(gbl_panel_1);
		
		chckbxUtiliserLaFonction = new JCheckBox("Utiliser la fonction F1");
		GridBagConstraints gbc_chckbxUtiliserLaFonction = new GridBagConstraints();
		gbc_chckbxUtiliserLaFonction.anchor = GridBagConstraints.WEST;
		gbc_chckbxUtiliserLaFonction.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUtiliserLaFonction.gridx = 0;
		gbc_chckbxUtiliserLaFonction.gridy = 0;
		panel_1.add(chckbxUtiliserLaFonction, gbc_chckbxUtiliserLaFonction);
		
		list = new JList<String>();
		list.setEnabled(false);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 3;
		gbc_list.insets = new Insets(0, 0, 5, 0);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 0;
		panel_1.add(list, gbc_list);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.white);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel_1.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		lblFx = new JLabel("F1(x) = ");
		panel_2.add(lblFx, BorderLayout.WEST);
		
		JTextField textField = new JTextField();
		textField.setEnabled(false);
		panel_2.add(textField);
		textField.setColumns(10);
		
		txtpnFxDottre = new JTextPane();
		txtpnFxDottre.setContentType("text/html");
		txtpnFxDottre.setText("<html><head><style>\r\ndiv.normal{font-style: italic; font-family: DejaVu Sans; font-size: 9px; background: #ffffb4}\r\nspan.red {color: red; font-weight: bold}\r\n</style></head><body>\r\n<div class=\"normal\">F1(x) do\u00eet \u00eatre exprim\u00e9 en fonction de x. Ex : <span class=\"red\">F1(x) = sqrt(x * x + 3) - x</span></div>\r\n</body>\r\n</html>");
		txtpnFxDottre.setBackground(getBackground());
		GridBagConstraints gbc_txtpnFxDottre = new GridBagConstraints();
		gbc_txtpnFxDottre.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnFxDottre.fill = GridBagConstraints.BOTH;
		gbc_txtpnFxDottre.gridx = 0;
		gbc_txtpnFxDottre.gridy = 2;
		panel_1.add(txtpnFxDottre, gbc_txtpnFxDottre);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.white);
		tabbedPane.addTab("Dessiner dans un rep\u00e8re", null, panel_3, null);
		
		chckbxUtiliserLeRepre = new JCheckBox("Utiliser le rep\u00e8re :");
		chckbxUtiliserLeRepre.setBackground(Color.white);
		chckbxUtiliserLeRepre.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				formattedTextField.setEnabled(!formattedTextField.isEnabled());
				formattedTextField_1.setEnabled(!formattedTextField_1.isEnabled());
				formattedTextField_2.setEnabled(!formattedTextField_2.isEnabled());
				formattedTextField_3.setEnabled(!formattedTextField_3.isEnabled());
				formattedTextField_4.setEnabled(!formattedTextField_4.isEnabled());
				formattedTextField_5.setEnabled(!formattedTextField_5.isEnabled());
				btnAjouterTracerPoint.setEnabled(!btnAjouterTracerPoint.isEnabled());
				btnAjouterTracerSegment.setEnabled(!btnAjouterTracerSegment.isEnabled());
				btnAjouterEffacerGraphique.setEnabled(!btnAjouterEffacerGraphique.isEnabled());
			}
		});
		panel_3.setLayout(new GridLayout(3, 7, 5, 5));
		panel_3.add(chckbxUtiliserLeRepre);
		
		label = new JLabel("");
		panel_3.add(label);
		
		label_1 = new JLabel("");
		panel_3.add(label_1);
		
		label_2 = new JLabel("");
		panel_3.add(label_2);
		
		label_3 = new JLabel("");
		panel_3.add(label_3);
		
		label_4 = new JLabel("");
		panel_3.add(label_4);
		
		btnAjouterTracerPoint = new JButton("Ajouter Tracer Point");
		btnAjouterTracerPoint.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel_3.add(btnAjouterTracerPoint);
		
		lblXmin = new JLabel("Xmin :");
		panel_3.add(lblXmin);

		NumberFormatter formatter = new NumberFormatter();
		formatter.setValueClass(Long.class);
		formatter.setAllowsInvalid(false);
		formatter.setMinimum(Long.MIN_VALUE);
		formatter.setMaximum(Long.MAX_VALUE);
		formattedTextField = new JFormattedTextField(formatter);
		formattedTextField.setEnabled(false);
		formattedTextField.setText("-10");
		panel_3.add(formattedTextField);
		
		lblXmax = new JLabel("Xmax :");
		panel_3.add(lblXmax);
		
		formattedTextField_2 = new JFormattedTextField(formatter);
		formattedTextField_2.setEnabled(false);
		formattedTextField_2.setText("10");
		panel_3.add(formattedTextField_2);
		
		lblGraduationsX = new JLabel("Graduations X :");
		panel_3.add(lblGraduationsX);
		
		formattedTextField_4 = new JFormattedTextField(formatter);
		formattedTextField_4.setEnabled(false);
		formattedTextField_4.setText("2");
		panel_3.add(formattedTextField_4);
		
		btnAjouterTracerSegment = new JButton("Ajouter Tracer Segment");
		btnAjouterTracerSegment.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel_3.add(btnAjouterTracerSegment);
		
		lblYmin = new JLabel("Ymin :");
		panel_3.add(lblYmin);
		
		formattedTextField_1 = new JFormattedTextField(formatter);
		formattedTextField_1.setEnabled(false);
		formattedTextField_1.setText("-10");
		panel_3.add(formattedTextField_1);
		
		lblYmax = new JLabel("Ymax :");
		panel_3.add(lblYmax);
		
		formattedTextField_3 = new JFormattedTextField(formatter);
		formattedTextField_3.setEnabled(false);
		formattedTextField_3.setText("10");
		panel_3.add(formattedTextField_3);
		
		lblGraduationsY = new JLabel("Graduations Y :");
		panel_3.add(lblGraduationsY);
		
		formattedTextField_5 = new JFormattedTextField(formatter);
		formattedTextField_5.setEnabled(false);
		formattedTextField_5.setText("2");
		panel_3.add(formattedTextField_5);
		
		btnAjouterEffacerGraphique = new JButton("Ajouter Effacer graphique");
		btnAjouterEffacerGraphique.setIcon(new ImageIcon(MainFrame.class.getResource("/images/ajouter.png")));
		panel_3.add(btnAjouterEffacerGraphique);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.white);
		tabbedPane.addTab("Fonction avanc\u00e9e", null, panel_4, null);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] {0, 30, 0, 30};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0};
		gbl_panel_4.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		chckbxUtiliserLaFonction_1 = new JCheckBox("Utiliser la fonction F2 avec comme param\u00e8tres :");
		chckbxUtiliserLaFonction_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				textField_1.setEnabled(!textField_1.isEnabled());
				textField_2.setEnabled(!textField_2.isEnabled());
				textField_3.setEnabled(!textField_3.isEnabled());
				textField_4.setEnabled(!textField_4.isEnabled());
				list_1.setEnabled(!list_1.isEnabled());
				btnVersLeHaut.setEnabled(!btnVersLeHaut.isEnabled());
				btnVersLeBas.setEnabled(!btnVersLeBas.isEnabled());
				btnSupprimer.setEnabled(!btnSupprimer.isEnabled());
			}
		});
		chckbxUtiliserLaFonction_1.setBackground(Color.WHITE);
		GridBagConstraints gbc_chckbxUtiliserLaFonction_1 = new GridBagConstraints();
		gbc_chckbxUtiliserLaFonction_1.gridwidth = 3;
		gbc_chckbxUtiliserLaFonction_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUtiliserLaFonction_1.gridx = 0;
		gbc_chckbxUtiliserLaFonction_1.gridy = 0;
		panel_4.add(chckbxUtiliserLaFonction_1, gbc_chckbxUtiliserLaFonction_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 0;
		panel_4.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		btnVersLeHaut = new JButton("Vers le haut");
		btnVersLeHaut.setEnabled(false);
		GridBagConstraints gbc_btnVersLeHaut = new GridBagConstraints();
		gbc_btnVersLeHaut.fill = GridBagConstraints.BOTH;
		gbc_btnVersLeHaut.insets = new Insets(0, 0, 5, 0);
		gbc_btnVersLeHaut.gridx = 8;
		gbc_btnVersLeHaut.gridy = 0;
		panel_4.add(btnVersLeHaut, gbc_btnVersLeHaut);
		
		lblSi = new JLabel("Si");
		GridBagConstraints gbc_lblSi = new GridBagConstraints();
		gbc_lblSi.anchor = GridBagConstraints.EAST;
		gbc_lblSi.insets = new Insets(0, 0, 5, 5);
		gbc_lblSi.gridx = 0;
		gbc_lblSi.gridy = 1;
		panel_4.add(lblSi, gbc_lblSi);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 1;
		panel_4.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		lblRenvoyer = new JLabel("renvoyer");
		GridBagConstraints gbc_lblRenvoyer = new GridBagConstraints();
		gbc_lblRenvoyer.insets = new Insets(0, 0, 5, 5);
		gbc_lblRenvoyer.gridx = 4;
		gbc_lblRenvoyer.gridy = 1;
		panel_4.add(lblRenvoyer, gbc_lblRenvoyer);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 5;
		gbc_textField_3.gridy = 1;
		panel_4.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		btnAjouter = new JButton("Ajouter");
		GridBagConstraints gbc_btnAjouter = new GridBagConstraints();
		gbc_btnAjouter.insets = new Insets(0, 0, 5, 5);
		gbc_btnAjouter.gridx = 6;
		gbc_btnAjouter.gridy = 1;
		panel_4.add(btnAjouter, gbc_btnAjouter);
		
		list_1 = new JList<String>();
		list_1.setEnabled(false);
		list_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridheight = 3;
		gbc_list_1.insets = new Insets(0, 0, 0, 5);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 7;
		gbc_list_1.gridy = 0;
		panel_4.add(list_1, gbc_list_1);
		
		btnVersLeBas = new JButton("Vers le bas");
		btnVersLeBas.setEnabled(false);
		GridBagConstraints gbc_btnVersLeBas = new GridBagConstraints();
		gbc_btnVersLeBas.fill = GridBagConstraints.BOTH;
		gbc_btnVersLeBas.insets = new Insets(0, 0, 5, 0);
		gbc_btnVersLeBas.gridx = 8;
		gbc_btnVersLeBas.gridy = 1;
		panel_4.add(btnVersLeBas, gbc_btnVersLeBas);
		
		lblDansLesAutres = new JLabel("Dans les autres cas, renvoyer");
		GridBagConstraints gbc_lblDansLesAutres = new GridBagConstraints();
		gbc_lblDansLesAutres.anchor = GridBagConstraints.WEST;
		gbc_lblDansLesAutres.gridwidth = 2;
		gbc_lblDansLesAutres.insets = new Insets(0, 0, 0, 5);
		gbc_lblDansLesAutres.gridx = 0;
		gbc_lblDansLesAutres.gridy = 2;
		panel_4.add(lblDansLesAutres, gbc_lblDansLesAutres);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 5;
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 2;
		panel_4.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setEnabled(false);
		btnSupprimer.setIcon(new ImageIcon(MainFrame.class.getResource("/images/supprimer.png")));
		GridBagConstraints gbc_btnSupprimer = new GridBagConstraints();
		gbc_btnSupprimer.fill = GridBagConstraints.BOTH;
		gbc_btnSupprimer.gridx = 8;
		gbc_btnSupprimer.gridy = 2;
		panel_4.add(btnSupprimer, gbc_btnSupprimer);
		setVisible(true);
	}
	
	public static MainFrame getInstance()
	{
		return INSTANCE;
	}
}
