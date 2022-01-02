package com.github.customers.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Contact implements Serializable {

    private static final long serialVersionUID = -5630927194373190406L;

    private String phone;

    private String extraPhone;

    public Contact(String phone, String extraPhone) {
        this.phone = phone;
        this.extraPhone = extraPhone;
    }

    public static Contact defaultContact() {
        return new Contact(
                "unknown",
                "unknown"
        );
    }
}