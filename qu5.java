class Student{
    private int roll= 10 ; 
    int reg = 12417663; 
    Student(int a , int b ){
        System.out.println(roll);
        System.out.println(a*b);
    }
    void display(){
         System.out.println(roll);
    }
}
class qu5 {
    public static void main(String[] args) {
        Student obj =  new Student(10,10); 
        obj.display();
    }
}
