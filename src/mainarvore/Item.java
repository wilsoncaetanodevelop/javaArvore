
package mainarvore;

public class Item {
    
    private String nome;
    private String fone;

    public Item(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    @Override
    public String toString() {
        return "\nItem:" + "\nNome: " + nome + "\nFone: " + fone;
    }
    
    
}
