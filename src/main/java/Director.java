public record Director(String name, String lastName) {
    @Override
    public String toString() {
        return name + ' ' + lastName;
    }
}
