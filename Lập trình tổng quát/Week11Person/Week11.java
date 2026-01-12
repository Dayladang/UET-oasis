import java.util.List;

public interface Week11<T> {

    /**
     * Function.
     */
    static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        for (int i = 0; i < list.size(); ++i) {
            for (int j = i; j > 0; --j) {
                int cmp = list.get(j).compareTo(list.get(j - 1));
                if (cmp < 1) {
                    T tmp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, tmp);
                }
            }
        }

        return list;
    }
}
