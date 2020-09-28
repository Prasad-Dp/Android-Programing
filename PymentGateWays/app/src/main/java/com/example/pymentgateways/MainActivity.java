package com.example.pymentgateways;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements PaymentResultListener {
    Checkout checkout;
    String API_KEY;
    EditText cname,amount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       cname=findViewById(R.id.cname);
       amount=findViewById(R.id.amount);

    }

    public void Payment(View view) {
        startPayment();
    }

    private void startPayment() {
        API_KEY="rzp_test_RGpsmZjVhny7MU";
        checkout=new Checkout();
        checkout.setKeyID(API_KEY);
        String Cname=cname.getText().toString();
        String T_amount= String.valueOf(Integer.parseInt(amount.getText().toString())*100);

        try {
            JSONObject options = new JSONObject();

            options.put("name", Cname);
            options.put("currency", "INR");
            options.put("amount", T_amount);//pass amount in currency subunits
            checkout.open(MainActivity.this, options);
        } catch(Exception e) {
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(this, "Payment Success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(this, "Payment Fail", Toast.LENGTH_SHORT).show();
    }
}