package br.com.fuctura.projeto.service;

import br.com.fuctura.projeto.enuns.Estatura;
import br.com.fuctura.projeto.model.Endereco;
import br.com.fuctura.projeto.model.Usuario;
import br.com.fuctura.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void instaciaDB() {

        Endereco end1 = new Endereco(null, "Rua da Soledade", 213, "Recife");
        Endereco end2 = new Endereco(null, "Rua da Uniao", 111, "Recife");
        Endereco end3 = new Endereco(null, "Rua do Espinheiro", 565, "Recife");

        Usuario uso1 = new Usuario(null, "Michael", "michael-ras@hotmail.com", "819000000", Estatura.ALTA, end1);
        Usuario uso2 = new Usuario(null, "Rafael", "Rafael@hotmail.com", "819000000", Estatura.MEDIA, end2);
        Usuario uso3 = new Usuario(null, "Miguel", "Miguel@hotmail.com", "819000000", Estatura.BAIXA, end3);
        Usuario uso4 = new Usuario(null, "Rodrigo", "Rodrigo@hotmail.com", "819000000", Estatura.ALTA, end1);



        usuarioRepository.saveAll(Arrays.asList(uso1, uso2, uso3, uso4));
    }
}
