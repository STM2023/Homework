import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args){
        AreaPrinter areaPrinter =new AreaPrinter();
        NamePrinter namePrinter = new NamePrinter();

        Circle circle = new Circle();
        circle.setRadius(1);

        namePrinter.printName(circle);
        outputInfo(circle);
        areaPrinter.printArea(circle);

        Triangle triangle =new Triangle();
        triangle.setSide(3);
        triangle.setHeinght(2);

        namePrinter.printName(triangle);
        outputInfo(triangle);
        areaPrinter.printArea(triangle);

        Quad quad = new Quad();
        quad.setSide(5);

        namePrinter.printName(quad);
        outputInfo(quad);
        areaPrinter.printArea(quad);

        Rombus rombus =new Rombus();
        rombus.setDiagonal1(7);
        rombus.setDiagonal2(4);

        namePrinter.printName(rombus);
        outputInfo(rombus);
        areaPrinter.printArea(rombus);

        Pentagon pentagon =new Pentagon();
        pentagon.setSide(6);
        pentagon.setApothem(5);

        namePrinter.printName(pentagon);
        outputInfo(pentagon);
        areaPrinter.printArea(pentagon);

        Hexagon hexagon =new Hexagon();
        hexagon.setSide(6);

        namePrinter.printName(hexagon);
        outputInfo(hexagon);
        areaPrinter.printArea(hexagon);
    }
    public static void outputInfo(Info info){
        info.showInfo();
        info.showPar();
    }
}
