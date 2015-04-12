package com.fernandez.paolo.yomeserotesting;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by HP on 05/04/2015.
 */
public class Item {
    public String name, description, type;
    public int time;
    public float price;

    public void parseFromJson(JSONObject json){
        try {
            name = json.getString("item_name");
            description = json.getString("item_description");
            type = json.getString("item_type");
            time = Integer.parseInt(json.getString("item_time"));
            price = Float.parseFloat(json.getString("item_price"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return "Name: "+name+"\n"+"Type: "+type+"\n"+"Time: "+Integer.toString(time)+"\n"+"Price: "+Float.toString(price);
    }
}
