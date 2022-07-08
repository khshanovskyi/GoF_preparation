package creational.builder.multi_builder;

class Starter {
    public static void main(String[] args) {

        Phone smartphone = new Phone.PhoneBuilder()
                .screen(new Screen.ScreenBuilder().diagonal(6.5).type("Touch").build())
                .protection(new Protection.ProtectionBuilder().dustProofType("IP57").waterproofType("IP57").build())
                .build();
        System.out.println(smartphone.toString());
    }
}
