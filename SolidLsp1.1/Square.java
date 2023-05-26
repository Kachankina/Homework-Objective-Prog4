package solid.lsp;

public class Square extends Rectangle {

    public Square(int size) {
        super(side,side);
    }

    @Override
    public void setSideA(int sideA) {;
        super.setSideA(sideA);
        super.setSideB(sideB);
    }

    @Override
    public void setSideB(int sideB) { super.setSideA(sideB);{
        super.setSideA(sideB);
        super.setSideA(sideA);

    }
    


    @Override
     return (int) Math.pow(getSideA(), 2);}
}
