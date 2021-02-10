package testapp.phonebook.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import testapp.phonebook.Entity.PhoneBookRecords;

import java.util.List;

public interface PhoneBookRepository extends CrudRepository<PhoneBookRecords, Long> {

    @Query(value = "insert into telephone.telephone_book (Name, Telephone, Email) " +
            "values(:name.name, :telephone.telephone, :email.email)", nativeQuery = true)
    List<PhoneBookRecords> addPhoneBookRecord(PhoneBookRecords name, PhoneBookRecords telephone, PhoneBookRecords email);

    @Query(value = "update telephone.telephone_book set name=:name, telephone=:telephone, email=:email where id=:id")
    List<PhoneBookRecords> editPhoneBookRecord(
            @Param("id") PhoneBookRecords id,
            @Param("name") String name,
            @Param("telephone") String telephone,
            @Param("email") String email);

    @Query(value = "delete from telephone.telephone_book where id=:id and name=:name and telephone=:telephone and email=:email")
    List<PhoneBookRecords> deletePhoneBookRecord(
            @Param("id") PhoneBookRecords id,
            @Param("name") String name,
            @Param("telephone") String telephone,
            @Param("email") String email);
}
