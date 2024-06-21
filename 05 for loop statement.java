1) for loop statement
2) nested loop
..............................................
1) for loop

      public class main {
      public static void main(String[] args) {
      for (int  q = 2;  q <= 10; q = q + 2){
      System.out.println(q);
      }
      }
      }

  output:
         2
         4
         6
         8
         10
  ................................................................
        2)  nested loop

          class Main {
      public static void main(String[] args) {
   
      for (int i = 1; i <= 2; i++) {
      System.out.println("Group: " + i); 
      
      
      for (int j = 1; j <= 3; j++) {
        System.out.println(" Sub Group: " + j);  
       }
       } 
       }
       }
output:

           Group: 1
             Sub Group: 1
             Sub Group: 2
             Sub Group: 3
            Group: 2
             Sub Group: 1
             Sub Group: 2
             Sub Group: 3
......................................................................

        
