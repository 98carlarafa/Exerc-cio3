/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TesteLoja {
     public static void main(String[] args) {
        Loja Loja1 = new Loja ();
        Loja1.vendedor = "Carla";
        Loja1.cliente = "Maria";
        Loja1.preco_compra = 50.0;
        
        System.out.println ("Nome do Vendedor da Loja1:" +Loja1.vendedor);
        
        Loja Loja2 = new Loja ();
        Loja2.vendedor = "João";
        Loja2.cliente = "Téo";
        Loja2.preco_compra = 100.0;
        
        System.out.println ("Nome do Cliente da Loja2:" +Loja2.cliente);
        
        Loja Loja3 = new Loja ();
        Loja3.vendedor = "Lucas";
        Loja3.cliente = "Otávio";
        Loja3.preco_compra = 120.0;
        
        System.out.println ("Preço da compra na Loja3:" +Loja3.preco_compra);
     }
    
}
