package behavioral.iterator;

public class NameCollection {
    private String[] names = {"A", "B", "C"};

    public MyIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements MyIterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}
