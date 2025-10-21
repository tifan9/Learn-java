public class Method {
    private String name;
    private int age;
    
    public Method(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String greet(){
        return "Hello" + name + age;
    }
    public int add( int a, int b){
    return a+ b;
    }

    public static void main(String [] args){

        Method m = new Method();
        

        System.out.println(m.add(45, 50));

    }
}
