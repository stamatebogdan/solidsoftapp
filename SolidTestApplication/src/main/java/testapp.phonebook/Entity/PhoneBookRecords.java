package testapp.phonebook.Entity;

import lombok.NonNull;
import org.springframework.data.annotation.Id;


public class PhoneBookRecords {

    @Id
    private long id;

    @NonNull
    private String name;

    @NonNull
    private String telephone;

    @NonNull
    private String email;
}
