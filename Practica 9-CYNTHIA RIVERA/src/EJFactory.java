/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eliza
 */
public class EJFactory {
	
   //use getShape method to get object of type shape 
   public EJ getEJ(String EJType){
      if(EJType == null){
         return null;
      }		
      if(EJType.equalsIgnoreCase("PESAS")){
         return new Pesas();
         
      } else if(EJType.equalsIgnoreCase("CORRER")){
         return new Correr();
         
      } else if(EJType.equalsIgnoreCase("Pelear")){
         return new Pelear();
      }
      
      return null;
   }
}
