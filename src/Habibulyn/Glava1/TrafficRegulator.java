package Habibulyn.Glava1;

/**
 * Created by Hi-Tech on 18.04.2017.
 */
enum Lights{
    RED(0), YELLOW(1), GREEN(2), ERROR(-1);
    private int value;
    private int curentValue = 0;

    Lights(int value){
        this.value=value;
    }

    public  int getValue(){
        return value;
    }

    public Lights nextLights(){
        curentValue = (curentValue+1)%3;
        return Lights.values()[curentValue];
    }
}
class Timer {
    private int delay;
    private static Lights light = Lights.RED;

    Timer(int sec){
        delay = 1000*sec;
    }

    public Lights shift(){
        Lights count = light.nextLights();
        try{
            switch (count){
                case RED: Thread.sleep( delay); break;
                case YELLOW: Thread.sleep(delay/3); break;
                case GREEN: Thread.sleep(delay/2); break;
            }
        } catch (Exception e){
            return Lights.ERROR;
        }
        return count;
    }
}

public class TrafficRegulator {
    public static void main(String[] args) {
        Timer t = new Timer(1);

        for(int k=0; k<5; k++)
            switch (t.shift()){
                case RED:
                    System.out.println("Stop!"); break;
                case YELLOW:
                    System.out.println("Wait!"); break;
                case GREEN:
                    System.out.println("Walk!"); break;
                case ERROR:
                    System.err.println("Time Error!"); break;
                default:
                    System.err.println("Unknown light!"); return;
            }
    }
}
