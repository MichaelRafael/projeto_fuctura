package br.com.fuctura.projeto.service;

import br.com.fuctura.projeto.model.Usuario;
import br.com.fuctura.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> finAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario upDate(Integer id, Usuario usuario){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }

}
