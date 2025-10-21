class Calculator{

    int a;
    public int Add(){
        System.out.println("Addition");
        return 0;
    }
}

// creating a method

class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String getPen(int cost){
if(cost >=10){
return "Pen red";
}else{
    return "Pen blue";
}
    }
}
public class Hello {
    public static void main (String [] args){
        // int num1= 2;

        // int num2= 4;

        // Calculator calculator = new Calculator();
        // System.out.println(num1+num2 + calculator.Add());

        Computer obj = new Computer();
        obj.playMusic();
        
    String str = obj.getPen(1);
System.out.println(str);

}
}
