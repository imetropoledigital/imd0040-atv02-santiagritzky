public class Circle {

    
public float radius;

public Circle(float radius){
    this.radius = radius;
}

public double Area(){
    double area_circ =  this.radius * this.radius * Math.PI;
    return area_circ;
}

public double  circumference(){
    double circum_circ = this.radius * Math.PI * 2;
    return circum_circ;
}




public static void main(String[] args) {

    Circle circulo = new Circle(5);

    System.out.println("Area do circulo: " + circulo.Area());
    System.out.println("Circunferencia do circulo: " + circulo.circumference());


}

}
