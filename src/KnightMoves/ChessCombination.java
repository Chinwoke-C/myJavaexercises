package KnightMoves;

public class ChessCombination {
    public static long solveMatrix(){
        char[] [] board = {
                {'A', 'B', 'C', '.','E'},
                {'.','G', 'H', 'I', 'J',},
                {'K','L', 'M', 'N','0'},
                {'P', 'Q', 'R', 'S', 'T'},
                {'U', 'V', '.', '.', 'Y'}
        };
        int[] [] moves = {{2,1}, {2,-1}, {-2,1}, {-2,-1}, {1,2}, {1,-2}, {-1,2},{-1,-2}};
        return 0;
    }

}
