package com.sunny.search.kafka;

import org.apache.kafka.clients.admin.TopicListing;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.lang.reflect.Executable;
import java.util.Properties;
import java.util.concurrent.Future;

/**
 * Created by Qinyi.
 */
public class MyProducer {

    private static KafkaProducer<String, String> producer;

    static {

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.20.110:9092");
        properties.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        //消息分配器
        properties.put("partitioner.class",
                "com.sunny.kafka.CustomPartitioner");

        producer = new KafkaProducer<>(properties);
    }

    /**
     * 只发送不管result
     */
    private static void sendMessageForgetResult() {

        ProducerRecord<String, String> record = new ProducerRecord<>(
                "test", "name", "ForgetResult"
        );
        producer.send(record);
        producer.close();
    }

    /**
     * 获取返回result
     *
     * @throws Exception
     */
    private static void sendMessageSync() throws Exception {

        ProducerRecord<String, String> record = new ProducerRecord<>(
                "test", "name", "sync"
        );
        RecordMetadata result = producer.send(record).get();

        System.out.println(result.topic());
        System.out.println(result.partition());
        System.out.println(result.offset());

        producer.close();
    }

    private static void sendMessageCallback() {

        ProducerRecord<String, String> record = new ProducerRecord<>(
                "test-partition", "name", "callback+name"
        );
        producer.send(record, new MyProducerCallback());

        record = new ProducerRecord<>(
                "test-partition", "name-x", "callback+name-x"
        );
        producer.send(record, new MyProducerCallback());
//
//        record = new ProducerRecord<>(
//                "test-partition", "name-y", "callback+name-y"
//        );
//        producer.send(record, new MyProducerCallback());
//
//        record = new ProducerRecord<>(
//                "test-partition", "name-z", "callback+name-z"
//        );
//        producer.send(record, new MyProducerCallback());

        producer.close();
    }

    private static class MyProducerCallback implements Callback {

        @Override
        public void onCompletion(RecordMetadata recordMetadata, Exception e) {

            if (e != null) {
                e.printStackTrace();
                return;
            }

            System.out.println(recordMetadata.topic());
            System.out.println(recordMetadata.partition());
            System.out.println(recordMetadata.offset());
            System.out.println("Coming in MyProducerCallback");
        }
    }

    public static void main(String[] args) throws Exception {

//        sendMessageForgetResult();
//        sendMessageSync();
        sendMessageCallback();
    }
}
