public class Pentagon extends Shape implements  Info {
        private int side;
        private int apothem;
        private String name;
        private int numcorners;

        @Override
        public void showInfo(){
            this.numcorners=5;
            System.out.println("має "+this.numcorners+" кутів");
        }
        @Override
        public void showPar(){
            System.out.println("сторона "+this.side+", апофема "+this.apothem);
        }
        public void setSide(int side){
            this.side=side;
        }
        public void setApothem(int apothem){
            this.apothem=apothem;
        }
        @Override
        public float getArea(){
            return 5*side*apothem/2;
        }
        @Override
        public String getName(){
            name="п'ятикутник" ;//Pentagon
            return name;
        }
    }


