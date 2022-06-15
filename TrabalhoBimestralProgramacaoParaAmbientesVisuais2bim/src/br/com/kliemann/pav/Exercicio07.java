package br.com.kliemann.pav;

import br.com.kliemann.pav.classes.Produto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Exercicio07 {
    
    public static ArrayList<Produto> listaProduto;
    
    public static void main(String[] args) {
       
        /*
        Crie um programa para cadastrar uma lista de compras, nele deve conter os seguintes dados:
        - Nome do produto;
        - Quantidade a ser comprado;
        - Valor pago.
        Esse programa deverá ser capaz de:
        - Cadastrar o item de compra;
        - Ordenar pelo valor e nome;
        - Adicionar o valor pago;
        - Listar os itens da compra;
        - Exibir o total da compra.
        */
        
        listaProduto = new ArrayList<>();
        
        int opcao = -1;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções:\n"
                                                               + "1- Cadastrar o item da compra\n"
                                                               + "2- Ordenar pelo valor do produto\n"
                                                               + "3- Ordenar pelo nome do produto\n"
                                                               + "4- Adicionar valor pago\n"
                                                               + "5- Listar os itens da compra\n"
                                                               + "6- Exibir total da compra\n"
                                                               + "0- Encerrar programa"));
            
            if(opcao == 1) {
                cadastrarItemCompra();
            }
            if(opcao == 2) {
                ordenaPorValor(listaProduto);
            }
            if(opcao == 3) {
                ordenaPorNome(listaProduto);
            }
            if(opcao == 4) {
                adicionarValor(listaProduto);
            }
            if(opcao == 5) {
                listarItensCompra(listaProduto);
            }
            if(opcao == 6) {
                totalCompra(listaProduto);
            }
            
        } while(opcao != 0);
        
    }
    
    private static void cadastrarItemCompra() {
        
        Produto produto = new Produto();
        
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        int qtdComprada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
        
        produto.setNomeProduto(nomeProduto);
        produto.setQtdComprada(qtdComprada);
        
        listaProduto.add(produto);
        
        JOptionPane.showMessageDialog(null, "Cadastro do item da compra realizado!");
        
    }
    
    private static void ordenaPorValor(ArrayList<Produto> listaProduto) {
        
        Collections.sort(listaProduto, new Comparator<Produto>() {
            
            @Override
            public int compare(Produto a, Produto b) {
                return a.getVlrUnitario().compareTo(b.getVlrUnitario());
            }
     
        });                
    }
    
    private static void ordenaPorNome(ArrayList<Produto> listaProduto) {
        
        Collections.sort(listaProduto, new Comparator<Produto>() {
            
            @Override
            public int compare(Produto a, Produto b) {
                return a.getNomeProduto().compareTo(b.getNomeProduto());
            }
     
        });
        
    }
    
    private static void adicionarValor(ArrayList<Produto> listaProduto) {
        
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto para adicionar um valor:");
        
        double vlrUnitario = 0;
        
        for(int i=0; i<listaProduto.size(); i++) {
            if(listaProduto.get(i).getNomeProduto().equals(nomeProduto)) {
                vlrUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do produto:"));
                listaProduto.get(i).setVlrUnitario(vlrUnitario);
                JOptionPane.showMessageDialog(null, "Valor adicionado!");
                break;
            }
        }

    }
    
    private static void listarItensCompra(ArrayList<Produto> listaProduto) {
        
        String msg = "Lista de todos os produtos: ";
        
        msg = listaProduto.toString();
        
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
    private static void totalCompra(ArrayList<Produto> listaProduto) {
        
        double vlrTotalVenda = 0;
        
        for(int i=0; i<listaProduto.size(); i++) {
             vlrTotalVenda += listaProduto.get(i).getVlrUnitario() * listaProduto.get(i).getQtdComprada();
        }
        
        JOptionPane.showMessageDialog(null, "Valor total da venda foi de: R$" + String.format("%.2f",vlrTotalVenda));
        
    }
    
}