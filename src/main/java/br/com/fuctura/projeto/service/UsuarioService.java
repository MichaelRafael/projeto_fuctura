package br.com.fuctura.projeto.service;

import br.com.fuctura.projeto.dto.UsuarioDTO;
import br.com.fuctura.projeto.model.Usuario;
import br.com.fuctura.projeto.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> finAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(UsuarioDTO usuarioDTO) {
        return usuarioRepository.save(modelMapper.map(usuarioDTO, Usuario.class));
    }

    public Usuario upDate(UsuarioDTO usuarioDTO){
        return usuarioRepository.save(modelMapper.map(usuarioDTO, Usuario.class));


//        Usuario uso = new Usuario(null, usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getContato());
//        uso.setId(id);
//        return usuarioRepository.save(uso);
    }

    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }

}
