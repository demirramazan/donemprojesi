package com.rdemir.donemprojesi.entities;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PERSONEL")
public class Personel extends BaseEntity {

    @Column(name = "PERSONEL_ADI", nullable = false, length = 50)
    private String personelAdi;

    @Column(name = "PERSONEL_SOYADI", nullable = false, length = 50)
    private String personelSoyadi;

    @Column(name = "KIMLIK_NO")
    @Size(max = 11)
    private String kimlikNo;

    @Email(regexp = "[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\\\\\.[A-Z]{2,6}", message = "Email hatali")
    @Column(name = "E_MAIL")
    private String email;

    @Column(name = "TELEFON_NO")
    @Size(max = 10)
    private String telefonNo;

    @Column(name = "ADRES", length = 500)
    private String adres;

    //    @Enumerated(EnumType.ORDINAL)
    @Column(name = "CINSIYET", nullable = false)
    private Integer cinsyet;

    @Column(name = "AKTIF")
    private Integer aktif;

    @ManyToOne
    @JoinColumn(name = "BIRIM_ID",
            foreignKey = @ForeignKey(name = "FK_PERSONEL_BIRIM"))
    private Birim birim;

    public Personel(String personelAdi, String personelSoyadi, String kimlikNo,
                    String email, String telefonNo, String adres) {
        this.personelAdi = personelAdi;
        this.personelSoyadi = personelSoyadi;
        this.kimlikNo = kimlikNo;
        this.email = email;
        this.telefonNo = telefonNo;
        this.adres = adres;
    }

    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }

    public String getPersonelSoyadi() {
        return personelSoyadi;
    }

    public void setPersonelSoyadi(String personelSoyadi) {
        this.personelSoyadi = personelSoyadi;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getCinsyet() {
        return 0;
    }

    public void setCinsyet(Integer cinsyet) {
        this.cinsyet = cinsyet;
    }
}