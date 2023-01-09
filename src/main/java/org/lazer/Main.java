package org.lazer;

import org.lazer.resources.*;

import java.lang.reflect.Method;

import static org.lazer.Main.Meta.myMeth;

public class Main {
    static class Meta{
        @Annotatoin(str = "Annotation", val = 100)
        public static void myMeth(){
            Meta ob = new Meta();
            //Получить аннотацию этого метода и отобразить значения ее членов
            try {
                //Для начала получить объект Class, который представляет данный класс
                Class<?> c = ob.getClass();
                //Теперь получить объект Method, который представляет этот метод
                Method m = c.getMethod("myMeth");
                //Получить аннотацию для этого класса
                Annotatoin anno = m.getAnnotation(Annotatoin.class);
                //Вывод значений
                System.out.println(anno.str() + " " + anno.val());
            }
            catch (NoSuchMethodException e){
                System.out.println("NoSuchMethodException");
            }
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}