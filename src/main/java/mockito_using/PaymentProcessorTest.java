package mockito_using;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class PaymentProcessorTest {

  @Test
  public void testProcessPayment() {
    PaymentService paymentServiceMock = mock(PaymentService.class);
    PaymentRequest request = new PaymentRequest("некоторые детали запроса на оплату"); // Some request details
    PaymentResponse response = new PaymentResponse("_"); // Waited response

    when(paymentServiceMock.processPayment(request)).thenReturn(response);

    PaymentProcessor processor = new PaymentProcessor(paymentServiceMock);
    PaymentResponse actualResponse = processor.process(request);

    assertEquals(response, actualResponse);
    verify(paymentServiceMock).processPayment(request);
  }

}
