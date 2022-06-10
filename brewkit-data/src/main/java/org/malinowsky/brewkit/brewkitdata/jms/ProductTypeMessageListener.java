package org.malinowsky.brewkit.brewkitdata.jms;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "java:/jms/listener")
public class ProductTypeMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        //TO IMPLEMENT
    }
}
