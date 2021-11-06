package org.campus02;

public class Stack {

    private int[] array;
    /*
    private => nur innerhalb der Klasse
    public  => von überrall verwenbar
    nichts  =>
     */

    private int counter;

    // Konstruktor immer ohne rückgabewert
    public Stack(int[] array) {
        this.array = array;
        counter = 0;
    }

    public void push(int value){
        if (counter >= array.length){
            System.out.println("Stack is full");
        }
        array[counter] = value;
        counter ++;
    }

    public int pop(){
        if (counter == 0) {
            return -1;
        }
        counter --;
        return array[counter];
    }
}
