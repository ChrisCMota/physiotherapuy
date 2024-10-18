package service.recordservice;

import model.PatientRecord;

import java.util.List;

public interface IRecordService {
    public PatientRecord register(PatientRecord newPatient);
    public PatientRecord setPatient(PatientRecord patientRecord);
    public List<PatientRecord> findByName(String name);
    public PatientRecord findById(Integer id);
    public boolean deleteById(Integer id);

}
