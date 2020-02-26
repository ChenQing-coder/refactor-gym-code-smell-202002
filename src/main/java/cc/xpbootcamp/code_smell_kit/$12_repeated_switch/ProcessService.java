package cc.xpbootcamp.code_smell_kit.$12_repeated_switch;

import java.util.List;

public class ProcessService {

    public void copyToManager(List<Process> list){
        for(int i = 0; i < list.size(); i ++){
            Process process = list.get(i);
            switch (process.getType()){
                case "new_branch":
                case "structured_deposit":
                    copyToManager(process);
            }
        }
    }

    public void copyToManager(Process process){

    }

    public void copyToCIO(List<Process> list){
        for(int i = 0; i < list.size(); i ++){
            Process process = list.get(i);
            switch (process.getType()){
                case "vpn_apply":
                case "new_server":
                    copyToCIO(process);
            }
        }
    }

    public void copyToCIO(Process process){

    }



}
