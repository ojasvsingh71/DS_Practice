// 5.	WAP to create a class named Shape and create three subclasses Circle, Triangle and Square, each class has two-member functions named draw () and erase (). Implement this concept using polymorphism. 

class shape{
    void draw(){};
    void erase(){};
}

class circle extends shape{
    void draw(){
        System.out.println("Circle drawn");
    }
    void erase(){
        System.out.println("Circle erased");
    }
}

class triangle extends shape{
    void draw(){
        System.out.println("Triangle drawn");
    }
    void erase(){
        System.out.println("Triangle erased");
    }
}
class square extends shape{
    void draw(){
        System.out.println("Square drawn");
    }
    void erase(){
        System.out.println("Square erased");
    }
}

class chonchu5{
    public static void main(String arg[]){
        shape c=new circle();
        shape s=new square();
        shape t=new triangle();

        c.draw();
        s.erase();
        t.draw();
    }
}