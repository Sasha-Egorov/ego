package com.egorov.homeworks.homework16;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Slf4j
public class AnnotationPresent {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException {

        Class<?> cl = Class.forName("com.egorov.homeworks.homework16.FractionTest");
        Method[] method = cl.getDeclaredMethods();
        for (Method met : method) {
            if (met.isAnnotationPresent(MyTest.class)) {
                String MethodName = met.getName();
                try {
                    met.invoke(null);
                    log.info(MethodName + " - successful");
                } catch (InvocationTargetException e) {
                    log.info(MethodName + " - failed");
                }
            }
        }
    }
}
