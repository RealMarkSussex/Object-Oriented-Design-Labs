public class Main {
    public static void main(String[] args) {
        SettingsManager sm1 = SettingsManager.getInstance();
        SettingsManager sm2 = SettingsManager.getInstance();
        
        sm1.setDeviceName("Good settings manager");
        sm1.setBackLightLevel(0.5f);

        System.out.println("sm2 device name: " + sm2.getDeviceName());
        System.out.println("sm2 backlight level: " + sm2.getBackLightLevel());
        System.out.println();
        System.out.println("sm1 device name: " + sm1.getDeviceName());
        System.out.println("sm1 backlight level: " + sm1.getBackLightLevel());
    }
}
