package az.elixir.social.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceModelFromAdapter {

    @JsonProperty("service")
    private String service;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("min")
    private String min;

    @JsonProperty("max")
    private String max;

    @JsonProperty("dripfeed")
    private boolean dripfeed;

    @JsonProperty("refill")
    private boolean refill;

    @JsonProperty("category")
    private String category;

    public ServiceModelFromAdapter() {
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public boolean isDripfeed() {
        return dripfeed;
    }

    public void setDripfeed(boolean dripfeed) {
        this.dripfeed = dripfeed;
    }

    public boolean isRefill() {
        return refill;
    }

    public void setRefill(boolean refill) {
        this.refill = refill;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ServiceModelFromAdapter{" +
                "service='" + service + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rate='" + rate + '\'' +
                ", min='" + min + '\'' +
                ", max='" + max + '\'' +
                ", dripfeed='" + dripfeed + '\'' +
                ", refill='" + refill + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
