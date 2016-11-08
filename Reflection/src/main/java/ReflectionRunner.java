package main.java;
import java.lang.Class.*;
import java.lang.annotation.*;
import java.lang.reflect.*;


/**
 * Created by daniel on 08/11/16.
 */
public class ReflectionRunner {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("main.java.Car");
            Object instanceCar = clazz.newInstance();

            //Class childClazz = Class.forName("main.java.Track");
            //Object instanceChildClazz = childClazz.newInstance();

            // List of Constructors with their parameters
            System.out.println("Constructors: ");
            for (Constructor constructor: clazz.getConstructors()){
                System.out.println(constructor.getName());
                for (Class p : constructor.getParameterTypes()){
                    System.out.println("  "+p.getName());
                }
            }
            System.out.println("==========");
            System.out.println("class modifiers:");

            //get class modifiers
            int modifiers = clazz.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                System.out.println("public");
            }
            if (Modifier.isAbstract(modifiers)) {
                System.out.println("abstract");
            }
            if (Modifier.isFinal(modifiers)) {
                System.out.println("final");
            }
            System.out.println("==========");

            // List of methods with annotations
            System.out.println("list of methods with their parametrs, annotations and types");
            for (Method method:clazz.getMethods()) {
                System.out.println("Name: " + method.getName() + " method type: " + method.getReturnType().getName());

                if (Modifier.isPublic(method.getModifiers())) {
                    System.out.print("public ");
                }
                if (Modifier.isPrivate(method.getModifiers())) {
                    System.out.print("private ");
                }
                if (Modifier.isProtected(method.getModifiers())) {
                    System.out.print("protected ");
                }
                if (Modifier.isStatic(method.getModifiers())) {
                    System.out.print("static ");
                }

                System.out.println("parametr types: ");
                for (Class paramType : method.getParameterTypes())
                    System.out.println(" " + paramType.getName());
                SpecialAnnotation anot = method.getAnnotation(SpecialAnnotation.class);
                if (anot != null && anot.enabled()) {
                    System.out.println("Call by " + SpecialAnnotation.class.getName() +
                            method.invoke(instanceCar));
                }

                System.out.println("----------");
            }
            System.out.println("==========");
            System.out.println(clazz.getPackage());
            System.out.println(clazz.getName());
            System.out.println("==========");
            System.out.println("superClass: "+clazz.getSuperclass().getName());
            System.out.println("==========");
            for(Annotation anot:clazz.getAnnotations()){
                System.out.println(anot.getClass().getName());
            }
            System.out.println("==========");
            for (Field field:clazz.getDeclaredFields()){
                if (Modifier.isPublic(field.getModifiers())) {
                    System.out.print("public ");
                }
                if (Modifier.isPrivate(field.getModifiers())) {
                    System.out.print("private ");
                }
                if (Modifier.isProtected(field.getModifiers())) {
                    System.out.print("protected ");
                }
                if (Modifier.isStatic(field.getModifiers())) {
                    System.out.print("static ");
                }
                System.out.print(field.getType()+" ");
                System.out.println(field.getName());
            }
            System.out.println("==========");




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
