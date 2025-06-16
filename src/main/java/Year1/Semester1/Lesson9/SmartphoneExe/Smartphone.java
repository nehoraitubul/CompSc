package Year1.Semester1.Lesson9.SmartphoneExe;

public class Smartphone {
    private int year;
    private float battery;
    private int chargingMinutes;
    private int[] appCounter = new int[4];

    public void setYear(int year){
        this.year = year;
    }

    public boolean needsCharging(){
        return this.battery <= 15.0;
    }

    public boolean isBatterFull(){
        return this.battery == 100;
    }

    public boolean isNewPhone(){
        return this.year >= 2021;
    }

    public boolean charge(int minutes){
        boolean answer = false;
        if (!isBatterFull()){
            answer = true;
            float chargingPerMinute = 0.5F;
            if (this.year == 2024){
                chargingPerMinute = 1;
            } else if (isNewPhone()) {
                chargingPerMinute = 0.75F;
            }
            if (chargingPerMinute * minutes + this.battery <= 100){
                this.battery += chargingPerMinute * minutes;
                this.chargingMinutes += minutes;
            } else {
                for (int i = 0; i < minutes; i++) {
                    if (chargingPerMinute + this.battery <= 100){
                        this.battery += chargingPerMinute;
                        this.chargingMinutes++;
                    } else {
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public String toString(){
        String newOrOld = "Old";
        if (isNewPhone()) newOrOld = "New";
        return "The phone is " + newOrOld + ", Charged for " + this.chargingMinutes + " minutes, and have now " + this.battery + " percentage.";
    }

    public boolean startApp(String app, int minutes){
        float percentPerMinute = 1;
        int appNum = 3;
        if (app.equals("Waze")){
            percentPerMinute = 1.2F;
            appNum = 0;
        } else if (app.equals("Gmail")) {
            percentPerMinute = 0.3F;
            appNum = 1;
        } else if (app.equals("Instagram")){
            percentPerMinute = 0.5F;
            appNum = 2;
        }
        if (percentPerMinute * minutes <= this.battery){
            this.battery -= percentPerMinute * minutes;
            this.appCounter[appNum]++;
            return true;
        }
        return false;
    }

    public String mostPopularApp(){
        int mostUsedApp = 3;
        int biggest = appCounter[3];
        for (int i = 0; i < this.appCounter.length; i++) {
            if (this.appCounter[i] > biggest){
                mostUsedApp = i;
            }
        }
        if (mostUsedApp == 0) return "Waze";
        if (mostUsedApp == 1) return "Gmail";
        if (mostUsedApp == 2) return "Instagram";
        return "Other";
    }

    public int minutesToFullCharge(){
        float chargingPerMinute = 0.5F;
        if (this.year == 2024){
            chargingPerMinute = 1F;
        } else if (isNewPhone()) {
            chargingPerMinute = 0.75F;
        }
        float batteryIsNeeded = 100 - this.battery;
        return (int) (batteryIsNeeded / chargingPerMinute);
    }
}
