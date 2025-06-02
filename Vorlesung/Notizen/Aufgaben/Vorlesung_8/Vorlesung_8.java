package Vorlesung.Notizen.Aufgaben.Vorlesung_8;

public class Vorlesung_8 {
    public static void main(String[] args) {
//        doubleLinkedList();
        myVehicle();
    }

    public static void doubleLinkedList() {
        DoublyLinkedList<Number> list = new DoublyLinkedList<>();
        list.add(5);
        list.add(3.14);
        list.add(42L);
        list.add(7.5f);

        list.printList(); // Output: 5 3.14 42 7.5
    }

    public static void myVehicle() {
        MyVehicle vehicle1 = new MyVehicle("Toyota", "Camry", 4, 180);
        MyVehicle vehicle2 = new MyVehicle("Toyota", "Camry", 4, 180);
        MyVehicle vehicle3 = new MyVehicle("Honda", "Civic", 4, 200);

        System.out.println(vehicle1.equals(vehicle2)); // true
        System.out.println(vehicle1.equals(vehicle3)); // false
    }
}
