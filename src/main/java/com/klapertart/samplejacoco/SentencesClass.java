package com.klapertart.samplejacoco;

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author kurakuraninja
 * @since 27/04/24
 */

@Component
public class SentencesClass {

    public boolean isPalindrom(String sentences){
        if (Objects.isNull(sentences)) return false;
        if (sentences.length() % 2 == 0) return false;

        for (int i = 0; i < (sentences.length()/2); i++) {
            if (sentences.charAt(i) != sentences.charAt(sentences.length()-(i+1))){
                return false;
            }
        }
        return true;
    }
}
