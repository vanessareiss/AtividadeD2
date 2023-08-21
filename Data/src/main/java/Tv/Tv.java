/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tv;

/**
 *
 * @author Aluno
 */
public class Tv {
   
   private boolean ligada = false; 
   private int canal = 1;
   private int volume = 0; 
   
    
public void ligarDesligar (){
ligada = !ligada;
if (ligada){
    System.out.println("Tv Ligada");
} else {
    System.out.println("Tv Desligada");
}
}    
public void getImprimir(){

System.out.println ("Tv: " + ligada + "\n Canal: " + canal + "\n Volume: " + volume);

}

public void setAlterar(int canal){
 if ((canal != 1 || canal != 3 || canal != 5 || canal !=7 || canal !=11)){
  this.canal = canal;
 System.out.println("Canal Inválido!"); 
 } else{ 
  this.canal = canal;
  System.out.println("Canal Alterado!");

 }
}

public void setAumentar (){
if (volume < 101 && volume > 0) {
this.volume += 1; 

System.out.println ("Volume Alterado para: " + volume);
} else{
System.out.println("Erro! Limite de volume: 100");
}

}

public void setDiminuir (){
if (volume < 101 && volume > 0) {
this.volume -= 1; 

System.out.println ("Volume Alterado para: " + volume);
} else{
System.out.println("Erro! Limite de volume: 0");
}


}


    
    
    
}
