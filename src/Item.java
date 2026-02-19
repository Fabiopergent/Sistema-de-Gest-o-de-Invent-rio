public class Item {
    private int id;
    private String nome;
    private int quantidade;
    private String localizacao;
    private double preco;

    public Item(int id, String nome, int quantidade, String localizacao, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.localizacao = localizacao;
        this.preco = preco;
    }

    public String getNome() { return nome;}
    public void setNome(String nome){ this.nome = nome; 
    }
    }