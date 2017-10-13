package tests.insertion;

import helpers.TrieNodeEqualityComparer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.TestTries;
import trie.Trie;
import trie.TrieDataStructure;

public class InsertionTest1 {

    private TrieDataStructure _desiredTrie;
    private TrieDataStructure _actualTrie;

    @Before
    public void init()
    {
        _actualTrie = new TrieDataStructure();
        _actualTrie.insert("abc");
    }

    @Test
    public void TestMethod1()
    {
        _desiredTrie = (TrieDataStructure)TestTries.get(0);
        Assert.assertTrue(new TrieNodeEqualityComparer().Equals(_desiredTrie.getRoot(), _actualTrie.getRoot()));
    }

    @Test
    public void TestMethod2()
    {
        _desiredTrie = (TrieDataStructure)TestTries.get(1);
        Assert.assertFalse(new TrieNodeEqualityComparer().Equals(_desiredTrie.getRoot(), _actualTrie.getRoot()));
    }

    @Test
    public void TestMethod3()
    {
        _desiredTrie = (TrieDataStructure)TestTries.get(2);
        Assert.assertFalse(new TrieNodeEqualityComparer().Equals(_desiredTrie.getRoot(), _actualTrie.getRoot()));
    }
}
