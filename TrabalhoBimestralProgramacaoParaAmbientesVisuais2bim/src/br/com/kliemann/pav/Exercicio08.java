package br.com.kliemann.pav;

import br.com.kliemann.pav.classes.TimeDeFutebol;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio08 {

    public static ArrayList<TimeDeFutebol> listaTime;
    
    public static void main(String[] args) {
        
        /*
        Crie um programa para controlar o campeonato brasileiro de futebol, para isso o programa
        deverá cadastrar os 9mes de futebol, contendo os atributos, Nome, No de Vitórias, No de
        Derrotas, Total de Pontos. O programa deverá solicitar ao usuário o numero da rodada e após,    
        solicitar o usuário informar o resultado de cada jogo (Deverá pegar a quan9dade de 9mes e   
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
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções:\n"
                                                               + "1- Cadastrar time\n"
                                                               + "2- Informar jogos da rodada\n"
                                                               + "3- Listar a classificação do campeonato\n"
                                                               + "0- Encerrar programa"));
        } while(opcao != 0);
        
    }
    
    private static void cadastrarTime() {
        
        TimeDeFutebol time = new TimeDeFutebol();
        
        String nome = JOptionPane.showInputDialog("Digite o nome do time de futebol:");

        time.getNome();
        listaTime.add(time);
        
        JOptionPane.showMessageDialog(null, "Time adicionado!");
        
    }
    
    private static void informarJogos() {
        
        
        
    }
    
    private static void listarClassificacao() {
        
        
        
    }
    
}
