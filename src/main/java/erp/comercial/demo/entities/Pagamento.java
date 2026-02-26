package erp.comercial.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "order_id", nullable = false, unique = true)
    private Pedido pedido;
    private double valor;
    //private StatusPagamento statusPagamento;
    //private FormaPagamento formaPagamento;
    private LocalDateTime horarioPagamento;
}
