public class Main {
    public static void main(String[] args) {
        List list = new List();
        for( int i = 0; i < 10; i++){
            list.add(i);
        }

        System.out.println(list.toString());
        System.out.println("Разворот");
        list.revert();
        System.out.println(list.toString());
    }
}