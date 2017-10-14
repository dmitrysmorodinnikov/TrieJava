package tests.startsWith;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.TestTries;
import trie.TrieDataStructure;

public class StartsWithTest1 {

    private TrieDataStructure ActualTrie;

    @Before
    public void init() {
        ActualTrie = (TrieDataStructure) TestTries.get(0);
    }

    @Test
    public void testMethod1() {
        Assert.assertTrue(ActualTrie.startsWith("a"));
    }

    @Test
    public void testMethod2() {
        Assert.assertTrue(ActualTrie.startsWith("ab"));
    }

    @Test
    public void testMethod3() {
        Assert.assertTrue(ActualTrie.startsWith("abc"));
    }

    @Test
    public void testMethod4() {
        Assert.assertFalse(ActualTrie.startsWith("abcd"));
    }

    @Test
    public void testMethod5() {
        Assert.assertFalse(ActualTrie.startsWith("ak"));
    }

    @Test
    public void testMethod6() {
        Assert.assertFalse(ActualTrie.startsWith("t"));
    }

    @Test
    public void testMethod7() {
        Assert.assertFalse(ActualTrie.startsWith("12345"));
    }
}
