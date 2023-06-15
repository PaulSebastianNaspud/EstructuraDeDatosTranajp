/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ups.edu.ec.trabajo.dos;

import java.util.Arrays;
import java.util.function.ObjDoubleConsumer;

/**
 *
 * @author estem
 */
public class TrabajoDosEstructuraDeDatos {

    public static void main(String[] args) {

        System.out.println("Cola y Pila implementacion generica: !");

        //instanciar
        ColaTarea<String> colaTarea = new ColaTarea<>();
        PilaTarea<Integer> pilaTareaInt = new PilaTarea<>();
        ColaTarea<Integer> colaTareaInt = new ColaTarea<>();
        ColaTarea<int[]> colaTareaArreglo = new ColaTarea<>();
        ColaTarea<String[]> colaTareaArregloString = new ColaTarea<>();

        //inserccion
        colaTarea.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTarea.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTarea.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTarea.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTarea.agregarTarea(new Tarea(5, "Tarea 5"));

        //enteros
        colaTareaInt.agregarTarea(new Tarea(1, 1));
        colaTareaInt.agregarTarea(new Tarea(2, 2));
        colaTareaInt.agregarTarea(new Tarea(3, 3));
        colaTareaInt.agregarTarea(new Tarea(4, 4));
        colaTareaInt.agregarTarea(new Tarea(5, 5));

        //pila entero
        pilaTareaInt.agregarTarea(new Tarea(1, 1));
        pilaTareaInt.agregarTarea(new Tarea(2, 2));
        pilaTareaInt.agregarTarea(new Tarea(3, 3));
        pilaTareaInt.agregarTarea(new Tarea(4, 4));
        pilaTareaInt.agregarTarea(new Tarea(5, 5));

        //arreglo
        colaTareaArreglo.agregarTarea(new Tarea(1, new int[]{1, 3, 4, 7, 5, 2}));
        colaTareaArreglo.agregarTarea(new Tarea(2, new int[]{6, 3, 4, 6, 8, 7}));
        colaTareaArreglo.agregarTarea(new Tarea(3, new int[]{1, 3, 4, 6, 8, 10}));

        //arreglo string
        colaTareaArregloString.agregarTarea(new Tarea(1, new String[]{"el paul se la come jsjsjsjsjsjsjj", "el zavala tambien", "a la sofia le gustan los bagres", "la karen calcula voltaje"}));
        colaTareaArregloString.agregarTarea(new Tarea(1, new String[]{"Hola", "mundo"}));
        colaTareaArregloString.agregarTarea(new Tarea(1, new String[]{"Palabra", "Cualquiera"}));

//        while (!colaTareaArreglo.estaVacia()) {
//            Tarea<int[]> tareaProcesada = colaTareaArreglo.porcesarTarea();
//
//            System.out.println("Prosesando tarea de la cola \n\t Sale -->" + tareaProcesada.getId() + " _ " + Arrays.toString(tareaProcesada.getAtributo()));
//        }
//
//        while (!colaTareaInt.estaVacia()) {
//            Tarea<Integer> tareaProcesada = colaTareaInt.porcesarTarea();
//
//            System.out.println("Prosesando tarea de la cola \n\t Sale -->" + tareaProcesada.getId() + " _ " + tareaProcesada.getAtributo());
//        }
//
//        //procesar las tareas de la cola<String>
//        while (!colaTarea.estaVacia()) {
//            Tarea<String> tareaProcesada = colaTarea.porcesarTarea();
//
//            System.out.println("Prosesando tarea de la cola \n\t Sale -->" + tareaProcesada.getId() + " _ " + tareaProcesada.getAtributo());
//        }
//
//        while (!pilaTareaInt.estaVacia()) {
//            Tarea<Integer> tareaProcesada = pilaTareaInt.procesarTarea();
//
//            System.out.println("Prosesando tarea de la cola \n\t Sale -->" + tareaProcesada.getId() + " _ " + tareaProcesada.getAtributo());
//        }
//
//        while (!colaTareaArregloString.estaVacia()) {
//            Tarea<String[]> tareaProcesada = colaTareaArregloString.porcesarTarea();
//
//            System.out.println("Prosesando tarea de la cola \n\t Sale -->" + tareaProcesada.getId() + " _ " + Arrays.toString(tareaProcesada.getAtributo()));
//        }
        PilaTarea<ColaTarea[]> pilaTareaCola = new PilaTarea<>();

        pilaTareaCola.agregarTarea(new Tarea(1, colaTarea));
        pilaTareaCola.agregarTarea(new Tarea(2, colaTareaInt));
        pilaTareaCola.agregarTarea(new Tarea(3, colaTareaArreglo));
        pilaTareaCola.agregarTarea(new Tarea(4, colaTareaArregloString));

        while (!pilaTareaCola.estaVacia()) {
            Tarea<ColaTarea> colaTareaDePila = pilaTareaCola.procesarTarea();
            System.out.println("Cola #"+colaTareaDePila.getId());
            while (!colaTareaDePila.getAtributo().estaVacia()) {
                Tarea<?> tareaProcesada = colaTareaDePila.getAtributo().procesarTarea();
                Object atributo = tareaProcesada.getAtributo();

                if (atributo instanceof int[]) {
                    int[] arreglo = (int[]) atributo;
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.println("Procesando tarea de la pila: \n\t Sale--> " + tareaProcesada.getId() + " - " + arreglo[i]);
                    }
                } else if (atributo instanceof String[]) {
                    String[] arreglo = (String[]) atributo;
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.println("Procesando tarea de la pila: \n\t Sale--> " + tareaProcesada.getId() + " - " + arreglo[i]);
                    }
                } else {
                    System.out.println("Procesando tarea de la pila: \n\t Sale--> " + tareaProcesada.getId() + " - " + atributo);
                }
            }
        }

    }

}
