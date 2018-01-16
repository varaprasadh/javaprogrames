/*
*written by varaprasadh!
*basic linkedlist as fifo queue!
*15\01\18
*/
class Node{
     Node head=null;
     int data;
     Node next=null;
  public void insert(int data){
    Node newnode=new Node();
    newnode.data=data;
    newnode.next=null;
   if(head==null){
     head=newnode;
     head.next=null;
   }
   else{
     Node temp;
     temp=head;
     while(temp.next!=null){
       temp=temp.next;
     }
     temp.next=newnode;
   }
    }
   public void delete(){
     if(head!=null){
       System.out.println(head.data+"deleted!");
       head=head.next;
     }
     else{
       System.out.println("list is empty!");
     }
   }
   public void display(){
     Node temp=head;
     while(temp.next!=null){
       System.out.println(temp.data+"->");
       temp=temp.next;
     }
     System.out.println(temp.data+"->Null");
   }

  }
public class JLinkedList{
  public static void main(String[] args){
    Node list=new Node();
    list.insert(20);
    list.insert(10);
    list.insert(30);
    list.insert(40);
    list.insert(50);
    list.insert(60);
    list.delete();
    list.delete();

    list.display();

  }
}
