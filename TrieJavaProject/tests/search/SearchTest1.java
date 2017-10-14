package tests.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.TestTries;
import trie.TrieDataStructure;

public class SearchTest1 {
    private TrieDataStructure ActualTrie;

    @Before
    public void Init()
    {
        ActualTrie = (TrieDataStructure)TestTries.get(0);
    }

    @Test
    public void TestMethod1()
    {
        Assert.assertFalse(ActualTrie.search("a"));
    }

    @Test
    public void TestMethod2()
    {
        Assert.assertFalse(ActualTrie.search("ab"));
    }

    @Test
    public void TestMethod3()
    {
        Assert.assertTrue(ActualTrie.search("abc"));
    }

    @Test
    public void TestMethod4()
    {
        Assert.assertFalse(ActualTrie.search("abcd"));
    }

    @Test
    public void TestMethod5()
    {
        Assert.assertFalse(ActualTrie.search("ak"));
    }

    @Test
    public void TestMethod6()
    {
        Assert.assertFalse(ActualTrie.search("t"));
    }

    @Test
    public void TestMethod7()
    {
        Assert.assertFalse(ActualTrie.search("12345"));
    }
}
