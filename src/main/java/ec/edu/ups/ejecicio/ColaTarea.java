/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejecicio;

import java.util.LinkedList;
import java.util.Queue;
import org.w3c.dom.ls.LSException;

/**
 *
 * @author LAB-05
 */
public class ColaTarea<T> {
    private Queue<Tarea<T>> colaTarea;

    public ColaTarea() {
        colaTarea = new LinkedList<>();
    }
    
    public void agregarTarea(Tarea<T> tarea){
        colaTarea.offer(tarea);
    }
    
    public Tarea<T> porcesarTarea(){
        Tarea<T> tareaProcesada = colaTarea.poll();
        return tareaProcesada;
    }
    
    public boolean estaVacia(){
        return colaTarea.isEmpty();
    }
    
}
