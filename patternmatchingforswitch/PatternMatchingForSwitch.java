package patternmatchingforswitch;

import patternmatchingforswitch.DayOfWeek;

public class PatternMatchingForSwitch {

    public static void main(String args[]) {
        getDayOfWeekName(DayOfWeek.MONDAY);
    }

    public static String getDayOfWeekName(DayOfWeek day) {
        String name = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> "Start of the week";
            case TUESDAY -> "Second day";
            case WEDNESDAY -> "Mid of the week";
            case THURSDAY -> "Fourth day";
            case SATURDAY -> "Weekend";
        };
        System.out.println(name);
        return name;
    }
}
