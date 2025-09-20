import java.util.Scanner;

public class Profissional {
    private Long id;
    private String nome;
    private String registroConselho;
    private String telefone;
    private String email;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        exibirDetalhesDoPaciente(
        98948298,
        "Wallace Gonzaga Dijkstra", 
        "WallaceGonzaga@gmail.com", 
        "(68)40028922",
        "Yare Y");
        long idEntrada = entrada.nextLong();
        if(idEntrada == id){
            exibirDetalhesDoPaciente(id, nome, email, telefone, registroConselho);
        }
        entrada.close();
    }

    public void exibirDetalhesDoPaciente(
    long id,
    String nome, 
    String email, 
    String telefone,
    String registroConselho)
    {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("RegistroConselho: " + registroConselho);

    }
}