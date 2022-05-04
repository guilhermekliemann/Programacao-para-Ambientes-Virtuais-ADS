package atividadebimestralambientesvisuais1;

import javax.swing.JOptionPane;

public class AtividadeBimestralAmbientesVisuais1 {

    public static int[] opcoesVetor = new int[3];
    
    public static void main(String[] args) {
        
        int opcoes;
       
        do {
            String op = JOptionPane.showInputDialog("BEM-VINDO A PIZZARIA KLIEMANN\n" + 
                                                    "\nVocê deseja fazer um pedido?" +
                                                    "\n1- Sim" + 
                                                    "\n0- Não");
            opcoes = Integer.parseInt(op);
            
            if(opcoes == 1) {
                opcoes = escolhaTamanho();
                opcoesVetor[0] = opcoes;
            }
            if(opcoes == 1 || opcoes == 2 || opcoes == 3 || opcoes == 4 || opcoes == 5) {
                opcoes = escolhaSabor();
                opcoesVetor[1] = opcoes;
            }
            if(opcoes == 1 || opcoes == 2 || opcoes == 3) {
                opcoes = escolhaBebida();
                opcoesVetor[2] = opcoes;
            }
            if(opcoes == 1 || opcoes == 2 || opcoes == 3) {
                JOptionPane.showMessageDialog(null, calcularValorTotal());
            }
        } while (opcoes != 0);
        
    }
    
    public static int escolhaTamanho() {
        
        int tamanho;
        
        String tamanhoPizza = JOptionPane.showInputDialog("Selecione o tamanho da pizza:\n" +
                                                          "\n1- Pequena: R$20,00" +
                                                          "\n2- Média: R$35,00" +
                                                          "\n3- Grande: R$50,00");
        
        tamanho = Integer.parseInt(tamanhoPizza);
        
        return tamanho;
        
    }
    
    public static int escolhaSabor() {
        
        int sabor;
        
        String saborPizza = JOptionPane.showInputDialog("Selecione o sabor da pizza:\n" +
                                                        "\n1- Calabresa" +
                                                        "\n2- Frango com Catupiry" +
                                                        "\n3- Catufilé");
        
        sabor = Integer.parseInt(saborPizza);
        
        return sabor;
        
    }
    
    public static int escolhaBebida() {
        
        int bebida;
        
        String bebidas = JOptionPane.showInputDialog("Selecione a sua bebida:\n" +
                                                     "\n1- Água Mineral: R$5,00" +
                                                     "\n2- Refrigerante: R$10,00" +
                                                     "\n3- Cerveja: R$7,00");
        
        bebida = Integer.parseInt(bebidas);
        
        return bebida;
        
    }
    
    public static String calcularValorTotal() {
        
        int valorTamanho = 0;
        int valorBebida = 0;
        int valorTotal;
        String tamanhoPizza = "", saborPizza = "", escolhaBebida = "", imprimir;
        
        //tamanho
        if(opcoesVetor[0] == 1) {
            valorTamanho = 20;
            tamanhoPizza = "Pequena - R$20,00";
        }
        if(opcoesVetor[0] == 2) {
            valorTamanho = 35;
            tamanhoPizza = "Média - R$35,00";
        }
        if(opcoesVetor[0] == 3) {
            valorTamanho = 50;
            tamanhoPizza = "Grande - R$50,00";
        }
        
        //sabor
        if(opcoesVetor[1] == 1) {
            saborPizza = ("Calabresa");
        }
        if(opcoesVetor[1] == 2) {
            saborPizza = ("Frango com Catupiry");
        }
        if(opcoesVetor[1] == 3) {
            saborPizza = ("Catufilé");
        }
        
        //bebida
        if(opcoesVetor[2] == 1) {
            valorBebida = 5;
            escolhaBebida = "Água - R$5,00";
        }
        if(opcoesVetor[2] == 2) {
            valorBebida = 10;
            escolhaBebida = "Refrigerante - R$10,00";
        }
        if(opcoesVetor[2] == 3) {
            valorBebida = 7;
            escolhaBebida = "Cerveja - R$7,00";
        }
        
        valorTotal = valorTamanho + valorBebida;
        
        imprimir = ("Informações sobre o pedido:\n" +
                    "\nTamanho da Pizza: " + tamanhoPizza +
                    "\nSabor: " + saborPizza +
                    "\nBebida: " + escolhaBebida + 
                    "\nValor Total: R$" + valorTotal + ",00");
        
        return imprimir;
        
    }
    
}
