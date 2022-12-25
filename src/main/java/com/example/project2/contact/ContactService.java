package com.example.project2.contact;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ContactService {
    public List<Contact> getContacts() {
        return List.of(
                new Contact(
                      1L,
                        "Lugano",
                        "0762506012"

                )
        );
    }
}
