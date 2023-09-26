package JAVA.Homework.Homework_seminar4;

import java.util.LinkedList;

public class MyQueue<Integer> {
    
    LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(Integer element){
        list.addLast(element);
    }

    public void dequeue(){
        list.removeFirst();
    }

    public Integer first(){
        return list.getFirst();
    }

    public LinkedList<Integer> getElements() {
        for (int index = 0; index < list.size(); index++) {
            list.get(index);
        }
        return list;
    }
}
