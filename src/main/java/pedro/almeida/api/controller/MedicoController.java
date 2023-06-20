package pedro.almeida.api.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import pedro.almeida.api.medico.DadosCadastroMedicoDTO;
import pedro.almeida.api.medico.DadosListagemMedicoDTO;
import pedro.almeida.api.medico.MedicoJPA;
import pedro.almeida.api.medico.MedicoRepository;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicoDTO dados){
        repository.save(new MedicoJPA(dados));
    }

    @GetMapping
    public Page<DadosListagemMedicoDTO> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacacao){
        return repository.findAll(paginacacao).map(DadosListagemMedicoDTO::new);
    }

}
