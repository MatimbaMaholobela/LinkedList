public class LinkedList<T> {

    private ListNode<T> front;

    public void print(){

        ListNode<T> current =  front;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }
    public int length(){

        ListNode<T> current =  front;
        int count=0;
        while(current != null){
            current = current.next;
            count++;
        } return count;

    }

    public void add(T data){

        ListNode<T> current  =  front;
        if(front==null){
            front  = new ListNode<T>(data);
        }
        else{

            while(current.next !=null){
                current  = current.next;
            }

            current.next =  new ListNode<T>(data);

        }
    }

    public void add(int index,T data){


        if (index==0){
            front  = new ListNode<T>(data,front);

        }
        else{
            ListNode<T> current  = front;
            for(int i=0;i<index-1;i++){
                current = current.next;
            }
            current.next = new ListNode<T>(data,current.next);
        }
                  

    }

    public T get(int index){

        ListNode<T> current  =  front;

        for(int i=0;i<index;i++){
            current  = current.next;

        }
        return current.data;
    }


    public void addSorted(T data){
        
        ListNode<T> prev = null;
        ListNode<T> current  = front;

        if(front == null || front.data.compareTo(data)>0){
            front  = new ListNode<T>(data,front);
        }
        else{

            while(current.next != null && current.next.data<data){

                prev = current;
                current = current.next;
            }

            prev.next= new ListNode<T>(data,prev.next);

        }
        
    }

    
}
