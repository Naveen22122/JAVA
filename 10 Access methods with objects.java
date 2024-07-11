01 Access methods with object.
............................................................  
          public class Main{
          public void mytutorial(){
          System.out.println(" The car is going as fast as it can!");
          }
          public void myspeed(int maxSpeed){
          System.out.println("Max speed is: "+ maxSpeed);
          }
           
           public static void Main(String[]args){
           Main myCar = new Main();
           myCar.mytutorial();
           myCar.speed(200);
           }
           }
output:

         The car is going as fast as it can!
         Max speed is: 200
.......................................................................
