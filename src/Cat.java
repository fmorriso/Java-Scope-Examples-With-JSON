public record Cat(
        String name,
        int age
) {
    @Override
    public String name() {
        return name;
    }
}
