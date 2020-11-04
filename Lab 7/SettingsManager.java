public class SettingsManager {
    private String deviceName;
    private float backLightLevel;

    private static SettingsManager instance = new SettingsManager();

    private SettingsManager() {

    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public float getBackLightLevel() {
        return backLightLevel;
    }

    public void setBackLightLevel(float backLightLevel) {
        if (backLightLevel > 1 || backLightLevel < 0) {
            throw new IllegalArgumentException("Backlight level should be betweeen 1 or 0");
        } else {
            this.backLightLevel = backLightLevel;
        }
    }

    public static SettingsManager getInstance() {
        return instance;
    }
}