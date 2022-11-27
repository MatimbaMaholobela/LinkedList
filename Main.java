public class Main {
    public static void main(String[] args) {

        ListIntNode list = new ListIntNode(3,new ListIntNode(5,new ListIntNode(7)));

        while(list !=null){
            System.out.println(list.data);
            list = list.next;
        }

    }
}
