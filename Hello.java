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

// Working with arrays

    int nums [] = {1,4,5,6};
    // change 2nd value of the array
    nums[1] = 90;


    // making the array dynamic
    int num [] = new int [4];
    num[0] = 110;
num[1] =40;
  num[2] = 30;
num[3] = 40;

for(int i=0; i<num.length; i++){
System.out.println(num[i]);
}
}
}



