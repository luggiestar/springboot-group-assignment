package com.example.project2.contact;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    public List<Contact> getContacts() {
        return contactRepository.findAll();
    }

    public void createNewContact(Contact contact) {
        Optional<Contact> contactOptional = contactRepository.findContactByNumber(contact.getNumber());
        if (contactOptional.isPresent()) {
            throw new IllegalStateException("Phone number exist");
        }
        contactRepository.save(contact);
    }
}
