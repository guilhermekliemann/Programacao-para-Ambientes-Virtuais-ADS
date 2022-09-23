package br.kliemann.menupav.exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MediaNotas extends JFrame{
    
    public MediaNotas() {
    
        super("Média Notas");
        
        JLabel lblNota1 = new JLabel("Nota 1");
        lblNota1.setBounds(10, 5, 80, 20);
        add(lblNota1);
        
        JLabel lblNota2 = new JLabel("Nota 2");
        lblNota2.setBounds(110, 5, 80, 20);
        add(lblNota2);
        
        JLabel lblNota3 = new JLabel("Nota 3");
        lblNota3.setBounds(210, 5, 80 ,20);
        add(lblNota3);
        
        JLabel lblNota4 = new JLabel("Nota 4");
        lblNota4.setBounds(310, 5, 80, 20);
        add(lblNota4);
        
        JTextField nota1 = new JTextField();
        nota1.setBounds(10, 25, 80, 20);
        add(nota1);
        
        JTextField nota2 = new JTextField();
        nota2.setBounds(110, 25, 80, 20);
        add(nota2);
        
        JTextField nota3 = new JTextField();
        nota3.setBounds(210, 25, 80, 20);
        add(nota3);
        
        JTextField nota4 = new JTextField();
        nota4.setBounds(310, 25, 80, 20);
        add(nota4);
        
        JButton botao = new JButton();
        botao.setText("Calcule Agora");
        botao.setBounds(100, 60, 200, 50);
        add(botao);
        
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Double n1 = Double.valueOf(nota1.getText());
                Double n2 = Double.valueOf(nota2.getText());
                Double n3 = Double.valueOf(nota3.getText());
                Double n4 = Double.valueOf(nota4.getText());
                Double media = (n1 + n2 + n3 + n4) / 4;
                
                JOptionPane.showMessageDialog(null, "A média é: " + media.toString());
        
            }
        });
        
        setLayout(null);
        setSize(415, 200);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
}
