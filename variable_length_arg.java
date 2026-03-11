 class student {
    void Fun(int ...x ){
        for (int i : x ){
            System.out.println(i);
        }
    }
 }
 
 class variable_length_arg {
    public static void main(String[] args) {
        student obj = new student();
        obj.Fun(12,23,23);

    }
    
    
}