public class LinkedIntList {
    private ListNode front;

    public void print(){

        ListNode current =  front;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }
    public int length(){

        ListNode current =  front;
        int count=0;
        while(current != null){
            current = current.next;
            count++;
        } return count;

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

    public void add(int index,int data){


        if (index==0){
            front  = new ListNode(data,front);

        }
        else{
            ListNode current  = front;
            for(int i=0;i<index-1;i++){
                current = current.next;
            }
            current.next = new ListNode(data,current.next);
        }
                  

    }

    public int get(int index){

        ListNode current  =  front;

        for(int i=0;i<index;i++){
            current  = current.next;

        }
        return current.data;
    }


    public void addSorted(int data){
        
        ListNode prev = null;
        ListNode current  = front;

        if(front == null || front.data>data){
            front  = new ListNode(data,front);
        }
        else{

            while(current.next != null && current.next.data<data){

                prev = current;
                current = current.next;
            }

            prev.next= new ListNode(data,prev.next);

        }
        
    }

    
}
