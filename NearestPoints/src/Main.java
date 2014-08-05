import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Main {
    private static Map<Point, Point> outMap = new HashMap<>();
    
    private static int pointsCount = 50_000;

    public static void main(String[] args){
        long start = System.currentTimeMillis();
        List<Point> points = generatePoints();
        getNearestPoints(points);
        System.out.println(System.currentTimeMillis() - start);
    }
    
    public static List<Point> generatePoints(){
        List<Point> points = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < pointsCount; i++){
            int x = r.nextInt(10_000);
            int y = r.nextInt(10_000);
            points.add(new Point(x, y));
        }
        return points;
    }
    
    public static Map<Point,Point> getNearestPoints(final List<Point> generatedPoints){
        class R1 implements Runnable{

            @Override
            public void run() {
                doCalculations(generatedPoints, 0, pointsCount / 2, outMap);
            }
            
        }
        class R2 implements Runnable{

            @Override
            public void run() {
                doCalculations(generatedPoints, pointsCount / 2 , pointsCount, outMap);
            }
            
        }
        Thread t1 = new Thread(new R1());
        Thread t2 = new Thread(new R2());
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return outMap;
    }
    
    private static double getDistance(Point a, Point b){
        return Math.sqrt(pow((int) (a.getX() - b.getX()),2) + pow((int) (a.getY() - b.getY()),2));
    }
    
    public static double pow(int a, int b){
        double res = 1;
        for (; b > 0; b--){
            res*=a;
        }
        return res;
    }
    
    public static void doCalculations(List<Point> inPoints, int indexFrom, int indexTo, Map<Point, Point> outMap){
        double shortest = 10_000;
        for(int i = indexFrom; i < indexTo; i++) {
            for(Point p2: inPoints){
                if(!inPoints.get(i).equals(p2)){
                    double distance = getDistance(inPoints.get(i), p2);
                    if(distance < shortest){
                        shortest = distance;
                        outMap.put(inPoints.get(i), p2);
                    }
                }
            }
        }
    }
}
