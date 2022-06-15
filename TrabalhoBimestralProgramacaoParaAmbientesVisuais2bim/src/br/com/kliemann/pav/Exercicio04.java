package br.com.kliemann.pav;

import javax.swing.JOptionPane;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        /*
        Crie uma aplicação para informar 10 nomes e mostre todos os nomes no final.
        */
        
        String[] vetor = new String[10];
        for(int i=0; i<vetor.length; i++) {
            String nomes = JOptionPane.showInputDialog("Digite o " + (i+1) + "º nome:");
            vetor[i] = nomes;
        }

        String msg = "Lista de nomes:\n";
        for(int i=0; i<vetor.length; i++) {
            msg += (i+1) + " - " + vetor[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg);
        
    }

}
