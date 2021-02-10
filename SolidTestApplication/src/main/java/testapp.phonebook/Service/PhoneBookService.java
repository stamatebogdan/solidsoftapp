package testapp.phonebook.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testapp.phonebook.Entity.PhoneBookRecords;
import testapp.phonebook.Repository.PhoneBookRepository;

import java.util.List;

@Service
public class PhoneBookService {

    private PhoneBookRepository phoneBookRepository;

    @Autowired
    public PhoneBookService(PhoneBookRepository phoneBookRepository){
        this.phoneBookRepository = phoneBookRepository;
    }

    public void getAllPhoneRecords(){
        phoneBookRepository.findAll();
    }


    public List<PhoneBookRecords> addPhoneBookRecord(PhoneBookRecords name, PhoneBookRecords telephone, PhoneBookRecords email){
        return phoneBookRepository.addPhoneBookRecord(name, telephone, email);
    }

    public List<PhoneBookRecords> editPhoneBookRecord(PhoneBookRecords id, String name, String telephone, String email){
        return phoneBookRepository.editPhoneBookRecord(id, name, telephone, email);
    }

    public List<PhoneBookRecords> deletePhoneBookRecord(PhoneBookRecords id, String name, String telephone, String email){
        return phoneBookRepository.deletePhoneBookRecord(id, name, telephone, email);
    }
}
