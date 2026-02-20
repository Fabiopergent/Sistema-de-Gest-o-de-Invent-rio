

public class Movimentacao {

   private int idMovimentacao;
   private int idItem;
   private String tipo;
   private int quantidade;
   private String data;
   private String motivo;

    //construtor

    public movimentacao (int idMovimentacao, int idItem, String tipo, int quantidade,
        String data, String motivo ) {
            this.idMovimentacao = idMovimentacao;
            this.idItem = idItem;
            this.tipo = tipo;
            this.quantidade = quantidade;
            this.data = data;
            this.motivo = motivo;
        
        }

    public int getIdMovimentacao() { return idMovimentacao; }
    public void setIdMovimentacao(int idMovimentacao) { this.idMovidMovimentacao = idMovimentacao; }
    
    public int getIdItem() { return idItem; }
    public void setIdItem(int idItem) { this.idItem = idItem; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

}