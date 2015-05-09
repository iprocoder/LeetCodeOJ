/**
 * Created by iprocoder on 2015/5/9.
 */
class TrieNode {
    static final int R = 26;
    TrieNode[] next;
    boolean terminate;
    // Initialize your data structure here.
    public TrieNode() {
        next = new TrieNode[R];
        terminate = false;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        root = insert(root, word, 0);
    }

    public TrieNode insert(TrieNode x, String key, int d) {
        if (x == null) {
            x = new TrieNode();
        }
        if (d == key.length()) {
            x.terminate = true;
            return x;
        }
        char c = key.charAt(d);
        x.next[c - 'a'] = insert(x.next[c - 'a'], key, d + 1);
        return x;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode x = search(root, word, 0);
        if (x == null) return false;
        return x.terminate;
    }

    private TrieNode search(TrieNode x, String key, int d) {
        if (x == null) {
            return null;
        }
        if (d == key.length()) {
            return x;
        }
        char c = key.charAt(d);
        return search(x.next[c - 'a'], key, d + 1);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        return collect(search(root, prefix, 0), prefix);
    }

    boolean collect(TrieNode x, String pre) {
        if (x == null) {
            return false;
        }
        if (x.terminate) {
            return true;
        }
        for (char c = 0; c < TrieNode.R; c++) {
            collect(x.next[c], pre);
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("ab");
        boolean search = trie.search("a");
        System.out.println(search);
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");