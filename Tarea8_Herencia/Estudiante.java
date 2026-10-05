/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea8_Herencia;

/**
 *
 * @author Alan
 */
public class Estudiante extends Persona {
    
    private String matricula;
    private String carrera;
    
    public Estudiante(String matricula, String carrera, String nombre, String cedula) {
    super(nombre,cedula);
    
    this.matricula = matricula;
    this.carrera = carrera;
    }
    
    @Override
    public String toString(){
    return super.toString() + "| Matricula:" + matricula +" | Carrera: " + carrera;
    }
    
       public static void main (String[] arg){
        
     Estudiante estudiante1 = new Estudiante("Alan", "1234567", "2024-001", "Ingeniería en Sistemas");

        System.out.println(estudiante1);
    }
   
    
    
    
}
