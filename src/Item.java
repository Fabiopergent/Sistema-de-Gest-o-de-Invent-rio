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

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome){ this.nome = nome; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade){ this.quantidade = quantidade; }

    public String getLocalizacao() {return localizacao; }
    public void setLocalizacao(String localizacao){ this.localizacao = localizacao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    }
    