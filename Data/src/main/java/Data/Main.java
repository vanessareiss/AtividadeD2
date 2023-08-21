/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Aluno
 */
public class Main {
    
     public static void main(String[] args){
    
      Data data = new Data ();
      
     
      // inserindo data válida
      data.setInserir(20, 6, 2000);
      data.getImprimir();
      // inserindo data inválida
      data.setInserir(1, 0, 2000);
      data.getImprimir();
      // Alterando data
      data.setAlterar(20, 10, 2003);
      data.getImprimir();
      // Avançar dia
      data.setAvancarDia(44);
      data.getImprimir(); 
  
      
    } 
    
}
