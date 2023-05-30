package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup btnGroupBoje = new ButtonGroup();
	JLabel lblCrvena;
	JLabel lblPlava;
	JLabel lblZuta;
	DefaultListModel<String> dlm = new DefaultListModel<String>();
	private JTextField txtDodatneBoje;
	private JList listBoje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
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
	public FrmTest() {
		setTitle("Frame test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		JToggleButton tglbtnCrvena = new JToggleButton("Crvena boja");
		tglbtnCrvena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCrvena.setForeground(Color.red);
				lblPlava.setForeground(Color.black);
				lblZuta.setForeground(Color.black);
				dlm.addElement(lblCrvena.getText());
			}
		});
		btnGroupBoje.add(tglbtnCrvena);
		GridBagConstraints gbc_tglbtnCrvena = new GridBagConstraints();
		gbc_tglbtnCrvena.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCrvena.gridx = 0;
		gbc_tglbtnCrvena.gridy = 0;
		pnlCenter.add(tglbtnCrvena, gbc_tglbtnCrvena);
		
		lblCrvena = new JLabel("Crvena");
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.anchor = GridBagConstraints.WEST;
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 0;
		pnlCenter.add(lblCrvena, gbc_lblCrvena);
		
		JToggleButton tglbtnPlava = new JToggleButton("Plava boja");
		tglbtnPlava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPlava.setForeground(Color.blue);
				lblCrvena.setForeground(Color.black);
				lblZuta.setForeground(Color.black);
				dlm.addElement(lblPlava.getText());
			}
		});
		btnGroupBoje.add(tglbtnPlava);
		GridBagConstraints gbc_tglbtnPlava = new GridBagConstraints();
		gbc_tglbtnPlava.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPlava.gridx = 0;
		gbc_tglbtnPlava.gridy = 1;
		pnlCenter.add(tglbtnPlava, gbc_tglbtnPlava);
		
		lblPlava = new JLabel("Plava");
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.anchor = GridBagConstraints.WEST;
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 1;
		pnlCenter.add(lblPlava, gbc_lblPlava);
		
		JToggleButton tglbtnZuta = new JToggleButton("Zuta boja");
		tglbtnZuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPlava.setForeground(Color.black);
				lblCrvena.setForeground(Color.black);
				lblZuta.setForeground(Color.yellow);
				dlm.addElement(lblZuta.getText());
			}
		});
		btnGroupBoje.add(tglbtnZuta);
		GridBagConstraints gbc_tglbtnZuta = new GridBagConstraints();
		gbc_tglbtnZuta.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnZuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnZuta.gridx = 0;
		gbc_tglbtnZuta.gridy = 2;
		pnlCenter.add(tglbtnZuta, gbc_tglbtnZuta);
		
		lblZuta = new JLabel("Zuta");
		GridBagConstraints gbc_lblZuta = new GridBagConstraints();
		gbc_lblZuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuta.anchor = GridBagConstraints.WEST;
		gbc_lblZuta.gridx = 1;
		gbc_lblZuta.gridy = 2;
		pnlCenter.add(lblZuta, gbc_lblZuta);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		pnlCenter.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblDodatneBoje = new JLabel("Dodatna boja");
		GridBagConstraints gbc_lblDodatneBoje = new GridBagConstraints();
		gbc_lblDodatneBoje.insets = new Insets(0, 0, 5, 0);
		gbc_lblDodatneBoje.gridx = 0;
		gbc_lblDodatneBoje.gridy = 0;
		panel.add(lblDodatneBoje, gbc_lblDodatneBoje);
		
		JComboBox<String> cmbDodatneBoje = new JComboBox<String>();
		cmbDodatneBoje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(cmbDodatneBoje.getSelectedItem().toString());
				switch (cmbDodatneBoje.getSelectedItem().toString()) {
				case "Zelena":
					lblDodatneBoje.setForeground(Color.green);
					break;
				case "Narandzasta":
					lblDodatneBoje.setForeground(Color.orange);
					break;
				case "Ljubicasta":
					lblDodatneBoje.setForeground(Color.magenta);
					break;
				default:
					break;
				}
			}
		});
		cmbDodatneBoje.setModel(new DefaultComboBoxModel<String>(new String[] {"Zelena", "Narandzasta", "Ljubicasta"}));
		GridBagConstraints gbc_cmbDodatneBoje = new GridBagConstraints();
		gbc_cmbDodatneBoje.insets = new Insets(0, 0, 5, 0);
		gbc_cmbDodatneBoje.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbDodatneBoje.gridx = 0;
		gbc_cmbDodatneBoje.gridy = 1;
		panel.add(cmbDodatneBoje, gbc_cmbDodatneBoje);
		
		txtDodatneBoje = new JTextField();
		txtDodatneBoje.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					dlm.addElement(txtDodatneBoje.getText());
					txtDodatneBoje.setText("");
				}
			}
		});
		GridBagConstraints gbc_txtDodatneBoje = new GridBagConstraints();
		gbc_txtDodatneBoje.insets = new Insets(0, 0, 5, 0);
		gbc_txtDodatneBoje.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDodatneBoje.gridx = 0;
		gbc_txtDodatneBoje.gridy = 2;
		panel.add(txtDodatneBoje, gbc_txtDodatneBoje);
		txtDodatneBoje.setColumns(10);
		
		JButton btnDodajBoju = new JButton("Dodaj boju");
		btnDodajBoju.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgTest dlgTest = new DlgTest();
				dlgTest.setVisible(true);
				
				if(dlgTest.isOk) {
					dlm.addElement(dlgTest.getTxtCrvena().getText() + " "
							+ dlgTest.getTxtZelena().getText() + " "
							+ dlgTest.getTxtPlava().getText());
					
					pnlCenter.setBackground(new Color
							(Integer.parseInt(dlgTest.getTxtCrvena().getText()), 
								Integer.parseInt(dlgTest.getTxtZelena().getText()),
								Integer.parseInt(dlgTest.getTxtPlava().getText())));
				}
				
			}
		});
		GridBagConstraints gbc_btnDodajBoju = new GridBagConstraints();
		gbc_btnDodajBoju.insets = new Insets(0, 0, 5, 0);
		gbc_btnDodajBoju.gridx = 0;
		gbc_btnDodajBoju.gridy = 4;
		panel.add(btnDodajBoju, gbc_btnDodajBoju);
		
		JButton btnIzmeniBoju = new JButton("Izmeni boju");
		btnIzmeniBoju.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int index = listBoje.getSelectedIndex();
					String selektovaniElement = 
							dlm.getElementAt(index).toString();
					String[] split = selektovaniElement.split(" ");
					
					DlgTest dlg = new DlgTest();
					dlg.getTxtCrvena().setText(split[0]);
					dlg.getTxtZelena().setText(split[1]);
					dlg.getTxtPlava().setText(split[2]);
					dlg.setVisible(true);
					
					if(dlg.isOk) {
						dlm.removeElementAt(index);
						dlm.add(index, dlg.getTxtCrvena().getText() + " "
								+ dlg.getTxtZelena().getText() + " "
								+ dlg.getTxtPlava().getText());
						
						pnlCenter.setBackground(new Color
								(Integer.parseInt(dlg.getTxtCrvena().getText()), 
									Integer.parseInt(dlg.getTxtZelena().getText()),
									Integer.parseInt(dlg.getTxtPlava().getText())));
					}
				} catch (IndexOutOfBoundsException e1) {
					JOptionPane.showMessageDialog(null, "Morate selektovati boju!");
				}
			}
		});
		GridBagConstraints gbc_btnIzmeniBoju = new GridBagConstraints();
		gbc_btnIzmeniBoju.gridx = 0;
		gbc_btnIzmeniBoju.gridy = 5;
		panel.add(btnIzmeniBoju, gbc_btnIzmeniBoju);
		
		JScrollPane scrollPaneBoje = new JScrollPane();
		GridBagConstraints gbc_scrollPaneBoje = new GridBagConstraints();
		gbc_scrollPaneBoje.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneBoje.gridx = 2;
		gbc_scrollPaneBoje.gridy = 3;
		pnlCenter.add(scrollPaneBoje, gbc_scrollPaneBoje);
		
		listBoje = new JList();
		scrollPaneBoje.setViewportView(listBoje);
		listBoje.setModel(dlm);
		
		JButton btnKlikni = new JButton("Klikni me");
		btnKlikni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Antistres dugme :)",
						"Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		contentPane.add(btnKlikni, BorderLayout.SOUTH);
	}

}
