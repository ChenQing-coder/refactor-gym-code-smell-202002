package cc.xpbootcamp.code_smell_kit.$23_refused_request;

import java.time.DayOfWeek;

public class Ticket {

    protected final Activity activity;

    public Ticket(Activity activity) {
        this.activity = activity;
    }

    public boolean isSession() {
        return Activity.ActivityType.SESSION.equals(activity.getType()) && isWorkday();
    }

    // code smell : refused_request
    private boolean isWorkday() {
        return !activity.getDate().getDayOfWeek().equals(DayOfWeek.SATURDAY)
                && !activity.getDate().getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }

    public int getPrice() {
        return DayOfWeek.FRIDAY.equals(activity.getDate().getDayOfWeek())
                ? activity.getPrice() * 2
                : activity.getPrice();
    }

    // code smell : refused_request
    public int refund() {
        return getPrice();
    }
}