package cn.stack.design.right;

import java.util.ArrayList;
import java.util.List;

public class Alert {
    private final List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addHandler(AlertHandler handler){
        alertHandlers.add(handler);
    }

    public void check(ApiStateInfo apiStateInfo){
        for(AlertHandler alertHandler: alertHandlers){
            alertHandler.check(apiStateInfo);
        }
    }
}
