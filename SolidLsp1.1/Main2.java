package solid;

import ...

public class Main {
    public static void main(String[]args){
        Rectangle rectangle = new Square(side:5);
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        System.out.printf("В прямоугольнике сторона А = %d, сторона B =%d\n", rectangle.getSideA(), rectangle.getSideB())
        ViewShape view = ViewShape(rectangle);
        view.showArea();
    }
}
