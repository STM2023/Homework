public class Triangle extends Shape implements Info{
    private int side;
    private int heinght;
    private String name;
    private int numcorners;

    @Override
    public void showInfo(){
        this.numcorners=3;
        System.out.println("має "+this.numcorners+" кута");
    }
    @Override
    public void showPar(){
        System.out.println("сторона "+this.side+", висота "+this.heinght);
    }
    public void setSide(int side){
        this.side=side;
    }
    public void setHeinght(int heinght){
        this.heinght=heinght;
    }
    @Override
    public float getArea(){
        return side*heinght/2;
    }
    @Override
    public String getName(){
        name="трикутник" ;//triangle
        return name;
    }

}
