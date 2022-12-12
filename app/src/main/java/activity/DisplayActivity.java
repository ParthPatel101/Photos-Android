package activity;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android10.R;

import java.util.Objects;

import model.Album;
import model.Model;
import model.Photo;

public class DisplayActivity extends AppCompatActivity {
    Album searchResults;
    Photo currentPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        searchResults = (Album) Model.dataTransfer.get(0);
        currentPhoto = (Photo) Model.dataTransfer.get(1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.setTitle((searchResults.photos.indexOf(currentPhoto) + 1)+ " of " + searchResults.photos.size());
        return super.onCreateOptionsMenu(menu);
    }
}
