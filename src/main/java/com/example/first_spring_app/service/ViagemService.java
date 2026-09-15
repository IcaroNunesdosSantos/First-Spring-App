package com.example.first_spring_app.service;

import com.example.first_spring_app.model.Viagem;
import com.example.first_spring_app.repository.ViagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViagemService {

    private final ViagemRepository viagemRepository;


    public ViagemService(ViagemRepository viagemRepository) {
        this.viagemRepository = viagemRepository;
    }

    public List<Viagem> listarTodas(){
        return viagemRepository.findAll();
    }

    public Viagem buscarPorId(Long id){
        return viagemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Viagem não encontrada"));
    }

    public Viagem cadastrar(Viagem viagem){
        return viagemRepository.save(viagem);
    }

    public void deletar(Long id){
        viagemRepository.deleteById(id);
    }
}
