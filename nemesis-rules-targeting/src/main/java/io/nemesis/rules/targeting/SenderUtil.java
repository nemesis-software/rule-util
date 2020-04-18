/*
 * nemesis Platform - NExt-generation Multichannel E-commerce SYStem
 *
 * Copyright (c) 2010 - 2017 nemesis
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of nemesis
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with nemesis.
 */
package io.nemesis.rules.targeting;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * A utility class to send messages.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class SenderUtil {

    private static final String RABBITMQ_HOST = "172.17.0" + ".1";

    private static final Logger LOGGER = Logger.getLogger(SenderUtil.class.getName());

    /**
     * Send the given outcome to a queue with the given name.
     *
     * @param outcome   the outcome to send.
     * @param queueName the name of the queue to which we send the outcome.
     * @throws Exception
     */
    public static void sendToQueue(Serializable outcome, String queueName) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(RABBITMQ_HOST);
        factory.setUsername("docker");
        factory.setPassword("docker");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        byte[] data = SerializationUtils.serialize(outcome);
        AMQP.BasicProperties props = new AMQP.BasicProperties.Builder().deliveryMode(2).priority(0).type(outcome.getClass().getCanonicalName()).contentType(
                        "application/x-java-serialized-object").build();

        channel.queueDeclare(queueName, false, false, false, null);
        channel.basicPublish("", queueName, props, data);
        LOGGER.info(" [x] Sent '" + outcome.toString() + "'");

        channel.close();
        connection.close();
    }
}
