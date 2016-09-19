package franco.gutierrez.ie.instagramfg.Rest.Model;

/**
 * Created by Franco on 9/17/2016.
 */

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import franco.gutierrez.ie.instagramfg.EndPoints.RelationshipService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static final String TAG = "Relationship Service";
    private RelationshipService mRelationshipService;

    public RestClient() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.instagram.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Log.i(TAG, "setting retrofit service");
        mRelationshipService =
                retrofit.create(RelationshipService.class);
        Log.i(TAG, "Done");
    }

    public RelationshipService getRelationshipService() {
        return mRelationshipService;
    }


}

