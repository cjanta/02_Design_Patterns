<<<<<<< HEAD
package com.cc.java.singleton;

public class App {
    
    public static void main(String[] args) {

        Singleton singleton1 = new Singleton(2);
        output("obj1: " + singleton1);
        output("myNum: " +  singleton1.getMyNum());

        Singleton singleton2 = new Singleton(3);
        output("obj1: " + singleton2);
        output("myNum: " +  singleton2.getMyNum());

   
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

=======
package com.cc.java.singleton;

public class App {
    
    public static void main(String[] args) {

        
        Singleton obj1 = Singleton.getInstance();
        Helper.output(obj1);
        obj1.actOnEvent();
        obj1.actOnEvent();
        // Events werden kumuliert ... 0 + 2
        Helper.output(obj1.getCounter());
        Helper.output("---------------------");
        
        Singleton obj2 = Singleton.getInstance();
        Helper.output(obj2);
        obj2.actOnEvent();
        obj2.actOnEvent();
        obj2.actOnEvent();
        // Events werden kumuliert ... 2 + 3
        Helper.output(obj2.getCounter());
        Helper.output("---------------------");


        Singleton obj3 = Singleton.getInstance();
        Helper.output(obj3);
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
        obj3.actOnEvent();
		
        // Events werden kumuliert ... 5 + 5
        Helper.output(obj3.getCounter());
   






    }


}

>>>>>>> f76644cb2a32a4bf80eb88ec5b4d377fd917901c
