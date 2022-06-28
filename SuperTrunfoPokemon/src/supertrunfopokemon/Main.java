package supertrunfopokemon;

import supertrunfopokemon.classes.CartaPokemon;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static Random random = new Random();
    
    public static ArrayList<CartaPokemon> baralho = new ArrayList<>();
    
    public static void main(String[] args) {
        
        int opcao = -1;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("SUPER TRUNFO POKÉMON \n" +
                                                                 "1- Cadastrar Pokémon \n" +
                                                                 "2- Iniciar Batalha \n" +
                                                                 "3- Mostrar Pokémons \n" +
                                                                 "0- Encerrar Programa"));
            
            switch(opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa Encerrado!");
                    break;
                case 1:
                    cadastrarPokemon(baralho);
                    break;
                case 2:
                    break;
                case 3:
                    mostrarPokemons(baralho);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha Inválida!");
            }
            
        } while(opcao != 0);
        
    }
    
    private static void cadastrarPokemon(ArrayList<CartaPokemon> baralho) {
        
        CartaPokemon cartaPokemon = new CartaPokemon();
        
        String nome = JOptionPane.showInputDialog("Digite o nome do Pokémon: ");
        int forca = random.nextInt(100);
        int ataque = random.nextInt(100);
        int defesa = random.nextInt(100);
        int agilidade = random.nextInt(100);
        
        cartaPokemon.setNome(nome);
        cartaPokemon.setForca(forca);
        cartaPokemon.setAtaque(ataque);
        cartaPokemon.setDefesa(defesa);
        cartaPokemon.setAgilidade(agilidade);
        
        baralho.add(cartaPokemon);
        
    }
    
    private static void iniciarBatalha(ArrayList<CartaPokemon> baralho) {
        
        ArrayList<CartaPokemon> baralhoJogador1 = new ArrayList<>();
        ArrayList<CartaPokemon> baralhoJogador2 = new ArrayList<>();
        
        
        
    }
    
    private static ArrayList<CartaPokemon> baralhoJogador(ArrayList<CartaPokemon> baralho) {
        
        ArrayList<CartaPokemon> baralhoJogador = new ArrayList<>();
        
        String cartasBaralho;
        
        for(int i=0; i<3; i++) {
            cartasBaralho = "";
            int k = 1;
            for(CartaPokemon baralho1 : baralho) {
                cartasBaralho = cartasBaralho + k + " - " + baralho1.getNome() + "\n";
                k++;
            }
            
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Infome a " + (k+1) + 
                                                                       "º carta escolhida para o duelo:\n" + cartasBaralho));
            baralhoJogador.add(baralho.get(escolha-1));
            baralho.remove(escolha-1);
        }
        
        return baralhoJogador;
        
    }
    
    private static void mostrarPokemons(ArrayList<CartaPokemon> baralho) {
        
        String cartasBaralho = "";
        
        int i = 1;
        for(CartaPokemon baralho1 : baralho) {
            cartasBaralho = cartasBaralho + i + " - " + baralho1.getNome() + "\n";
            i++;
        }
        
        int carta = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione uma carta para ver seus atributos: \n" + cartasBaralho)) - 1;
        
        JOptionPane.showMessageDialog(null, baralho.get(carta).toString());
        
    }
    
}
