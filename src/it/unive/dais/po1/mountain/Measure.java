package it.unive.dais.po1.mountain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( {
        java.lang.annotation.ElementType.FIELD,
        java.lang.annotation.ElementType.METHOD,
        java.lang.annotation.ElementType.PARAMETER,
        ElementType.LOCAL_VARIABLE })
@Retention(RetentionPolicy.SOURCE)
public @interface Measure {
    String value();
    double min() default 0.0;
}
