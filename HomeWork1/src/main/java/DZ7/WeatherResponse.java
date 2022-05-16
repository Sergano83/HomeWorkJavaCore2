package DZ7;

import static io.restassured.RestAssured.given;


import com.fasterxml.jackson.databind.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;


import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter



public class WeatherResponse {
        @SneakyThrows
        public static void main(String[] args) {

            RestAssured.baseURI = "http://dataservice.accuweather.com/";

            Response response = given()
                    .when()
                    .get("forecasts/v1/daily/5day/294021?apikey=yODGgbTvYC5fkSQNmG0rOnvPB1V8vo89");

            System.out.println(response.asPrettyString());

            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper
                    .readTree(response.asPrettyString())
                    .at("/DailyForecasts");

            List<DailyForecasts> dailyForecasts = new ArrayList<>();

            if(jsonNode.isArray()){
                for (JsonNode arrayItem : jsonNode) {
                    dailyForecasts.add(objectMapper.convertValue(arrayItem,DailyForecasts.class));
                }

            }



            for (DailyForecasts dailyForecast : dailyForecasts) {
                System.out.println("В Москве " + dailyForecast.getDate() + " максимальная темпиратура " +
                        dailyForecast.getTemperature().getMaximum().getValue() + " минимальная темпиратура " +
                        dailyForecast.getTemperature().getMinimum().getValue());
            }


        }


}

