package br.com.fuctura.projeto.controller;

import br.com.fuctura.projeto.dto.UsuarioDTO;
import br.com.fuctura.projeto.model.Usuario;
import br.com.fuctura.projeto.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    // @GetMapping end point de busca
    // @PostMapping end point de inserir
    // @PutMapping end point de atualizar
    // @DeleteMapping end point de deletar

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getById(@PathVariable Integer id) {
        Usuario usu = usuarioService.findById(id).get();
        return ResponseEntity.ok().body(modelMapper.map(usu, UsuarioDTO.class));

//        Usuario usu = usuarioService.findById(id).get();
//        UsuarioDTO usuDTO = new UsuarioDTO(usu);
//        return ResponseEntity.ok().body(usuDTO);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> findAll() {
        List<Usuario> usuList = usuarioService.finAll();
        return ResponseEntity.ok().body(usuList.stream().map(x -> modelMapper.map(x, UsuarioDTO.class))
                .collect(Collectors.toList()));


//        List<Usuario> listUsu = usuarioService.finAll();
//        List<UsuarioDTO> listDTO = new ArrayList<>();
//
//        for (Usuario uso: listUsu) {
//            listDTO.add(new UsuarioDTO(uso));
//
//        }
//        return listDTO;
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usu = usuarioService.save(usuarioDTO);
        return ResponseEntity.ok().body(modelMapper.map(usu, UsuarioDTO.class));

//        Usuario usu = usuarioService.save(usuarioDTO);
//        UsuarioDTO usuDTO = new UsuarioDTO(usu);
//        return  usuDTO;
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDTO> upDate(@PathVariable Integer id, @RequestBody UsuarioDTO usuarioDTO) {
        usuarioDTO.setId(id);
        return ResponseEntity.ok().body(modelMapper.map(usuarioService.upDate(usuarioDTO), UsuarioDTO.class));

//        Usuario usu = usuarioService.findById(id).get();
//        UsuarioDTO usuDTO = new UsuarioDTO(usu);
//        return usuarioService.upDate(id, usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        usuarioService.delete(id);

    }
}
