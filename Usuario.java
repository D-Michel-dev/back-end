import java.util.Objects;

public class Usuario {
    public static void main(String[] args) {}
        
    
    private Long id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String senha;
    private Boolean ativo;
    private String papel;

    // --- Construtores (Opcional, mas recomendado) ---
    public Usuario() {
    }

    public Usuario(Long id, String nomeCompleto, String nomeUsuario, String senha, Boolean ativo, String papel) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.ativo = ativo;
        this.papel = papel;
    }

    // --- Getters e Setters ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(nomeUsuario, usuario.nomeUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeUsuario);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", ativo=" + ativo +
                ", papel='" + papel + '\'' +
                '}';
    }
}
