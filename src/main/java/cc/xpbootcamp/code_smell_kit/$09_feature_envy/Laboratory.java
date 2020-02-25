package cc.xpbootcamp.code_smell_kit.$09_feature_envy;

public class Laboratory {
    private Image image;

    public String calculateLevel() {
        if(image.getName().equals("BIG DATA") || image.getName().equals("AI") || image.getMinDuration() >= 120.0) {
            return "Difficult";
        } else if (image.getMinDuration() >= 60.0) {
            return "Normal";
        }
        return "easy";//依恋情结，实验类频繁调用镜像类的数据
    }
}
