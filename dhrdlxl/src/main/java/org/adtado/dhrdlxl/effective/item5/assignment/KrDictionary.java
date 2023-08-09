package org.adtado.dhrdlxl.effective.item5.assignment;

import java.util.Arrays;
import java.util.HashSet;

public class KrDictionary implements Lexicon{
    private final HashSet<String> set;

    public KrDictionary() {
        this.set = new HashSet<>(Arrays.asList("가나", "다라"));
    }

    @Override
    public boolean isValid(String word) {
        return set.contains(word);
    }
}
