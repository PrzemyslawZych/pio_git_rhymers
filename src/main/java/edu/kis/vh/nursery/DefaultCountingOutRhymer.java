package edu.kis.vh.nursery;
/**
 * Klasa DefaultCountingOutRhymer implementuje prosty stos o stałej wielkości.
 * Udostępnia podstawowe operacje: dodawanie, zdejmowanie i podgląd wartości na szczycie stosu.
 */
public class DefaultCountingOutRhymer {

    private static final int MAX_STACK_CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int MAX_STACK_INDEX = MAX_STACK_CAPACITY - 1;
    public static final int DEFAULT_RETURN_VALUE = -1;
    private final int[] numbers = new int[MAX_STACK_CAPACITY];
    // TODO: Pole powinno być prywatne – narusza hermetyzację
    public int total = EMPTY_RHYMER_INDICATOR;
    /**
     * Dodaje liczbę na stos, jeśli nie jest pełny.
     *
     * @param in wartość do dodania na stos
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true jeśli pusty, false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }
    /**
     * Sprawdza, czy stos osiągnął maksymalną pojemność.
     *
     * @return true jeśli pełny, false w przeciwnym razie
     */
    public boolean isFull() {
        return total == MAX_STACK_INDEX;
    }
    /**
     * Zwraca wartość z wierzchu stosu bez jej zdejmowania.
     *
     * @return wartość z wierzchu stosu lub -1 jeśli stos jest pusty
     */
    protected int peekAtTop() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }
    /**
     * Zdejmuje i zwraca wartość z wierzchu stosu.
     *
     * @return wartość z wierzchu stosu lub -1 jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

}
