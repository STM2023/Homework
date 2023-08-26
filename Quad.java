public class Quad extends Shape implements Info{
    private int side;
    private String name;
    private int numcorners;
    public void setSide(int side){
        this.side=side;
    }

    @Override
    public void showInfo(){
        this.numcorners=4;//
        System.out.println("має "+this.numcorners+" кута");
    }
    @Override
    public void showPar(){
        System.out.println("сторона "+this.side);
    }
    @Override
    public  String getName(){
        name="квадрат";//""sguare"
        return name;
    }
    @Override
    public float getArea(){
       return side*side;
    }

}
