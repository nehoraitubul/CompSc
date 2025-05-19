package Semester2.ProgrammingWorkshop.Lesson6.TelegramBot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    // USERNAME: Neho0258bot
    // TOKEN: 8118583921:AAEIWvCZPQG14IUE7GQ39OSobFSD8O0cF7M
    // LINK: t.me/Neho0258bot

    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new MyBot());
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

}
