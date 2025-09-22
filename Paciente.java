import java.time.LocalDate;

public class Paciente {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String grupoSanguineo;
    private String sexo;
    private String cep;
    private String endereco;
    private String cidade;
    private String estado;

    public Paciente(Long id, String nome, String email, String telefone, LocalDate dataNascimento, String grupoSanguineo, String sexo, String cep, String endereco, String cidade, String estado) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.grupoSanguineo = grupoSanguineo;
        this.sexo = sexo;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    String obterPaciente() {
        return String.format("ID: " + id + "\n" + "NOME: " + nome + "\n" + "EMAIL: " + email + "\n" + "TELEFONE: " + telefone + "\n" + "DATA DE NASCIMENTO: " + dataNascimento + "\n"
        + "GRUPO SANGUÍNEO: " + grupoSanguineo + "\n" + "SEXO: " + sexo + "\n" + "CEP: " + cep + "\n" + "ENDEREÇO: " + endereco + "\n" + "CIDADE: " + cidade + "\n" + "ESTADO: " + estado);
    }
}