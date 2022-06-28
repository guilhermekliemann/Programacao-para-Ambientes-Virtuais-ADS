package supertrunfopokemon.classes;

public class CartaPokemon {

    public CartaPokemon() {
    }
    
    public CartaPokemon(String nome) {
        this.nome = nome;
    }
 
    private String nome;
    private int forca;
    private int ataque;
    private int defesa;
    private int agilidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    @Override
    public String toString() {
        return "CARTA: \n Nome do Pokémon: " + nome + "\n Força: " + forca + "\n Ataque: " + ataque + "\n Defesa: " + defesa + "\n Agilidade: " + agilidade + "\n";
    }
    
}
