/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "lotiti", R.drawable.color_red));
        words.add(new Word("green", "tsdwo", R.drawable.color_green));
        words.add(new Word("yellow", "sdbk", R.drawable.color_dusty_yellow));
        words.add(new Word("brown", "knj", R.drawable.color_brown));
        words.add(new Word("black", "nlsn", R.drawable.color_black));

        WordAdapter itemsAdapter = new WordAdapter(this,words, getResources().getColor(R.color.category_colors));

        ListView listView = (ListView) findViewById(R.id.color_list);

        listView.setAdapter(itemsAdapter);
    }
}
