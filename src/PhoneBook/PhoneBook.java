package PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    boolean isClosed = true;
    private List<Contact> contacts = new ArrayList<>();


    public boolean isClosed() {
        return isClosed;
    }

    public boolean Open() {
        return this.isClosed = false;
    }

    public void addContact(String name, String phoneNo) {
        if (!isClosed){
            addIntoContacts(name, phoneNo);
        }
    }

    private void addIntoContacts(String name, String phoneNo) {
        int id = contacts()+1;
        Contact newContact = new Contact(id, name, phoneNo);
        contacts.add(newContact);


    }

    public int contacts() {
        return contacts.size();
    }

    public Contact searchContactWithId(int id) {
        Contact contactToReturn = null;

        for (Contact contact:contacts) {
            if (contact.getId()==id){
                contactToReturn = contact;
                break;
            }
        }
        if (contactToReturn == null) throw new ContactNotFoundException();

        return contactToReturn;
    }

    public boolean deleteContactWithName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contacts.remove(contact);
            }
        }
        return false;
    }
}

//    public int delete(int id) {
//
//        for (int i = 0; i < contacts.size(); i++) {
//            if (contact.get(i).equals(contact))
//                 contacts.remove(index);
//
//    }
//    }
//       id Contact contact = this.searchContactWithId(id);
//
//        int index = 0;
//        for (int i = 0; i < contacts.size(); i++){
//            if(contacts.get(i).equals(contact)){
//                index = i;
//                break;
//            }
//        }
//
//        return index;
//    }
//}
