package ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String site = "http://aport.ru";//создали строчку с адресом сайта
        URL url = new URL(site);//передаем сюда адрес по которму хотим установить соединение
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int response = httpURLConnection.getResponseCode();//получаем ответный код от браузера
        System.out.println(response);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        //получаем доступ к потоку информации с сайта
        StringBuilder resultText = new StringBuilder();
        //сюда аккумулируем всё, что читает BufferedReader
        String input;//сохраняем всё из BufferedReader
        while ((input = bufferedReader.readLine()) != null) {//в input присвоение строчки и если удалось прочитать то не равно 0
            resultText.append(input);
        }
        System.out.println(resultText);
    }
}
