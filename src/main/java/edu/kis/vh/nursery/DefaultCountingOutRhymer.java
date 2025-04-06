package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int RETURN_MINUS_ONE = -1;
    private static final int MAX_INDEX = CAPACITY - 1;

    public int getTotal() {
        return total;
    }

    private static final int EMPTY_VALUE = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_VALUE;
        }
        
            public boolean isFull() {
                return total == MAX_INDEX;
            }
        
                protected int peek() {
                    if (callCheck())
                        return RETURN_MINUS_ONE;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return RETURN_MINUS_ONE;
                        return numbers[total--];
                    }

}
