package Chapter5;

//(Pythagorean Triples) A right triangle can have sides whose lengths are all integers. The set
//        of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple.
//        The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the
//        sides is equal to the square of the hypotenuse. Write an application that displays a table of the
//        Pythagorean triples for side1, side2 and the hypotenuse, all no larger than 500. Use a triple-nested
//        for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll
//        learn in more advanced computer-science courses that for many interesting problems there’s no
//        known algorithmic approach other than using sheer brute force.

public class PythagoreanTriples {

            private int side1;
            private int side2;
            private int hypotenuse;
            private int limitingValue;

            public PythagoreanTriples( int limitingValue){
                this.limitingValue = limitingValue;
            }
            public void calculateTriples(){
                System.out.printf("%10s%5s%10s", side1, side2, hypotenuse);

                for (int i = 1; i < limitingValue ; i++) {
                   int side1 = i;
                    for (int j = 1; j < limitingValue ; j++) {
                       int side2 = j;
                        for (int k = 1; k < limitingValue ; k++) {
                          int  hypotenuse = k;
                            if ((Math.pow(side1,2)) + (Math.pow(side2,2)) == (Math.pow(hypotenuse,2))){

                                System.out.printf("%10d: %5d: %10d%n", side1, side2, hypotenuse);
                            }

                        }

                    }

                }
            }
}