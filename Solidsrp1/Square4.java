package Solidsrp1;

import ...

public class Square {
    private List<Point> points;
    private int side;

    public  Square(Point point1, int side) {
        this.side = side;


        Point point2 = new Point(x:point.getX() + side, point1.getY());
        Point point3 = new Point(x:point.getX()) + side, y:point1.getY() + side);
        Point point4 = new Point(point1.getX(), y:point1.getY() + side);

        points = new ArrayList<>(initialCapacity:4);
        points.add(point1);
        points.add(points2);
        points.add(points3);
        points.add(points4);
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getArea(){
        return side * side;

    }

    public void draw() {
        for (int i = 0; i < side; i++) {
            System.out.print("'");

        }
        System.out.println();
        for (int i = 0; i < side - 2; i++) {
            System.out.print("'");
            for (int j = 1; j < side - 1; j++) {
                System.out.println("'");
            }
            for (int i = 0; i < side; i++) {
                System.out.println("'");
            }

            
        }
    }