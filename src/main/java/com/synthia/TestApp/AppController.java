package com.synthia.TestApp;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @Autowired
    ChildService childService;

    @PostMapping("/addChild")
    public String addChild(@RequestBody Child child){
       return new Gson().toJson(childService.addChild(child));
    }

    @GetMapping("/getChildren")
    public String getChildren(){
        return new Gson().toJson(childService.getAllChildren());
    }

    @GetMapping("/search/{name}")
    public String searchChildren(@PathVariable String name){
        return new Gson().toJson(childService.searchChildren(name));
    }

    @PutMapping("/updateChild")
    public String updateChild(@RequestBody Child child){
        return new Gson().toJson(childService.updateChild(child));
    }

    private double getDistance(double x2, double y2){
        double x1= 0.0;
        double y1= 0.0;
        double ac= Math.abs(y2-y1);
        double cb= Math.abs(x2-x1);
        return Math.hypot(ac,cb);
    }
    @GetMapping("/dart/{x}/{y}")
          public String score(@PathVariable double x, @PathVariable double y) {
        double distance = getDistance(x, y);
        if (distance > 10) {
            return "you scored "+0+" Points";
        } else
            if (distance>5){
                return "You scored " +1+ " Point";
            }else
                if (distance>1){
                    return "You scored "+5+" Points";
                }else {
                    return "You scored "+10+" Points";
                }

    }
}
