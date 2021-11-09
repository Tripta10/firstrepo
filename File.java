import java.io.Serializable;  



 import java.io.*;  



 class Student14 implements Serializable{  

 int id;  

String name;  

public Student14(int id, String name) {  



this.id = id;  



this.name = name;  



 }  



}  



 class Persist{  



 public static void main(String args[]){  







 try{  



 



 Student14 s1 =new Student14(211,"ravi");  



FileOutputStream fout=new FileOutputStream("f.txt");  



 ObjectOutputStream out=new ObjectOutputStream(fout);  



out.writeObject(s1);  



 out.close();  



 System.out.println("success");  



 }catch(Exception e){



 System.out.println(e);



 }  } }



 public class File {
     
 }
 