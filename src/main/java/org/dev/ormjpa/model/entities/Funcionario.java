package org.dev.ormjpa.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    @Id
    private Long id;
    private String nomeFuncionario;

    // Relacionamento ManyToOne - Vários funcionários pertencem a um único departamento
    @ManyToOne
    //@JoinColumn(name = "departamento_id") // Define a coluna de chave estrangeira
    private Departamento departamento;
}
