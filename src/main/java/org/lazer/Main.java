package org.lazer;

import org.lazer.resources.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

@What(description = "Annotation class")
@Annotatoin(str = "Annotation class", val = 10)
public class Main {
        @What(description = "Annotation method")
        @Annotatoin(str = "Annotation method", val = 100)
        public static void myMeth(){
            Main ob = new Main();
            //Получить аннотацию этого метода и отобразить значения ее членов
            try {
                Annotation[] annos = ob.getClass().getAnnotations();
                System.out.println("Все аннотации для Main");
                for(Annotation a: annos){
                    System.out.println(a);
                }
                Method m = ob.getClass().getMethod("myMeth");
                annos = m.getAnnotations();
                System.out.println("Все аннотации для myMeth");
                for (Annotation a: annos){
                    System.out.println(a);
                }
            }
            catch (NoSuchMethodException e){
                System.out.println("NoSuchMethodException");
            }
    }
    public static void main(String[] args) {
        myMeth();
    }
}