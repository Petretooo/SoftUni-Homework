package Reflections.Reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class someClass = Reflection.class;
//        System.out.println(someClass.getSimpleName());
//        System.out.println(someClass.getSuperclass().getSimpleName());
//
//        Class[] interfaces = someClass.getInterfaces();
//        Arrays.stream(interfaces).forEach(e -> System.out.println(e.getSimpleName()));
//
//        Constructor[] declaredConstructors = someClass.getDeclaredConstructors();
//        Reflection reflection = (Reflection) someClass.getDeclaredConstructor().newInstance();
//        System.out.println();
////        for (Constructor declaredConstructor : declaredConstructors) {
////            declaredConstructor.newInstance()
////
////        }

//        Constructor[] constructors = someClass.getConstructors();
//        for (Constructor constructor : constructors) {
//            Class[] parameterTypes = constructor.getParameterTypes();
//            System.out.println();
//        }
//        Constructor[] declaredConstructors = someClass.getDeclaredConstructors();
//        for (Constructor constructor : declaredConstructors) {
//            Class[] parameterTypes = constructor.getParameterTypes();
//            System.out.println();
//        }
//        for (Constructor constructor : declaredConstructors) {
//            Class[] parameterTypes = constructor.getParameterTypes();
//            if(parameterTypes.length == 1 && parameterTypes[0].getSimpleName().equals("String")){
//                Reflection pesho = (Reflection) constructor.newInstance("Pesho");
//                System.out.println();
//            }
//        }

/*
        Field name = someClass.getField("name");
        System.out.println(name.getName());
        System.out.println(name.getType().getSimpleName());
*/

/*        Reflection reflection = new Reflection("ASD -> Reflection");

        Field asdFromReflection = reflection.getClass().getDeclaredField("asd");
        asdFromReflection.setAccessible(true);
        Object asdValueFromReflection = asdFromReflection.get(reflection);
        System.out.println();
        asdValueFromReflection = "AS2D -> Modified";

        asdFromReflection.set(reflection, asdValueFromReflection);
        */




/*        Reflection reflection = new Reflection("ASD -> FirstReflection");
        Class<Reflection> aClass = (Class<Reflection>) reflection.getClass();
        Method[] allDdeclaredMethods = aClass.getDeclaredMethods();
        Method[] getters = getMethodsStartsWith("get", allDdeclaredMethods);
        Method[] setters = getMethodsStartsWith("set", allDdeclaredMethods);


        Arrays.stream(getters)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(String.format("%s will return class %s",
                        m.getName(), m.getReturnType().getSimpleName())));

        Arrays.stream(setters)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(String.format("%s and will set field of class %s",
                        m.getName(), m.getParameterTypes()[0].getSimpleName())));



        */
        Reflection reflection = new Reflection("ASD -> FirstReflection");
        Class<Reflection> aClass = (Class<Reflection>) reflection.getClass();
        Method[] allDdeclaredMethods = aClass.getDeclaredMethods();
        Method[] getters = getMethodsStartsWith("get", allDdeclaredMethods);
        Method[] setters = getMethodsStartsWith("set", allDdeclaredMethods);
        Field[] fields = aClass.getDeclaredFields();


        Arrays.stream(fields)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach( f -> System.out.println(String.format("%s must be private!",
                        f.getName())));

        Arrays.stream(getters)
                .filter(f -> Modifier.isPublic(f.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(String.format("%s have to be public!",
                        m.getName())));

        Arrays.stream(setters)
                .filter(f -> Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(String.format("%s have to be private!",
                        m.getName())));



    }

    public static Method[] getMethodsStartsWith(String with, Method[] methods){
        return Arrays.stream(methods)
                .filter(m -> m.getName().startsWith("get"))
                .toArray(Method[]::new);
    }
}
