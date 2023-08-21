/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Aluno
 */
public class Data {
    int dia;
    int mes;
    int ano; 
       
    
    public void getImprimir(){
    
    System.out.println(dia + "/" + mes + "/" + ano);
    
    
    }
    
  public void setInserir( int dia, int mes, int ano){
      
     if ( (dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (ano > 1900 && ano < 2100) ){
           this.dia = dia;
           this.mes = mes;
           this.ano = ano;
           System.out.println("Data válida!");
     }
     else {
  
        this.dia = 0;
        this.mes = 0;
        this.ano = 0; 
        
        System.out.println("Dia, mês e ano zerados.");
    }
  }
  
  public void setAlterar(int dia, int mes, int ano){
      if ((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (ano > 1900 && ano < 2100)){
      
      this.dia = dia;
      this.mes = mes;
      this.ano = ano; 
      System.out.println("Data válida!");
     }
     else {
  
        this.dia = 0;
        this.mes = 0;
        this.ano = 0; 
        
        System.out.println("Dia, mês e ano zerados.");
    }
        
   }
  
  public void setAvancarDia(int dia){
    this.dia += dia;
    if (this.dia > 31){
        this.mes += this.dia / 31;
        this.dia = this.dia % 31;
        
        if(this.mes > 12){
            this.ano += this.mes/12;
            this.mes = this.mes % 12;
        }
    }
  }
  
    
}

