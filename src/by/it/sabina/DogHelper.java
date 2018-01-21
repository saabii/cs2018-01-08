package by.it.sabina;

import by.it.sabina.lesson06.Dog;

public class DogHelper {

public static void printAllNames(Dog[] dogs) {
    for (Dog dog : dogs) {
        System.out.print(dog.getName()+" ");
    }
    System.out.println();
}

    public static double averageAge(Dog[] dogs) {
        double res = 0;
        if (dogs.length > 0)
            for (Dog dog : dogs)
                res = res + 1.0*dog.getAge()/dogs.length;
        return res;
    }


}
