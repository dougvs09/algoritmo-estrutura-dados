package trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("apartment");
        trie.insert("valentina");
        trie.insert("douglas");

        boolean found = trie.search("douglas");

        System.out.printf("Word found? %b", found);
    }
}
