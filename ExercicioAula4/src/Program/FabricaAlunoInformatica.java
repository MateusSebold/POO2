package Program;

import Interfaces.Aluno;
import Interfaces.FabricaAluno;

public class FabricaAlunoInformatica implements FabricaAluno {
    @Override
    public Aluno criarAluno() {
        return new AlunoInformatica();
    }
}
