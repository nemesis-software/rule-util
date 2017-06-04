package com.nemesis.platform.module.targeting;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

/**
 * A utility class to send messages.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class SenderUtil {

    /**
     * Send the given outcome to a queue with the given name.
     *
     * @param outcome     the outcome to send.
     * @param queueName the name of the queue to which we send the outcome.
     * @throws Exception
     */
    public static void sendToQueue(Serializable outcome, String queueName) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("172.17.0.1");
        factory.setUsername("docker");
        factory.setPassword("docker");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        byte[] data = SerializationUtils.serialize(outcome);
        AMQP.BasicProperties props = new AMQP.BasicProperties.Builder().deliveryMode(2).priority(0).type(outcome.getClass().getCanonicalName()).build();

        channel.queueDeclare(queueName, false, false, false, null);
        channel.basicPublish("", queueName, props, data);
        System.out.println(" [x] Sent '" + outcome.toString() + "'");

        channel.close();
        connection.close();
    }
}
