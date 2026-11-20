package it.unive.dais.po1.rpg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Hero hero = new Archer("Pietro", 100, 100, 8);
        Class<Archer> c = (Class<Archer>) hero.getClass();
        System.out.println(c.getName());
        System.out.println(c.isInterface());
        System.out.println(c.isEnum());
        System.out.println(c.getSuperclass().getName());

        for(Class<?> cl : c.getInterfaces()) {
            System.out.println(cl.getName());
        }

        for(Field f : c.getDeclaredFields()) {
            System.out.println(f.getName());
            f.setAccessible(true);
            System.out.println(f.get(hero));
            f.set(hero, -1);
            System.out.println(f.get(hero));
        }
        System.out.println(Validator.validate(hero));

        for(Method m : c.getDeclaredMethods()) {
            if(m.getName().equals("attack")) {
                m.invoke(hero);
            }
        }
        for(Method m : c.getSuperclass().getDeclaredMethods()) {
            if(m.getName().equals("takeDamage")) {
                m.invoke(hero, 20);
            }
        }

        for(Constructor cstr : c.getDeclaredConstructors() ) {
            Archer ar = (Archer) cstr.newInstance("Archer", 90, 90, 10);
        }



        Class c1 = Hero.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSuperclass().getName());

        //for(Constructor cstr : c1.getDeclaredConstructors())
        //    cstr.newInstance("hero", 100, 100);

        Class<?> knight = Class.forName("it.unive.dais.po1.rpg.Knight");
        System.out.println(knight.getName());
        System.out.println(knight.getSuperclass());

        Class c2 = int.class;
        System.out.println(c2.getName());
        System.out.println(c2.getSuperclass());

    }
}
