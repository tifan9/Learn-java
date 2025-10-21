package codewars;
public class Motorcycle {
    String make;
    String color;
    boolean engineState; //check if it is on or off.


    // method to start engine

    void startEngine(){
        if(engineState == true){
        System.out.println("The engine is already on. ");
        }else{
            System.out.println("The engine is now on. ");
        }
    }

    // another method for showAtts
    Void showAtts(){
        System.out.println("This motorcycle is a " + color + " " + make);

        if(engineState == true)
            System.out.println("The engine is on. ");
        else
            System.out.println("the engine is off. ");
        
    }
}
