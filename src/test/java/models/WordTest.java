package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception{
        Word testWord = new Word();
        Integer expected = 1;
        assertEquals(expected, testWord.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForMultipleLetters_2() throws Exception {
        Word testWord = new Word();
        Integer expected = 2;
        assertEquals(expected, testWord.calculateScore("ae"));
    }

    @Test
    public void calculateScore_returnsScoreForWholeWord_5() throws Exception {
        Word testWord = new Word();
        Integer expected = 5;
        assertEquals(expected, testWord.calculateScore("cat"));
    }
}