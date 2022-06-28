package br.com.kliemann.pav;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {
        
        /*
        Crie uma classe que tenha um vetor de inteiros de 10 posições e mostre a soma total dos elementos.
        */
        
        int[] vetor = new int[10];
        for(int i=0; i<vetor.length; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º número para somar:"));
            vetor[i] = num;
        }
        
        int soma = 0;
        for(int i=0; i<vetor.length; i++) {
            soma += vetor[i];
        }
        
        JOptionPane.showMessageDialog(null, "A soma total dos números do vetor é: " + soma);

    }
    
}
