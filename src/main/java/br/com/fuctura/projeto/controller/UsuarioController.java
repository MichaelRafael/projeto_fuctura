package br.com.fuctura.projeto.controller;

import br.com.fuctura.projeto.model.Usuario;
import br.com.fuctura.projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    // @GetMapping end point de busca
    // @PostMapping end point de inserir
    // @PutMapping end point de atualizar
    // @DeleteMapping end point de deletar

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.finAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getById(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {
        return  usuarioService.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario upDate(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.upDate(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        usuarioService.delete(id);
    }
}
