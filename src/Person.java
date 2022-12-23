public class Person {
    String name;
    int age;
    int height;
    int weight;


    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    public void info() {
        System.out.println(name + " " + age + " " + height + " " + weight);
    }

    public void work() {
        if (age < 18 || age > 70) {
            System.out.println("отдыхаю дома");
        }
        else {
            System.out.println("работаю");
        }
        }

}
