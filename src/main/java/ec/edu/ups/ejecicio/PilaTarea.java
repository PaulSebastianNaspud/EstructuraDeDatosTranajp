/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejecicio;

import java.util.Stack;

/**
 *
 * @author LAB-05
 */
public class PilaTarea<T> {
    private Stack <Tarea<T>> pilaTarea; 

    public PilaTarea() {
        pilaTarea = new Stack<>();
    }
    
    public void agregarTarea(Tarea<T> tarea){
        pilaTarea.push(tarea);
    }
    
    public Tarea<T> porcesarTarea(){
        Tarea<T> tareaProcesada = pilaTarea.pop();
        return tareaProcesada;
    }
    
    public boolean estaVacia(){
        return pilaTarea.isEmpty();
    }
}
