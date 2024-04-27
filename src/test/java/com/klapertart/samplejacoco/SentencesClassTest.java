package com.klapertart.samplejacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SentencesClassTest {
    @Autowired
    private SentencesClass sentencesClass;

    @Test
    void testPalindrom1() {
        boolean result = sentencesClass.isPalindrom("aku");
        Assertions.assertFalse(result);
    }

    @Test
    void testPalindrom2() {
        boolean result = sentencesClass.isPalindrom("katak");
        Assertions.assertTrue(result);
    }
    @Test
    void testPalindrom3() {
        boolean result = sentencesClass.isPalindrom("kaak");
        Assertions.assertFalse(result);
    }
    @Test
    void testPalindrom4() {
        boolean result = sentencesClass.isPalindrom(null);
        Assertions.assertFalse(result);
    }
}