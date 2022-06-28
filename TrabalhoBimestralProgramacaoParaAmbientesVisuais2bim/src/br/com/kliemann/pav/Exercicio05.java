package br.com.kliemann.pav;

import javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main(String[] args) {
        
        /*
        Crie uma aplicação para informar 10 números , remova os números ímpares da lista, e
        no final mostre a lista sem os valores ímpares.
        */
        
        int[] vetor = new int[10];
        for(int i=0; i<vetor.length; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número: "));
            vetor[i] = num;
        }
        
        String msg = "";
        for(int i=0; i<vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                if(i == vetor.length-1) {
                    msg = msg + vetor[i] + ".";
                } else {
                    msg = msg + vetor[i] + " - ";
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Lista de números PAR:\n" + msg);
        
    }
    
}
