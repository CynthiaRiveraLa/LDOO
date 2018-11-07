/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eliza
 */
public class FactoryPatternDemo {

   public static void main(String[] args) {
      EJFactory EJFactory = new EJFactory();

      EJ EJ1 = EJFactory.getEJ("Pesas");
      EJ1.ejercicio();
      EJ EJ2 = EJFactory.getEJ("Correr");
      EJ2.ejercicio();
      EJ EJ3 = EJFactory.getEJ("Peleas");
      EJ3.ejercicio();
   }
}

