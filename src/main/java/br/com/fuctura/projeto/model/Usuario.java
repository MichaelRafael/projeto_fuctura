package br.com.fuctura.projeto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer id;
    @Column(name = "usuario_name")
    private String nome;
    @Column(name = "usuario_email")
    private String email;
    @Column(name = "usuario_contato")
    private String contato;

}
