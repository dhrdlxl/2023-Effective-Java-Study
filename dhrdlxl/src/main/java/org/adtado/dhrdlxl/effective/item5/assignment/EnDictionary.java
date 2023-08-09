package org.adtado.dhrdlxl.effective.item5.assignment;

import java.util.Arrays;
import java.util.HashSet;

public class EnDictionary implements Lexicon {
    private final HashSet<String> set;

    public EnDictionary() {
        this.set = new HashSet<>(Arrays.asList("AB", "CD"));
    }

    @Override
    public boolean isValid(String word) {
        return set.contains(word);
    }
}
