package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer udostępnia prostą implementację struktury danych
 * opartą na tablicy całkowitej. Umożliwia podstawowe operacje typu stosowego (LIFO),
 * takie jak dodawanie elementu, sprawdzanie pustego stanu, sprawdzanie przepełnienia,
 * podgląd ostatniego elementu oraz usuwanie ostatniego elementu.
 */
public class DefaultCountingOutRhymer {

    /**
     * Maksymalna pojemność tablicy.
     */
    private static final int CAPACITY = 12;

    /**
     * Wartość zwracana w przypadku próby wykonania operacji na pustej strukturze.
     */
    private static final int RETURN_MINUS_ONE = -1;

    /**
     * Maksymalny dopuszczalny indeks w tablicy.
     */
    private static final int MAX_INDEX = CAPACITY - 1;

    /**
     * Wartość reprezentująca pustą strukturę.
     */
    private static final int EMPTY_VALUE = -1;

    /**
     * Tablica przechowująca elementy w strukturze.
     */
    private final int[] numbers = new int[CAPACITY];

    /**
     * Indeks wskazujący na szczyt struktury.
     * Początkowo ustawiony na wartość EMPTY_VALUE, co oznacza, że struktura jest pusta.
     */
    private int total = EMPTY_VALUE;

    /**
     * Zwraca bieżący indeks ostatniego dodanego elementu lub -1, jeśli struktura jest pusta.
     *
     * @return indeks ostatniego elementu lub -1, jeśli struktura jest pusta
     */
    // TODO: Metoda nie jest używana, przemyśleć jej usunięcie.
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nową wartość do struktury, o ile nie jest ona pełna.
     *
     * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy struktura jest pusta.
     *
     * @return true, jeśli struktura nie zawiera żadnych elementów, w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    /**
     * Sprawdza, czy struktura osiągnęła swoją maksymalną pojemność.
     *
     * @return true, jeśli struktura jest pełna, w przeciwnym razie false
     */
    public boolean isFull() {
        return total == MAX_INDEX;
    }

    /**
     * Zwraca ostatnią wartość bez jej usuwania.
     *
     * @return ostatnio dodana wartość lub -1, jeśli struktura jest pusta
     */
        protected int peek() {
            if (callCheck())
                return RETURN_MINUS_ONE;
            return numbers[total];
        }

    /**
     * Usuwa i zwraca ostatnią wartość ze struktury.
     *
     * @return usunięta wartość lub -1, jeśli struktura jest pusta
     */
        public int countOut() {
            if (callCheck())
                return RETURN_MINUS_ONE;
            return numbers[total--];
        }

}
