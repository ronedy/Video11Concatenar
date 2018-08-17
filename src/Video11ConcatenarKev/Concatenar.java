/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video11ConcatenarKev;

/**
 *
 * @author HP ENVY
 */
public class Concatenar {
    
    public void concatenar(){
         
        System.out.println("Concatenar caracteres");
       
        String nombre = "Kevin";
        
    
        
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi nombre tiene: "+nombre.length()+" caracteres");
        System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
        
        //ahora sacare la ultima letrea de mi nombre
        int ultima;
        //podria hacerlo con for pero mejor asi
        ultima = nombre.length();
        
        System.out.println("La ultima letra de " + nombre + " es " +nombre.charAt(ultima-1));
    }
}
