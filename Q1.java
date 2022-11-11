class Mammals{
 void print(){
    System.out.println("I am mammal");
 }
}
class MarineAnimals extends Mammals{              //as multiple inheritence is not possible in java, 
    void print(){                                 //so i have used multilevel inheritence so that 
   System.out.println("I am a marine animal"); //BlueWhale class can indirectly inherit two classes
    }
    void printParent(){
        super.print();
    }
   }
class BlueWhale extends MarineAnimals{
    void print(){
    System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    void printP1(){
        super.print();
    }
    void printP2(){
        super.printParent();
    }
}

public class Q1{
    public static void main(String args[]){
     Mammals M=new Mammals();
     MarineAnimals mA=new MarineAnimals();
     BlueWhale bW=new BlueWhale();

     M.print();  //function of Mammals by object of Mammals
     mA.print(); //function of MarineAnimals by object of MarineAnimals
     bW.print(); //function of BlueWhale by object of BlueWhale
     
     bW.printP1(); //function of MarineAnimals by object of BlueWhale
     bW.printP2(); //function of Mammals by object of BlueWhale
    } 
 }
