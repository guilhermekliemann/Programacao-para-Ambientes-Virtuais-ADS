package programacaoparaambientesvisuais;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import programacaoparaambientesvisuais.classes.Aluno;

public class ListaAlunos {

    public static ArrayList<Aluno> listaAluno;
    
    public static void main(String[] args) {
               
        listaAluno = new ArrayList<>();
        
        int opcao = -1;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção:\n"
                                               + "1- Adicionar Aluno\n"
                                               + "2- Remover Aluno\n"
                                               + "3- Pesquisar Aluno\n"
                                               + "0- Sair"));
            if(opcao == 1)
                adicionarAluno();
            if(opcao == 2)
                removerAluno();
            if(opcao == 3)
                pesquisarAluno();
            if(opcao == 0)
                sair();
            
        }while(opcao != 0);
         
    }
    
    public static void adicionarAluno() {
        
        Aluno novoAluno = new Aluno();
        
        //adiciona nome
        String novoNome = JOptionPane.showInputDialog("Informe o NOME do aluno:");
        
        //adiciona ra
        int novoRa = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA do aluno:"));
        
        //adiciona dtNasc
        String novoDtNasc = JOptionPane.showInputDialog("Informe da DT de NASCIMENTO do aluno:");
        
        //adiciona cpf
        String novoCpf = JOptionPane.showInputDialog("Informe o CPF do aluno;");
        
        novoAluno.setRa(novoRa);
        novoAluno.setNome(novoNome);
        novoAluno.setDtNasc(novoDtNasc);
        novoAluno.setCpf(novoCpf);
        
        listaAluno.add(novoAluno);
        
        System.out.println("Lista contém: " + listaAluno.size());
        
        JOptionPane.showMessageDialog(null, "Aluno ("+novoNome+") adicionado com sucesso!");
        
    }
    
    public static void removerAluno() {

        String mensagem;
        
        mensagem = "Alunos cadastrados:\n";
        
        for(int i = 0; i > listaAluno.size(); i++) {
            mensagem += listaAluno.get(i).getNome() + "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem + listaAluno.toString());
        
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno para ser removido:");
        
        for (int i = 0; i < listaAluno.size(); i++) {
            if (listaAluno.get(i).getNome().equals(nome)) {
              listaAluno.remove(i);
              JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
            }
        }
        
    }
    
    public static void pesquisarAluno() {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno para pesquisar:");
        
        for (int i = 0; i < listaAluno.size(); i++) {
            if (listaAluno.get(i).getNome().equals(nome)) {
              JOptionPane.showMessageDialog(null, "Aluno pesquisado:\n" + listaAluno.get(i).toString());
            }
        }
        
    }
    
    public static void sair() {
        
        String sair;
        
        sair = "Você deseja sair?";
        
        JOptionPane.showConfirmDialog(null, sair);
        
    }
    
}
