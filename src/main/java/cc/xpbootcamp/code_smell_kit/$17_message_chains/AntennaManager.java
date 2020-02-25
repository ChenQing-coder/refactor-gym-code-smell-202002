package cc.xpbootcamp.code_smell_kit.$17_message_chains;

import java.util.List;

public class AntennaManager {
    private List<Province> provinceList;

    public boolean has5GAntenna() {
        return provinceList.stream()
                .flatMap(province -> province.getCities().stream())
                .flatMap(city -> city.getAreas().stream())
                .flatMap(area -> area.getRoads().stream())
                .flatMap(road -> road.getBaseStations().stream())
                .flatMap(baseStation -> baseStation.getAntennaList().stream())
                .anyMatch(Antenna::is5GAntenna);
    }//过长的消息链
}
