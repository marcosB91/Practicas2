/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersona;

import PersonaServicio.PersonaServicio;
import entidades.Persona;

/**
 *
 * @author Bangho
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { PersonaServicio servicio = new PersonaServicio();
    Persona persona = servicio.crearPersona();

    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Sexo: " + persona.getSexo());
    System.out.println("Edad: " + persona.getEdad());

    servicio.datosPersona(persona);
    int imc = servicio.imc(persona);

    if (imc == -1) {
        System.out.println("Bajo peso");
    } else if (imc == 0) {
        System.out.println("Peso normal");
    } else {
        System.out.println("Sobrepeso");
    }

    if (servicio.esMayorDeEdad(persona)) {
        System.out.println("Es mayor de edad");
    } else {
        System.out.println("Es menor de edad");
    }
}
    }
    

