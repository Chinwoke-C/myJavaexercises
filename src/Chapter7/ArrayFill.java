package Chapter7;

import java.util.Arrays;

public class ArrayFill {

    public static void main(String[] args) {
        char[][] jak = {{'x', 'o', 'x'}, {'x', 'o', 'x'}, {'x', 'x', 'o'}};
        multiInit(jak);
//        int[] theRay = new int[10];
//        for (int i = 0; i < 10; i++) {
//            theRay[i] = i + 1;
////            System.out.print(theRay[i] + ", ");
//        }
//        Arrays.stream(theRay).parallel().forEach(number-> System.out.print(number+ ", "));
//    }
//    char[] jak ={'x', 'o', 'x', 'o'};
  }
        public static void multiInit(char[][] jak) {
            for (int row = 0; row < jak.length; row++){
                for (int column = 0; column < jak[row].length ; column++) {
                    System.out.print(jak[row][column]+ "  ");
                }
                System.out.println();

            }

        }


  public static void fillChar(){
        char[] [] mine = new char[3][3];
      for (int i = 0; i < mine.length ; i++) {
          for (int j = 0; j <mine[i].length ; j++) {
              if ((i < 2  & j % 2 == 0) | (i ==2 & j < 2)){
                  System.out.print('x' + "  ");
              }else {
                  System.out.print(" "+ 'o');
              }


          }

      }

  }

}
