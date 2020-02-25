package cc.xpbootcamp.code_smell_kit.$13_loops;

import java.util.List;

public class ProjectService {

    public boolean canDelete(Project project) {
        List<Batch> batches = project.getBatches();
        boolean canDelete = true;
        for (Batch batch : batches) {
            List<BaseStation> baseStations = batch.getBaseStation();
            for (BaseStation baseStation : baseStations) {
                if (baseStation.getStatus().equals("waiting")) {
                    canDelete = false;//循环语句
                }
            }
        }
        return canDelete;
    }
}
