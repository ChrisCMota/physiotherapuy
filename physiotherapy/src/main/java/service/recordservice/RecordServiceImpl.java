package service.recordservice;

import dao.PatientRecordDAO;
import model.PatientRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class RecordServiceImpl implements IRecordService{

    @Autowired
    private PatientRecordDAO dao;


    @Override
    public PatientRecord register(PatientRecord newPatient) {
        newPatient.setUnvId(UUID.randomUUID().toString());
        newPatient.setActive(1);
        return dao.save(newPatient);
    }

    @Override
    public PatientRecord setPatient(PatientRecord patientRecord) {
        return dao.save(patientRecord);
    }

    @Override
    public List<PatientRecord> findByName(String name) {
        return dao.findByNamePatientContaining(name);
    }

    @Override
    public PatientRecord findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(Integer id) {
        PatientRecord record = findById(id);
        if (record != null){
            record.setActive(0);
            dao.save(record);
            return true;
        }
        return false;
    }
}
