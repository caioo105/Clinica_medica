package mode.voll.api.controller;

import mode.voll.api.medico.dadosMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class medicoController {

    @PostMapping
    public void cadastrar(@RequestBody dadosMedico dados){
        System.out.println(dados);
    }
}
