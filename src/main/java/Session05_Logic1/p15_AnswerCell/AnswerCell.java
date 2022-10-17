package Session05_Logic1.p15_AnswerCell;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep){
            return false;
        }
        if(isMorning && !isMom){
            return false;
        }
        return true;
    }
}
