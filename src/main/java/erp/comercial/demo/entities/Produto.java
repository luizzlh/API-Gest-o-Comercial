package erp.comercial.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoProduto;
    private String descricao;
    private double preco;
    private int quantidade;
    private boolean ativo;
    private LocalDateTime horaCriacao;
    private LocalDateTime horaAtualizacao;
}
