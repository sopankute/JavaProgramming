
public class Person{
    void eat(){
        System.out.println("nice fruits");
    }
    
    public static void main(String[] args) {
        
        Person p=new Person(){ // extends Person
            //body of Anonymous Inner class
            @Override
            void eat(){
                System.out.println("Nice Orange!!");
            }
        }; // AI end
        p.eat();    
    } // main end
} // class end

// Nice Orange!!
