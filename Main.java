public class Main{
    public static void main(String[] args){
        MediadorChat sala = new MediadorChat();

        Colaborador user1 = new Usuario("Livia");
        Colaborador user2 = new Usuario("Tati");
        Colaborador user3 = new Usuario("Lucas");

        sala.adicionarColaborador(user1);
        sala.adicionarColaborador(user2);
        sala.adicionarColaborador(user3);

        System.out.println("--- Início do Chat ---");
        user1.enviar("Oii, tudo bem?");
        System.out.println("----------------------");
        user2.enviar("Olá, tudo bem");
    }
}