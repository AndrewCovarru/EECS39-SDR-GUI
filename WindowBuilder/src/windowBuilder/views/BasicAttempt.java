package windowBuilder.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class BasicAttempt extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicAttempt frame = new BasicAttempt();
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
	public BasicAttempt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 269);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JSeparator separator = new JSeparator();
		
		JRadioButton btnNewButton = new JRadioButton("Mode");
		buttonGroup.add(btnNewButton);
		btnNewButton.setForeground(new Color(255, 250, 250));
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		
		JRadioButton btnFrequenc = new JRadioButton("Frequency");
		buttonGroup.add(btnFrequenc);
		btnFrequenc.setForeground(new Color(255, 250, 250));
		btnFrequenc.setBackground(new Color(128, 128, 128));
		btnFrequenc.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		
		JRadioButton btnGainvolume = new JRadioButton("Volume");
		buttonGroup.add(btnGainvolume);
		btnGainvolume.setForeground(new Color(255, 250, 250));
		btnGainvolume.setBackground(new Color(128, 128, 128));
		btnGainvolume.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		
		JRadioButton btnUnits = new JRadioButton("Units");
		buttonGroup.add(btnUnits);
		btnUnits.setForeground(new Color(255, 250, 250));
		btnUnits.setBackground(new Color(128, 128, 128));
		btnUnits.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		
		JButton btnIncrease = new JButton("Increase");
		btnIncrease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIncrease.setBackground(new Color(128, 128, 128));
		btnIncrease.setForeground(new Color(255, 250, 250));
		btnIncrease.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		
		JButton btnDefault = new JButton("Default");
		btnDefault.setForeground(new Color(255, 250, 250));
		btnDefault.setBackground(new Color(128, 128, 128));
		btnDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDefault.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		
		JButton btnDecrease = new JButton("Decrease");
		btnDecrease.setForeground(new Color(255, 250, 250));
		btnDecrease.setBackground(new Color(128, 128, 128));
		btnDecrease.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 11));
		
		JLabel lblNewLabel = new JLabel("Frequency Range (AM, FM, USB, LSB)");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 11));
		
		JLabel lblNetworkStatus = new JLabel("Network Status");
		lblNetworkStatus.setForeground(new Color(255, 250, 250));
		lblNetworkStatus.setFont(new Font("Segoe UI Symbol", Font.BOLD, 11));
		
		JRadioButton btnGain = new JRadioButton("Gain");
		buttonGroup.add(btnGain);
		btnGain.setForeground(new Color(255, 250, 250));
		btnGain.setBackground(new Color(128, 128, 128));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(128, 128, 128));
		comboBox.setForeground(new Color(255, 250, 250));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"WBFM", "AM", "USB", "LSB"}));
		comboBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		comboBox.setMaximumRowCount(4);
		
		JFormattedTextField frmtdtxtfldHelloWorld = new JFormattedTextField();
		frmtdtxtfldHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldHelloWorld.setForeground(new Color(255, 250, 250));
		frmtdtxtfldHelloWorld.setBackground(new Color(0, 0, 0));
		frmtdtxtfldHelloWorld.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 67));
		frmtdtxtfldHelloWorld.setText("92100 Hz\r\n");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(frmtdtxtfldHelloWorld, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnUnits, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
										.addComponent(btnFrequenc, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnGain, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnGainvolume, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
										.addComponent(comboBox, 0, 117, Short.MAX_VALUE)))
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDefault, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(btnDecrease, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(btnIncrease, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
								.addComponent(lblNetworkStatus, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
					.addGap(225))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNetworkStatus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnIncrease)
							.addGap(18)
							.addComponent(btnDefault)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnDecrease))
						.addComponent(frmtdtxtfldHelloWorld, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGainvolume)
						.addComponent(btnNewButton)
						.addComponent(btnFrequenc))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnUnits)
						.addComponent(btnGain, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(300)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
