package trie;

public class TrieDataStructure implements Trie {

    private TrieNode root;

    public TrieDataStructure() {
        this.root = new TrieNode();
    }

    @Override
    public void insert(String word) {
        if (word == null || word.isEmpty())
            return;
        TrieNode curr = root;
        for(int i=0;i<word.length();i++) {
            TrieNode node = addCh(word.charAt(i), false, curr);
            curr = node;
        }
        curr.setEndOfWord(true);
    }

    @Override
    public boolean search(String word) {
        TrieNode curr = this.root;
        for(int i=0;i<word.length();i++) {
            curr = chInTrie(word.charAt(i), curr);
            if (curr == null)
                return false;
        }
        return curr.isEndOfWord();
    }

    @Override
    public boolean startsWith(String prefix) {
        TrieNode curr = this.root;
        for(int i=0;i<prefix.length();i++) {
            curr = chInTrie(prefix.charAt(i), curr);
            if (curr == null)
                return false;
        }
        return true;
    }

    public TrieNode getRoot() {
        return root;
    }

    private TrieNode chInTrie(char ch, TrieNode curr)
    {
        return curr.getChildren().containsKey(ch) ? curr.getChildren().get(ch) : null;
    }

    private TrieNode addCh(char ch, boolean isLast, TrieNode curr) {
        if (curr.getChildren().containsKey(ch))
            return curr.getChildren().get(ch);
        TrieNode trieNode = new TrieNode(isLast);
        curr.getChildren().put(ch, trieNode);
        return trieNode;
    }
}
