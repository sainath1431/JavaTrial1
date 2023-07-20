class Animal{
    
    Animal(){
        System.out.println("Parent Class Constructor.");

    }
}

class Tiger extends Animal{

    Tiger(){
        System.out.println("Tiger Class Constructor.");
    }
}

class Lion extends Animal{
    Lion(){
        System.out.println("Lions Class Constructor");

    }
}

public class sai{
    public static void main(String[] args){

        Lion l= new Lion();
        
        Tiger t =new Tiger();
    }
}