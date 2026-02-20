//String s1 = "hello". will create object and store hello in heap inside string constant pool
// if s2 having same data "hello" it will just pass referance of scp of s1 without 
//saving explicitly .

// scp is box inside heap which common for all object data storage 

// Ntring s3 = new String("hello") will create one object in heap then check 
// is there another "hello" present inside heaf if not ,like here then itwill
//  again create one object inside scp  then store data . 
//lenght(), charAt(),concat() like "hi"concat(" all"), substring like "hello".substring(2)
// "java".replace('a','o') , "h i".trim() , toUpperCase(), toLowerCase(),
//  contains() , indexof(), lastIndexOf(), "java".startsWith(),'java'.endsWith('ja')
//split(),toCharArray() "abc".toCharArray()


public class strung11 {
    public static void main(String[] args) {
        String s1 = "bahubali"; 
        String s2 = "bahubali"; 
        System.out.println(s1==s2);
        System.out.println(s1.replace('b','a')); 
        String s3 = new String("rar"); 
        String s4 = new String("rar");
        System.out.println(s3==s4);
        String[] s6 = s3.split("a"); 
        for (String i : s6){
             System.out.println(i);
        }
       

        String s5 = new String("bahubali");
        System.out.println(s2==s5);
        System.out.println(s2.equals(s5));//it will compare through value not 
        //memory ref . 
    }
   

}
