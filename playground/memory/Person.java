class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        int number = 20;

        Person person = new Person("Ana");

        changeNumber(number);
        System.out.println(number); // 2

        changeName(person);
        System.out.println(person.name); // "Martin"

        reassign(person);
        System.out.println(person.name); // "Mel

    }

    public static void changeNumber(int n) {
        n = 2;
    }

    public static void changeName(Person p) {
        p.name = "Martin";
    }

    public static void reassign(Person p) {
        p = new Person("Mel");
    }




}