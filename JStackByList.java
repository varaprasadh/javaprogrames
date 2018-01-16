class Stack{

    Stack head=null;
    int data;
    Stack top=null;

  public void push(int data){
    Stack newnode=new Stack();
    newnode.data=data;
    newnode.top=null;
    if(head==null){
      head=newnode;
      head.top=null;
    }
    else{
       newnode.top=head;
       head=newnode;
      }
    }
    public void pop(){
      if(head==null){
        System.out.println("stack empty!");
      }
      else{
        System.out.println(head.data+"-popped!");
        head=head.top;
       }

    }

    public void show(){
      Stack temp=head;
      while(temp.top!=null){
        System.out.println(temp.data+">>");
        temp=temp.top;
      }
      System.out.println(temp.data+">>null");
    }


}
public class JStackByList{
  public static void main(String[] args){
    Stack s= new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.push(60);
    s.pop();
    s.pop();
    s.show();


  }
}
