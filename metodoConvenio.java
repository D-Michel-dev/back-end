public class metodoConvenio {
    
    public static void main(String[] args) {
        
        Convenio registro1 = new Convenio(1L, "Unimed","Unimed Rio Branco Cooperativa de Trabalho Médico Ltda", "84.313.741/0001-12",
        "Dr. Marcus Yomura", "sac@unimedrb.com.br" , "(68) 92106-4510", true);

        System.out.println(registro1.registroConvenio());
    }
}
