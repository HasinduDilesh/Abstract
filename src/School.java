abstract class School {
    void teaching(){
        System.out.println("Teaching!");
    }
    abstract void learning();
}
class Grade11 extends School{
    void learning(){
        System.out.println("Grade 11 students are learning well!");
    }
    void teaching(){
        super.teaching();
        System.out.println("Teachers are teaching well!");
    }
}
class RunSchool{
    public static void main(String[] args) {
        School s = new Grade11();
        s.learning();
        s.teaching();
    }
}