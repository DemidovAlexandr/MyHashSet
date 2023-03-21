public class Main {
    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        int key = 1000000;
        hashSet.add(key);
        System.out.println(hashSet.contains(key)); // true
        hashSet.remove(key);
        System.out.println(hashSet.contains(key)); // false
    }
}