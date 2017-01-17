package tok_gogogo.numbertext;

/**
 * Created by Administrator on 2017/1/9.
 */
public interface NumberBase {
    public void start();

    public NumberTextView withNumber(float number);

    public NumberTextView withNumber(float number, boolean flag);

    public NumberTextView withNumber(int number);

    public NumberTextView setDuration(long duration);

    public void setOnEnd(NumberTextView.EndListener callback);
}