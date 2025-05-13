package Semester2.ProgrammingWorkshop.Lesson5.API;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url("https://v2.jokeapi.dev/joke/any").build();

            Response response = client.newCall(request).execute();
            String res = response.body().string();

            JSONObject jsonObject = new JSONObject(res);
            String type = jsonObject.getString("type");
            if (type.equals("single")){
                String joke = jsonObject.getString("joke");
                System.out.println(joke);
            } else {
                String setup = jsonObject.getString("setup");
                System.out.println(setup);
                String delivery = jsonObject.getString("delivery");
                System.out.println(delivery);
            }
//            System.out.println(res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
