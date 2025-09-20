import java.time.LocalDate;

public class metodoPaciente {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(1L, "Elton", "eltonbarbosaa001@gmail.com", "68 9 9936 5536", LocalDate.of(2004, 10, 23), "B+", "Masculino", "00000-000", "Rua 00 de Dezembro, 000", "Rio Branco", "Acre");

        System.out.println(paciente1.obterPaciente());
    }
}