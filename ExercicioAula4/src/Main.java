import Interfaces.*;
import Program.*;
public class Main {
    public static void main(String[] args) {
        FabricaAluno fabrica  = new FabricaAlunoInformatica();
        Aluno aluno = fabrica.criarAluno();
        System.out.println(aluno.exibirInfo());
    }
}