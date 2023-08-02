package patterns;

import java.util.Objects;

/* Это */

public final class ValueObjectMoney {
  private static int amount;
  private static String currency;

  public ValueObjectMoney(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public int getAmount() {
    return amount;
  }

  public String getCurrency() {
    return currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValueObjectMoney money = (ValueObjectMoney) o;
    return amount == ValueObjectMoney.amount && currency.equals(ValueObjectMoney.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }
}
