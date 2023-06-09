package com.driver;

import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args){
    RWOnly rw=new RWOnly();
//  rw.name="Shlok";
//  System.out.println(rw.name);
    rw.setName("Shlok");
    System.out.print(rw.getName());
  }
}