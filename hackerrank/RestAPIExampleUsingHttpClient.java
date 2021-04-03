package hackerrank;


import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestAPIExampleUsingHttpClient {

        public static void main(String[] args) {
            HttpClient client = HttpClient.newHttpClient();

            String json = new StringBuilder()
                    .append("{")
                    .append("\"name\":\"cj\",")
                    .append("\"notes\":\"restatement\"")
                    .append("}").toString();

            String str = "{\n" +
                    "    \"name\": \"cj\", \n" +
                    "    \"notes\": \"restatement\"\n" +
                    "  }";
         //   HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();// http://tracking-dev.api.cj.com/graphql

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(str))
                    .uri(URI.create("https://httpbin.org/post"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .header("Content-Type", "application/json")
                    .header("Authorization","Bearer SantoshPattanaikPersonalToken")
                    .build();

            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    // .thenAccept(System.out::println)
                    .thenApply(RestAPIExampleUsingHttpClient::parse)
                    .join();
        }

        public static String parse(String responseBody){
            System.out.println(responseBody);
   /*         JSONArray jsonArray = new JSONArray(responseBody);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt("id");
                int userId = jsonObject.getInt("userId");
                String title= jsonObject.getString("title");
                System.out.println("Id-> "+id+" Title-> "+title+" UserId-> "+userId);
            }*/
            return null;
        }
}
