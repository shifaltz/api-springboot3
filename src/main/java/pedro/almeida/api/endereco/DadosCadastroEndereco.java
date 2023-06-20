package pedro.almeida.api.endereco;

public record DadosCadastroEndereco(
        String logradouro,
        String bairro,
        String cep,
        String cidade,
        String uf,
        String complemento,
        String numero
){}
