public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> newList = new LinkedList<>();

        newList.add(2);
        newList.add(5);
        newList.add(12);
        newList.addSorted(10);

        //newList.print();
        System.out.println(newList.length());
        newList.print();

    }
}
