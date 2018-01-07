 class inheritance{
   String str;
   int sup;
 public inheritance(String str,int sup){
   this.str=str;
   this.sup=sup;
   System.out.println("superclass constructor"+str+":"+sup);
 }

}
 class Subclass1 extends inheritance{
   public Subclass1(String str1,int sub1,String str,int sup){
     super(str,sup);
     System.out.println("subclass1"+str1+":"+sub1);
   }
 }
 class Subclass2 extends Subclass1{
   public Subclass2(int sup,int sub1,int sub2,String str,String str1,String str2){
     super(str1,sub1,str,sup);
     System.out.println("subclass 2:"+str2+":"+sub2);
   }
 }
 public class Inherit{
   public static void main(String args[]){
     Subclass2 subclass2=new Subclass2(1,2,3,"superclassparam","subclass1param","subclass2param");
   }
 }
