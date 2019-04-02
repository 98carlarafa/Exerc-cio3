/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TesteAluno {
    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno ();
        Aluno1.nome = "Carla";
        Aluno1.idade = 20;
        Aluno1.altura = 1.70;
        
        System.out.println ("Nome do Aluno1:" +Aluno1.nome);
        
        Aluno Aluno2 = new Aluno ();
        Aluno2.nome = "John";
        Aluno2.idade = 21;
        Aluno2.altura = 1.80;
        
        System.out.println ("Idade do Aluno2:" +Aluno2.idade);
        
        Aluno Aluno3 = new Aluno ();
        Aluno3.nome = "Luciano";
        Aluno3.idade = 30;
        Aluno3.altura = 1.60;
        
        System.out.println ("Altura do Aluno3:" +Aluno3.altura);
        
        
    }
}
