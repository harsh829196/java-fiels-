class A<K,V>{
    K key ;
    V value ; 
    A(K key, V value){
        this.key=key ;
        this.value=value ;
    }
    void get(){
        System.out.println(key+ " "+value);
    }
}
public class set {
    public static void main(String[] args) {
        A<Integer> object= new A<Integer>();
        obj.set(65);
        System.out.println(obj.get());
        A<String> obj1 = new A<String>();
        obj1.set("ABC");
        System.err.println(obj1.get());
    }
}
