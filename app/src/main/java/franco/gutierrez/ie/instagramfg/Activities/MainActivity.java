package franco.gutierrez.ie.instagramfg.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import franco.gutierrez.ie.instagramfg.Network.InstagramApp;
import franco.gutierrez.ie.instagramfg.ObjectBinder;
import franco.gutierrez.ie.instagramfg.R;
import franco.gutierrez.ie.instagramfg.Util.ApplicationData;

/**
 *
 * @created by :Franco Gutierrez
 * @since: 19/09/2016
 * A login screen that offers login via instagram library
 */
public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    public Context mContext;
    private InstagramApp mApp;
    //overwrite of two methods for InstagramApp class
    InstagramApp.OAuthAuthenticationListener listener = new InstagramApp.OAuthAuthenticationListener() {

        @Override
        public void onSuccess() {
            Intent intent = new Intent(getApplicationContext(), NavDrawerActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("object", new ObjectBinder(mApp));
            startActivity(intent);

        }

        @Override
        public void onFail(String error) {
            Toast.makeText(MainActivity.this, error, Toast.LENGTH_SHORT).show();
        }
    };
    private Button btnConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mContext = MainActivity.this;
        //creating the session
        mApp = new InstagramApp(getApplicationContext(), MainActivity.this, ApplicationData.Client_ID,
                ApplicationData.Client_Secret_ID, ApplicationData.CallBackURL);
        mApp.setListener(listener);


        btnConnect = (Button) findViewById(R.id.btnConnect);

        if (mApp.hasAccessToken()) {
            Log.i(TAG, mApp.hasAccessToken() + " Starting NavBarActivity");
            Intent intent = new Intent(this, NavDrawerActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("object", new ObjectBinder(mApp));
            startActivity(intent);
        }
        btnConnect.setOnClickListener(new View.OnClickListener() {

                                          @Override
                                          public void onClick(View view) {

                                              mApp.authorize();
                                          }
                                      }
        );

        if (mApp.hasAccessToken()) {
            Log.i(TAG, mApp.hasAccessToken() + "");


            btnConnect.setText("Disconnect");


        }

    }


}
