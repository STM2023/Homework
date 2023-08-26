public class Rombus extends Shape implements Info{
    private int diagonal1;
    private int diagonal2;
    private String name;
    private int numcorners;

    @Override
    public void showInfo(){
        this.numcorners=4;
        System.out.println("має "+this.numcorners+" кута");
    }
    @Override
    public void showPar(){
        System.out.println("діагональ1 "+this.diagonal1+", діагональ2 "+this.diagonal2);
    }
    public void setDiagonal1(int diagonal1){
        this.diagonal1=diagonal1;
    }
    public void setDiagonal2(int diagonal2){
        this.diagonal2=diagonal2;
    }
    @Override
    public float getArea(){
        return diagonal1*diagonal2/2;
    }
    @Override
    public String getName(){
        name="ромб" ;//Rombus
        return name;
    }
}
