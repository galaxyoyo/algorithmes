package galaxyoyo.algorithmes.frames;

import galaxyoyo.algorithmes.funcs.VarList;
import galaxyoyo.algorithmes.funcs.VarList.Var;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.google.gson.Gson;

@SuppressWarnings("serial")
public class NewVarDialog extends JDialog
{
	private JTextField keyTextField;
	private JTextField valueTextField;
	private JLabel lblTypeDeVariable;
	private JComboBox<String> typeComboBox;
	private JLabel lblClasseDeLa;
	private JLabel lblNomDeLa;
	private JTextField classTextField;
	private JLabel lblValeur;
	private JLabel lblNotePour;
	private JLabel lblExsListe;
	private JButton btnOk;
	private JButton btnAnnuler;
	
	public NewVarDialog(Component parent)
	{
		setResizable(false);
		setSize(new Dimension(512, 256));
		setLocationRelativeTo(parent);
		setTitle("Ajouter une nouvelle variable");
		setAlwaysOnTop(true);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[] {0, 0, 0, 0, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		getContentPane().setLayout(gridBagLayout);
		
		lblTypeDeVariable = new JLabel("Type de variable :");
		GridBagConstraints gbc_lblTypeDeVariable = new GridBagConstraints();
		gbc_lblTypeDeVariable.insets = new Insets(0, 0, 5, 5);
		gbc_lblTypeDeVariable.anchor = GridBagConstraints.EAST;
		gbc_lblTypeDeVariable.gridx = 0;
		gbc_lblTypeDeVariable.gridy = 0;
		getContentPane().add(lblTypeDeVariable, gbc_lblTypeDeVariable);
		
		typeComboBox = new JComboBox<String>();
		typeComboBox.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent event)
			{
				if (typeComboBox.getSelectedIndex() == typeComboBox.getItemCount() - 1)
				{
					lblClasseDeLa.setVisible(true);
					classTextField.setVisible(true);
				}
				else
				{
					lblClasseDeLa.setVisible(false);
					classTextField.setVisible(false);
				}
			}
		});
		typeComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Nombre entier", "Nombre décimal", "Gros nombre entier", "Booléen", "Caractère", "Chaîne de caractères", "Liste", "HashMap", "Autre ..."}));
		GridBagConstraints gbc_typeComboBox = new GridBagConstraints();
		gbc_typeComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_typeComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_typeComboBox.gridx = 1;
		gbc_typeComboBox.gridy = 0;
		getContentPane().add(typeComboBox, gbc_typeComboBox);
		
		lblClasseDeLa = new JLabel("Classe de la variable :");
		lblClasseDeLa.setVisible(false);
		GridBagConstraints gbc_lblClasseDeLa = new GridBagConstraints();
		gbc_lblClasseDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblClasseDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblClasseDeLa.gridx = 0;
		gbc_lblClasseDeLa.gridy = 1;
		getContentPane().add(lblClasseDeLa, gbc_lblClasseDeLa);
		
		classTextField = new JTextField();
		classTextField.setVisible(false);
		classTextField.setText("java.lang.Integer");
		GridBagConstraints gbc_classTextField = new GridBagConstraints();
		gbc_classTextField.insets = new Insets(0, 0, 5, 0);
		gbc_classTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_classTextField.gridx = 1;
		gbc_classTextField.gridy = 1;
		getContentPane().add(classTextField, gbc_classTextField);
		classTextField.setColumns(10);
		
		lblNomDeLa = new JLabel("Nom de la variable :");
		GridBagConstraints gbc_lblNomDeLa = new GridBagConstraints();
		gbc_lblNomDeLa.anchor = GridBagConstraints.EAST;
		gbc_lblNomDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomDeLa.gridx = 0;
		gbc_lblNomDeLa.gridy = 2;
		getContentPane().add(lblNomDeLa, gbc_lblNomDeLa);
		
		keyTextField = new JTextField();
		GridBagConstraints gbc_keyTextField = new GridBagConstraints();
		gbc_keyTextField.insets = new Insets(0, 0, 5, 0);
		gbc_keyTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_keyTextField.gridx = 1;
		gbc_keyTextField.gridy = 2;
		getContentPane().add(keyTextField, gbc_keyTextField);
		keyTextField.setColumns(10);
		
		lblValeur = new JLabel("Valeur par défaut :");
		GridBagConstraints gbc_lblValeur = new GridBagConstraints();
		gbc_lblValeur.anchor = GridBagConstraints.EAST;
		gbc_lblValeur.insets = new Insets(0, 0, 5, 5);
		gbc_lblValeur.gridx = 0;
		gbc_lblValeur.gridy = 3;
		getContentPane().add(lblValeur, gbc_lblValeur);
		
		valueTextField = new JTextField();
		GridBagConstraints gbc_valueTextField = new GridBagConstraints();
		gbc_valueTextField.insets = new Insets(0, 0, 5, 0);
		gbc_valueTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_valueTextField.gridx = 1;
		gbc_valueTextField.gridy = 3;
		getContentPane().add(valueTextField, gbc_valueTextField);
		valueTextField.setColumns(10);
		
		lblNotePour = new JLabel("<html><body><em><strong style=\"color: red\">NOTE</strong> : Pour tout objet non nombre ni chaîne de caractères ni booléen, il doit être entré au format JSON.</em></body></html>");
		GridBagConstraints gbc_lblNotePour = new GridBagConstraints();
		gbc_lblNotePour.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNotePour.insets = new Insets(0, 0, 5, 0);
		gbc_lblNotePour.gridwidth = 2;
		gbc_lblNotePour.gridx = 0;
		gbc_lblNotePour.gridy = 4;
		getContentPane().add(lblNotePour, gbc_lblNotePour);
		
		lblExsListe = new JLabel("<html><body>Exs :<br />Liste de nombre : [1, 2, 3, 10, 16777215]<br />HashMap de chaînes : {\"Sens de la vie\":42,\"Sortie\":\"Par là\"}</body></html>");
		GridBagConstraints gbc_lblExsListe = new GridBagConstraints();
		gbc_lblExsListe.insets = new Insets(0, 0, 5, 0);
		gbc_lblExsListe.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblExsListe.gridwidth = 2;
		gbc_lblExsListe.gridx = 0;
		gbc_lblExsListe.gridy = 5;
		getContentPane().add(lblExsListe, gbc_lblExsListe);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Object value;
				try
				{
					if (!keyTextField.getText().matches("[a-zA-Z_0-9]+"))
					{
						throw new IllegalArgumentException("Caractère(s) invalide(s) dans le nom de la variable");
					}
					if (!keyTextField.getText().substring(0, 1).matches("[a-zA-Z_]"))
					{
						throw new IllegalArgumentException("Un nom de variable doît commencer par une lettre ou un underscore");
					}
					switch (typeComboBox.getSelectedIndex())
					{
					case 0 : value = Integer.parseInt(valueTextField.getText()); break;
					case 1 : value = Double.parseDouble(valueTextField.getText()); break;
					case 2 : value = Long.parseLong(valueTextField.getText()); break;
					case 3 : value = Boolean.parseBoolean(valueTextField.getText()); break;
					case 4 :
						if (valueTextField.getText().length() != 1)
							throw new IllegalArgumentException("Il ne doît y avoir qu'un seul caractère");
						value = Character.valueOf(valueTextField.getText().charAt(0)); break;
					case 5 : value = valueTextField.getText(); break;
					case 6 : value = new Gson().fromJson(valueTextField.getText(), ArrayList.class); break;
					case 7 : value = new Gson().fromJson(valueTextField.getText(), HashMap.class); break;
					case 8 : value = new Gson().fromJson(valueTextField.getText(), Class.forName(classTextField.getText()));
					default : throw new IndexOutOfBoundsException();
					}
					VarList.getList().add(new Var<Object>(keyTextField.getText(), value));
					dispose();
				}
				catch (Throwable t)
				{
					JOptionPane.showMessageDialog(NewVarDialog.this, "Oups ! Il y a une erreur : " + t.getClass() + " : '" + t.getMessage() + "'");
					return;
				}
			}
		});
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.insets = new Insets(0, 0, 5, 5);
		gbc_btnOk.gridx = 0;
		gbc_btnOk.gridy = 6;
		getContentPane().add(btnOk, gbc_btnOk);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(0, 0, 5, 0);
		gbc_btnAnnuler.gridx = 1;
		gbc_btnAnnuler.gridy = 6;
		getContentPane().add(btnAnnuler, gbc_btnAnnuler);
		
		setVisible(true);
	}
}
