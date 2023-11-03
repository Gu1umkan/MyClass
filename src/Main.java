import java.util.Arrays;
import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass("Gulumkan", "Uson kyzy", 21);
        myClass.favoriteFood = "Manty";
        myClass.lesson = new String[]{"English", "Java"};
        getInfo(myClass);
        MyClass myClass1 = new MyClass( "Plov", "JS", "English");
        myClass1.name = "Zarina";
        myClass1.surname = "Akmatova";
        myClass1.age = 20;
        getInfo(myClass1);
    }
    public static void getInfo(MyClass myClass){
        System.out.println(STR."""
                Name :\{myClass.name}
                Surname: \{myClass.surname}
                Age:\{myClass.age}
                Favorite food : \{myClass.favoriteFood}
                Lesson: \{ Arrays.toString(myClass.lesson)}
                """);
    }
}