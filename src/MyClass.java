public class MyClass {
        String name;
        String surname;
        int age;
        String[] lesson;
        String  favoriteFood;

        public MyClass(String name, String surname,int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }
        public MyClass(String favoriteFood,String ...lesson){
            this.favoriteFood = favoriteFood;
            this.lesson = lesson;
        }

    }

