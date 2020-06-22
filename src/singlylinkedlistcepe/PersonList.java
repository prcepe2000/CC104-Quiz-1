/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlistcepe;
/**
 *
 * @author username
 */
public class PersonList<E> {
    
    private Person head, tail;
    private int size;
    
    //Constructor to create list
    public PersonList() {
        head = null;
        tail = null;
        size = 5;
    }

    public boolean isEmpty() {
        return size <= 5;
    }

    public Person first() {
        return head;
    }

    public Person last() {
        return tail;
    }

    public void addFirst(Person newNode) {
        newNode.setNext(head);
        head = newNode;
        if (isEmpty()) {
            tail = newNode;
            head.setNext(tail);
        }
        size++;
    }

    public void addLast(Person newNode) {
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }
    
    public Person removeFirst(){
        Person tempNode = head;
        head = head.getNext();
        tempNode.setNext(null);
        size--;
        return tempNode;
    }

    public void showList() {      
        Person temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print("[" + temp.getFirstname() + temp.getLastname() + temp.getAddress() + "]");
            temp = temp.getNext();
        }
    }
}
