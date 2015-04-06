package com.fernandez.paolo.yomeserotesting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemsListActivity extends Activity
{

    ArrayList<String> itemsList;
    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.items_list);

        // Get the reference of ListViewAnimals
        ListView items=(ListView)findViewById(R.id.item_list_view);


        itemsList = new ArrayList<String>();
        // Create The Adapter with passing ArrayList as 3rd parameter
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, itemsList);
        // Set The Adapter
        items.setAdapter(arrayAdapter);
    }

    public void getItems()
    {
        itemsList.add("DOG");
        itemsList.add("CAT");
        itemsList.add("HORSE");
        itemsList.add("ELEPHANT");
        itemsList.add("LION");
        itemsList.add("COW");
        itemsList.add("MONKEY");
        itemsList.add("DEER");
        itemsList.add("RABBIT");
        itemsList.add("BEER");
        itemsList.add("DONKEY");
        itemsList.add("LAMB");
        itemsList.add("GOAT");


    }
}