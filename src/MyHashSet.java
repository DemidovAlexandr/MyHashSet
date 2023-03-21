public class MyHashSet {

    int[] numbers = new int[31251]; // 1 000 000 / 32 + 1, т.к. есть число 0

    public void add(int key) {
        numbers[getIndex(key)] |= getBit(key); // включающее ИЛИ для int = 0
    }

    public void remove(int key) {
        numbers[getIndex(key)] &= ~getBit(key); // логическое И для инверсированной записи бита (ноли останутся нолями, единица превратится в ноль)
    }

    public boolean contains(int key) {
        return (numbers[getIndex(key)] & getBit(key)) != 0; // == 1 если бит равен единице
    }

    private int getIndex(int key) { // определить индекс в массиве, для 5 = 0
        return key / 32;
    }

    private int getBit(int key) { // определить бит в 32 битном int, для 5 = 0000 0000 0000 0000 0000 0000 0010 0000
        key %= 32;
        return (1 << key); // key 0 = 0000 0000 0000 0000 0000 0000 0000 0001
    }
}
