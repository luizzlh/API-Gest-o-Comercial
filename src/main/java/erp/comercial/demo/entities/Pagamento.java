package erp.comercial.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private Pedido pedido;
    private double valor;
    private StatusPagamento statusPagamento;
    private FormaPagamento formaPagamento;
    private LocalDateTime horarioPagamento;
}
