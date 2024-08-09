package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month == 6) {
            System.out.println("Summer");
        } else if (month < 1 || month > 12) {
            System.out.println("wrong number!");
        }

    }
}
