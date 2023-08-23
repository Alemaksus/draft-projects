package mockito_using;

import java.util.Objects;

public class PaymentResponse {
  private String status;

  public PaymentResponse(String status) {
    this.status = status;
  }

  // Getters and Setters as needed

  // Method equals can be needed for the comparisons in the tests
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PaymentResponse that = (PaymentResponse) obj;
    return Objects.equals(status, that.status);
  }

  // Method hashCode also can be needed
  @Override
  public int hashCode() {
    return status != null ? status.hashCode() : 0;
  }
}
