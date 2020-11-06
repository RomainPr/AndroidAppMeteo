package openWeatherMap

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "4d4d0c0e64f8f9280f0859adadd53013"

interface OpenWeatherService {

    @GET("data/2.5/weather?units=metric&lang=fr")
    fun getWeather(@Query("q") cityName: String,
    @Query("appid") apiKey: String = API_KEY) : Call<WeatherWrapper>

}