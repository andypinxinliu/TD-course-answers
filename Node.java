public class Node{
  private int data;
  private Node next;   
  
  //default constructor
  Node(){
     this.data = 0;
     this.next = null;
  }
  Node(int data, Node next){
     this.data = data;
     this.next = next;
  }   
}
