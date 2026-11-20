package it.unive.dais.po1.rpg;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Validator {
    public static Collection<String> validate(Collection<Hero> hero) throws IllegalAccessException {
        List<String> errors = new ArrayList<>();
        for(Hero h: hero) {
            String s = validate(h);
            if(s!=null)
                errors.add(s);
        }
        return null;
    }

    public static String validate(Hero h) throws IllegalAccessException {
        for(Field f : h.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            if(f.isAnnotationPresent(Stat.class)) {
                Stat s = f.getAnnotation(Stat.class);
                Integer value = (Integer) f.get(h);
                if(value < s.min())
                    return "Value of "+f.getName()+" is "+value+", min allowed is "+s.min();
                if(value>s.max())
                    return "Value of "+f.getName()+" is "+value+", max allowed is "+s.max();
            }
        }
        return null;
    }
}
