public class ListNode<T> implements Comparable<T>{

        public T data;
        public ListNode<T> next;

        public ListNode(){
            this(null,null);
        }

        public ListNode(T data){
            this(data,null);
        }

        public ListNode(T data,ListNode<T> next) {
            this.data = data;
            this.next = next;
        }

        public int compareTo(T data2){

            return 0;
            
        }

    
}