package erp.gestao.comercial.entities;

import jakarta.persistence.*;

@Entity
@Table(name="produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoProduto;
    private String descricao;
    private double preco;
    private int quantidade;
}
