package com.rdemir.donemprojesi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "SALON_TANIM")
public class SalonImp extends BaseEntity {

    @Column(name = "SALON_KODU")
    private String salonKodu;

    @Column(name = "SALON_ADI")
    private String salonAdi;

    @OneToMany(mappedBy = "salon")
    private List<CihazImp> cihaz;

    public SalonImp() {
    }

    public SalonImp(String salonKodu, String salonAdi, List<CihazImp> cihaz) {
        this.salonKodu = salonKodu;
        this.salonAdi = salonAdi;
        this.cihaz = cihaz;
    }

    public String getSalonKodu() {
        return salonKodu;
    }

    public void setSalonKodu(String salonKodu) {
        this.salonKodu = salonKodu;
    }

    public String getSalonAdi() {
        return salonAdi;
    }

    public void setSalonAdi(String salonAdi) {
        this.salonAdi = salonAdi;
    }

    public List<CihazImp> getCihaz() {
        return cihaz;
    }

    public void setCihaz(List<CihazImp> cihaz) {
        this.cihaz = cihaz;
    }
}
