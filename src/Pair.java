public class Pair {
    private final int first;
    private final int second;

    public Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
    public String toString()
    {
        return first + "*" + second;
    }
}
