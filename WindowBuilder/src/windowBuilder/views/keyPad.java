package windowBuilder.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;

public class keyPad extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public String field;
	/**
	 * Create the dialog.
	 */	
	public String returnField() {
		return field; 
	}
	
	
	public keyPad(String name, String currentValue) {

		setBounds(250, 100, 300, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JFormattedTextField entryField = new JFormattedTextField();
		entryField.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		entryField.setForeground(Color.GREEN);
		entryField.setBackground(Color.BLACK);
		entryField.setText(currentValue);
		JLabel lblField = new JLabel(name);
		lblField.setForeground(Color.GREEN);
		lblField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		
		
		JButton button1 = new JButton("1");
		button1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button1.setForeground(Color.GREEN);
		button1.setBackground(Color.BLACK);
		button1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(entryField.getText() == null)
					entryField.setText("1");
				else
					entryField.setText(entryField.getText() + "1");
			}
		});
		
		JButton button2 = new JButton("2");
		button2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button2.setForeground(Color.GREEN);
		button2.setBackground(Color.BLACK);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("2");
				else
					entryField.setText(entryField.getText() + "2");
			}
		});
		button2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton button3 = new JButton("3");
		button3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button3.setForeground(Color.GREEN);
		button3.setBackground(Color.BLACK);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("3");
				else
					entryField.setText(entryField.getText() + "3");
			}
		});
		button3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton button4 = new JButton("4");
		button4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button4.setForeground(Color.GREEN);
		button4.setBackground(Color.BLACK);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("4");
				else
					entryField.setText(entryField.getText() + "4");
			}
		});
		button4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton button7 = new JButton("7");
		button7.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button7.setForeground(Color.GREEN);
		button7.setBackground(Color.BLACK);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("7");
				else
					entryField.setText(entryField.getText() + "7");
			}
		});
		button7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton buttonPeriod = new JButton(".");
		buttonPeriod.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		buttonPeriod.setForeground(Color.GREEN);
		buttonPeriod.setBackground(Color.BLACK);
		buttonPeriod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText(".");
				else
					entryField.setText(entryField.getText() + ".");
				
				
			}
		});
		buttonPeriod.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton button5 = new JButton("5");
		button5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button5.setForeground(Color.GREEN);
		button5.setBackground(Color.BLACK);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("5");
				else
					entryField.setText(entryField.getText() + "5");
			}
		});
		button5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton button8 = new JButton("8");
		button8.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button8.setForeground(Color.GREEN);
		button8.setBackground(Color.BLACK);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("8");
				else
					entryField.setText(entryField.getText() + "8");
			}
		});
		button8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton button0 = new JButton("0");
		button0.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button0.setForeground(Color.GREEN);
		button0.setBackground(Color.BLACK);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("0");
				else
					entryField.setText(entryField.getText() + "0");
			}
		});
		button0.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton button6 = new JButton("6");
		button6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button6.setForeground(Color.GREEN);
		button6.setBackground(Color.BLACK);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("6");
				else
					entryField.setText(entryField.getText() + "6");
			}
		});
		button6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton button9 = new JButton("9");
		button9.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		button9.setForeground(Color.GREEN);
		button9.setBackground(Color.BLACK);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() == null)
					entryField.setText("9");
				else
					entryField.setText(entryField.getText() + "9");
			}
		});
		button9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		
		JButton buttonBack = new JButton("<");
		buttonBack.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
		buttonBack.setForeground(Color.GREEN);
		buttonBack.setBackground(Color.BLACK);
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entryField.getText() != null) {
					String pastField = entryField.getText();
					String newField = pastField.substring(0, pastField.length() - 1);
					entryField.setText(newField);					
				}
			}
		});
		buttonBack.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(button4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(button6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(button7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(button8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(buttonPeriod, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(button0, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buttonBack, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(lblField, GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(entryField, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
									.addGap(8))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(button1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addGap(14)
									.addComponent(button2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(button3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
							.addGap(27))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(entryField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(button3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(button6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(button7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttonPeriod, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(buttonBack, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addComponent(button0, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.BLACK);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
				okButton.setForeground(Color.GREEN);
				okButton.setBackground(Color.BLACK);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						field = entryField.getText();
						dispose();
						
					}
				});
				
				JButton btnClear = new JButton("Clear");
				btnClear.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
				btnClear.setForeground(Color.GREEN);
				btnClear.setBackground(Color.BLACK);
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						entryField.setText("");
					}
				});
				
				JButton btnDefault = new JButton("Default");
				btnDefault.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
				btnDefault.setForeground(Color.GREEN);
				btnDefault.setBackground(Color.BLACK);
				btnDefault.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						entryField.setText("default");
					}
				});
				buttonPane.add(btnDefault);
				buttonPane.add(btnClear);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	} 
}
