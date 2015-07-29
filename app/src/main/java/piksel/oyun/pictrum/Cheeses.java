/*
 * Copyright (C) 2015 The Android Open Source Project
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

package piksel.oyun.pictrum;

import java.util.Random;

public class Cheeses {

    private static final Random RANDOM = new Random();

    public static int getRandomCheeseDrawable() {
        switch (RANDOM.nextInt(8)) {
            default:
            case 0:
                return R.drawable.album_1;
            case 1:
                return R.drawable.album_2;
            case 2:
                return R.drawable.album_3;
            case 3:
                return R.drawable.album_4;
            case 4:
                return R.drawable.album_5;
            case 5:
                return R.drawable.album_6;
            case 6:
                return R.drawable.album_7;
            case 7:
                return R.drawable.album_8;
            
        }
    }

    public static final String[] sCheeseStrings = {
           "My Birthday Party #25","Erasmus Party 21 July","HüCON 2014","ToruCON", "MetuCON",
            "Office Party", "Lisa & John Wedding", "My Birthday Party #22", "My Birthday Party #32",
            "My Birthday Party #19"
    };

}
