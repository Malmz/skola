
public class Sub implements Algo
{
        private int x;
        private int y;

    public Sub(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public String calc()
    {
        // put your code here
        return "" + (x - y);
    }
}
