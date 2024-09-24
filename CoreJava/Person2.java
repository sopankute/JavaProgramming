
abstract class Person2{
    abstract void eat(); // 
    abstract void speak(); //
    
    public static void main(String[] args) {
        
        Person2 p=new Person2(){ // extends Person
            //body of Anonymous Inner class
            @Override
            void eat(){
                System.out.println("Nice Orange!!");
            }
            @Override
            void speak(){
            System.out.println("English!");    
            }
        }; // AI end
        p.eat();    
        p.speak();
    } // main end
} // class end

// Nice Orange!!
// English!