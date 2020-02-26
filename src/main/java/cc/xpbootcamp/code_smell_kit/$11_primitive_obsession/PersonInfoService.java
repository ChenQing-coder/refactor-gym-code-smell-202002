package cc.xpbootcamp.code_smell_kit.$11_primitive_obsession;

import java.util.ArrayList;
import java.util.List;

public class PersonInfoService {

    private List<String> loadPersonInfo(){
        List<String> infoList = new ArrayList<>();
        // from csv
        return infoList;

    }

    public void sendEmail(){
        List<String> infoList = loadPersonInfo();
        for(int i = 0; i < infoList.size(); i ++){
            String info = infoList.get(i);
            if(info.endsWith("true")){
                String id = info.split("|")[0];
                MessageUtil.sendEmail(id,MessageTemplate.NEW_PROCESS);
            }

        }

    }




}
