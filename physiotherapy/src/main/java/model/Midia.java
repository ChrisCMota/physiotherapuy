package model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_midia")
public class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_seq")
    private Integer numSeq;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "link_midia", length = 255)
    private String linkMidia;

    @ManyToOne
    @JoinColumn(name = "id_record")
    private PatientRecord record;

    public Integer getNumSeq() {
        return numSeq;
    }

    public void setNumSeq(Integer numSeq) {
        this.numSeq = numSeq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public PatientRecord getRecord() {
        return record;
    }

    public void setRecord(PatientRecord record) {
        this.record = record;
    }
}
