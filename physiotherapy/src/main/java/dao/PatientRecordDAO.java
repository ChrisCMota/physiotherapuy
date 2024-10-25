package dao;

import model.PatientRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRecordDAO extends CrudRepository<PatientRecord, Integer> {
    public List<PatientRecord> findByNamePatientRecordContaining(String name);
}
