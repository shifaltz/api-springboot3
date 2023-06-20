package pedro.almeida.api.medico;

import pedro.almeida.api.endereco.DadosCadastroEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosCadastroEndereco endereco
){}
