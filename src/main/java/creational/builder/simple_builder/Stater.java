package creational.builder.simple_builder;

class Stater {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Pavlo", "Khshanovkyi")
                .email("kh.@gmail.com")
                .age(26)
                .build();

        System.out.println(user.toString());
    }
}
