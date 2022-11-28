public class LinkedIntList {
    private ListNode front;

    public void print(){

        ListNode current =  front;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }

    public void add(int data){

        if(front==null){
            front  = new ListNode(data);
        }
        else{

            ListNode current  =  front;

            while(current.next !=null){
                current  = current.next;
            }

            current.next =  new ListNode(data);

        }
    }
}
