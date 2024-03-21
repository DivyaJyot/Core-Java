package OCJP17.InnerClasses;

public class Computer {
    private static int hdd=700;

    public static void main(String[] args) {
        Laptop.main(new String[]{"abc"});
        Laptop.getName();
        OperatingSystem.printConfig();
        System.out.println(OperatingSystem.ram);

    }

    private static class OperatingSystem {
        private static int ram=8;

        public static void printConfig() {
            System.out.println("HDD=" + hdd + "RAM" + ram);
        }
        


    }


}
