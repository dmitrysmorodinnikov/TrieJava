package trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private boolean endOfWord;
    private Map<Character, TrieNode> children;

    public TrieNode(){
        children = new HashMap<>();
    }
    public TrieNode(boolean isLast){
        children = new HashMap<>();
        endOfWord = isLast;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }
}


