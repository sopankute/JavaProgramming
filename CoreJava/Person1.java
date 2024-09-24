
interface Person1{
 void eat(); // 
 void speak(); //
public static void main(String[] args) {
        
    Person1 p=new Person1(){ // implements Person
            //body of Anonymous Inner class
            @Override
            public void eat(){
                System.out.println("Nice Guava!!");
            }
            @Override
            public void speak(){
            System.out.println("English!");    
            }
    }; // AI end
        p.eat();    
        p.speak();
    } // main end
} // class end


// Nice Guava!!
// English!
