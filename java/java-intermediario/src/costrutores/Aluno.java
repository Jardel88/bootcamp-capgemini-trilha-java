package costrutores;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    STATUS situacaoAluno;
    MATRICULA situacaoMatricula;

    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public enum STATUS {
        APROVADO,
        REPROVADO
    }

    public enum MATRICULA {
        MATRICULADO,
        PENDENTE,
        RECUSADO
    }

    public double calcularMediaAluno(){
        return (nota1 + nota2 + nota3) / 3;
    }
}
