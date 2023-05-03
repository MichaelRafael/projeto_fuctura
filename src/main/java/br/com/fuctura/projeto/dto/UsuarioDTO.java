package br.com.fuctura.projeto.dto;

import br.com.fuctura.projeto.enuns.Estatura;
import br.com.fuctura.projeto.model.Endereco;
import br.com.fuctura.projeto.model.Usuario;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UsuarioDTO {

    private Integer id;

    @NotBlank(message = "Campo nome é requerido!")
    private String nome;

    @NotBlank(message = "Campo email é requerido!")
    private String email;

    @NotBlank(message = "Campo contato é requerido!")
    private String contato;

    private Estatura estatura;

    private Endereco endereco;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.contato = usuario.getContato();
        this.estatura = usuario.getEstatura();
        this.endereco = usuario.getEndereco();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Estatura getEstatura() {
        return estatura;
    }

    public void setEstatura(Estatura estatura) {
        this.estatura = estatura;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
