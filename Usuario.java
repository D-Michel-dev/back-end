import java.util.Scanner;

public class Usuario {
    private Long id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String senha;
    private Boolean ativo;
    private String papel;

    public Usuario(Long id, String nomeCompleto, String nomeUsuario, String senha, Boolean ativo, String papel) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.ativo = ativo;
        this.papel = papel;
    }

    public Long getId() { return id; }
    public String getNomeCompleto() { return nomeCompleto; }
    public String getNomeUsuario() { return nomeUsuario; }
    public String getSenha() { return senha; }
    public Boolean getAtivo() { return ativo; }
    public String getPapel() { return papel; }

    static Usuario buscarUsuarioPorId(int id) {
        if (id == 1234) {
            return new Usuario(
                1234L,
                "Luis Henrique",
                "luishenrique",
                "senha123",
                true,
                "Administrador"
            );
        }
        return null;
    }

    static void exibirUsuario(Usuario user) {
        if (user == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }
        System.out.println("ID: " + user.getId());
        System.out.println("Nome Completo: " + user.getNomeCompleto());
        System.out.println("Nome de Usuário: " + user.getNomeUsuario());
        System.out.println("Senha: " + user.getSenha());
        System.out.println("Ativo: " + user.getAtivo());
        System.out.println("Papel: " + user.getPapel());
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o ID do usuário: ");
        int input = entrada.nextInt();
        Usuario user = buscarUsuarioPorId(input);
        exibirUsuario(user);
        entrada.close();
    }
}
