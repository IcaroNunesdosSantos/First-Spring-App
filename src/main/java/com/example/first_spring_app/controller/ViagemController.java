package com.example.first_spring_app.controller;

import com.example.first_spring_app.model.Viagem;
import com.example.first_spring_app.service.ViagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/viagens")
public class ViagemController {

    private final ViagemService viagemService;

    public ViagemController(ViagemService viagemService) {
        this.viagemService = viagemService;
    }

    @GetMapping
    public List<Viagem> listar(){
        return viagemService.listarTodas();
    }

    @GetMapping("/{id}")
    public Viagem listarPorId(@PathVariable Long id){
        return viagemService.buscarPorId(id);
    }

    @PostMapping
    public Viagem criarViagem(@RequestBody Viagem viagem){
        return viagemService.cadastrar(viagem);
    }

    @DeleteMapping("/{id}")
    public void deletarViagem(@PathVariable Long id){
        viagemService.deletar(id);
    }
}
