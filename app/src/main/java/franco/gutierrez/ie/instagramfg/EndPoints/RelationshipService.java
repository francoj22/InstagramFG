package franco.gutierrez.ie.instagramfg.EndPoints;

/**
 * Created by Franco on 9/17/2016.
 */

import franco.gutierrez.ie.instagramfg.Rest.Model.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RelationshipService {

    @GET("v1/users/self/media/recent")
    Call<User> getList(
            @Query("count") String userId,
            @Query("access_token") String accessToken);


}

