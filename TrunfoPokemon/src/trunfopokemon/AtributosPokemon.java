package trunfopokemon;

public class AtributosPokemon {

    public AtributosPokemon() {
    }
    
    public AtributosPokemon(int vida, int ataque, int defesa, int velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }
    
    private int vida;
    private int ataque;
    private int defesa;
    private int velocidade;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "AtributosPokemon{" + "vida=" + vida + ", ataque=" + ataque + ", defesa=" + defesa + ", velocidade=" + velocidade + '}';
    }
    
}
