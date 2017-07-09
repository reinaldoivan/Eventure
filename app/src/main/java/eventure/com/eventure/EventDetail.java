package eventure.com.eventure;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EventDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        int position = getIntent().getIntExtra("index", -1);

        //EventModel[] models = EventModel.getEvents();
        //EventModel current = models[position];

        EventModel current = EventModel.getEvents()[position];

        ImageView imageView = (ImageView) findViewById(R.id.detail_imageView);
        TextView eventName = (TextView)findViewById(R.id.detail_textView_eventName);
        TextView venueName = (TextView) findViewById(R.id.detail_textView_venue);
        TextView date = (TextView) findViewById(R.id.detail_textView_date);
        TextView eventDetail = (TextView) findViewById(R.id.detail_textView_eventDetail);

        imageView.setImageResource(current.detailImage);
        eventName.setText(current.eventName);
        venueName.setText(current.venue);
        date.setText(current.date);
        eventDetail.setText(current.eventDetail);
    }
}
