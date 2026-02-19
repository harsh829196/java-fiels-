enum day {mon, tue ,wed ,thur, fri, sat , sun}
class qu4 {
    public static void main(String[] args) {
        day d = day.sun ;
        switch (d) {
            case sun:
                System.out.println(d);
                break;
        
            default:
                System.out.print(d);
                break;
        }
    }
}
