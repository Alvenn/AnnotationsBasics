package com.gmail.alvenn89;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
        TextContainer txt = new TextContainer();
        Class<?> cls = txt.getClass();

        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            if (method.isAnnotationPresent(Saver.class) && cls.isAnnotationPresent(SaveTo.class)) {
                try {
                    method.invoke(txt, cls.getAnnotation(SaveTo.class).path());
                }
                catch (IllegalAccessException e){
                    System.out.println(e);
                }
                catch (InvocationTargetException e){
                    System.out.println(e);
                }
            }
        }
    }
}
