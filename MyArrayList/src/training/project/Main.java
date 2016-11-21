package training.project;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println(list.add(15));
        System.out.println(list.add(12));
        System.out.println(list.add(11));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));



    }
}
