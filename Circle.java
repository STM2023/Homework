public class Circle extends Shape implements Info{
    private int radius;
    private String name;
    private int numcorners;
    public void setRadius(int radius){
        this.radius=radius;
    }
    @Override
    public  void showInfo(){
        this.numcorners=0;
        System.out.println("має "+this.numcorners+" кутів");
    }
    @Override
    public void showPar(){
        System.out.println("радіус "+this.radius);
    }
    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }
        @Override
        public String getName(){
         name="коло"; //circle
            return name;
        }



}
