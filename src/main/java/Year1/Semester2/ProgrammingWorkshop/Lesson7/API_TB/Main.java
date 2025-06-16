package Year1.Semester2.ProgrammingWorkshop.Lesson7.API_TB;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static final String URL = "https://app/seker/live/fm1/send-message";

    public static void main(String[] args) {
        try {

            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url(URL + "?id=ID&text=TEXT").build();
            Response response = client.newCall(request).execute();
            JSONObject jsonObject = new JSONObject(response.body().string());
            System.out.println(jsonObject.getString("extra"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
