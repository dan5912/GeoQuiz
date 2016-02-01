package info.jdelectronics.android.geoquiz;

/**
 * Created by daniel on 1/29/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mCheated;



    public Question(int textResId, boolean answerTrue, boolean didCheat){

        mTextResId = textResId;
        mAnswerTrue = answerTrue;

    }

    public boolean hasCheated() {
        return mCheated;
    }

    public void didCheat(boolean cheated) {
        mCheated = cheated;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
