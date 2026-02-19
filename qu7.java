class Student {
    int a =30 ;
    int b =40 ; 

    
    static int  show(int x ){
        return x*x ;
    }
    Student (int m1 ,int m2){
        a= m1; 
        b= m2 ;
    }
    void display(){
        System.out.println("A=" + a + " B=" + b);
    }
// copy constructer 
    Student(Student obj){
        a= obj.a;
        b= obj.b ;
    }
}
class qu7 {
    public static void main(String[] args) {
      Student s1= new Student(10 ,20);
      s1.display() ; 
      int c =Student.show(9) ;
      System.out.println("C= "+ c);
      Student s2 = new Student(s1); 
      s2.display();
    }
}
