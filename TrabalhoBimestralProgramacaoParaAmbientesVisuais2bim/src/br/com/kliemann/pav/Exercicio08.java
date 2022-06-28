package br.com.kliemann.pav;

import br.com.kliemann.pav.classes.TimeDeFutebol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Exercicio08 {

    public static ArrayList<TimeDeFutebol> listaTime;
    
    public static void main(String[] args) {
        
        /*
        Crie um programa para controlar o campeonato brasileiro de futebol, para isso o programa
        deverá cadastrar os times de futebol, contendo os atributos, Nome, No de Vitórias, No de
        Derrotas, Total de Pontos. O programa deverá solicitar ao usuário o numero da rodada e após,    
        solicitar o usuário informar o resultado de cada jogo (Deverá pegar a quantidade de times e   
        dividir por 2 para saber quantas vezes irá exibir a mensagem para informar o resultado).
        Para cada vitória deverá ser somado 3 pontos, empate 1 e derrota 0.
        O programa deve conter as seguintes opções:
        - Cadastrar Time;
        - Informar jogos da rodada;
        - Listar a classificação do campeonato.
        */
        
        listaTime = new ArrayList<>();
        
        int opcao = -1;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções:\n\n"
                                                               + "1- Cadastrar time\n"
                                                               + "2- Informar jogos da rodada\n"
                                                               + "3- Listar a classificação do campeonato\n"
                                                               + "0- Encerrar programa"));
            
            if(opcao == 1) {
                cadastrarTime();
            }
            if(opcao == 2) {
                informarJogos();
            }
            if(opcao == 3) {
                ordenarClassificacao();
                listarClassificacao();
            }
            
        } while(opcao != 0);
        
    }
    
    private static void cadastrarTime() {
        
        TimeDeFutebol time = new TimeDeFutebol();
        
        String nome = JOptionPane.showInputDialog("Digite o nome do time de futebol:");
        int numVitorias = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vitorias: "));
        int numDerrotas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de derrotas: "));
        int numEmpates = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de empates: "));
        int totalPontos = (numVitorias * 3) + (numEmpates * 1);
        
        time.setNome(nome);
        time.setNumVitorias(numVitorias);
        time.setNumDerrotas(numDerrotas);
        time.setNumEmpates(numEmpates);
        time.setTotalPontos(totalPontos);
        listaTime.add(time);
        
        JOptionPane.showMessageDialog(null, "Time adicionado!");
        
    }
    
    private static void informarJogos() {
        
        
        
    }
    
    private static void listarClassificacao() {     
        
        String msg = listaTime.toString();
        JOptionPane.showMessageDialog(null, "Classificação dos Times" + msg);
        
    }
    
    private static void ordenarClassificacao() {
        
        Collections.sort(listaTime, new Comparator<TimeDeFutebol>() {
            
            @Override
            public int compare(TimeDeFutebol a, TimeDeFutebol b) {
                return b.getTotalPontos().compareTo(a.getTotalPontos());
            }
     
        });  
        
    }

}