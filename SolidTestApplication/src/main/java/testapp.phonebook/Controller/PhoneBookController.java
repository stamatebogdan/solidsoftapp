package testapp.phonebook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import testapp.phonebook.Entity.PhoneBookRecords;
import testapp.phonebook.Service.PhoneBookService;

import java.util.List;

@RestController
@RequestMapping("/phonebook/app")
public class PhoneBookController {

    private PhoneBookService phoneBookService;

    @Autowired
    public PhoneBookController(PhoneBookService phoneBookService){
        this.phoneBookService = phoneBookService;
    }

    @GetMapping("name/{name}/telephone/{telephone}/email/{email}/addContact")
    public List<PhoneBookRecords> addPhoneBookRecord(
            @PathVariable(value = "name") PhoneBookRecords name,
            @PathVariable(value = "telephone") PhoneBookRecords telephone,
            @PathVariable(value = "email") PhoneBookRecords email
    ){
        return phoneBookService.addPhoneBookRecord(name, telephone, email);
    }

    @GetMapping("/id/{id}/name/{name}/telephone/{telephone}/email/{email}/editContact")
    public List<PhoneBookRecords> editPhoneBookRecord(
            @PathVariable(value = "id") PhoneBookRecords id,
            @PathVariable(value = "name") String name,
            @PathVariable(value = "telephone") String telephone,
            @PathVariable(value = "email") String email
    ){
        return phoneBookService.editPhoneBookRecord(id, name, telephone, email);
    }

    @GetMapping("/id/{id}/name/{name}/telephone/{telephone}/email/{email}/deleteContact")
    public List<PhoneBookRecords> deletePhoneBookRecord(
            @PathVariable(value = "id") PhoneBookRecords id,
            @PathVariable(value = "name") String name,
            @PathVariable(value = "telephone") String telephone,
            @PathVariable(value = "email") String email
    ){
        return phoneBookService.deletePhoneBookRecord(id, name, telephone, email);
    }

    @PostMapping("/postMapping")
    public void getAllPhoneRecords(){
        phoneBookService.getAllPhoneRecords();
    }








}
