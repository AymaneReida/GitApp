package a.reida.gitapp.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.net.URL;
import java.util.List;

import a.reida.gitapp.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class UsersListViewModel extends ArrayAdapter {
    private List<GitUser> users;
    private int resource;
    public UsersListViewModel(@NonNull Context context, int resource, List<GitUser> data) {
        super(context, resource, data);
        this.resource = resource;
        this.users = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(resource, parent, false);
        }
        CircleImageView imageViewUSer = listViewItem.findViewById(R.id.imageViewUser);
        TextView textViewLogin = listViewItem.findViewById(R.id.textViewLogin);
        TextView textViewScore = listViewItem.findViewById(R.id.textViewScore);
        //textViewLogin.setText(getItem(position).login);
        textViewLogin.setText(users.get(position).login);
        textViewScore.setText(String.valueOf(users.get(position).score));
        try {
            URL url = new URL(users.get(position).avatarUrl);
            Bitmap bitmap = BitmapFactory.decodeStream(url.openStream());
            imageViewUSer.setImageBitmap(bitmap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //imageViewUSer.setImageBitmap();
        return listViewItem;
    }
}
