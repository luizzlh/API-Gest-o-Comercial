package erp.comercial.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="pedidos")
public class Pedido {
    @Id
    @Column(name="numeroPedido")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int numeroPedido;
    private Cliente cliente;
    private Usuario vendedor;
    private Status status;
    private double totalPedido;
    private LocalDateTime horaCriacao;
    private LocalDateTime horaAtualizacao;

}
