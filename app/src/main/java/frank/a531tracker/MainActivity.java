package frank.a531tracker;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find OHP Text View
        TextView ohp = (TextView) findViewById(R.id.ohp_text_view);

        // Set click listener on OHP View
        ohp.setOnClickListener(new View.OnClickListener() {
            //code will be executed when the OHP is clicked
            @Override
            public void onClick(View view) {
                // Create new intent to open the {@link ohp_activity}
                Intent ohpIntent = new Intent(MainActivity.this, ohp.class);

                // Start the new activity
                startActivity(ohpIntent);
            }
        });

        //Find deadlift Text View
        TextView deadlift = (TextView) findViewById(R.id.deadlift_text_view);

        // Set click listener on deadlidt View
        deadlift.setOnClickListener(new View.OnClickListener() {
            //code will be executed when the OHP is clicked
            @Override
            public void onClick(View view) {
                // Create new intent to open the {@link deadlift_activity}
                Intent deadliftIntent = new Intent(MainActivity.this, deadlift.class);

                // Start the new activity
                startActivity(deadliftIntent);
            }
        });

        //Find bench Text View
        TextView bench = (TextView) findViewById(R.id.bench_text_view);

        // Set click listener on bench View
        bench.setOnClickListener(new View.OnClickListener() {
            //code will be executed when the bench is clicked
            @Override
            public void onClick(View view) {
                // Create new intent to open the {@link bench_activity}
                Intent benchIntent = new Intent(MainActivity.this, bench.class);

                // Start the new activity
                startActivity(benchIntent);
            }
        });

        //Find squat Text View
        TextView squat = (TextView) findViewById(R.id.squat_text_view);

        // Set click listener on squat View
        squat.setOnClickListener(new View.OnClickListener() {
            //code will be executed when the squat is clicked
            @Override
            public void onClick(View view) {
                // Create new intent to open the {@link squat_activity}
                Intent squatIntent = new Intent(MainActivity.this, squat.class);

                // Start the new activity
                startActivity(squatIntent);
            }
        });

    }


}
