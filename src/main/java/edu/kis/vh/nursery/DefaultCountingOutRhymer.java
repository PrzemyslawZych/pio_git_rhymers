package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int CALLCHECK = -1;
    private static final int FULLINDEX = 11;
    private static final int ERROR = -1;
    final private int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CALLCHECK;
    }

    public boolean isFull() {
        return total == FULLINDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }
}
