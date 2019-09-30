package bank.web;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.apache.http.client.methods.RequestBuilder.post;

public class ServiceTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8111);

//    @Test
//    public void testCreateCustomer() {
//        stubFor(post(urlEqualTo("wemanibank/customers"))
//                .withHeader()
//                .withRequestBody()
//
//        ));
//    }
}
