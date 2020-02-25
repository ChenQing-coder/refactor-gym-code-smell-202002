package cc.xpbootcamp.code_smell_kit.$10_data_clumps;

import java.util.Date;

public class Laboratory {
    private Date createTime;
    private String name;
    private String imageName;
    private Integer imageSize;
    private String imageExpiredTime;

    public Laboratory(Date createTime, String name, String imageName, Integer imageSize, String imageExpiredTime) {//数据泥团
        this.createTime = createTime;
        this.name = name;
        this.imageName = imageName;
        this.imageSize = imageSize;
        this.imageExpiredTime = imageExpiredTime;
    }
}
