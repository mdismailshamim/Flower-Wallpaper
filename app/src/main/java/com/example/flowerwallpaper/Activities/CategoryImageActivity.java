package com.example.flowerwallpaper.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

import com.example.flowerwallpaper.Adapters.GridAdapter;
import com.example.flowerwallpaper.Adapters.UserClass;
import com.example.flowerwallpaper.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryImageActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserClass userClass;
    private List<UserClass> roseList;
    private List<UserClass> dahilaList;
    private List<UserClass> jasmineList;
    private List<UserClass> sharonList;
    private List<UserClass> hibiscussyriacusList;
    private List<UserClass> hybridteaList;
    private NetworkInfo info;
    private GridAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_image);
        recyclerView = findViewById(R.id.recyclerView);

        roseList = new ArrayList<>();
        dahilaList = new ArrayList<>();
        jasmineList = new ArrayList<>();
        sharonList = new ArrayList<>();
        hibiscussyriacusList = new ArrayList<>();
        hybridteaList = new ArrayList<>();


        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(CONNECTIVITY_SERVICE);
        info = cm.getActiveNetworkInfo();
        if (info != null) {
            Toast.makeText(CategoryImageActivity.this, "Loading..", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No Internet Connection!", Toast.LENGTH_LONG).show();
        }

        //roseList add data
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/1086178/pexels-photo-1086178.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/1315921/pexels-photo-1315921.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/931167/pexels-photo-931167.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/617965/pexels-photo-617965.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/3782745/pexels-photo-3782745.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/165893/pexels-photo-165893.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/462402/pexels-photo-462402.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/750178/pexels-photo-750178.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/754273/pexels-photo-754273.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/2397376/pexels-photo-2397376.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/931164/pexels-photo-931164.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/931177/pexels-photo-931177.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/750173/pexels-photo-750173.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/931179/pexels-photo-931179.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/698884/pexels-photo-698884.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        roseList.add(new UserClass("rose","https://images.pexels.com/photos/931168/pexels-photo-931168.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));

        //dahilaList add data
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/60597/dahlia-red-blossom-bloom-60597.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/2196578/pexels-photo-2196578.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/3985411/pexels-photo-3985411.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/2196578/pexels-photo-2196578.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/1200432/pexels-photo-1200432.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/65940/dahlia-dahlias-autumn-asteraceae-65940.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/699963/pexels-photo-699963.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/1044334/pexels-photo-1044334.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/924374/pexels-photo-924374.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/599679/pexels-photo-599679.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/669502/pexels-photo-669502.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/669512/pexels-photo-669512.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/133172/pexels-photo-133172.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/432873/pexels-photo-432873.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        dahilaList.add(new UserClass("dahila","https://images.pexels.com/photos/704780/pexels-photo-704780.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));


        //jasmineList add data
        jasmineList.add(new UserClass("jasmine","https://image.shutterstock.com/image-photo/white-jasmine-flowers-closeup-isolated-600w-1200645358.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2014/06/06/10/24/flower-363278_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2020/06/06/15/48/scent-of-jasmine-5267074_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2018/05/25/09/12/jasmin-3428597_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2015/06/17/05/55/plumeria-812017_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2018/09/18/22/12/jasmine-blue-3687455_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2020/04/25/18/51/jasminum-5092158_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2019/05/22/21/30/jasmine-4222596_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2018/05/25/09/12/jasmin-3428593_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2019/06/24/07/30/jasmin-4295405_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2014/10/27/19/03/mock-orange-505456_960_720.jpg"));
        jasmineList.add(new UserClass("jasmine","https://cdn.pixabay.com/photo/2019/05/22/21/33/jasmine-4222607_960_720.jpg"));

        //sharonList add data
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2019/07/26/00/54/rose-4363707_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2018/07/28/05/07/rose-of-sharon-3567356_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2018/08/04/17/36/flowers-3584099_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2015/11/29/11/28/rose-of-sharon-1068574_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2016/11/11/05/12/flower-1815866_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2018/07/28/05/07/rose-of-sharon-3567355_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2018/08/26/00/41/rose-of-sharon-3631290_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2017/06/29/19/08/rose-of-sharon-2455841_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2019/08/24/00/16/white-4426790_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2017/07/05/22/32/rose-of-sharon-2476217_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2019/08/23/05/26/rose-of-sharon-4424931_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2019/08/04/18/07/hypericum-4384365_960_720.jpg"));
        sharonList.add(new UserClass("sharon","https://cdn.pixabay.com/photo/2018/08/19/02/19/hollyhock-3615960_960_720.jpg"));


        //hibiscussyriacusList add data
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2020/08/09/17/10/flower-5476092_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2020/08/10/15/28/hibiscus-5478145_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2020/08/10/15/28/hibiscus-5478143_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2020/08/10/15/28/flower-5478144_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2020/08/10/15/28/flower-5478144_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2018/07/17/20/30/hibiscus-3544979_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2020/01/01/19/48/hibiscus-4734311_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2016/05/23/11/54/hibiscus-syriacus-1410195_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2019/07/24/22/03/hibiscus-4361267_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2020/01/13/20/41/hibiscus-4763508_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2019/08/14/20/49/hibiscus-4406703_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2018/11/27/21/36/hibiscus-3842446_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2018/06/29/14/19/hibiscus-3506094_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2019/08/25/11/06/hibiscus-4429235_960_720.jpg"));
        hibiscussyriacusList.add(new UserClass("hibiscussyriacus","https://cdn.pixabay.com/photo/2017/09/12/13/43/rose-of-sharon-2742357_960_720.jpg"));


        //hybridteaList add data
        hybridteaList.add(new UserClass("hybridtea","https://cdn.pixabay.com/photo/2020/08/24/09/12/blue-moon-rose-5513266_960_720.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://cdn.pixabay.com/photo/2017/06/16/23/50/rose-2410767_960_720.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://cdn.pixabay.com/photo/2015/01/29/19/37/white-tea-rose-616597_960_720.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://cdn.pixabay.com/photo/2012/09/21/18/57/bouquet-of-flowers-57477_960_720.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://cdn.pixabay.com/photo/2019/09/21/18/19/rose-4494476_960_720.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://cdn.pixabay.com/photo/2020/02/08/18/18/rose-4830914_960_720.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://cdn.pixabay.com/photo/2019/08/31/18/44/rose-4443856_960_720.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://cdn.pixabay.com/photo/2015/01/29/19/41/tea-rose-616608_960_720.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://image.freepik.com/free-photo/hybrid-tea-rose-bloom_294094-130.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://image.freepik.com/free-photo/rosa-centifolia-rose-des-peintres-flower-closeup-green-garden-surface_128711-1759.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://image.freepik.com/free-photo/pink-orange-hybrid-tea-roses_121837-92.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://image.freepik.com/free-photo/aphrodite-hybrid-tea-rose-english-garden-beautiful-single-mid-pink-rose-with-medium-fragrance-charming-pink-flowers-salmon-pink-colour-summer-autumn_39190-445.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://image.freepik.com/free-photo/white-rose-full-bloomed_1376-288.jpg"));
        hybridteaList.add(new UserClass("hybridtea","https://image.freepik.com/free-photo/rose_19485-37327.jpg"));



        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        gridAdapter = new GridAdapter(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("EXTRA_NAME");

            if (value.equals("rose")){
                getCuteBaby();
            }
            if (value.equals("dahila")){
                getCuteBabyGirl();
            }
            if (value.equals("jasmine")){
                getCutestBabay();
            }
            if (value.equals("sharon")){
                getdsharon();
            }
            if (value.equals("hibiscussyriacus")){
                gethibiscussyriacus();
            }
            if (value.equals("hybridtea")){
                getCuteStyleBoy();
            }

        }
    }

    private void getCuteBaby() {
        gridAdapter.setListImage(roseList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getCuteBabyGirl() {
        gridAdapter.setListImage(dahilaList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getCutestBabay() {
        gridAdapter.setListImage(jasmineList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getdsharon() {
        gridAdapter.setListImage(sharonList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void gethibiscussyriacus() {
        gridAdapter.setListImage(hibiscussyriacusList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getCuteStyleBoy() {
        gridAdapter.setListImage(hybridteaList);
        recyclerView.setAdapter(gridAdapter);
    }
}
