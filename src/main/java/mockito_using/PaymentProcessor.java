package mockito_using;

public class PaymentProcessor {

  private PaymentService paymentService;

  public PaymentProcessor(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public PaymentResponse process(PaymentRequest request) {
    return paymentService.processPayment(request);
  }

}
