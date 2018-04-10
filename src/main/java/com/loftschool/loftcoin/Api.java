package com.loftschool.loftcoin;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    //сайт с которого берем данные
    String baseUrl = "https://api.coinmarketcap.com/v1/";
    // метод передающий список криптовалют с сайта и преобразовующий их в список
    @GET("ticker")
    Call<List<Coin>> ticker();


}
