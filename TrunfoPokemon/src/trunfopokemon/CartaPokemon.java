package trunfopokemon;

public class CartaPokemon {

    public CartaPokemon() {
    }

    public CartaPokemon(String nome, String tipo, AtributosPokemon atributos) {
        this.nome = nome;
        this.tipo = tipo;
        this.atributos = atributos;
    }

    private String nome;
    private String tipo;
    private AtributosPokemon atributos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public AtributosPokemon getAtributos() {
        return atributos;
    }

    public void setAtributos(AtributosPokemon atributos) {
        this.atributos = atributos;
    }

    @Override
    public String toString() {
        return "CartaPokemon{" + "nome=" + nome + ", tipo=" + tipo + ", atributos=" + atributos + '}';
    }

}
