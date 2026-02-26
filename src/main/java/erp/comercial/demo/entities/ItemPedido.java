package erp.comercial.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name="itens_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int numeroPedido;
    @ManyToOne
    @JoinColumn(name = "produto_codigo_produto")
    private Produto produto;
    private int quantidade;
    private double precoUnitario;
    private double precoTotal;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
