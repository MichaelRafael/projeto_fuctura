package br.com.fuctura.projeto.service;

import br.com.fuctura.projeto.dto.UsuarioDTO;
import br.com.fuctura.projeto.exceptions.DataIntregretyViolationException;
import br.com.fuctura.projeto.exceptions.ObjectNotFondException;
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


    public Usuario findById(Integer id) {
      Optional<Usuario> usu = usuarioRepository.findById(id);
      return usu.orElseThrow(() -> new ObjectNotFondException("Objeto não encontrado!"));
    }

    public List<Usuario> finAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(UsuarioDTO usuarioDTO) {
        findByEmail(usuarioDTO);
        return usuarioRepository.save(modelMapper.map(usuarioDTO, Usuario.class));
    }

    public Usuario upDate(UsuarioDTO usuarioDTO){
        findById(usuarioDTO.getId());
        findByEmail(usuarioDTO);
        return usuarioRepository.save(modelMapper.map(usuarioDTO, Usuario.class));

    }

    public void delete(Integer id) {
        findById(id);
        usuarioRepository.deleteById(id);
    }

    private void findByEmail(UsuarioDTO usuarioDTO) {
        Optional<Usuario> usu = usuarioRepository.findByEmail(usuarioDTO.getEmail());
        if (usu.isPresent() && !usu.get().getId().equals(usuarioDTO.getId())) {
            throw new DataIntregretyViolationException("Email já cadastrado na base de dados!");
        }
    }

}
