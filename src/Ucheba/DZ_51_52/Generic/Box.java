package Ucheba.DZ_51_52.Generic;

public class Box<T, D> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public boolean setElement(T element) {
        this.element = element;
        return true;
    }

    public void place(D placeItem) {
        System.out.println("place" + ": " + element + " " + placeItem);
    }

    public boolean clear(){
        if(element == null){
            return true;
        }
        return clear();
    }

    public boolean isEmpty(){
        if(element == null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Box<String, String> s1 = new Box<>("name");
        s1.setElement("table");
        s1.setElement("banana");
        System.out.println(s1.setElement("plate"));
        System.out.println(s1.getElement());
        System.out.println(s1.isEmpty());

        Box<Integer, Integer> s2 = new Box<>(21);
        s2.setElement(11);
        s2.setElement(22);
        System.out.println(s2.setElement(14));
        System.out.println(s2.getElement());
        System.out.println(s2.isEmpty());

    }
}
