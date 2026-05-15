import java.util.ArrayList;
import java.util.List;

public class MediadorChat implements Mediador{
    private List<Colaborador> colaboradores = new ArrayList<>();

    public void adicionarColaborador(Colaborador c){
        colaboradores.add(c);
        c.setMediador(this);
    }

    @Override
    public void enviarMsg(String mensagem, Colaborador remetente){
        for (Colaborador c : colaboradores){
            if (c != remetente){
                c.receber(remetente.getNome() + ": " + mensagem);
            }
        }
    }
    
}
