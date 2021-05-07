package com.train;

public class Tickets {
   private   int totaltickets;
   private   int roundtrip;

    public Tickets(int totaltickets, int roundtrip) {
        this.totaltickets = totaltickets;
        this.roundtrip = roundtrip;
    }

    public void show(){
        int total = (int) ((totaltickets-roundtrip)*1000+(roundtrip*2000)*0.9);
      System.out.println("Total tickets :"+totaltickets+"\n"
              +"Round-trip:"+roundtrip+"\n"
              +"Total:"+total);
  }
}
