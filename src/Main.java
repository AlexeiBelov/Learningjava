import java.util.ArrayList;
import java.util.List;


public class Main {

    private static final List<Building> buildings;

    static {
        buildings = new ArrayList<>();
        buildings.add(new Building(1, 3, 3));
        buildings.add(new Building(2, 5, 5));
        buildings.add(new Building(4, 7, 2));
        buildings.add(new Building(8, 11, 4));
    }

    public static void main(String[] args) {
        List<Point> result = new ArrayList<>();
        Point currentPoint = new Point(0, 0);
        result.add(currentPoint);
        Building currentBuilding = null;
        for (; ; ) {
            Building b = findNearestBuilding(currentPoint, currentBuilding);
            if (b == null && currentBuilding == null) {
                break;
            }
            if (b == null) {//пошли вниз
                int x2 = currentBuilding.getX2();
                Point p = new Point(x2, currentBuilding.getY());
                result.add(p);
                currentBuilding = getUpperBuilding(p);//следущее здание
                if (currentBuilding == null) {//дошли до низа
                    currentPoint = new Point(x2, 0);
                } else {
                    currentPoint = new Point(x2, currentBuilding.getY());
                }
            } else {//пошли вверх
                currentBuilding = b;
                result.add(new Point(currentBuilding.getX1(), currentPoint.getY()));
                currentPoint = new Point(currentBuilding.getX1(), currentBuilding.getY());
            }
            result.add(currentPoint);
        }
        System.out.println(result);
    }

    private static Building getUpperBuilding(Point p) {
        Building upperBuilding = null;
        for (Building building : buildings) {
            assert building.getY() <= p.getY();
            if (p.getX() > building.getX1() && p.getX() < building.getX2()) {
                if (upperBuilding == null || building.getY() > upperBuilding.getY()
                        || upperBuilding.getY() == building.getY() && upperBuilding.getX2() < building.getX2()) {
                    upperBuilding = building;
                }
            }
        }
        return upperBuilding;
    }

    private static Building findNearestBuilding(Point currentPoint, Building currentBuilding) {
        Building nearestBuilding = null;
        for (Building building : buildings) {
            if (currentBuilding == null || currentPoint.getX() >= currentBuilding.getX2() && !building.equals(currentBuilding)) {
                if (nearestBuilding == null || building.getX1() < nearestBuilding.getX1()
                        || building.getX1() == nearestBuilding.getX1() && building.getY() > nearestBuilding.getY()) {
                    nearestBuilding = building;
                }
            }
        }
        return nearestBuilding;
    }
}
