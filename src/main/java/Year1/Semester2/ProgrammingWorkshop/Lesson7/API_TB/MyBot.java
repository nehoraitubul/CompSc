package Year1.Semester2.ProgrammingWorkshop.Lesson7.API_TB;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "ApiBotChatExeBot";
    }

    public String getBotToken(){
        return "7638611613:AAHtxmCBGVw3bsvnnQQqn6vcRADmHaWkx20";
    }



    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        long chatId = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        String responseFromChatGpt;
        if (text.equals("balance")){
            responseFromChatGpt = ApiManager.ApiRequestGetMessage(text, RequestType.CHECK_BALANCE);
        } else if (text.equals("clear")){
            responseFromChatGpt = ApiManager.ApiRequestGetMessage(text, RequestType.CLEAR_HISTORY);
        } else {
            responseFromChatGpt = ApiManager.ApiRequestGetMessage(text, RequestType.SEND_MESSAGE);
        }

        System.out.println(responseFromChatGpt);
        sendResponse(chatId, responseFromChatGpt);
    }

    public void sendResponse(long chatId, String text){
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(text);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
