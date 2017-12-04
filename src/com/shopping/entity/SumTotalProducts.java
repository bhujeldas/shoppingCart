package com.shopping.entity;

import java.util.List;

public class SumTotalProducts {
    private List<AddToList> summary;
    private Float grandTotal;

    public List<AddToList> getSummary() {
        return summary;
    }
    public void setSummary(List<AddToList> summary) {
        this.summary = summary;
    }
    public Float getGrandTotal() {
        return grandTotal;
    }
    public void setGrandTotal(Float grandTotal) {
        this.grandTotal = grandTotal;
    }
}
