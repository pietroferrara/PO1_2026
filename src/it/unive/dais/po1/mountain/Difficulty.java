package it.unive.dais.po1.mountain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Difficulty {
    Level level() default Level.EASY;
    enum Level {
        EASY, MEDIUM, HARD
    }
}
