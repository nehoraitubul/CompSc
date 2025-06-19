package Year1.Semester2.ProgrammingWorkshop.Lesson7.API_TB;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.IOException;

public class Main {
    public static final String URL = "https://app/seker/live/fm1";

    public static void main(String[] args) {

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new MyBot());
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


//        try {
//            OkHttpClient client = new OkHttpClient();
//
//            Request request = new Request.Builder()
//                    .url(URL + "?id=ID&text=TEXT")
//                    .build();
//            Response response = client.newCall(request).execute();
//
//
//            JSONObject jsonObject = new JSONObject(response.body().string());
//            System.out.println(jsonObject.getString("extra"));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

}
