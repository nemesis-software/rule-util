package com.nemesis.platform.module.targeting;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * A utility class to send messages.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class SenderUtil {

    /**
     * Send the given object to a queue with the given name.
     *
     * @param object    the object to send.
     * @param queueName the name of the queue to which we send the object.
     * @throws Exception
     */
    public static void sendToQueue(Object object, String queueName) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("172.17.0.1");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(queueName, false, false, false, null);
        channel.basicPublish("", queueName, null, object.toString().getBytes("UTF-8"));
        System.out.println(" [x] Sent '" + object.toString() + "'");

        channel.close();
        connection.close();
    }
}
