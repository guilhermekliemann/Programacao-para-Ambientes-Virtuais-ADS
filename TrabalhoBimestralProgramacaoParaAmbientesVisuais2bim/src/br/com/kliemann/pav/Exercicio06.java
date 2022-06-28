package br.com.kliemann.pav;

import javax.swing.JOptionPane;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        /*
        Crie uma aplicação (classe Java com método main) para armazenar números inteiros em
        uma estrutura de dados Vetor de 50 posições e que forneça ao usuário as seguintes
        opções:
        */
        
        int[] vetor = new int[50];
        
        int opcao = -1;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções:\n\n"
                                                               + "1 – Inserir 50 valores inteiros\n"
                                                               + "2 – Pesquisar um valor inteiro\n"
                                                               + "3 – Mostrar todos os valores\n"
                                                               + "4 – Mostrar o menor e o maior valor\n"
                                                               + "5 – Mostrar o primeiro e o último valor do vetor\n"
                                                               + "6 – Mostrar valores pares\n"
                                                               + "7 – Mostrar valores ímpares\n"
                                                               + "8 – Mostrar soma dos valores\n"
                                                               + "0 - Sair\n"));
            
            if(opcao == 1) {
                inserirValor(vetor);
            }
            if(opcao == 2) {
                pesquisarValor(vetor);
            }
            if(opcao == 3) {
                mostrarTodosValores(vetor);
            }
            if(opcao == 4) {
                mostrarMenorMaior(vetor);
            }
            if(opcao == 5) {
                mostrarPrimeiroUltimo(vetor);
            }
            if(opcao == 6) {
                mostrarPares(vetor);
            }
            if(opcao == 7) {
                mostrarImpares(vetor);
            }
            if(opcao == 8) {
                mostrarSoma(vetor);
            }
            
        } while(opcao != 0);
        
    }
    
    private static void inserirValor(int[] vetor) {
        
        for(int i=0; i<vetor.length; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor:"));
            vetor[i] = num;
        }   
        
        JOptionPane.showMessageDialog(null, "Números adicionados com sucesso!");
        
    }
    
    private static boolean verificaRepetido(int[] vetor, int num) {
        
        for(int i=0; i<vetor.length; i++) {
            if(vetor[i] != 0 && vetor[i] == num) {
                return true;
            }
        }
        
        return false;
        
    }
    
    private static void pesquisarValor(int[] vetor) {
        
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
    
    private static void mostrarTodosValores(int[] vetor) {
        
        String msg = "";
        for(int i=0; i<vetor.length; i++) {
            if(i == vetor.length-1) {
                msg = msg + vetor[i] + " ";
            } else {
                msg = msg + vetor[i] + " - ";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Todos os valores do vetor: [ " + msg + ']');
        
    }
    
    private static void mostrarMenorMaior(int[] vetor) {
        
        int maior = 0, menor = 999999999;
        
        for(int i=0; i<vetor.length; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
            if(vetor[i] < menor) {
               menor = vetor[i];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Menor valor do vetor: [ " + menor + " ]" + "\nMaior valor do vetor: [ " + maior + " ]");
        
    }
    
    private static void mostrarPrimeiroUltimo(int[] vetor) {
        
        int primeiro = vetor[0];
        int ultimo = vetor[49];

        JOptionPane.showMessageDialog(null, "Primeiro valor do vetor: [ " + primeiro + " ]" + "\nÚltimo valor do vetor: [ " + ultimo + " ]");
        
    }
    
    private static void mostrarPares(int[] vetor) {
        
        String par = "";
        for(int i=0; i<vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                par = par + vetor[i] + " ";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Valores pares do vetor: [ " + par + ']');
        
    }
    
    private static void mostrarImpares(int[] vetor) {
        
        String impar = "";
        for(int i=0; i<vetor.length; i++) {
            if(vetor[i] % 2 != 0) {
                impar = impar + vetor[i] + " ";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Valores ímpares do vetor: [ " + impar + ']');
        
    }
    
    private static void mostrarSoma(int[] vetor) {
        
        int soma = 0;
        
        for(int i=0; i<vetor.length; i++) {
            soma += vetor[i];
        }
        
        JOptionPane.showMessageDialog(null, "Soma total dos valores do vetor: [ " + soma + " ]");
        
    }

}
