package model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="tbl_client")
public class PatientRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_record")
    private int idRecord;

    @Column(name = "name", length = 100, nullable = false)
    private String namePatient;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "sex", length = 1)
    private String sex;

    @Column(name = "aircode", length = 7)
    private String aircode;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "address_complement", length = 100)
    private String addressComplement;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "occupation", length = 100)
    private String occupation;

    @Column(name = "clinical_diagnosis", columnDefinition = "TEXT")
    private String clinicalDiagnosis;

    @Column(name = "main_complaint", columnDefinition = "TEXT")
    private String mainComplaint;

    @Column(name = "hmp_hma", columnDefinition = "TEXT")
    private String hmpHma;

    @Column(name = "medication", columnDefinition = "TEXT")
    private String medication;

    @Column(name = "complementary_exams", columnDefinition = "TEXT")
    private String complementaryExams;

    @Column(name = "physical_examination", columnDefinition = "TEXT")
    private String physicalExamination;

    @Column(name = "clinical_conduct", columnDefinition = "TEXT")
    private String clinicalConduct;

    @Column(name = "diagnosis", columnDefinition = "TEXT")
    private String diagnosis;

    @Column(name = "unv_id", length = 45)
    private String unvId;

    @Column(name = "link_photo", length = 255)
    private String linkPhoto;

    @Column(name = "active")
    private int active;

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getIdRecord() {
        return idRecord;
    }

    public void setIdRecord(int idRecord) {
        this.idRecord = idRecord;
    }

    public String getNamePatient() {
        return namePatient;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAircode() {
        return aircode;
    }

    public void setAircode(String aircode) {
        this.aircode = aircode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getClinicalDiagnosis() {
        return clinicalDiagnosis;
    }

    public void setClinicalDiagnosis(String clinicalDiagnosis) {
        this.clinicalDiagnosis = clinicalDiagnosis;
    }

    public String getMainComplaint() {
        return mainComplaint;
    }

    public void setMainComplaint(String mainComplaint) {
        this.mainComplaint = mainComplaint;
    }

    public String getHmpHma() {
        return hmpHma;
    }

    public void setHmpHma(String hmpHma) {
        this.hmpHma = hmpHma;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getComplementaryExams() {
        return complementaryExams;
    }

    public void setComplementaryExams(String complementaryExams) {
        this.complementaryExams = complementaryExams;
    }

    public String getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination;
    }

    public String getClinicalConduct() {
        return clinicalConduct;
    }

    public void setClinicalConduct(String clinicalConduct) {
        this.clinicalConduct = clinicalConduct;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getUnvId() {
        return unvId;
    }

    public void setUnvId(String unvId) {
        this.unvId = unvId;
    }

    public String getLinkPhoto() {
        return linkPhoto;
    }

    public void setLinkPhoto(String linkPhoto) {
        this.linkPhoto = linkPhoto;
    }
}
