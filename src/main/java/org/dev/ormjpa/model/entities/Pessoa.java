package org.dev.ormjpa.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID gerado automaticamente pelo banco
    private Long id;
    private String nome;
    private int idade;
    // Relacionamento OneToOne com a classe Passport
    @OneToOne(cascade = CascadeType.ALL) // Cascata: alterações em Person serão refletidas no Passaporte
    //@JoinColumn(name = "passport_id", referencedColumnName = "id") // Nome da coluna que referencia a chave estrangeira
    private Passaporte passport;
}
