
public class Calculator {
    public static void main(String[] args) {
        Algo[] a = new Algo[2];
        a[0] = new Add(5, 8);
        a[1] = new Sub(10, 7);
        
        for(int i = 0; i < a.length; i++){
            String r = a[i].calc();
            System.out.println(r);
        }
    }
}
