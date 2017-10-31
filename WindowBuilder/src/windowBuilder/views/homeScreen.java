package windowBuilder.views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox; 
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.UnknownHostException;

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
import javax.swing.JSlider;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.bensherman.rtlsdrdjava.tcpcli.TcpClient;

import javax.swing.JEditorPane;
//import com.bensherman.rtlsdrdjava.tcpcli.TcpClient;

public class homeScreen extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	private TcpClient tcpClient;
	private Thread tcpClientThread; 
	
	//Creates String for execute method
	private String deviceIndex;
	private String enableOption;
	private String frequency;
	private String modulationMode;
	private String overSampling;
	private String ppmError;
	private String sampleRate;
	private String squelchDelay;
	private String squelch;
	private String resampleRate;
	private String atanMath;
	private String gain;
	private String volume;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homeScreen frame = new homeScreen();
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
	public homeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JFormattedTextField freqDisplay = 	new JFormattedTextField();
		freqDisplay.setEditable(false);
		freqDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		freqDisplay.setForeground(new Color(255, 250, 250));
		freqDisplay.setBackground(new Color(0, 0, 0));
		freqDisplay.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 42));
		freqDisplay.setText("Frequency");
		
		JFormattedTextField gainField = new JFormattedTextField();
		gainField.setEditable(false);
		
		JFormattedTextField volField = new JFormattedTextField();
		volField.setEditable(false);
		
		JFormattedTextField squField = new JFormattedTextField();
		squField.setEditable(false);
		
		JSlider gainSlider = new JSlider();
		gainSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				double percentage = (double)gainSlider.getValue()/100;
				double gainPercent = Math.round(49.6 * percentage * 100) / 100; 
				gainField.setText("" + gainPercent);
				gain = gainField.getText();
			}
		});
		gainSlider.setBackground(new Color(105, 105, 105));
		gainSlider.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		
		JSlider volSlider = new JSlider();
		volSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				volField.setText("" + volSlider.getValue());
				volume = volField.getText();
			}
		});
		volSlider.setBackground(new Color(105, 105, 105));
		volSlider.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JSlider squSlider = new JSlider();
		squSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				squField.setText("" + squSlider.getValue());
				squelch = squField.getText();
			}
		});
		squSlider.setBackground(new Color(105, 105, 105));
		squSlider.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JLabel volLabel = new JLabel("Volume: ");
		volLabel.setForeground(new Color(255, 250, 250));
		volLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JLabel gainLabel = new JLabel("Gain:");
		gainLabel.setForeground(new Color(255, 250, 250));
		
		JLabel squLabel = new JLabel("Squelch:");
		squLabel.setForeground(new Color(255, 250, 250));
		
		JButton btnFrequency = new JButton("Frequency");
		btnFrequency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				freqKeyPad keypad = new freqKeyPad();
				keypad.setVisible(true);
				
				 keypad.addWindowListener(new WindowListener() {
			            public void windowClosed(WindowEvent arg0) {
			                freqDisplay.setText(keypad.returnFreq());
			               frequency = freqDisplay.getText();
			            }
			            public void windowActivated(WindowEvent arg0) {
			            }
			            public void windowClosing(WindowEvent arg0) {
			            }
			            public void windowDeactivated(WindowEvent arg0) {
			            }
			            public void windowDeiconified(WindowEvent arg0) {
			            }
			            public void windowIconified(WindowEvent arg0) {
			            }
			            public void windowOpened(WindowEvent arg0) {
			            }
			        });
				
			}
		});
		
		JFormattedTextField ipDisplay = new JFormattedTextField();
		ipDisplay.setEditable(true);
		
		JButton btnIpAddress = new JButton("IP Address");
		btnIpAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ipKeyPad keypad = new ipKeyPad();
				keypad.setVisible(true);
				
				 keypad.addWindowListener(new WindowListener() {
			            public void windowClosed(WindowEvent arg0) {
			                ipDisplay.setText(keypad.returnip());
			            	 try {
									tcpClient = new TcpClient(keypad.returnip(), TcpClient.RTLSDRD_DEFAULT_TCP_PORT_NUMBER);
					                tcpClientThread = new Thread(tcpClient);
					                tcpClientThread.start();
								} catch (UnknownHostException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
			            }
			            public void windowActivated(WindowEvent arg0) {
			            }
			            public void windowClosing(WindowEvent arg0) {
			            }
			            public void windowDeactivated(WindowEvent arg0) {
			            }
			            public void windowDeiconified(WindowEvent arg0) {
			            }
			            public void windowIconified(WindowEvent arg0) {
			            }
			            public void windowOpened(WindowEvent arg0) {
			            }
			        });
			}
		});
		
		JButton btnExecute = new JButton("Execute");
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Frequency:" + frequency);
				Parameters.FREQUENCY.append(frequency);
				
				System.out.println("Modulation Mode: " + modulationMode);
				Parameters.MODULATION_MODE.append(modulationMode);
				
				System.out.println("Squelch: " + squelch);
				Parameters.SQUELCH_LEVEL.append(squelch);
				
				System.out.println("Gain: "+ gain);
				Parameters.TUNER_GAIN.append(gain);
				
				System.out.println("Volume:" + volume);
				Parameters.VOLUME.append(volume);
				
				Parameters.SAMPLE_RATE.append("2400000");
				Parameters.RESAMPLE_RATE.append("48000");
				
				for (Parameters p : Parameters.values())
		        {
		            for(String s : p.getDameonCallableStrings()){

		                tcpClient.sendToServer(s);
		            }
		           // MainActivity.getTcpClient().sendToServer("EXECUTE");
		            p.resetValues();
		        }
				tcpClient.sendToServer("EXECUTE");	
			}
		});
		
		JButton btnNewButton = new JButton("Sample Rate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		JComboBox modMode = new JComboBox();
		modMode.setModel(new DefaultComboBoxModel(new String[] {"fm", "wbfm", "raw", "am", "usb", "lsb"}));
		modMode.setMaximumRowCount(6);
		modMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modulationMode = modMode.getSelectedItem().toString();
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(freqDisplay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnExecute)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnIpAddress, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnFrequency, Alignment.LEADING)
										.addComponent(modMode, Alignment.LEADING, 0, 93, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(ipDisplay, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
										.addComponent(formattedTextField))))
							.addGap(227))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(squSlider, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
							.addGap(450))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(squLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(squField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(524, Short.MAX_VALUE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(volLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(volField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(520, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(volSlider, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addGap(460))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(gainLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(gainField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(540, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(gainSlider, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addGap(450))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(freqDisplay, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
						.addComponent(ipDisplay, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnFrequency)
							.addGap(9)
							.addComponent(btnIpAddress)))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(volLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(volField, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(volSlider, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(86))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addComponent(modMode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(gainLabel)
								.addComponent(gainField, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(gainSlider, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(103)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(squLabel)
								.addComponent(squField, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(squSlider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnExecute))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}