package br.kliemann.menupav.cliente;

import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class TelaCliente {
    
    public TelaCliente() {
        
        createAndShowGUI();
        
    }
   
    private static void createAndShowGUI() {
        
        JFrame janelaCadastroCliente = new JFrame("Cadastrar Cliente");
        janelaCadastroCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaCadastroCliente.setLocationRelativeTo(null);
        
        janelaCadastroCliente.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
        
        Label labelNome = new Label("Nome:");
        JTextField textNome = new JTextField();
        janelaCadastroCliente.getContentPane().add(labelNome);
        janelaCadastroCliente.getContentPane().add(textNome);
        
        Label labelCPF = new Label("CPF:");
        JTextField textCPF = new JTextField();
        janelaCadastroCliente.getContentPane().add(labelCPF);
        janelaCadastroCliente.getContentPane().add(textCPF);
        
        Label labelDtNasc = new Label("Data Nascimento:");
        JTextField textDtNasc = new JTextField();
        janelaCadastroCliente.getContentPane().add(labelDtNasc);
        janelaCadastroCliente.getContentPane().add(textDtNasc);
        
        Label labelIdade = new Label("Idade:");
        JTextField textIdade = new JTextField();
        janelaCadastroCliente.getContentPane().add(labelIdade);
        janelaCadastroCliente.getContentPane().add(textIdade);
        
        JButton btnNovo = new JButton("Novo Cliente");
        janelaCadastroCliente.getContentPane().add(btnNovo);
        janelaCadastroCliente.getContentPane().add(new Label());
        
        janelaCadastroCliente.setSize(450, 300);
        janelaCadastroCliente.setVisible(true);
        janelaCadastroCliente.setLocationRelativeTo(null);
        
    }
    
}
