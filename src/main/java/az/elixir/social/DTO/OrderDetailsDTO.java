package az.elixir.social.DTO;

public class OrderDetailsDTO {

    private int serviceCode;

    private int amount;


    public OrderDetailsDTO() {
    }


    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
