class Animal{
    void makeSound()
    {
        System.out.println("Animal makes a sound");
    }

}
class Cat extends Animal{
    void makeSound()
    {
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    void makeSound()
    {
        System.out.println("Bhow");
    }
}
public class overRiding {
    public static void main(String[] args) {
        Animal A1=new Cat();
        Animal A2=new Dog();
        A1.makeSound();
        A2.makeSound();
        

        
    }
    
}
