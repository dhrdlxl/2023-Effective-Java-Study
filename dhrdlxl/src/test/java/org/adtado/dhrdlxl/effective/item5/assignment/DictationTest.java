package org.adtado.dhrdlxl.effective.item5.assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class DictationTest {
    @Test
    void kr_dictation() {
        List<String> submit = Arrays.asList("가나", "AB", "CD");

        Long score = getScore(submit, KrDictionary::new);

        assertEquals(1L, score);
    }

    @Test
    void en_dictation() {
        List<String> submit = Arrays.asList("가나", "AB", "CD");

        Long score = getScore(submit, EnDictionary::new);

        assertEquals(2L, score);
    }

    public Long getScore(List<String> submit, Supplier<? extends Lexicon> dictionary) {
        Long score = 0L;

        Lexicon lexicon = dictionary.get();
        for (String s : submit) {
            if (lexicon.isValid(s)) {
                score++;
            }
        }

        return score;
    }
}