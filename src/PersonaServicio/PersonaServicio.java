/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaServicio;

import entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author Bangho
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.println("Ingrese el nombre : ");
        String nombre = leer.nextLine();
        persona.setNombre(nombre);

        System.out.println("Ingrese el sexo (H, M u O): ");
        String sexo = leer.nextLine().toUpperCase();

        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("Sexo no valido. Ingrese el sexo (H, M u O): ");
            sexo = leer.nextLine().toUpperCase();
        }
            System.out.println(" te sexo es :"+sexo);

        persona.setSexo(sexo);

        boolean esMayor = obtenerEdad();
        persona.setEdad(esMayor ? 1 : 0);

        return persona;
    }

    public boolean obtenerEdad() {
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        leer.nextLine();
        if (edad >= 18) {
            return true;
        } else {
            System.out.println("Edad no valida. Ingrese una edad mayor o igual a 18: ");
            return obtenerEdad();
            
        }
    }  
     

 public void datosPersona(Persona persona){
         
            System.out.println("Ingresa tu peso ");
            int peso = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese la altura :");
            int altura = leer.nextInt();
            leer.nextLine();
            persona.setPeso(peso);
            persona.setAltura(altura);
            
 }
   public int imc (Persona persona){
        int imc = persona.getPeso()/ (persona.getAltura()*persona.getAltura());
        
        if (imc<20){
    return -1;
    } else if (imc >=20 && imc <= 25){
       return 0;
    }else {
            return 1;
            }
        }
   public boolean esMayorDeEdad(Persona persona){
   return persona.getEdad()>= 18;}
}





    

