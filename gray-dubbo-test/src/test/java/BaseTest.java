import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.DefaultedHttpParams;
import org.apache.http.params.HttpParams;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * @author kongyunhui on 2018/7/20.
 */
public class BaseTest {
    public static void main(String[] args) throws Exception{
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(20000);
        requestFactory.setReadTimeout(20000);
        restTemplate.setRequestFactory(requestFactory);
        Map<String, String> params = new HashMap<>();
        params.put("bootstrap", "CG");
        params.put("ruleValue", "1");
        Boolean forObject = restTemplate.getForObject("http://localhost:8080/grayrule/isGrayRule?bootstrap={bootstrap}&ruleValue={ruleValue}", Boolean.class, params);
        System.out.println(forObject);
    }
}
