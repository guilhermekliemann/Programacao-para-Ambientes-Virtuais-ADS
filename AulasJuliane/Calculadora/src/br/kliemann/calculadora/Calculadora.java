package br.kliemann.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
    
    public static void main(String[] args) {
        
        new Calculadora();
        
    }
    
    private int leitura;
    private int memoria;
    private char operacao;
    
    public Calculadora() {
        
        super("Calculadora");
        setVisible(true);
        setLayout(null);
        setSize(265, 350);
        
        leitura = 0;
        memoria = 0;
        
        // display
        JTextField display = new JTextField("");
        display.setBounds(10, 10, 231, 50);
        this.add(display);

        // screen buttons
        JButton btnNum7 = new JButton();
        btnNum7.setText("7");
        btnNum7.setBounds(10, 70, 50, 50);
        this.add(btnNum7);
        
        JButton btnNum8 = new JButton();
        btnNum8.setText("8");
        btnNum8.setBounds(70, 70, 50, 50);
        this.add(btnNum8);
        
        JButton btnNum9 = new JButton();
        btnNum9.setText("9");
        btnNum9.setBounds(130, 70, 50, 50);
        this.add(btnNum9);
        
        JButton btnC = new JButton();
        btnC.setText("C");
        btnC.setBounds(190, 70, 50, 50);
        this.add(btnC);
        
        JButton btnNum4 = new JButton();
        btnNum4.setText("4");
        btnNum4.setBounds(10, 130, 50, 50);
        this.add(btnNum4);
        
        JButton btnNum5 = new JButton();
        btnNum5.setText("5");
        btnNum5.setBounds(70, 130, 50, 50);
        this.add(btnNum5);
        
        JButton btnNum6 = new JButton();
        btnNum6.setText("6");
        btnNum6.setBounds(130, 130, 50, 50);
        this.add(btnNum6);
        
        JButton btnMult = new JButton();
        btnMult.setText("*");
        btnMult.setBounds(190, 130, 50, 50);
        this.add(btnMult);
        
        JButton btnNum1 = new JButton();
        btnNum1.setText("1");
        btnNum1.setBounds(10, 190, 50, 50);
        this.add(btnNum1);
        
        JButton btnNum2 = new JButton();
        btnNum2.setText("2");
        btnNum2.setBounds(70, 190, 50, 50);
        this.add(btnNum2);
        
        JButton btnNum3 = new JButton();
        btnNum3.setText("3");
        btnNum3.setBounds(130, 190, 50, 50);
        this.add(btnNum3);
        
        JButton btnDiv = new JButton();
        btnDiv.setText("/");
        btnDiv.setBounds(190, 190, 50, 50);
        this.add(btnDiv);
        
        JButton btnNum0 = new JButton();
        btnNum0.setText("0");
        btnNum0.setBounds(10, 250, 50, 50);
        this.add(btnNum0);
        
        JButton btnSub = new JButton();
        btnSub.setText("-");
        btnSub.setBounds(70, 250, 50, 50);
        this.add(btnSub);
        
        JButton btnSum = new JButton();
        btnSum.setText("+");
        btnSum.setBounds(130, 250, 50, 50);
        this.add(btnSum);
        
        JButton btnResult = new JButton();
        btnResult.setText("=");
        btnResult.setBounds(190, 250, 50, 50);
        this.add(btnResult);
        
        // action of the buttons
        btnNum7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 7;
                display.setText(display.getText() + "7");
            }
        });
        
        btnNum8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 8;
                display.setText(display.getText() + "8");
            }
        });
        
        btnNum9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 9;
                display.setText(display.getText() + "9");
            }
        });
        
        btnNum4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 4;
                display.setText(display.getText() + "4");
            }
        });
        
        btnNum5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 5;
                display.setText(display.getText() + "5");
            }
        });
        
        btnNum6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 6;
                display.setText(display.getText() + "6");
            }
        });
        
        btnNum1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 1;
                display.setText(display.getText() + "1");
            }
        });
        
        btnNum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 2;
                display.setText(display.getText() + "2");
            }
        });
        
        btnNum3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 3;
                display.setText(display.getText() + "3");
            }
        });
        
        btnNum0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura += 0;
                display.setText(display.getText() + "0");
            }
        });
        
        // action operation buttons
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " + ");
            }
        });
        
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '-';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " - ");
            }
        });
        
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '*';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " * ");
            }
        });
        
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '/';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " / ");
            }
        });
        
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = 'C';
                leitura = 0;
                memoria = 0;
                display.setText("");
            }
        });
        
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operacao) {
                    case '+': 
                        memoria += leitura;
                        leitura = 0;
                        break;
                    case '-':
                        memoria -= leitura;
                        leitura = 0;
                        break;
                    case '/':
                        memoria /= leitura;
                        leitura = 0;
                        break;
                    case '*':
                        memoria *= leitura;
                        leitura = 0;
                        break;
                }
                display.setText(display.getText() + " = " + memoria);
            }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}