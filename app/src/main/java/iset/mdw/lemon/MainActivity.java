package iset.mdw.lemon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

import iset.mdw.lemon.Adapter.adapterCategoryProduct;
import iset.mdw.lemon.Adapter.model.productCategory;
import iset.mdw.lemon.Adapter.model.products;
import iset.mdw.lemon.Adapter.productAdapter;


public class MainActivity extends AppCompatActivity {
    LottieAnimationView lottie;
    adapterCategoryProduct productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    iset.mdw.lemon.Adapter.productAdapter productAdapter;
    private TextView textView,textView2,textView3,textView4;
    Dialog mDialog;
    ImageView imageView,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        lottie = findViewById(R.id.lottie);
        mDialog = new Dialog(this);
        mDialog.setContentView(R.layout.popup);

        lottie.animate().translationX(2000).setDuration(2000).setStartDelay(2900);


        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.show();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Productdetails3.class);
                startActivity(i);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),productdetails4.class);
                startActivity(i);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),productdetails5.class);
                startActivity(i);
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),productdetails6.class);
                startActivity(i);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(),Searchpage.class);
                startActivity(i);
            }
        });

        List<productCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new productCategory(1, "Most Popular"));
        productCategoryList.add(new productCategory(2, "Trending"));
        productCategoryList.add(new productCategory(3, "Skin Care"));
        productCategoryList.add(new productCategory(4, "Hair Care"));
        productCategoryList.add(new productCategory(5, "All Body Products"));
        productCategoryList.add(new productCategory(6, "Make Up"));
        productCategoryList.add(new productCategory(7, "Fragrance"));

        setProductAdapter(productCategoryList);


            List<products> productsList = new ArrayList<>();
            productsList.add(new products(2, "Japanese Cherry Blossom","250 ml", "$ 17.00",R.drawable.prod2));
            productsList.add(new products(1, "Africain Mango Shower Gel","350 ml", "$ 25.00",R.drawable.prod1));
            productsList.add(new products(2, "Japanese Cherry Blossom","300 ml", "$ 20.00",R.drawable.prod2));
            productsList.add(new products(1, "Africain Mango Shower Gel","250 ml", "$ 35.00",R.drawable.prod1));
        setProdItemRecycler(productsList);


    }


    private void setProductAdapter(List<productCategory> productCategoryList){


        productCatRecycler = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this , RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new adapterCategoryProduct(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);
    }


    private void setProdItemRecycler(List<products> productsList){


        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this , RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new productAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);
    }

}
