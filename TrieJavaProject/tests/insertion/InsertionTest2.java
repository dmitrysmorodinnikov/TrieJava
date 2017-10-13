package tests.insertion;

import helpers.TrieNodeEqualityComparer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.TestTries;
import trie.TrieDataStructure;

public class InsertionTest2 {

    private TrieDataStructure DesiredTrie;
    private TrieDataStructure ActualTrie;

    @Before
    public void Init()
    {
        ActualTrie = new TrieDataStructure();
        ActualTrie.insert("abcd");
    }

    @Test
    public void TestMethod1()
    {
        DesiredTrie = (TrieDataStructure)TestTries.get(0);
        Assert.assertFalse(new TrieNodeEqualityComparer().Equals(DesiredTrie.getRoot(), ActualTrie.getRoot()));
    }

    @Test
    public void TestMethod2()
    {
        DesiredTrie = (TrieDataStructure)TestTries.get(1);
        Assert.assertTrue(new TrieNodeEqualityComparer().Equals(DesiredTrie.getRoot(), ActualTrie.getRoot()));
    }

    @Test
    public void TestMethod3()
    {
        DesiredTrie = (TrieDataStructure)TestTries.get(2);
        Assert.assertFalse(new TrieNodeEqualityComparer().Equals(DesiredTrie.getRoot(), ActualTrie.getRoot()));
    }
}
