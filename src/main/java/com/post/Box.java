package com.post;

public  class Box {
    protected  float length;
    protected  float width;
    protected  int height;

    public Box (float length ,float width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public boolean validate(float length, float width, int height){
        if(volume(length,width,height)<=volume(this.length,this.width,this.height))
            return true;
        else
            return  false;
    }
    public float volume(float length, float width, int height){
        return length*width*height;
    }


}
