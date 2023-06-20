package pedro.almeida.api.medico;

public record DadosListagemMedicoDTO(String nome, String email, String crm, Especialidade especialidade){

    public DadosListagemMedicoDTO(MedicoJPA medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
