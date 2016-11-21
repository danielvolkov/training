package factoryMethod;

/**
 * Created by daniel on 21/11/16.
 */
/**
 *  (Factory Method)
 * Goal:
 * Creating an interface with create object.
 * With in, instance of class which creates, determines by classes
 * which implements the interface
 * ======
 * Example:
 *
 * knows, instance of class which we should to create;
 * class design, allows to create object that has properties of specific class
 */
public class FactoryMethod {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("C++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();


    }
    static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if(speciality.equalsIgnoreCase("Java")){
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("C++")){
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality+"is unssuport");
        }

    }
}
