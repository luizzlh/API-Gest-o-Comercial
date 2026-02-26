package erp.comercial.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String documento;
    private String email;
    private String telefone;
    private String endereco;
    private Boolean ativo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
}
