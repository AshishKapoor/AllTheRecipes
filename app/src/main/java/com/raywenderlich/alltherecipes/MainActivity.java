
package com.raywenderlich.alltherecipes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.content.Intent;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;


public class MainActivity extends AppCompatActivity {
  private ListView mListView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mListView = (ListView) findViewById(R.id.recipe_list_view);
// 1
        final ArrayList<Recipe> recipeList = Recipe.getRecipesFromFile("recipes.json", this);

        RecipeAdapter adapter = new RecipeAdapter(this, recipeList);

        mListView.setAdapter(adapter);
  }

}