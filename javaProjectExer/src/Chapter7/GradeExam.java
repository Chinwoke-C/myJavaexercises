package Chapter7;

public class GradeExam {
    public static void main(String[] args) {
        // TODO Students answers to the questions
        char[] [] answers ={
                {'A', 'B', 'A','C', 'C', 'E', 'E', 'E', 'A', 'D'},
                {'D','B','A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

            //TODO key to the questions
       char[] keys = {'D', 'B', 'C', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

            //todo Grade all answers
        for (int i = 0; i < answers.length ; i++) {
            //todo Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++){
                if (answers[i][j] == keys[j]){
                   correctCount++;
                }
            }
                System.out.printf("Student's %d correct count is %d",i+1,correctCount);
            System.out.println();

        }
    }
}
