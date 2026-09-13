class Exam {
    int score;
    void submitAnswer(String answer) { if (answer.equals("Java")) score++; }
    void showScore() { System.out.println("Score: " + score); }
}
public class OnlineExam {
    public static void main(String[] args) {
        Exam exam = new Exam(); exam.submitAnswer("Java"); exam.submitAnswer("Python"); exam.submitAnswer("Java"); exam.showScore();
    }
}
