package programacaoparaambientesvisuais;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
//Converte String para Inteiro
int vlrInteiro = Integer.parseInt(nome);
        
//Converte String para Float
float vlrFloat = Float.parseFloat(nome);
        
//Converte String para Double
double vlrDouble = Double.parseDouble(nome);
*/

public class CadastroAluno {

    public static String vetorAlunos[] = new String[10];
    
    public static void main(String[] args) {
        
        int opcaoTela = 0;
        
        do {
            
            String op = JOptionPane.showInputDialog("SELECIONE UMA DAS OPÇÕES ABAIXO:" +
                                                    "\n1 - Novo Aluno" +
                                                    "\n2 - Buscar Aluno" +
                                                    "\n3 - Listar Todos" +
                                                    "\n4 - Sair");
            
            opcaoTela = Integer.parseInt(op);
            
            switch(opcaoTela) {
                
                case 1: adicionarAluno();
                    break;
                case 2: buscarAluno();
                    break;
                case 3: listarTodos();
                    break;
                case 4: sair();
                    break;
                default:
                    
            }
            
        }while(opcaoTela != 4);
        
    }
    
    public static void adicionarAluno() {
        
        String nome = JOptionPane.showInputDialog("Informe o nome do novo aluno:");
        
        for(int i = 0; i < vetorAlunos.length; i++) {
            
            if(vetorAlunos[i] == null) {
                vetorAlunos[i] = nome;
                break;
            }
            
        }
        
    }
    
    public static void buscarAluno() {
        
        String nome = JOptionPane.showInputDialog("Informe o nome do aluno para buscar:");
        
        for(int i = 0; i < vetorAlunos.length; i++) {
            
            if(vetorAlunos == null) {
                vetorAlunos[i] = nome;
            }
            
        }
        
    }
    
    public static void listarTodos() {
        
        String mensagem;
        
        mensagem = "Mostrar lista de alunos?";
        
        for(int i = 0; i > vetorAlunos.length; i++) {
            
            mensagem += vetorAlunos[i] + "\n";
            
        }
        
        JOptionPane.showConfirmDialog(null, mensagem);
        JOptionPane.showMessageDialog(null, vetorAlunos);
        
    }
    
    public static void sair() {
        
        String sair;
        
        sair = "Voce deseja sair?";
        
        JOptionPane.showConfirmDialog(null, sair);
        
    }
    
}
