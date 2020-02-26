package cc.xpbootcamp.code_smell_kit.$05_global_data;


import java.util.ArrayList;
import java.util.List;

public class LicenseValidator {
    public static List<BaseStation> supportBaseStation = new ArrayList<>();
    public static List<BaseStation> warnBaseStation = new ArrayList<>();
    public static List<BaseStation> failedBaseStation = new ArrayList<>();//全局变量

}
