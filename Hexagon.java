public class Hexagon extends Shape implements Info{
    private int side;
    private String name;
    private int numcorners;

    @Override
    public void showInfo(){
        this.numcorners=6;
        System.out.println("має "+this.numcorners+" кутів");
    }
    @Override
    public void showPar(){
        System.out.println("сторона "+this.side);
    }
    public void setSide(int side){
        this.side=side;
    }

    @Override
    public float getArea(){
        return (float) Math.sqrt(3)*3*side*side/2;
    }
    @Override
    public String getName(){
        name="шестикутник" ;//
        return name;
    }
}



