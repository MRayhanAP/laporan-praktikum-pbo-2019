package unittest;

/**
 *
 * @author Asus
 */
public class MessageProcessor1841720121Ray {

    private String mSender, mRecipient, mMessage;

    public String getMessageRay() {
        return mMessage;
    }

    public String getRecipient() {
        return mRecipient;
    }

    public String getSender() {
        return mSender;
    }

    public void setMessageRay(String mMessage) {
        this.mMessage = mMessage;
    }

    public void setRecipientRay(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public void setSenderRay(String mSender) {
        this.mSender = mSender;
    }

    public String messageFormatRay() {
        String message = String.format("Hai %s, you have message from %s. \nThe message as follows : %s",
                this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessageRay() {
        System.out.println(messageFormatRay());
    }
}
