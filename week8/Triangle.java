package org.shapes;
public class Triangle{
  double base;
  double height;
  public Triangle(double base,double height){
  this.base=base;
  this.height=height;
  }
  public double getArea(){
  return 0.5*base*height;
  }
  public double getPerimeter(){
  return 3*base;
  }
  }
