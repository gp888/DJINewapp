package com.dji.GSDemo.GaodeMap;

/**
 * Created by 111112 on 2017/4/21.
 */

public class MoveSurroundMode {

    private double BasicLat,BasicLng;
    private float High;
    private float Radius;
    private float Speed;
    private boolean isClocked;

    protected void setBasicPoint(double lat,double lng){
        BasicLat = lat;
        BasicLng = lng;
    }
    protected void setParameter(float high,float radius,float speed){
        High = high;
        Radius = radius;
        Speed = speed;

    }


}
