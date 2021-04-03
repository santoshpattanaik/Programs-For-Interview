package hackerrank;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestAPIUsingHttpClient {

        public static void main(String[] args) {
            HttpClient client = HttpClient.newHttpClient();

            String json = new StringBuilder()
                    .append("{")
                    .append("\"name\":\"cj\",")
                    .append("\"notes\":\"restatement\"")
                    .append("}").toString();

            String str = "mutation {\n" +
                    "  createOrders(\n" +
                    "    newOrders: [\n" +
                    "      {\n" +
                    "        enterpriseId: 1113122\n" +
                    "        actionTrackerId: 22\n" +
                    "        orderId: \"33\"\n" +
                    "        eventTime: \"2020-10-10T01:01:01.0-07:00\"\n" +
                    "        verticalParameters: {\n" +
                    "          advertiserVertical: Travel\n" +
                    "          confirmationNumber: \"YN25890C\"\n" +
                    "          originCity: \"Los Angeles\"\n" +
                    "          originState: \"California\"\n" +
                    "          destinationCity: \"Seattle\"\n" +
                    "          destinationState: \"Washington\"\n" +
                    "          noCancellation: \"true\"\n" +
                    "        }\n" +
                    "        customParameters: [\n" +
                    "          { name: \"n1\", value: \"v1\" }\n" +
                    "          { name: \"n2\", value: \"v2\" }\n" +
                    "        ]\n" +
                    "        items: [\n" +
                    "          { unitPrice: 1, quantity: 1, sku: \"abc\", discount: \"10\" }\n" +
                    "          { unitPrice: 2, quantity: 2, sku: \"ddd\", discount: \"20\" }\n" +
                    "        ]\n" +
                    "        amount: 80\n" +
                    "        discount: 25\n" +
                    "      }\n" +
                    "      {\n" +
                    "        enterpriseId: 1113122\n" +
                    "        actionTrackerId: 22\n" +
                    "        orderId: \"33\"\n" +
                    "        eventTime: \"2020-10-10T01:01:01.0-07:00\"\n" +
                    "        verticalParameters: {\n" +
                    "          advertiserVertical: Travel\n" +
                    "          confirmationNumber: \"YN25890C\"\n" +
                    "          originCity: \"Los Angeles\"\n" +
                    "          originState: \"California\"\n" +
                    "          destinationCity: \"Seattle\"\n" +
                    "          destinationState: \"Washington\"\n" +
                    "          noCancellation: \"true\"\n" +
                    "        }\n" +
                    "        customParameters: [\n" +
                    "          { name: \"n1\", value: \"v1\" }\n" +
                    "          { name: \"n2\", value: \"v2\" }\n" +
                    "        ]\n" +
                    "        items: [\n" +
                    "          { unitPrice: 1, quantity: 1, sku: \"abc\", discount: \"10\" }\n" +
                    "          { unitPrice: 2, quantity: 2, sku: \"ddd\", discount: \"20\" }\n" +
                    "        ]\n" +
                    "        amount: 80\n" +
                    "        discount: 25\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  ) {\n" +
                    "    orders {\n" +
                    "      submissionId\n" +
                    "      orderReceivedTime\n" +
                    "      eventTime\n" +
                    "      verticalParameters {\n" +
                    "        advertiserVertical\n" +
                    "        confirmationNumber\n" +
                    "        originCity\n" +
                    "        originState\n" +
                    "        destinationCity\n" +
                    "        destinationState\n" +
                    "        noCancellation\n" +
                    "      }\n" +
                    "      advertiser {\n" +
                    "        enterpriseId\n" +
                    "      }\n" +
                    "      actionTracker {\n" +
                    "        id\n" +
                    "      }\n" +
                    "      orderId\n" +
                    "      discount\n" +
                    "      customParameters {\n" +
                    "        name\n" +
                    "        value\n" +
                    "      }\n" +
                    "      items {\n" +
                    "        unitPrice\n" +
                    "        quantity\n" +
                    "        sku\n" +
                    "        discount\n" +
                    "      }\n" +
                    "    }\n" +
                    "    errors {\n" +
                    "      message\n" +
                    "      fields\n" +
                    "    }\n" +
                    "  }\n" +
                    "}\n";
         //   HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();// http://tracking-dev.api.cj.com/graphql

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(str))
                    .uri(URI.create("http://tracking-dev.api.cj.com/graphql"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .setHeader("Content-Type", "application/json")
                  //  .setHeader("Content-Length","3495")
                    .setHeader("Authorization","Bearer 4w9mmqv6r7tey2g8xnjt8fyrc5")
                    .build();

            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    // .thenAccept(System.out::println)
                    .thenApply(RestAPIUsingHttpClient::parse)
                    .join();
        }

        public static String parse(String responseBody){
            System.out.println(responseBody);
            return null;
        }
}








   /*         JSONArray jsonArray = new JSONArray(responseBody);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt("id");
                int userId = jsonObject.getInt("userId");
                String title= jsonObject.getString("title");
                System.out.println("Id-> "+id+" Title-> "+title+" UserId-> "+userId);
            }*/