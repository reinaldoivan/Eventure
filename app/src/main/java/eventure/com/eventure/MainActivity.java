package eventure.com.eventure;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        EventAdapter adapter = new EventAdapter(this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(getApplicationContext(), EventDetail.class);
                intent.putExtra("index", position);

                startActivity(intent);

            }
        });
    }
}

class EventAdapter extends BaseAdapter
{
    EventModel[] events;
    private Context parentContext;

    EventAdapter(Context parentContext)
    {
        this.parentContext = parentContext;
        events = EventModel.getEvents();
    }

    @Override
    public int getCount() {
        return events.length;
    }

    @Override
    public Object getItem(int position) {
        return events[position];
    }

    @Override
    public long getItemId(int position) {
        return events[position].eventName.hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = View.inflate(parentContext, R.layout.activity_list_layout, null );

        TextView nameTextView = (TextView) convertView.findViewById(R.id.list_textView_eventName);
        TextView venueTextView = (TextView) convertView.findViewById(R.id.list_textView_Venue);
        TextView dateTextView = (TextView) convertView.findViewById(R.id.list_textView_date);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.list_imageView_image);

        imageView.setImageResource(events[position].image);
        nameTextView.setText( events[position].eventName);
        venueTextView.setText(events[position].venue);
        dateTextView.setText(events[position].date);

        return convertView;
    }
}
