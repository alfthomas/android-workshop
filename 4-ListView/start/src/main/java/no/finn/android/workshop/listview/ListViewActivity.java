package no.finn.android.workshop.listview;

import android.app.Activity;
import android.os.Bundle;

public class ListViewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String[] getCountryArray() {
        return getResources().getStringArray(R.array.countries);
    }

}
