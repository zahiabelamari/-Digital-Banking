package ma.emsi.ebanckingbackend.repositories;
import ma.emsi.ebanckingbackend.entities.BankAccount;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}