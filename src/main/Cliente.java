package one.digitalinnovation.gof.model;

import javax.persistence.Entity;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.Auto)
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

    public Long getId() {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}