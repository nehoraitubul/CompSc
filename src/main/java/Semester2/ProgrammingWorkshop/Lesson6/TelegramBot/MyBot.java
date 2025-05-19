package Semester2.ProgrammingWorkshop.Lesson6.TelegramBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.*;

public class MyBot extends TelegramLongPollingBot {
    private Set<Long> chatIds = new HashSet<>();
    private Date targetDate;

    public MyBot(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        this.targetDate = calendar.getTime();
    }

    public String getBotToken(){
        return "8118583921:AAEIWvCZPQG14IUE7GQ39OSobFSD8O0cF7M";
    }

    @Override
    public String getBotUsername() {
        return "Neho0258bot";
    }

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId());
        long millis = this.targetDate.getTime() - System.currentTimeMillis();
        long minutes  = millis / 1000 / 60;
        sendMessage.setText("Minutes left: " + minutes);

        this.chatIds.add(update.getMessage().getChatId());

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }
}
