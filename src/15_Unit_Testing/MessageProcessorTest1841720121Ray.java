package unittest;

import org.junit.Assert;
import org.junit.Test;
import unittest.MessageProcessor1841720121Ray;

/**
 *
 * @author Asus
 */
public class MessageProcessorTest1841720121Ray {

    MessageProcessor1841720121Ray mProcessor;

    public MessageProcessorTest1841720121Ray() {
        mProcessor = new MessageProcessor1841720121Ray();
        mProcessor.setSenderRay("Ronaldo");
        mProcessor.setRecipientRay("Rafael");
        mProcessor.setMessageRay("Whats up bro?");
    }

    @Test
    public void testShowMessageRay() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo. \nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatRay());
    }
}
