public class Main {
    public static void main(String[] args) {
 //criar item
     Item notebook = new Item(1, "Notebook Dell", 10, "Estoque A", 3500.00);

 //criar movimentacao
     Movimentacao mov = new Movimentacao(101, 1, "ENTRADA", 5, "20/02/206", "Compra fornecedor");    
    
 //exibir no terminal
     System.out.println("Item: " + notebook.getNome());
     System.out.println("Movimentação tipo: " + mov.getTipo());    

    }
}