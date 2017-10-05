/*
 * Copyright (C) 2014 The Android Open Source Project
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

package g7.sharedTransition;

/**
 * Represents an Item in our application. Each item has a name, id, full size image url and
 * thumbnail url.
 */
public class Item {

//    private static final String LARGE_BASE_URL = "http://storage.googleapis.com/androiddevelopers/sample_data/activity_transition/large/";
//    private static final String THUMB_BASE_URL = "http://storage.googleapis.com/androiddevelopers/sample_data/activity_transition/thumbs/";

    public static Item[] ITEMS = new Item[]{
            new Item("A1",  "http://cdn2.autoexpress.co.uk/sites/autoexpressuk/files/styles/gallery_adv/public/2016/08/audi_a1_render_front.jpg"),
            new Item("A3","https://media.ed.edmunds-media.com/audi/a3/2018/oem/2018_audi_a3_sedan_20-tfsi-prestige-quattro_fq_oem_2_1280.jpg"),
            new Item("A4",  "https://cnet1.cbsistatic.com/img/0jCkVeD46Tv3jeKxe6bLCfxS5zc=/770x433/2017/03/31/c3750592-495c-4c3d-a357-ce1c36cd4985/2018audis4-07886.jpg"),
            new Item("S5", "http://hanabi.autoweek.com/sites/default/files/styles/gen-1200-675/public/2018-audi-s5-sportback-27.jpg"),
            new Item("RS6",  "http://www.2018carsinfo.com/wp-content/uploads/2016/12/2018-Audi-S6-front-view.jpg"),
            new Item("RS7",  "https://i.pinimg.com/originals/86/60/f0/8660f0e26e9167f081b4f632a8ec0c5d.jpg"),
            new Item("S8",  "https://static.cargurus.com/images/site/2016/06/23/13/36/2017_audi_s8-pic-4673879182464838694-640x480.jpeg"),
            new Item("TT","https://media.ed.edmunds-media.com/audi/tt/2017/ot/2017_audi_tt_LIFE1_ot_11031613_1280.jpg"),
            new Item("R8","https://media.ed.edmunds-media.com/audi/r8/2017/ot/2017_audi_r8_LIFE1_ot_1102167_1280.jpg"),
    };

    public static Item getItem(int id) {
        for (Item item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    private final String mName;
    private final String mFileName;

    Item(String name,  String fileName) {
        mName = name;
        mFileName = fileName;
    }

    public int getId() {
        return mName.hashCode() + mFileName.hashCode();
    }


    public String getName() {
        return mName;
    }

    public String getPhotoUrl() {
        return mFileName;
    }

    public String getThumbnailUrl() {
        return mFileName;
    }

}
