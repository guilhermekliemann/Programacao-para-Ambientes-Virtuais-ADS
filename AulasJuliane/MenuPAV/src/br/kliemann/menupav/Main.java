package br.kliemann.menupav;

import br.kliemann.menupav.cliente.TelaCliente;
import br.kliemann.menupav.exercicios.Calculadora;
import br.kliemann.menupav.exercicios.MediaNotas;
import br.kliemann.menupav.exercicios.TextDemo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
Guilherme Libano Kliemann
RA: 00225869
*/

public class Main {

    public static void main(String[] args) {
        
        createAndShowGUI();
        
    }
    
    private static void createAndShowGUI() {
        
        // criando a tela
        JFrame janelaPrincipal = new JFrame("Menu PAV");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setLocationRelativeTo(null);
        
        // adiciona componentes
        janelaPrincipal.setJMenuBar(createMenuBar());
        
        // display the window
        janelaPrincipal.setSize(400, 200);
        janelaPrincipal.setVisible(true);
        janelaPrincipal.setLocationRelativeTo(null);
        
    }
    
    private static JMenuBar createMenuBar() {
        
        JMenuBar menuBar = new JMenuBar();
        
        // menu exercicios
        JMenu menuExercicios = new JMenu("Exercícios");
        menuBar.add(menuExercicios);
        
        JMenuItem calculadora = new JMenuItem("Calculadora");
        calculadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Calculadora();
            }
        });
        menuExercicios.add(calculadora);
        
        JMenuItem textdemo = new JMenuItem("TextDemo");
        textdemo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TextDemo();
            }
        });
        menuExercicios.add(textdemo);
        
        JMenuItem mediaNotas = new JMenuItem("Média Notas");
        mediaNotas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MediaNotas();
            }
        });
        menuExercicios.add(mediaNotas);
        
        // menu mensagens
        JMenu mensagens = new JMenu("Mensagens");
        menuBar.add(mensagens);
        
        JMenuItem mensagem1 = new JMenuItem("PLAIN_MESSAGE");
        mensagem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "PLAIN_MESSAGE", " ", JOptionPane.PLAIN_MESSAGE);
            }
        });
        mensagens.add(mensagem1);
        
        JMenuItem mensagem2 = new JMenuItem("YES_NO_OPTION");
        mensagem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "YES_NO_OPTION", " ", JOptionPane.YES_NO_OPTION);
            }
        });
        mensagens.add(mensagem2);
        
        JMenuItem mensagem3 = new JMenuItem("YES_NO_CANCEL_OPTION");
        mensagem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "YES_NO_CANCEL_OPTION", " ", JOptionPane.YES_NO_CANCEL_OPTION);
            }
        });
        mensagens.add(mensagem3);
        
        JMenuItem mensagem4 = new JMenuItem("QUESTION_MESSAGE");
        mensagem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "QUESTION_MESSAGE", " ", JOptionPane.QUESTION_MESSAGE);
            }
        });
        mensagens.add(mensagem4);
        
        // menu cadastro
        JMenu menuCadastro = new JMenu("Cadastro");
        menuBar.add(menuCadastro);
        
        JMenu menuCliente = new JMenu("Cliente");
        menuCadastro.add(menuCliente);
        
        JMenuItem itemClienteCadastro = new JMenuItem("Cadastrar");
        itemClienteCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaCliente();
            }
        });
        menuCliente.add(itemClienteCadastro);
        
        JMenuItem itemClienteListar = new JMenuItem("Listar");
        itemClienteListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaCliente();
            }
        });
        menuCliente.add(itemClienteListar);
        
        return menuBar;
        
    }
    
}
