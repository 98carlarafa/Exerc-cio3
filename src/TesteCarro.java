/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TesteCarro {
    public static void main(String[] args) {
        Carro Carro1 = new Carro ();
        Carro1.nome_carro = "Siena";
        Carro1.ano = 2013;
        Carro1.preco = 25.000;
        
        System.out.println ("Nome do Carro1:" +Carro1.nome_carro);
        
        Carro Carro2 = new Carro ();
        Carro2.nome_carro = "Gol";
        Carro2.ano = 2009;
        Carro2.preco = 15.000;
        
        System.out.println ("Ano do Carro2:" +Carro2.ano);
        
        Carro Carro3 = new Carro ();
        Carro3.nome_carro = "Civic";
        Carro3.ano = 2019;
        Carro3.preco = 50.000;
        
        System.out.println ("Preço do Carro3:" +Carro3.preco);
        
        
    }
    
}
