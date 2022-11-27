public class ListIntNode {

        public int data;
        public ListIntNode next;

        public ListIntNode(){
            this(0,null);
        }

        public ListIntNode(int data){
            this(data,null);
        }

        public ListIntNode(int data,ListIntNode next) {
            this.data = data;
            this.next = next;
        }

    
}