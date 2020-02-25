package cc.xpbootcamp.code_smell_kit.$09_feature_envy;

import java.util.Date;

public class Image {
    private String name;
    private Integer size;
    private String status;
    private Date deadline;
    private Double minDuration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Double getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(Double minDuration) {
        this.minDuration = minDuration;
    }
}
