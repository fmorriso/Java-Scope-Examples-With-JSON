public class Pet {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
     int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Pet() {/* prevent uninitialized instances */}

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
