/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;
 

/**
 *
 * @author Roniel Nunes
 */
public class FolhaPagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        
        Funcionario pessoa1 = new Funcionario("poliane","25/01/1998");
        pessoa1.contratar("Efetivo",5000f,0, "01/03/2022");
        pessoa1.calculaSalarioBruto(100);
        pessoa1.folhaPagamento(100);
        
        
        Funcionario pessoa2 = new Funcionario("Daniel","15/09/1981");
        pessoa1.contratar("Horista",4000f,3, "01/03/2032");
        pessoa1.calculaSalarioBruto(100);
        pessoa1.folhaPagamento(100);
        
        Funcionario pessoa3 = new Funcionario("Bruno","05/02/2000");
        pessoa1.contratar("Efetivo",1200f,0, "31/12/2021");
        pessoa1.calculaSalarioBruto(100);
        pessoa1.folhaPagamento(100);
        
        Funcionario pessoa4 = new Funcionario("Gabriel","27/04/2001");
        pessoa1.contratar("Efetivo",3000f,5, "06/04/2000");
        pessoa1.calculaSalarioBruto(100);
        pessoa1.folhaPagamento(100);
        
    }
    
}

 