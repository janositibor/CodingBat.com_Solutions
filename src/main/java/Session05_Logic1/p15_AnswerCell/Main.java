package Session05_Logic1.p15_AnswerCell;

public class Main {
    public static void main(String[] args) {
        AnswerCell answerCell=new AnswerCell();

        System.out.println(answerCell.answerCell(false, false, false));
        System.out.println(answerCell.answerCell(false, false, true));
        System.out.println(answerCell.answerCell(true, false, false));
    }
}
