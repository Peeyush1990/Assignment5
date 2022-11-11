import java.util.Scanner;

class Marks{
    int rollNo,marks;
    String name;
}
class Physics extends Marks{
  Physics(String name,int marks){
    this.name=name;
    this.marks=marks;
  }
}
class Chemistry extends Marks{
    Chemistry(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
class Mathematics extends Marks{
    Mathematics(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}

public class Q3 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter number of students: ");
     int n=sc.nextInt(); //number of students
     
     Physics arr1[]=new Physics[n]; //arrays of objects to store marks corresponding to each student
     Chemistry arr2[]=new Chemistry[n];
     Mathematics arr3[]=new Mathematics[n];
     for(int i=0;i<n;i++){
        System.out.print("Enter name of student "+(i+1)+": ");
        String temp=sc.next();
        System.out.print("Enter marks in physics, chemistry, mathematics respectively seperated by space: ");

        int Marks=sc.nextInt(); //taking marks of physics as input
        Physics p=new Physics(temp, Marks);  //creating an object with name and marks
        arr1[i]=p;              //pushing the object into the array

        Marks=sc.nextInt();
        Chemistry c=new Chemistry(temp, Marks);
        arr2[i]=c;

        Marks=sc.nextInt();
        Mathematics m=new Mathematics(temp, Marks);
        arr3[i]=m;
     }
     int pTotal,cTotal,mTotal;
     pTotal=cTotal=mTotal=0;
     for(int i=0;i<n;i++){
        pTotal+=arr1[i].marks;
        cTotal+=arr2[i].marks;
        mTotal+=arr3[i].marks;
     }
     for(int i=0;i<n;i++)
        System.out.println("Total marks of student "+(i+1)+": "+(arr1[i].marks+arr2[i].marks+arr3[i].marks)); 

     System.out.println("Average marks of the class in physics: "+(pTotal*1.0/n));
     System.out.println("Average marks of the class in chemistry: "+(cTotal*1.0/n));
     System.out.println("Average marks of the class in chemistry: "+(mTotal*1.0/n));
     System.out.println("Average total marks of the class: "+(mTotal+cTotal+pTotal)*1.0/n);
     sc.close();
    }
}