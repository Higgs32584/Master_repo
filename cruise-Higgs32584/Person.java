//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Person {
    protected double age;
    protected String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = (double)age;
    }

    public String display() {
        return this.name + " : " + this.age;
    }

    public boolean compareTo(Person p) {
        return this.name.equals(p.name);
    }
}