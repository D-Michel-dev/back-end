import java.time.LocalDate;

public class Convenio {
    private Long id;
    private String nome;
    private String razaoSocial;
    private String cnpj;
    private String representante;
    private String email;
    private String telefone;
    private Boolean ativo;

    public Convenio(Long id, String nome, String razaoSocial, String cnpj, String representante, String email, String telefone, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.representante = representante;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    String registroConvenio(){
        return String.format("ID: " + id + "\n" + "NOME: " + nome + "\n" + "RAZAO SOCIAL: " + razaoSocial + "\n" + "CNPJ: " + cnpj + "\n" + "REPRESENTANTE: " + representante + "\n"
        + "EMAIL: " + email + "\n" + "TELEFONE: " + telefone + "\n" + "ATIVO: " + ativo);
    }
}