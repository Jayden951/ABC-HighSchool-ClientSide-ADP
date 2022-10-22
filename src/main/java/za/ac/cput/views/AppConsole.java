package za.ac.cput.views;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import za.ac.cput.domain.studentdetails.Student;

import java.io.IOException;

public class AppConsole {
    private static OkHttpClient client = new OkHttpClient();

    private static String run(String URL) throws IOException {
        Request request = new Request.Builder()
                .url(URL)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void findAll() {
        try {
            final String URL = "http://localhost:8080/student/all";
            String responsebody = run(URL);
            JSONArray student = new JSONArray(responsebody);

            for (int i = 0; i < student.length(); i++) {
                JSONObject students = student.getJSONObject(i);

                Gson g = new Gson();
                Student s = g.fromJson(students.toString(), Student.class);
                System.out.println(s.toString());

            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        findAll();
    }
}
