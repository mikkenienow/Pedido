package aula;

public class Aluno {
    String nome;
    int matricula;
    int anoLetivo;
    String telefoneContato;
    
    void aprovarReprovar(double media){
        if (media >=6){
            anoLetivo++;
            System.out.println(nome+" Aprovado");
        } else{
            System.out.println(nome+" Reprovado");
        }
    }
    
    
    
}
