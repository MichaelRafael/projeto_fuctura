package br.com.fuctura.projeto.service;

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

        Usuario uso1 = new Usuario(null, "Michael", "michael-ras@hotmail.com", "819000000");
        Usuario uso2 = new Usuario(null, "Rafael", "Rafael@hotmail.com", "819000000");
        Usuario uso3 = new Usuario(null, "Miguel", "Miguel@hotmail.com", "819000000");
        Usuario uso4 = new Usuario(null, "Rodrigo", "Rodrigo@hotmail.com", "819000000");

        usuarioRepository.saveAll(Arrays.asList(uso1, uso2, uso3, uso4));
    }
}
