package br.kliemann.menupav.exercicios;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextDemo {
    
    protected static JTextField textField;
    protected static JTextArea textArea;
    private static String newLine = "\n";
    static String ICONE;
    
    public TextDemo() {
        
        JFrame frame = new JFrame("Text Demo");
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        
        frame.getContentPane().add(textDemo());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }
    
    public static JPanel textDemo() {
        
        JPanel jPanel = new JPanel(new GridBagLayout());
        
        textField = new JTextField();
        
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textArea.append(text + newLine);
                
                if(textField.getText().equalsIgnoreCase("verde")) {
                    JOptionPane.showMessageDialog(null, "Você quis dizer ovos verdes?", " ", JOptionPane.PLAIN_MESSAGE);
                } else if(textField.getText().equalsIgnoreCase("teste")) {
                    JOptionPane.showMessageDialog(null, "Teste em produção", " ", JOptionPane.WARNING_MESSAGE);
                } else if(textField.getText().equalsIgnoreCase("batatinha")) {
                    Object[] options = {"Sim", "Nem pensar", "Não peguei a referência"};
                    
                    int op = JOptionPane.showOptionDialog(null, "Vamos jogar batatinha frita 123?", " ",
                             JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
                    
                    switch(op) {
                        case 0:
                            textArea.append("Sim" + newLine);
                            break;
                        case 1:
                            textArea.append("Nem pensar" + newLine);
                            break;
                        case 2:
                            textArea.append("Não peguei a referência" + newLine);
                            break;
                    }
                }
                
                textField.setText(null);
                textField.selectAll();
            }
        });
        
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        jPanel.add(textField, c);
        
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        jPanel.add(scrollPane, c);
        
        return jPanel;
    }
    
}
