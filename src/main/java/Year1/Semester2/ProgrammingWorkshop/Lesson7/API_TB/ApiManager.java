package Year1.Semester2.ProgrammingWorkshop.Lesson7.API_TB;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class ApiManager {

    public static final String ID = "314943051";

    public static String BASE_URL = "https://app.seker.live/fm1/";

    public static String ApiRequestGetMessage(String message, RequestType type){
        try {
            OkHttpClient client = new OkHttpClient();

            HttpUrl.Builder builder = HttpUrl.parse(BASE_URL + type.getType()).newBuilder();

            builder.addQueryParameter("id", ID);

            if (type.getType().equals("send-message")){
                builder.addQueryParameter("text", message);
            }

            HttpUrl url = builder.build();

            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();

            if (!response.isSuccessful()) {
                System.err.println("שגיאה בבקשה: קוד " + response.code());
                return null;
            }

            JSONObject jsonObject = new JSONObject(response.body().string());
            System.out.println(jsonObject);

            return jsonObject.getString("extra");


        } catch (Exception e) {
            System.err.println("שגיאה כללית: " + e.getMessage());
            return null;
        }
    }
}
