package lv.rvt;

public class box {
    public double volume;
    public double height;
    public double width;
    public double length;
    
    double area(){
      return length * width;              
    }
    
    public double volume(){
        return length * height * width;
    }
    public box(double width, double height, double length) {
      this.width = width;
      this.height = height;
      this.length = length;
  } 
}
