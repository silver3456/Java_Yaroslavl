import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

public class MeasureTests {
    final static int LIMIT = 100000;
    final static int SEC = 1000;

    private List<Integer> arrayList;
    private Set<Integer> integerHashSet;
    private List<Integer> linkedList;
    private Set<Integer> integerTreeSet;

    private Consumer<Collection> addConsumer;
    private Consumer<Collection> getConsumer;
    private Consumer<Collection> removeConsumer;


    @Before
    public void init() {
        arrayList = new ArrayList<>();
        integerHashSet = new HashSet<>();
        linkedList = new LinkedList<>();
        integerTreeSet = new TreeSet<>();

        addConsumer = (list) -> {
            for (int i = 0; i < LIMIT; i++)
                list.add(i);
        };

        getConsumer = (list) -> {
            Iterator<Integer> iter = list.iterator();
            while (iter.hasNext())
                iter.next();
        };

        removeConsumer = (list) -> {
            Iterator<Integer> iter = list.iterator();
            while (iter.hasNext())
                iter.remove();
        };
    }

    @Test
    public void testAdd() {
        measure("ArrayList add", addConsumer, arrayList);
        measure("LinkedList add", addConsumer, linkedList);
        measure("HashSet add", addConsumer, integerHashSet);
        measure("TreeSet add", addConsumer, integerTreeSet);
    }

    @Test
    public void testGet() {
        measure("ArrayList get", getConsumer, arrayList);
        measure("LinkedList get", getConsumer, linkedList);
        measure("HashSet get", getConsumer, integerHashSet);
        measure("TreeSet get", getConsumer, integerTreeSet);
    }

    @Test
    public void testRemove() {
        measure("ArrayList remove", removeConsumer, arrayList);
        measure("LinkedList remove", removeConsumer, linkedList);
        measure("HashSet remove", removeConsumer, integerHashSet);
        measure("TreeSet remove", removeConsumer, integerTreeSet);
    }

    public static void measure(String method, Consumer<Collection> consumer, Collection<Integer> list) {
        long startTime = System.nanoTime();


        consumer.accept(list);

        long endtime = System.nanoTime();
        long duration = endtime - startTime;
        System.out.println(method + ": \t" +  ((double)duration)/1000);
    }
}
