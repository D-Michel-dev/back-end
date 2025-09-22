public class Especialidade {
    private Long id;
    private String nome;

    public Especialidade(Long id, String nome) {
        this.id = id;
        this.nome = nome;   
    }   

    String EspecialidadeFormatada() {
        return String.format("ID: " + id + "\n" + "ESPECIALIDADE: " + nome);
    }
}