package fpoly.quynhlm.dev.examplejavaoop.Model;

public class Student {
    private String name;
    private int age;
    private float scores;

    public Student() {

    }

    public Student(String name, int age, float scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public String Information() {
        return this.name + "" + this.age + this.scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScores() {
        return scores;
    }

    public void setScores(float scores) {
        this.scores = scores;
    }
}
