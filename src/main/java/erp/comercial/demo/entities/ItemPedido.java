package erp.comercial.demo.entities;

import jakarta.persistence.*;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Produto produto;
    private int quantidade;
    private double precoUnitario;
    private double precoTotal;

}
