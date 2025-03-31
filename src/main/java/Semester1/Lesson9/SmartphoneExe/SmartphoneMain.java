package Semester1.Lesson9.SmartphoneExe;

public class SmartphoneMain {
    public static void main(String[] args) {
        Smartphone smart1 = new Smartphone();
        smart1.setYear(2022);
        System.out.println(smart1.minutesToFullCharge());
    }
}
