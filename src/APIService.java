import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIService {

    @POST("auth/login")
    public Response<Object> login(@Body Object obj);

    @GET("retailers/{id}")
    public Response<Object> getRetailer(@Path("id") int id);

    public static APIService getInstance() {

        OkHttpClient client = new OkHttpClient.Builder().build();
        String baseUrl = "";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(APIService.class);
    }

}
