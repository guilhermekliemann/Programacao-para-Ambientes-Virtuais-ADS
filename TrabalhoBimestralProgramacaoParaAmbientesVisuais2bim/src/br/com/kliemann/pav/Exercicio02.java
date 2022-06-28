 package br.com.kliemann.pav;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        
        /*
        Crie uma classe que tenha um vetor de inteiros de 20 posições, solicite ao usuário
        informar os valores e após solicite ao usuário informar um valor para ser pesquisado,
        depois mostre o valor informado e sua posição;
        */
        
        int[] vetor = new int[20];
        for(int i=0; i<vetor.length; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor:"));
            vetor[i] = num;
        }
        
        int x = -1;
        while(x != 0) {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para pesquisar no vetor(sair = 0): "));
            
            String msg = "O número " + x + " não foi encontrado no vetor!";
            for(int i=0; i<vetor.length; i++) {
                if(x == vetor[i]) {
                    msg = "O número " + vetor[i] + " foi encontrado na posição " + i + " do vetor!";
                }
            }

            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
   
}
