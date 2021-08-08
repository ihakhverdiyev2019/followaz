package az.elixir.social.Utils;

import az.elixir.social.DTO.ServiceModelFromAdapter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class CheckFromAdapter {


    public ServiceModelFromAdapter getDataFromAdapter(String serviceId) throws UnsupportedEncodingException, JsonProcessingException {


            HttpPost post = new HttpPost("https://socialpanel.app/api/v2");
        ObjectMapper objectMapper = new ObjectMapper();
        ServiceModelFromAdapter result = null;

        // add request parameter, form parameters
            List<NameValuePair> urlParameters = new ArrayList<>();
            urlParameters.add(new BasicNameValuePair("key", "7fd03fa7ccdedb8d04c4c45ba72ebb32"));
            urlParameters.add(new BasicNameValuePair("action", "services"));

            post.setEntity(new UrlEncodedFormEntity(urlParameters));
            String json = null;

            try (CloseableHttpClient httpClient = HttpClients.createDefault();
                 CloseableHttpResponse response = httpClient.execute(post)) {

                System.out.println(EntityUtils.toString(response.getEntity()));

json = objectMapper.writeValueAsString(EntityUtils.toString(response.getEntity()));




            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        List<ServiceModelFromAdapter> myObjects = objectMapper.readValue(json, new TypeReference<List<ServiceModelFromAdapter>>(){});
        for(int i = 0; i<myObjects.size();i++){
            if (myObjects.get(i).getService().equals(serviceId)){

                result = myObjects.get(i);



            }







        }





        return result;
    }





}
