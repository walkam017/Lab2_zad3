
    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {
            int[] tab1 = {3, 8, 2, 6, 10};
            int[] tab2 = {3, 9, 5, 1, 7};

            // 1. Oblicz sumę wszystkich elementów w tablicach
            int sumaTab1 = Arrays.stream(tab1).sum();
            int sumaTab2 = Arrays.stream(tab2).sum();
            System.out.println("Suma elementów tablicy 1: " + sumaTab1);
            System.out.println("Suma elementów tablicy 2: " + sumaTab2);

            // 2. Znajdź maksymalną i minimalną wartość dla każdej tablicy
            int maxTablica1 = Arrays.stream(tab1).max().orElse(Integer.MIN_VALUE);
            int minTablica1 = Arrays.stream(tab2).min().orElse(Integer.MAX_VALUE);
            int maxTablica2 = Arrays.stream(tab1).max().orElse(Integer.MIN_VALUE);
            int minTablica2 = Arrays.stream(tab2).min().orElse(Integer.MAX_VALUE);
            System.out.println("Max wartość tablicy 1: " + maxTablica1);
            System.out.println("Min wartość tablicy 1: " + minTablica1);
            System.out.println("Max wartość tablicy 2: " + maxTablica2);
            System.out.println("Min wartość tablicy 2: " + minTablica2);

            // 3. Oblicz średnią wszystkich wartości w tablicy
            double sredniaTablica1 = Arrays.stream(tab1).average().orElse(0);
            double sredniaTablica2 = Arrays.stream(tab2).average().orElse(0);
            System.out.println("Średnia wartości tablicy 1: " + sredniaTablica1);
            System.out.println("Średnia wartości tablicy 2: " + sredniaTablica2);

            // 4. Utwórz kopię istniejącej tablicy
            int[] kopiaTablica1 = Arrays.copyOf(tab1, tab1.length);
            int[] kopiaTablica2 = Arrays.copyOf(tab2, tab2.length);

            // 5. Wybierz elementy z tablicy, które spełniają określone kryterium
            int[] nowaTablica1 = Arrays.stream(tab1).filter(x -> x > 5).toArray();
            System.out.println("Nowa tablica 1 po wybraniu elementów większych od 5: " + Arrays.toString(nowaTablica1));

            // 6. Usuń określony element z tablicy
            int elementDoUsuniecia = 6;
            int[] nowaTablica2 = Arrays.stream(tab2).filter(x -> x != elementDoUsuniecia).toArray();
            System.out.println("Nowa tablica 2 po usunięciu elementu " + elementDoUsuniecia + ": " + Arrays.toString(nowaTablica2));

            // 7. Połącz tablice 1 i 2
            int[] polaczonaTablica = new int[tab1.length + tab2.length];
            System.arraycopy(tab1, 0, polaczonaTablica, 0, tab1.length);
            System.arraycopy(tab2, 0, polaczonaTablica, tab1.length, tab2.length);
            System.out.println("Połączona tablica 1 i 2: " + Arrays.toString(polaczonaTablica));

            // 8. Znajdź liczbę wystąpień określonej wartości w tablicy 2
            int wartoscDoSprawdzenia = 3;
            long liczbaWystapien = Arrays.stream(tab2).filter(x -> x == wartoscDoSprawdzenia).count();
            System.out.println("Liczba wystąpień wartości " + wartoscDoSprawdzenia + " w tablicy 2: " + liczbaWystapien);
        }
    }
