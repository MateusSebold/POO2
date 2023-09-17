package Program;

import Interfaces.Aluno;

public class AlunoInformatica  implements Aluno {

    @Override
    public String exibirInfo() {
        return "Aluno :  Informática";
    }
}
