
public class Add implements Algo {
        private int x;
        private int y;
        
    public Add(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public String calc()
    {
        // put your code here
        return "" + (x + y);
    }
}
