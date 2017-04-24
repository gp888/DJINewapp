package com.dji.GSDemo.GaodeMap;

/**
 * Created by 111112 on 2017/4/21.
 */

public class MoveSurroundMode {


    public double BasicLat,BasicLng;
    public float qsgd_ptr; //起始高度
    public float gdjg_ptr;//高度间隔
    public float jcds_ptr;//监测点数
    public float ddcjsj_ptr;//单点采集时间
    public float jcgd_ptr;//监测高度
    public float jcfxsd_ptr;//监测飞行速度
    public float hrbj_ptr;//环绕半径
    //private float High;
    //private float Radius;
    //private float Speed;
    //private boolean isClocked;

    protected void setBasicPoint(double lat,double lng){
        BasicLat = lat;
        BasicLng = lng;
    }
    protected void setQsgd_ptr(float ptr){
        qsgd_ptr = ptr;
    }
    protected void setGdjg_ptr(float ptr){
        gdjg_ptr = ptr;
    }
    protected void setJcds_ptr(float ptr){
        jcds_ptr = ptr;
    }
    protected void setDdcjsj_ptr(float ptr){
        ddcjsj_ptr = ptr;
    }
    protected void setJcgd_ptr(float ptr){
        jcgd_ptr = ptr;
    }
    protected void setJcfxsd_ptr(float ptr){
        jcfxsd_ptr = ptr;
    }
    protected void setHrbj_ptr(float ptr){
        hrbj_ptr = ptr;
    }

}
