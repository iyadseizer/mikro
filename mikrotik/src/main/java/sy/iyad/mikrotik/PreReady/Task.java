package sy.iyad.mikrotik.PreReady;



import sy.iyad.mikrotik.OnCompleteListener;

public class Task <Tx> {
    private Exception exception;
    private Tx result;
    private volatile boolean isSuccessful;
    private OnCompleteListener<Tx> onCompleteListener;
    public Task(){

    }

    public OnCompleteListener<Tx> getOnCompleteListener() {
        return onCompleteListener;
    }

    public void addOnCompleteListener( OnCompleteListener<Tx> listener) {
        this.onCompleteListener = listener;
               listener.onComplete(this);
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public Exception getException() {
        return exception;
    }

    public Tx getResult() {
        return result;
    }

    public void setException( Exception exception) {
        this.exception = exception;
    }

    public void setResult( Tx result) {
        this.result = result;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }
}