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

public class ipKeyPad extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ipKeyPad dialog = new ipKeyPad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String ip;

	/**
	 * Create the dialog.
	 */	
	public String returnip() {
		return ip; 
	}
	public ipKeyPad() {

		setBounds(100, 100, 275, 238);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(105, 105, 105));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JFormattedTextField ipField = new JFormattedTextField();
		ipField.setEditable(false);
		JLabel lblipuency = new JLabel("IP:");
		lblipuency.setForeground(new Color(255, 250, 250));
		lblipuency.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("1");
				else
					ipField.setText(ipField.getText() + "1");
			}
		});
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("2");
				else
					ipField.setText(ipField.getText() + "2");
			}
		});
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("3");
				else
					ipField.setText(ipField.getText() + "3");
			}
		});
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("4");
				else
					ipField.setText(ipField.getText() + "4");
			}
		});
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("5");
				else
					ipField.setText(ipField.getText() + "5");
			}
		});
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("6");
				else
					ipField.setText(ipField.getText() + "6");
			}
		});
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("7");
				else
					ipField.setText(ipField.getText() + "7");
			}
		});
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("8");
				else
					ipField.setText(ipField.getText() + "8");
			}
		});
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setValue("9");
				else
					ipField.setText(ipField.getText() + "9");
			}
		});
		JButton num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText("0");
				else
					ipField.setText(ipField.getText() + "0");
			}
		});
		JButton numPeriod = new JButton(".");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ipField.getText() == null)
					ipField.setText(".");
				else
					ipField.setText(ipField.getText() + ".");
			}
		});
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(num7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(num8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(num9))
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addGap(6)
								.addComponent(lblipuency)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ipField))
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(num1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num3)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num0)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(num4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(num5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(num6)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(numPeriod)))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblipuency)
						.addComponent(ipField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(num1)
						.addComponent(num0)
						.addComponent(num2)
						.addComponent(num3))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(num4)
						.addComponent(numPeriod, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(num5)
						.addComponent(num6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(num7)
						.addComponent(num8)
						.addComponent(num9))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(105, 105, 105));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ip = ipField.getText();
						dispose();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	} 
	
}
