import java.time.LocalTime;
public class Time {
    public int hours;
    public int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    public Time(LocalTime localTime) {
        this.hours = localTime.getHour();
        this.minutes = localTime.getMinute();
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }

    public Time addTime(Time otherTime) {
        int newHours = this.hours + otherTime.getHours();
        int newMinutes = this.minutes + otherTime.getMinutes();

        if (newMinutes >= 60) {
            newMinutes -= 60;
            newHours++;
        }

        if (newHours >= 24) {
            newHours %= 24;
        }

        return new Time(newHours, newMinutes);
    }
}
