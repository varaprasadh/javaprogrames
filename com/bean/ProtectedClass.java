
package com.bean;


 public class ProtectedClass {
       ThisChild tc=new ThisChild();
        public void setFname(String str){
            tc.setFname(str);
        }
        public String getFname(){
           return tc.getFname();
        }
      protected class ThisChild{
         private String fname;
         private String lname;

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }
         
      }
      
}
