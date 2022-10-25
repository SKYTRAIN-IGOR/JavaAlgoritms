package com.thealgorithms.strings;

import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordLadderTest {

    @Test
    public void wordLadder() {

        // **Test 1:**
        // Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
        // Output: 5
        // Explanation: One shortest transformation sequence is 
        // "hit" -> "hot" -> "dot" -> "dog" -> cog" 
        // which is 5 words long.
      
        List<String> wordList1 = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        Assertions.assertTrue(WordLadder.ladderLength("hit", "cog", wordList1) == 5);

        // **Test 2:**
        // Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
        // Output: 0
        // Explanation: The endWord "cog" is not in wordList,
        // therefore there is no valid transformation sequence.
      
        List<String> wordList2 = Arrays.asList("hot", "dot", "dog", "lot", "log");
        Assertions.assertTrue(WordLadder.ladderLength("hit", "cog", wordList2) == 0);

    }
}
