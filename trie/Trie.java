package trie;

public class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentNode = root;

        for (char c: word.toCharArray()) {
            if (!currentNode.children.containsKey(c)) {
                currentNode.children.put(c, new TrieNode());
            }

            currentNode = currentNode.children.get(c);
        }

        currentNode.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode currentNode = root;

        for (char c: word.toCharArray()) {
            if (currentNode.children.containsKey(c)) {
                currentNode = currentNode.children.get(c);
            }
        }

        return currentNode.isEndOfWord;
    }
}
