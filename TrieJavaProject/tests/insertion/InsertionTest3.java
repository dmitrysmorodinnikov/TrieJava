package tests.insertion;

import helpers.TrieNodeEqualityComparer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.TestTries;
import trie.TrieDataStructure;

public class InsertionTest3 {

    private TrieDataStructure _desiredTrie;
    private TrieDataStructure _actualTrie;

    @Before
    public void init()  {
        _actualTrie = new TrieDataStructure();
        _actualTrie.insert("abc");
        _actualTrie.insert("abgl");
        _actualTrie.insert("cdf");
        _actualTrie.insert("abcd");
        _actualTrie.insert("lmn");
    }

    @Test
    public void testMethod1() {
        _desiredTrie = (TrieDataStructure)TestTries.get(0);
        Assert.assertFalse(new TrieNodeEqualityComparer().Equals(_desiredTrie.getRoot(), _actualTrie.getRoot()));
    }

    @Test
    public void testMethod2()  {
        _desiredTrie = (TrieDataStructure)TestTries.get(1);
        Assert.assertFalse(new TrieNodeEqualityComparer().Equals(_desiredTrie.getRoot(), _actualTrie.getRoot()));
    }

    @Test
    public void testMethod3()  {
        _desiredTrie = (TrieDataStructure)TestTries.get(2);
        Assert.assertTrue(new TrieNodeEqualityComparer().Equals(_desiredTrie.getRoot(), _actualTrie.getRoot()));
    }

}
