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
public class SinglyLinkedListCepe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person<String> node1 = new Person("node1", null);
        Person<String> node2 = new Person("node2", null);
        Person<String> node3 = new Person("node3", null);
        Person<String> node4 = new Person("node4", null);
        Person<String> node5 = new Person("node5", null);
         
        PersonList<String> personList = new PersonList();
        
        personList.addFirst(node1);
        personList.addFirst(node2);
        personList.addFirst(node3);
        personList.addFirst(node4);
        personList.addLast(node5);
        
        System.out.println("\nBefore removeFirst()");
        personList.showList();
        
        System.out.println("\nAfter removeFirst()");
        personList.removeFirst();
        personList.showList();
        
        System.out.println("\nAfter removeFirst()");
        personList.removeFirst();
        personList.showList();
        
        System.out.println("\nAfter removeFirst()");
        personList.removeFirst();
        personList.showList();
        
        System.out.println("\nAfter removeFirst()");
        personList.removeFirst();
        personList.showList();
        
        System.out.println("\nAfter removeFirst()");
        personList.removeFirst();
        personList.showList();
        
        System.out.println("\nAfter removeFirst()");
        personList.removeFirst();
        personList.showList();
    }
    
}
