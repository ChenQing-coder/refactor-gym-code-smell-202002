package cc.xpbootcamp.code_smell_kit.$17_message_chains;

public class Antenna {
    private String type;
    private int count;

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean is5GAntenna() {
        return type.equals("5G");
    }
}
