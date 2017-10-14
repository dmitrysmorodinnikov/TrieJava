package helpers;

import trie.TrieNode;
import java.util.Map;

public class TrieNodeEqualityComparer {

    public boolean Equals(TrieNode x, TrieNode y) {
        if (x == null && y == null)
            return true;
        if (x == null || y == null || x.isEndOfWord() != y.isEndOfWord())
            return false;
        for(Map.Entry<Character, TrieNode> entry : x.getChildren().entrySet()) {
            if (!y.getChildren().containsKey(entry.getKey()))
                return false;
            if (!Equals(y.getChildren().get(entry.getKey()), entry.getValue()))
                return false;
        }
        return true;
    }
}
