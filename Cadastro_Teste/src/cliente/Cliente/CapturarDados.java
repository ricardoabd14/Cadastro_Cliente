package cliente.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapturarDados extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nomeField;
    private JTextField cpfField;
    private JTextField generoField;
    private JTextField idadeField;
    private JButton submitButton;

    public CapturarDados() {
       
        setTitle("Captura de Dados");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Layout
        setLayout(new GridLayout(5, 2));

       
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField();

        JLabel generoLabel = new JLabel("Gênero:");
        generoField = new JTextField();

        JLabel idadeLabel = new JLabel("Idade:");
        idadeField = new JTextField();

        submitButton = new JButton("Submit");

        
        add(nomeLabel);
        add(nomeField);
        add(cpfLabel);
        add(cpfField);
        add(generoLabel);
        add(generoField);
        add(idadeLabel);
        add(idadeField);
        add(new JLabel()); // Placeholder
        add(submitButton);

        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String cpf = cpfField.getText();
                String genero = generoField.getText();
                int idade = Integer.parseInt(idadeField.getText());

               
                JOptionPane.showMessageDialog(null, "Dados Capturados:\n" +
                        "Nome: " + nome + "\n" +
                        "CPF: " + cpf + "\n" +
                        "Gênero: " + genero + "\n" +
                        "Idade: " + idade);
            }
        });
    }

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CapturarDados().setVisible(true);
            }
        });
    }
}
