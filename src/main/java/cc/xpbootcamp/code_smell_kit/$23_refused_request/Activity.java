package cc.xpbootcamp.code_smell_kit.$23_refused_request;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Activity {

    private final ActivityType type;

    private final LocalDate date;

    private final int price;

    public Activity(ActivityType type, LocalDate date, int price) {
        this.type = type;
        this.date = date;
        this.price = price;
    }

    public enum ActivityType {WORKSHOP, TDD, SESSION}
}
