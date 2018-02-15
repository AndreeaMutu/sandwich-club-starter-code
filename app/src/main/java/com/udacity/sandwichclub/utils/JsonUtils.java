package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {
    //{
//        "name":{
//        "mainName":"Ham and cheese sandwich",
//        "alsoKnownAs":[
//        ]
//        },
//        "placeOfOrigin":"",
//        "description":"A ham and cheese sandwich is a common type of sandwich. It is made by putting cheese and sliced ham between two slices of bread. The bread is sometimes buttered and/or toasted. Vegetables like lettuce, tomato, onion or pickle slices can also be included. Various kinds of mustard and mayonnaise are also common.",
//        "image":"https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Grilled_ham_and_cheese_014.JPG/800px-Grilled_ham_and_cheese_014.JPG",
//        "ingredients":[
//        "Sliced bread",
//        "Cheese",
//        "Ham"
//        ]
//        }
// private String mainName;
//private List<String> alsoKnownAs = null;
//private String placeOfOrigin;
//private String description;
//private String image;
//private List<String> ingredients = null;
  //  https://github.com/udacity/ud851-Sunshine/blob/3299888110b4292cf89ca1f6c0b5036cf1c364bc/app/src/main/java/com/example/android/sunshine/utilities/OpenWeatherJsonUtils.java
    public static Sandwich parseSandwichJson(String json) {
        JSONObject sandwichJson = null;
        String mainName = null;
        try {
            sandwichJson = new JSONObject(json);
            JSONObject nameJson = sandwichJson.getJSONObject("name");
            mainName = nameJson.getString("mainName");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return new Sandwich(mainName, null, null, null, null, null);
    }
}
