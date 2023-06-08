package com.obushko.cryptowallet.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.obushko.cryptowallet.Activities.Adapter.CryptoWalletAdapter;
import com.obushko.cryptowallet.Activities.Domain.CryptoWallet;
import com.obushko.cryptowallet.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CryptoWalletAdapter cryptoWalletAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerViewWallet();
    }

    private void recyclerViewWallet() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<CryptoWallet> cryptoWalletsList = new ArrayList<>();
        ArrayList<Integer> lineData = new ArrayList<>();
        lineData.add(1000);
        lineData.add(1100);
        lineData.add(1200);
        lineData.add(1100);

        ArrayList<Integer> lineData2 = new ArrayList<>();
        lineData2.add(2100);
        lineData2.add(2000);
        lineData2.add(1900);
        lineData2.add(2000);

        ArrayList<Integer> lineData3 = new ArrayList<>();
        lineData3.add(900);
        lineData3.add(1100);
        lineData3.add(1290);
        lineData3.add(1000);
        lineData3.add(1150);

        cryptoWalletsList.add(new CryptoWallet("bitcoin", "BTX", 1234.12,2.13, lineData, 1234.12, 0.12343));
        cryptoWalletsList.add(new CryptoWallet("ethereum", "ETH", 2134.21,-1.13, lineData2, 6544.31, 0.02343));
        cryptoWalletsList.add(new CryptoWallet("tron", "TRX", 6534.12,0.83, lineData3, 31234.12, 0.02154));

        cryptoWalletAdapter = new CryptoWalletAdapter(cryptoWalletsList);
        recyclerView.setAdapter(cryptoWalletAdapter);
    }
}