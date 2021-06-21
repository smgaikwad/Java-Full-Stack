import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
public class App {
    private static final String GET_API_URI = "https://jsonplaceholder.typicode.com/posts";
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("simple-api", "application/json")
                .uri(URI.create(GET_API_URI))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();

        List<Post> posts = mapper.readValue(response.body(),
                new TypeReference<List<Post>>() {});

        posts.forEach(System.out::println);
    }
}
