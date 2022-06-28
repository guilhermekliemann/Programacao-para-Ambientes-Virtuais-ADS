package trunfopokemon;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static ArrayList<CartaPokemon> listaCartas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        AtributosPokemon atributosVenusaur = new AtributosPokemon(80, 100, 100, 80);
        CartaPokemon venusaur = new CartaPokemon("Venusaur", "Planta/Venenoso", atributosVenusaur);
        
        AtributosPokemon atributosCharizard = new AtributosPokemon(78, 109, 85, 100);
        CartaPokemon charizard = new CartaPokemon("Charizard", "Fogo/Voador", atributosCharizard);
        
        AtributosPokemon atributosBlastoise = new AtributosPokemon( 79, 85, 105, 78);
        CartaPokemon blastoise = new CartaPokemon("Blastoise", "Água", atributosBlastoise);
        
        AtributosPokemon atributosMeganium = new AtributosPokemon(80, 83, 100, 80);
        CartaPokemon meganium = new CartaPokemon("Meganium", "Planta", atributosMeganium);
        
        AtributosPokemon atributosTyphlosion = new AtributosPokemon(78, 109, 85, 100);
        CartaPokemon typhlosion = new CartaPokemon("Typhlosion", "Fogo", atributosTyphlosion);
        
        AtributosPokemon atributosFeraligatr = new AtributosPokemon(85, 105, 100, 78);
        CartaPokemon feraligatr = new CartaPokemon("Feraligatr", "Água", atributosFeraligatr);
        
        AtributosPokemon atributosSceptile = new AtributosPokemon(70, 105, 85, 120);
        CartaPokemon sceptile = new CartaPokemon("Sceptile", "Planta", atributosSceptile);
        
        AtributosPokemon atributosBlaziken = new AtributosPokemon(80, 120, 70, 80);
        CartaPokemon blaziken = new CartaPokemon("Blaziken", "Fogo/Lutador", atributosBlaziken);
        
        AtributosPokemon atributosSwampert = new AtributosPokemon(100, 110, 90, 60);
        CartaPokemon swampert = new CartaPokemon("Swampert", "Água/Terrestre", atributosSwampert);
        
        listaCartas.add(venusaur);
        listaCartas.add(charizard);
        listaCartas.add(blastoise);
        listaCartas.add(meganium);
        listaCartas.add(typhlosion);
        listaCartas.add(feraligatr);
        listaCartas.add(sceptile);
        listaCartas.add(blaziken);
        listaCartas.add(swampert);
        
        while(true) {
            sorteiaCarta();
        }
        
    }
    
    private static void sorteiaCarta() {
        
        CartaPokemon cartaMaquina = new CartaPokemon();
        CartaPokemon cartaJogador = new CartaPokemon();
        
        Random random = new Random();
        
        int numeroCartaMaquina = random.nextInt(9);
        cartaMaquina = listaCartas.get(numeroCartaMaquina);
        System.out.println(cartaMaquina);
        
        int numeroCartaJogador = random.nextInt(9);
        while(numeroCartaJogador == numeroCartaMaquina) {
            numeroCartaJogador = random.nextInt(9);
        }
        cartaJogador = listaCartas.get(numeroCartaJogador);
        
        JOptionPane.showMessageDialog(null, "SUA CARTA SORTEADA FOI: " + "\n" + "\n" +
                                                 "Pokemon: " + cartaJogador.getNome() + "\n" +
                                                 "Tipo: " + cartaJogador.getTipo() + "\n" +
                                                 "Atributos: " + "\n" +
                                                 "*Vida - " + cartaJogador.getAtributos().getVida() + "\n" +
                                                 "*Ataque - " + cartaJogador.getAtributos().getAtaque() + "\n" +
                                                 "*Defesa - " + cartaJogador.getAtributos().getDefesa() + "\n" +
                                                 "*Velocidade - " + cartaJogador.getAtributos().getVelocidade() + "\n");
        
        escolhaAtributo(cartaMaquina, cartaJogador);
        
    }
    
    private static void escolhaAtributo(CartaPokemon cartaMaquina, CartaPokemon cartaJogador) {

        String escolha = JOptionPane.showInputDialog("Digite o nome do seu atributo escolhido:");

        int atributo = 0;
        
        if(escolha.equalsIgnoreCase("vida")) {
            atributo = cartaJogador.getAtributos().getVida();
            if(atributo > cartaMaquina.getAtributos().getVida()) {
                JOptionPane.showMessageDialog(null, "Vida da carta do Jogador: " + atributo + "\n" +
                                   "Vida da carta da Máquina: " + cartaMaquina.getAtributos().getVida() + "\n" + "\n" +
                                   "JOGADOR VENCEU!");
            } else if(atributo < cartaMaquina.getAtributos().getVida()) {
                JOptionPane.showMessageDialog(null, "Vida da carta do Jogador: " + atributo + "\n" +
                                   "Vida da carta da Máquina: " + cartaMaquina.getAtributos().getVida() + "\n" + "\n" +
                                   "MÁQUINA VENCEU!");
            } else {
                JOptionPane.showMessageDialog(null, "Vida da carta do Jogador: " + atributo + "\n" +
                                   "Vida da carta da Máquina: " + cartaMaquina.getAtributos().getVida() + "\n" + "\n" +
                                   "OCORREU UM EMPATE!");
            }
        }
        
        else if(escolha.equalsIgnoreCase("ataque")) {
            atributo = cartaJogador.getAtributos().getAtaque();
            if(atributo > cartaMaquina.getAtributos().getAtaque()) {
                JOptionPane.showMessageDialog(null, "Ataque da carta do Jogador: " + atributo + "\n" +
                                   "Ataque da carta da Máquina: " + cartaMaquina.getAtributos().getAtaque() + "\n" + "\n" +
                                   "JOGADOR VENCEU!");
            } else if(atributo < cartaMaquina.getAtributos().getAtaque()) {
                JOptionPane.showMessageDialog(null, "Ataque da carta do Jogador: " + atributo + "\n" +
                                   "Ataque da carta da Máquina: " + cartaMaquina.getAtributos().getAtaque() + "\n" + "\n" +
                                   "MÁQUINA VENCEU!");
            } else {
                JOptionPane.showMessageDialog(null, "Ataque da carta do Jogador: " + atributo + "\n" +
                                   "Ataque da carta da Máquina: " + cartaMaquina.getAtributos().getAtaque() + "\n" + "\n" +
                                   "OCORREU UM EMPATE!");
            }
        }
        
        else if(escolha.equalsIgnoreCase("defesa")) {
            atributo = cartaJogador.getAtributos().getDefesa();
            if(atributo > cartaMaquina.getAtributos().getDefesa()) {
                JOptionPane.showMessageDialog(null, "Defesa da carta do Jogador: " + atributo + "\n" +
                                   "Defesa da carta da Máquina: " + cartaMaquina.getAtributos().getDefesa() + "\n" + "\n" +
                                   "JOGADOR VENCEU!");
            } else if(atributo < cartaMaquina.getAtributos().getDefesa()) {
                JOptionPane.showMessageDialog(null, "Defesa da carta do Jogador: " + atributo + "\n" +
                                   "Defesa da carta da Máquina: " + cartaMaquina.getAtributos().getDefesa() + "\n" + "\n" +
                                   "MÁQUINA VENCEU!");
            } else {
                JOptionPane.showMessageDialog(null, "Defesa da carta do Jogador: " + atributo + "\n" +
                                   "Defesa da carta da Máquina: " + cartaMaquina.getAtributos().getDefesa() + "\n" + "\n" +
                                   "OCORREU UM EMPATE!");
            }
        }
        
        else if(escolha.equalsIgnoreCase("velocidade")) {
            atributo = cartaJogador.getAtributos().getVelocidade();
            if(atributo > cartaMaquina.getAtributos().getVelocidade()) {
                JOptionPane.showMessageDialog(null, "Defesa da carta do Jogador: " + atributo + "\n" +
                                   "Defesa da carta da Máquina: " + cartaMaquina.getAtributos().getVelocidade()+ "\n" + "\n" +
                                   "JOGADOR VENCEU!");
            } else if(atributo < cartaMaquina.getAtributos().getVelocidade()) {
                JOptionPane.showMessageDialog(null, "Defesa da carta do Jogador: " + atributo + "\n" +
                                   "Defesa da carta da Máquina: " + cartaMaquina.getAtributos().getVelocidade()+ "\n" + "\n" +
                                   "MÁQUINA VENCEU!");
            } else {
                JOptionPane.showMessageDialog(null, "Defesa da carta do Jogador: " + atributo + "\n" +
                                   "Defesa da carta da Máquina: " + cartaMaquina.getAtributos().getVelocidade()+ "\n" + "\n" +
                                   "OCORREU UM EMPATE!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Atributo inválido!");
        }
        
    }

}