package cc.xpbootcamp.code_smell_kit.$23_refused_request;

public class VIPTicket extends Ticket {

    private final boolean supportExtensionalActivities;

    public VIPTicket(Activity activity, boolean supportExtensionalActivities) {
        super(activity);
        this.supportExtensionalActivities = supportExtensionalActivities;
    }

    public boolean isSession() {
        return Activity.ActivityType.SESSION.equals(activity.getType());
    }

    public int getPrice() {
        return super.getPrice() + 100;
    }

    public boolean hasExtensionalActivities() {
        return Activity.ActivityType.TDD.equals(activity.getType()) || supportExtensionalActivities;
    }
}