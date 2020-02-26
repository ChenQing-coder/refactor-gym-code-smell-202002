package cc.xpbootcamp.code_smell_kit.$05_global_data;

public class BaseStationService {

    public void updateSupportBaseStation(BaseStation baseStation) {
        if(isSupportBaseStation(baseStation)) {
            LicenseValidator.supportBaseStation.add(baseStation);//对全局变量对操作
        }
    }

    private boolean isSupportBaseStation(BaseStation baseStation) {
        if(baseStation.getType().equals("4G")) {
            return true;
        }
        return false;
    }
}
