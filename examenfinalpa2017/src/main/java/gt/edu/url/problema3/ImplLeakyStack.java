/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author Julita
 */
public class ImplLeakyStack {
    public class ImplLeakyStack implements LeakyStack {
    public CircularLinkedList<Animal> lista = null;
    private int HistorialMaximo = 0;
    private Animal AnimalActual = null;
    private boolean guardarList = false;
    private int guardados = 0;
    private int undos = 0;
    
    public ImplLeakyStack(int maxHistory){
        lista = new CircularLinkedList<Animal>();
        HistorialMaximo = maxHistory;
    }
    

    public void saveHistoy(Animal animal) {
        if (guardarList){
            lista.addFirst(AnimalActual);
            AnimalActual = animal;
            guardados++;
        } else {
            AnimalActual = animal;
            guardarList = true;
        }
    }

    @Override
    public Animal undo() {
        if (guardados == 0){
            throw new IllegalArgumentException("No hay animales en el historial");
        } else {
            if (HistorialMaximo != undos){
                Animal an = lista.first();
                lista.removeFirst();
                guardados--;
                undos++;
                return an;
            } else {
                throw new IllegalArgumentException("Se alcanzó el limite del historial");
            }
        }
    }
    
}
}
