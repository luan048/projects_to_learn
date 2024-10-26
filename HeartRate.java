public class HeartRate {
    public void frequency(String name, String sex, int birthYear) {
        if(sex.equalsIgnoreCase("men")) {
            int age = 2024 - birthYear;
            int frequency = 220 - age;
            System.out.println("Hello " + name + " your heart rate is " + frequency + " Bps");
        }
        else if(sex.equalsIgnoreCase("women")) {
            int age = 2024 - birthYear;
            int frequency = 226 - age;
            System.out.println("Hello " + name + " your heart rate is " + frequency + " Bps");
        }
    }
}