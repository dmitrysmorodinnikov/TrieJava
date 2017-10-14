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
    public void init()  {
        ActualTrie = new TrieDataStructure();
        ActualTrie.insert("abcd");
    }

    @Test
    public void testMethod1() {
        DesiredTrie = (TrieDataStructure)TestTries.get(0);
        Assert.assertFalse(new TrieNodeEqualityComparer().Equals(DesiredTrie.getRoot(), ActualTrie.getRoot()));
    }

    @Test
    public void testMethod2()  {
        DesiredTrie = (TrieDataStructure)TestTries.get(1);
        Assert.assertTrue(new TrieNodeEqualityComparer().Equals(DesiredTrie.getRoot(), ActualTrie.getRoot()));
    }

    @Test
    public void testMethod3()  {
        DesiredTrie = (TrieDataStructure)TestTries.get(2);
        Assert.assertFalse(new TrieNodeEqualityComparer().Equals(DesiredTrie.getRoot(), ActualTrie.getRoot()));
    }
}
