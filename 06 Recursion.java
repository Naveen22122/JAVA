Recursion example
  
1. example of adding the numbers till 20
2.Example of adding numbers between 15 to 20
.......................................................................
             1. public class Main {
              public static void main(String[] args) {
                int result = sum(20);
                System.out.println(result);
              }
              public static int sum(int k) {
                if (k > 0) {
                  return k + sum(k - 1);
                } else {
                  return 0;
                }
              }
            }

            output:
                  210
..........................................................................

  2.Example of adding numbers between 15 to 20
            public class Main {
            public static void main(String[] args) {
              int result = sum(15, 20);
              System.out.println(result);
            }
            public static int sum(int start, int end) {
              if (end > start) {
                return end + sum(start, end - 1);
              } else {
                return end;
              }
            }
          }
             output: 
                      105
...................................................................................

