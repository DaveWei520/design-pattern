package com.weiyu.designPattern.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author weiyu
 * @description
 * @create 2018/5/11 11:42
 * @since 1.0.0
 */
public class BuildingFactory {
    private static final ConcurrentHashMap<String,Gymnasium> buildings = new ConcurrentHashMap<>();

    public static Gymnasium getBuilding(String activity){
        Gymnasium building = buildings.get(activity);
        if (building == null){
            building = new Gymnasium(activity);
            buildings.put(activity,building);
        }
        return building;
    }

    public static int getSize(){
        return buildings.size();
    }
}
