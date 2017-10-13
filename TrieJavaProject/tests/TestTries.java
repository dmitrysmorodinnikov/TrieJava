package tests;

import trie.Trie;
import trie.TrieDataStructure;
import trie.TrieNode;

import java.util.ArrayList;
import java.util.List;

public class TestTries {
    private static List<Trie> Instances = new ArrayList<>();

    static {
        AddToInstances();
    }

    public static Trie get(int index)
    {
        return Instances.get(index);
    }

    private static void AddToInstances()
    {
        Instances.add(Create1());
        Instances.add(Create2());
        Instances.add(Create3());
    }

    private static Trie Create1()//"abc"
    {
        TrieDataStructure trie = new TrieDataStructure();
        TrieNode bTrieNode = new TrieNode();
        TrieNode cTrieNode = new TrieNode();
        TrieNode endTrieNode = new TrieNode(true);
        trie.getRoot().getChildren().put('a', bTrieNode);
        bTrieNode.getChildren().put('b', cTrieNode);
        cTrieNode.getChildren().put('c', endTrieNode);

        return trie;
    }

    private static Trie Create2()//"abcd"
    {
        TrieDataStructure trie = new TrieDataStructure();
        TrieNode bTrieNode = new TrieNode();
        TrieNode cTrieNode = new TrieNode();
        TrieNode dTrieNode = new TrieNode();
        TrieNode endTrieNode = new TrieNode(true);
        trie.getRoot().getChildren().put('a', bTrieNode);
        bTrieNode.getChildren().put('b', cTrieNode);
        cTrieNode.getChildren().put('c', dTrieNode);
        dTrieNode.getChildren().put('d', endTrieNode);

        return trie;
    }

    private static Trie Create3()//"abc","abgl","cd","abcd", "lmn"
    {
        TrieDataStructure trie = new TrieDataStructure();
        TrieNode bTrieNode = new TrieNode();
        TrieNode lTrieNode = new TrieNode();
        TrieNode d1TrieNode = new TrieNode();
        TrieNode d2TrieNode = new TrieNode(true);
        TrieNode mTrieNode = new TrieNode();
        TrieNode nTrieNode = new TrieNode();
        TrieNode cgTrieNode = new TrieNode();
        TrieNode fTrieNode = new TrieNode();
        TrieNode endTrieNode1 = new TrieNode(true);
        TrieNode endTrieNode2 = new TrieNode(true);
        TrieNode endTrieNode3 = new TrieNode(true);
        TrieNode endTrieNode4 = new TrieNode(true);

        trie.getRoot().getChildren().put('a', bTrieNode);
        trie.getRoot().getChildren().put('c', d1TrieNode);
        trie.getRoot().getChildren().put('l', mTrieNode);
        bTrieNode.getChildren().put('b', cgTrieNode);
        cgTrieNode.getChildren().put('c', d2TrieNode);
        cgTrieNode.getChildren().put('g', lTrieNode);
        lTrieNode.getChildren().put('l', endTrieNode2);
        d2TrieNode.getChildren().put('d', endTrieNode1);

        d1TrieNode.getChildren().put('d', fTrieNode);
        fTrieNode.getChildren().put('f', endTrieNode3);

        mTrieNode.getChildren().put('m', nTrieNode);
        nTrieNode.getChildren().put('n', endTrieNode4);

        return trie;
    }
}
