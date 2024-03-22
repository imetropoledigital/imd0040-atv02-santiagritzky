public class Circle {

    
public float radius;

public Circle(float radius){
    this.radius = radius;
}

public double area(){
    double area_circ =  this.radius * this.radius * Math.PI;
    return area_circ;
}

public double  circumference(){
    double circum_circ = this.radius * Math.PI * 2;
    return circum_circ;
}




}
