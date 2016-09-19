package franco.gutierrez.ie.instagramfg;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Franco on 9/18/2016.
 */
public class ObjectBinder extends Binder implements Parcelable {

    public static final Parcelable.Creator<ObjectBinder> CREATOR = new Parcelable.Creator<ObjectBinder>() {
        public ObjectBinder createFromParcel(Parcel in) {
            return (ObjectBinder) in.readStrongBinder();
        }

        public ObjectBinder[] newArray(int size) {
            return new ObjectBinder[size];
        }
    };
    private final Object mData;

    public ObjectBinder(Object data) {
        mData = data;
    }

    public Object getData() {
        return mData;
    }

    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeStrongBinder(this);
    }
}
