package br.com.kliemann.pav;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        
        /*
        Crie um classe com um vetor de inteiros de 10 posições e solicite ao usuário para inserir os elementos do 
        vetor, mostre os elementos no final.
        */

        int[] vetor = new int[10];
        for(int i=0; i<vetor.length; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor:"));
            vetor[i] = num;
        }
        
        String msg = "";
        for(int i=0; i<vetor.length; i++) {
            if(i == vetor.length-1) {
                msg = msg + vetor[i] + ".";
            } else {
                msg = msg + vetor[i] + " - ";
            }
        }
        
        JOptionPane.showMessageDialog(null, msg);

    }
    
}
