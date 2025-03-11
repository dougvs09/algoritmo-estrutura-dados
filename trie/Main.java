package trie;

import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("apartment");
        trie.insert("valentina");
        trie.insert("douglas");

        boolean found = trie.search("douglas");

        logger.log(INFO, "Word found? {0}", found);
    }
}
