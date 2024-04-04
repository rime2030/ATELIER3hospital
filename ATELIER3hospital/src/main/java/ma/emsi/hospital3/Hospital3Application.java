package ma.emsi.hospital3;

import ma.emsi.hospital3.entities.Patient;
import ma.emsi.hospital3.repository.PatientRepository;
import org.hibernate.type.TrueFalseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Hospital3Application implements CommandLineRunner {
@Autowired
private PatientRepository patientRepository;
    public static void main(String[] args) {

        SpringApplication.run(Hospital3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null ,"Mohamed",new Date(),false,34));
        patientRepository.save(new Patient(null ,"Hanan",new Date(),false,5675));
        patientRepository.save(new Patient(null ,"Salma",new Date(),true,9089));
    }
}
