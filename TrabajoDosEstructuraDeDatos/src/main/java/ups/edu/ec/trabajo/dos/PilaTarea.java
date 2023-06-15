/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.trabajo.dos;

import java.util.Stack;

/**
 *
 * @author estem
 */
public class PilaTarea<T> {
    private Stack <Tarea<T>> pilaTarea; 

    public PilaTarea() {
        pilaTarea = new Stack<>();
    }
    
    public void agregarTarea(Tarea<T> tarea){
        pilaTarea.push(tarea);
    }
    
    public Tarea<T> procesarTarea(){
        Tarea<T> tareaProcesada = pilaTarea.pop();
        return tareaProcesada;
    }
    
    public Tarea<T>[] procesarArray() {
        Tarea<T>[] arregloTareas = new Tarea[pilaTarea.size()];
        pilaTarea.toArray(arregloTareas);
        return arregloTareas;
    }
    
    public boolean estaVacia(){
        return pilaTarea.isEmpty();
    }
}
