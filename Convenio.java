public class Convenio {

    public static void main(String[] args) {
        Convenio convenio = new Convenio();

        convenio.setId(21L);
        convenio.mostrarId();

        convenio.setNome("Convênio Exemplo");
        convenio.exibirNome();

        convenio.setRazaoSocial("Razão Social Exemplo Ltda.");
        convenio.exibirRazaoSocial();

        convenio.setCnpj("12.345.678/0001-99");
        convenio.exibirCnpj();

        convenio.setRepresentante("João da Silva");
        convenio.exibirRepresentante();

        convenio.setEmail("webacademy@gmail.com");
        convenio.exibirEmail();

        convenio.setTelefone("(12) 3456-4321");
        convenio.exibirTelefone();

        convenio.setAtivo(true);
        convenio.exibirAtivo();
    }

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void mostrarId() {
        System.out.println("ID do Convênio: " + id);
    }

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;

    }

    public void exibirNome() {
        System.out.println("Nome do Convênio: " + nome);
    }

    private String razaoSocial;

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void exibirRazaoSocial() {
        System.out.println("Razão Social: " + razaoSocial);
    }

    private String cnpj;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void exibirCnpj() {
        System.out.println("CNPJ: " + cnpj);
    }

    private String representante;

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getRepresentante() {
        return representante;
    }

    public void exibirRepresentante() {
        System.out.println("Representante: " + representante);
    }

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void exibirEmail() {
        System.out.println("Email: " + email);
    }

    private String telefone;

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void exibirTelefone() {
        System.out.println("Telefone: " + telefone);
    }

    private Boolean ativo;

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void exibirAtivo() {
        System.out.println("Ativo: " + ativo);
    }
}