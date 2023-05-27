abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle!");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle!");
    }
}
class Test {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        s1.draw();
        Shape s2 = new Circle();
        s2.draw();
    }
}