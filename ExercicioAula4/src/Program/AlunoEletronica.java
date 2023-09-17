package Program;

import Interfaces.Aluno;

public class AlunoEletronica implements Aluno {
    @Override
    public String exibirInfo() {
        return "Aluno Eletronica";
    }
}
