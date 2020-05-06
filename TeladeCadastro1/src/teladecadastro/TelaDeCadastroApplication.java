package teladecadastro;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDeCadastroApplication {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastroApplication window = new TelaDeCadastroApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaDeCadastroApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new BorderLayout());
		
		JLabel titulo = new JLabel("<html><h1>Cadastro de Produtos</h1></html>");
		titulo.setHorizontalAlignment (JLabel.CENTER);
		frame.getContentPane().add(titulo, BorderLayout.NORTH);
		
		TelaDeEntrada telaDeEntrada = new TelaDeEntrada();
		frame.getContentPane().add(telaDeEntrada);
		
		
	    
		
		
		
		
		
		
		
		
	}

}