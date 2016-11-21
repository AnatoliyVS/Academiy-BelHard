package practicaltasks.task014.dataman;

public class DataMan {

    private String name;
    private int age;
    private static int count = 0;

    public DataMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public DataMan() {
        this.name = null;
        this.age = 0;
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

    @Override
    public String toString() {
        count++;
        return String.format("| %-17s | %14d", name, age);
    }

}
