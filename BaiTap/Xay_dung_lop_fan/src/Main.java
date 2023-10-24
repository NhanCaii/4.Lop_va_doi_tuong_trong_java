public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Fan fan1 = new Fan(10, true,10,"yellow" );
        Fan fan2 = new Fan(5, false,5,"blue" );
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

    public static class Fan{
        final int SLOW=1;
        final int MEDIUM=2;
        final int FAST=3;
        private int speed=1;
        private boolean on=false;
        private double radius=5;
        private String color= "blue";

        public Fan(int speed, boolean on, double radius, String color){
            this.speed=speed;
            this.on=on;
            this.radius=radius;
            this.color=color;
        }
        public int getSpeed(){return this.speed;}
        public boolean getOn(){return this.on;}
        public double getRadius(){return this.radius;}
        public String getColor(){return this.color;}

        public void setSpeed(int speed){
            this.speed=speed;
        }
        public void setOn(boolean on){
            this.on =on;
        }
        public void setRadius(double radius){
            this.radius=radius;
        }
        public void setColor(String color){
            this.color=color;
        }
        public String toString(){
            if (this.getOn()){
                return "Speed: "+ this.getSpeed()+", Color: "+this.getColor()+", radius: "+this.getRadius()+"\n Fan is on";
            } else {
                return "Color: "+this.getColor()+", radius: "+this.getRadius()+"\n Fan is off";

            }
        }
    }
}