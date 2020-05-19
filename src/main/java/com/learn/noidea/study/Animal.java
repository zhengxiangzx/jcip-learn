public class Animal{
    int num = 10;
    static int age=20;
    public void eat(){
    System.out.println("animal need to eat food");
    }
    public static void sleep(){
      System.out.println("animal need to sleep");  
    }
    public void move(){
        System.out.println("animal can move");
    }
}
class Cat extends Animal{
    int num=89;
    static int age=30;
    String name="tomCat";
    public void eat(){
        System.out.println("eat fish");
    }
    public static void sleep(){
       System.out.println("cat sleep"); 
    }
    public void catchMouse(){
        System.out.println("cat can catch mouse");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("eat bone");
    }
}
