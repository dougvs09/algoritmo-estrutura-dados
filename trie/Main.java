package trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("apartment");
        trie.insert("valentina");
        trie.insert("douglas");

        System.out.println(trie.search("douglas"));
    }
}
