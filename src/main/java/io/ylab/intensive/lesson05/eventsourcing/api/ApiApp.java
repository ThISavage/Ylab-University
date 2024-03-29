package io.ylab.intensive.lesson05.eventsourcing.api;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ApiApp {
    public static void main(String[] args) throws Exception {
        // Тут пишем создание PersonApi, запуск и демонстрацию работы
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        applicationContext.start();
        MessageSendler messageSendler = applicationContext.getBean(MessageSendler.class);
        messageSendler.send();
    }
}
