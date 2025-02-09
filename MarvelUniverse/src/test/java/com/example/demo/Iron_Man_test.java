package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Iron_Man_test {
	Iron_Man obj = new Iron_Man();
    @Test
    void testHero1Wins() {
        assertEquals("Thor", Iron_Man.determineWinner("Thor", "Iron Man"));
    }

    @Test
    void testHero2Wins() {
        assertEquals("Scarlet Witch", Iron_Man.determineWinner("Hulk", "Scarlet Witch"));
    }

    @Test
    void testTie() {
        assertEquals("tie", Iron_Man.determineWinner("Spider-Man", "Spider-Man"));
    }

    @Test
    void testInvalidHero() {
        assertEquals("invalid", Iron_Man.determineWinner("Batman", "Iron Man"));
    }

    @Test
    void testCaseInsensitiveInput() {
        assertEquals("invalid", Iron_Man.determineWinner("thor", "iron man")); // Method is case-sensitive
    }
    @Test
    void testCaseInsensitiveInput1() {
        assertEquals("invali", Iron_Man.determineWinner("Thor", "Iron man")); // Method is case-sensitive
    }

    @Test
    void testWhitespaceInput() {
        assertEquals("Thor", Iron_Man.determineWinner("  Thor  ", " Iron Man "));
    }
}
