package extend;

import oop.Shape;

public class Circle extends Shape {

    Point point;
    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() {
        System.out.println("[center = ]");
            point.x,point.y,color);
    }

}
