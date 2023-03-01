public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super.getWidth();
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);

    }
    //setArea dan setPerimeter tidak perlu di overide karena memiliki 

    @Override
    public void setLength(double side) {
        // TODO Auto-generated method stub
        this.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        // TODO Auto-generated method stub
        this.setWidth(width);
    }



}
