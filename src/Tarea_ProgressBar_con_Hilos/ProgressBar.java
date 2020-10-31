package Tarea_ProgressBar_con_Hilos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgressBar extends JFrame {

	private JPanel contentPane;
	JProgressBar pbrBarra;
	Hilo miHilo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressBar frame = new ProgressBar();
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
	public ProgressBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				miHilo = new Hilo(pbrBarra);
				Thread miThread = new Thread(miHilo);
				miThread.start();
			}
		});
		btnComenzar.setBounds(49, 122, 129, 55);
		contentPane.add(btnComenzar);
		
		pbrBarra = new JProgressBar();
		pbrBarra.setBounds(25, 61, 183, 39);
		contentPane.add(pbrBarra);
	}
	
	
}
