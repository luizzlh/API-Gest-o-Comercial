package erp.comercial.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {
    @Id
    @Column(name="numeroPedido")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int numeroPedido;
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "vendedor_id", nullable = false)
    private Usuario vendedor;
    //private Status status;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemPedido> items = new ArrayList<>();
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Pagamento pagamento;
    private double totalPedido;
    private LocalDateTime horaCriacao;
    private LocalDateTime horaAtualizacao;

}
