package franco.gutierrez.ie.instagramfg.Adapters;

/**
 * Created by Franco on 9/17/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import franco.gutierrez.ie.instagramfg.R;
import franco.gutierrez.ie.instagramfg.Rest.Model.Stats.Datum;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private Context mcontext;
    private ArrayList<Datum> android;

    public DataAdapter(ArrayList<Datum> android, Context mcontext) {

        this.android = android;
        this.mcontext = mcontext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.userFullName.setText(android.get(i).getUser().getFullName());
        Picasso.with(mcontext).load(android.get(i).getImages().getLowResolution().getUrl()).into(viewHolder.feed);

    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView userFullName;
        private ImageView feed;

        public ViewHolder(View view) {
            super(view);

            userFullName = (TextView) view.findViewById(R.id.user_name);
            feed = (ImageView) view.findViewById(R.id.profile_picture);

        }
    }
}
