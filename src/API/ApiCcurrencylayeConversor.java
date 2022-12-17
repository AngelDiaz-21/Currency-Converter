package API;
/**
 *
 * @author Angel
 */
// necessary components are imported
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class ApiCcurrencylayeConversor {
    
    public static final String BASE_URL = "https://api.apilayer.com/currency_data/";
    public static final String ENDPOINT = "convert";

    // this object is used for executing requests to the (REST) API
    static CloseableHttpClient httpClient = HttpClients.createDefault();

    public Object getApiAmount (double amount, int fromConverter, int toConverter){
        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

        currencyCodes.put(1, "MXN"); //Pesos Mexicanos
        currencyCodes.put(2, "CAD"); //Canadian Dollars
        currencyCodes.put(3, "EUR"); //Euros
        currencyCodes.put(4, "USD"); //Dolares Estadounidenses
        currencyCodes.put(5, "HKD"); //Hong kong dollars
        currencyCodes.put(6, "INR"); //Indian rubies

        String valueFromCode, valueToCode;
        JSONObject resultado = null;

        valueFromCode = currencyCodes.get(fromConverter);
        valueToCode = currencyCodes.get(toConverter);

        HttpGet get = new HttpGet(BASE_URL + ENDPOINT + "?to="+valueToCode+"&from="+valueFromCode+"&amount="+amount);
        get.addHeader("apikey", "cXPO5rWpa93x0gzb6Hg7vQ7t507BKKPE");

        try {
            CloseableHttpResponse response =  httpClient.execute(get);
            System.out.println(response);
            HttpEntity entity = response.getEntity();
            System.out.println("eSTO ES NIKNAONED" + entity);
//          Se pasa primero a objeto
            JSONObject jsonObject = new JSONObject(EntityUtils.toString(entity));            
//            System.out.println("Esto es jsonObject"+jsonObject);
//            System.out.println("Single-Currency Conversion!!");
            
            resultado = jsonObject;
            
            response.close();
        } catch (ClientProtocolException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        
        return resultado;    
    }   
}
