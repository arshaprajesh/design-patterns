package behavioral.iterator;

public class IteratorDemo {

    public static void run() {
        NameCollection collection = new NameCollection();
        MyIterator it = collection.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

