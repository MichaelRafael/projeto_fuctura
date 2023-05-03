package br.com.fuctura.projeto.model;

import br.com.fuctura.projeto.enuns.Estatura;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Usuario_id")
    private Integer id;
    @NotBlank(message = "Campo nome é requerido!")
    @Column(name = "Usuario_name")
    private String nome;
    @NotBlank(message = "Campo email é requerido!")
    @Column(name = "Usuario_email")
    private String email;
    @NotBlank(message = "Campo contato é requerido!")
    @Column(name = "Usuario_contato")
    private String contato;
    @Column(name = "Usuario_estatura")
    private Estatura estatura;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
}
