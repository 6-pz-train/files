package com.locostatmanager.busines.dao.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by anatoliy on 22.04.14.
 */
@Entity
@javax.persistence.Table(name = "LOCO_DATA", schema = "", catalog = "sql337514")
public class LocoDataEntity {
    private long idLocoData;

    @Id
    @javax.persistence.Column(name = "ID_LOCO_DATA", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public long getIdLocoData() {
        return idLocoData;
    }

    public void setIdLocoData(long idLocoData) {
        this.idLocoData = idLocoData;
    }

    private String idLoco;

    @Basic
    @javax.persistence.Column(name = "ID_LOCO", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public String getIdLoco() {
        return idLoco;
    }

    public void setIdLoco(String idLoco) {
        this.idLoco = idLoco;
    }

    private Timestamp recordTimeLocoData;

    @Basic
    @javax.persistence.Column(name = "RECORD_TIME_LOCO_DATA", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    public Timestamp getRecordTimeLocoData() {
        return recordTimeLocoData;
    }

    public void setRecordTimeLocoData(Timestamp recordTimeLocoData) {
        this.recordTimeLocoData = recordTimeLocoData;
    }

    private Byte naprAccumBatrSecA;

    @Basic
    @javax.persistence.Column(name = "NAPR_ACCUM_BATR_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getNaprAccumBatrSecA() {
        return naprAccumBatrSecA;
    }

    public void setNaprAccumBatrSecA(Byte naprAccumBatrSecA) {
        this.naprAccumBatrSecA = naprAccumBatrSecA;
    }

    private Byte naprAccumBatrSecB;

    @Basic
    @javax.persistence.Column(name = "NAPR_ACCUM_BATR_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getNaprAccumBatrSecB() {
        return naprAccumBatrSecB;
    }

    public void setNaprAccumBatrSecB(Byte naprAccumBatrSecB) {
        this.naprAccumBatrSecB = naprAccumBatrSecB;
    }

    private Byte tokAccumBatrSecA;

    @Basic
    @javax.persistence.Column(name = "TOK_ACCUM_BATR_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTokAccumBatrSecA() {
        return tokAccumBatrSecA;
    }

    public void setTokAccumBatrSecA(Byte tokAccumBatrSecA) {
        this.tokAccumBatrSecA = tokAccumBatrSecA;
    }

    private Byte tokAccumBatrSecB;

    @Basic
    @javax.persistence.Column(name = "TOK_ACCUM_BATR_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTokAccumBatrSecB() {
        return tokAccumBatrSecB;
    }

    public void setTokAccumBatrSecB(Byte tokAccumBatrSecB) {
        this.tokAccumBatrSecB = tokAccumBatrSecB;
    }

    private Short tokVozTedSecA;

    @Basic
    @javax.persistence.Column(name = "TOK_VOZ_TED_SEC_A", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTokVozTedSecA() {
        return tokVozTedSecA;
    }

    public void setTokVozTedSecA(Short tokVozTedSecA) {
        this.tokVozTedSecA = tokVozTedSecA;
    }

    private Short tokVozTedSecB;

    @Basic
    @javax.persistence.Column(name = "TOK_VOZ_TED_SEC_B", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTokVozTedSecB() {
        return tokVozTedSecB;
    }

    public void setTokVozTedSecB(Short tokVozTedSecB) {
        this.tokVozTedSecB = tokVozTedSecB;
    }

    private Short tokYakTed12SecA;

    @Basic
    @javax.persistence.Column(name = "TOK_YAK_TED12_SEC_A", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTokYakTed12SecA() {
        return tokYakTed12SecA;
    }

    public void setTokYakTed12SecA(Short tokYakTed12SecA) {
        this.tokYakTed12SecA = tokYakTed12SecA;
    }

    private Short tokYakTed12SecB;

    @Basic
    @javax.persistence.Column(name = "TOK_YAK_TED12_SEC_B", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTokYakTed12SecB() {
        return tokYakTed12SecB;
    }

    public void setTokYakTed12SecB(Short tokYakTed12SecB) {
        this.tokYakTed12SecB = tokYakTed12SecB;
    }

    private Short tokYakTed34SecA;

    @Basic
    @javax.persistence.Column(name = "TOK_YAK_TED34_SEC_A", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTokYakTed34SecA() {
        return tokYakTed34SecA;
    }

    public void setTokYakTed34SecA(Short tokYakTed34SecA) {
        this.tokYakTed34SecA = tokYakTed34SecA;
    }

    private Short tokYakTed34SecB;

    @Basic
    @javax.persistence.Column(name = "TOK_YAK_TED34_SEC_B", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTokYakTed34SecB() {
        return tokYakTed34SecB;
    }

    public void setTokYakTed34SecB(Short tokYakTed34SecB) {
        this.tokYakTed34SecB = tokYakTed34SecB;
    }

    private Short naprContSetSecA;

    @Basic
    @javax.persistence.Column(name = "NAPR_CONT_SET_SEC_A", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getNaprContSetSecA() {
        return naprContSetSecA;
    }

    public void setNaprContSetSecA(Short naprContSetSecA) {
        this.naprContSetSecA = naprContSetSecA;
    }

    private Short naprContSetSecB;

    @Basic
    @javax.persistence.Column(name = "NAPR_CONT_SET_SEC_B", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getNaprContSetSecB() {
        return naprContSetSecB;
    }

    public void setNaprContSetSecB(Short naprContSetSecB) {
        this.naprContSetSecB = naprContSetSecB;
    }

    private Byte temprBuks1StorMashSecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS1_STOR_MASH_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks1StorMashSecA() {
        return temprBuks1StorMashSecA;
    }

    public void setTemprBuks1StorMashSecA(Byte temprBuks1StorMashSecA) {
        this.temprBuks1StorMashSecA = temprBuks1StorMashSecA;
    }

    private Byte temprBuks1StorPomMashSecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS1_STOR_POM_MASH_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks1StorPomMashSecA() {
        return temprBuks1StorPomMashSecA;
    }

    public void setTemprBuks1StorPomMashSecA(Byte temprBuks1StorPomMashSecA) {
        this.temprBuks1StorPomMashSecA = temprBuks1StorPomMashSecA;
    }

    private Byte temprBuks2StorMashSecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS2_STOR_MASH_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks2StorMashSecA() {
        return temprBuks2StorMashSecA;
    }

    public void setTemprBuks2StorMashSecA(Byte temprBuks2StorMashSecA) {
        this.temprBuks2StorMashSecA = temprBuks2StorMashSecA;
    }

    private Byte temprBuks2StorPomMashSecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS2_STOR_POM_MASH_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks2StorPomMashSecA() {
        return temprBuks2StorPomMashSecA;
    }

    public void setTemprBuks2StorPomMashSecA(Byte temprBuks2StorPomMashSecA) {
        this.temprBuks2StorPomMashSecA = temprBuks2StorPomMashSecA;
    }

    private Byte temprBuks3StorMashSecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS3_STOR_MASH_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks3StorMashSecA() {
        return temprBuks3StorMashSecA;
    }

    public void setTemprBuks3StorMashSecA(Byte temprBuks3StorMashSecA) {
        this.temprBuks3StorMashSecA = temprBuks3StorMashSecA;
    }

    private Byte temprBuks3StorPomMashSecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS3_STOR_POM_MASH_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks3StorPomMashSecA() {
        return temprBuks3StorPomMashSecA;
    }

    public void setTemprBuks3StorPomMashSecA(Byte temprBuks3StorPomMashSecA) {
        this.temprBuks3StorPomMashSecA = temprBuks3StorPomMashSecA;
    }

    private Byte temprBuks4StorMashSecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS4_STOR_MASH_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks4StorMashSecA() {
        return temprBuks4StorMashSecA;
    }

    public void setTemprBuks4StorMashSecA(Byte temprBuks4StorMashSecA) {
        this.temprBuks4StorMashSecA = temprBuks4StorMashSecA;
    }

    private Byte temprBuks4StorPomMashSecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS4_STOR_POM_MASH_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks4StorPomMashSecA() {
        return temprBuks4StorPomMashSecA;
    }

    public void setTemprBuks4StorPomMashSecA(Byte temprBuks4StorPomMashSecA) {
        this.temprBuks4StorPomMashSecA = temprBuks4StorPomMashSecA;
    }

    private Byte temprBuks4StorPomMashSecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS4_STOR_POM_MASH_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks4StorPomMashSecB() {
        return temprBuks4StorPomMashSecB;
    }

    public void setTemprBuks4StorPomMashSecB(Byte temprBuks4StorPomMashSecB) {
        this.temprBuks4StorPomMashSecB = temprBuks4StorPomMashSecB;
    }

    private Byte temprBuks4StorMashSecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS4_STOR_MASH_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks4StorMashSecB() {
        return temprBuks4StorMashSecB;
    }

    public void setTemprBuks4StorMashSecB(Byte temprBuks4StorMashSecB) {
        this.temprBuks4StorMashSecB = temprBuks4StorMashSecB;
    }

    private Byte temprBuks3StorPomMashSecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS3_STOR_POM_MASH_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks3StorPomMashSecB() {
        return temprBuks3StorPomMashSecB;
    }

    public void setTemprBuks3StorPomMashSecB(Byte temprBuks3StorPomMashSecB) {
        this.temprBuks3StorPomMashSecB = temprBuks3StorPomMashSecB;
    }

    private Byte temprBuks3StorMashSecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS3_STOR_MASH_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks3StorMashSecB() {
        return temprBuks3StorMashSecB;
    }

    public void setTemprBuks3StorMashSecB(Byte temprBuks3StorMashSecB) {
        this.temprBuks3StorMashSecB = temprBuks3StorMashSecB;
    }

    private Byte temprBuks2StorPomMashSecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS2_STOR_POM_MASH_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks2StorPomMashSecB() {
        return temprBuks2StorPomMashSecB;
    }

    public void setTemprBuks2StorPomMashSecB(Byte temprBuks2StorPomMashSecB) {
        this.temprBuks2StorPomMashSecB = temprBuks2StorPomMashSecB;
    }

    private Byte temprBuks2StorMashSecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS2_STOR_MASH_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks2StorMashSecB() {
        return temprBuks2StorMashSecB;
    }

    public void setTemprBuks2StorMashSecB(Byte temprBuks2StorMashSecB) {
        this.temprBuks2StorMashSecB = temprBuks2StorMashSecB;
    }

    private Byte temprBuks1StorPomMashSecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS1_STOR_POM_MASH_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks1StorPomMashSecB() {
        return temprBuks1StorPomMashSecB;
    }

    public void setTemprBuks1StorPomMashSecB(Byte temprBuks1StorPomMashSecB) {
        this.temprBuks1StorPomMashSecB = temprBuks1StorPomMashSecB;
    }

    private Byte temprBuks1StorMashSecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BUKS1_STOR_MASH_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprBuks1StorMashSecB() {
        return temprBuks1StorMashSecB;
    }

    public void setTemprBuks1StorMashSecB(Byte temprBuks1StorMashSecB) {
        this.temprBuks1StorMashSecB = temprBuks1StorMashSecB;
    }

    private Byte temprVhodTedSecA1;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VHOD_TED_SEC_A1", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVhodTedSecA1() {
        return temprVhodTedSecA1;
    }

    public void setTemprVhodTedSecA1(Byte temprVhodTedSecA1) {
        this.temprVhodTedSecA1 = temprVhodTedSecA1;
    }

    private Byte temprVhodTedSecA2;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VHOD_TED_SEC_A2", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVhodTedSecA2() {
        return temprVhodTedSecA2;
    }

    public void setTemprVhodTedSecA2(Byte temprVhodTedSecA2) {
        this.temprVhodTedSecA2 = temprVhodTedSecA2;
    }

    private Byte temprVhodTedSecB1;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VHOD_TED_SEC_B1", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVhodTedSecB1() {
        return temprVhodTedSecB1;
    }

    public void setTemprVhodTedSecB1(Byte temprVhodTedSecB1) {
        this.temprVhodTedSecB1 = temprVhodTedSecB1;
    }

    private Byte temprVhodTedSecB2;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VHOD_TED_SEC_B2", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVhodTedSecB2() {
        return temprVhodTedSecB2;
    }

    public void setTemprVhodTedSecB2(Byte temprVhodTedSecB2) {
        this.temprVhodTedSecB2 = temprVhodTedSecB2;
    }

    private Byte temprVihodTed1SecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VIHOD_TED1_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVihodTed1SecA() {
        return temprVihodTed1SecA;
    }

    public void setTemprVihodTed1SecA(Byte temprVihodTed1SecA) {
        this.temprVihodTed1SecA = temprVihodTed1SecA;
    }

    private Byte temprVihodTed2SecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VIHOD_TED2_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVihodTed2SecA() {
        return temprVihodTed2SecA;
    }

    public void setTemprVihodTed2SecA(Byte temprVihodTed2SecA) {
        this.temprVihodTed2SecA = temprVihodTed2SecA;
    }

    private Byte temprVihodTed3SecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VIHOD_TED3_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVihodTed3SecA() {
        return temprVihodTed3SecA;
    }

    public void setTemprVihodTed3SecA(Byte temprVihodTed3SecA) {
        this.temprVihodTed3SecA = temprVihodTed3SecA;
    }

    private Byte temprVihodTed4SecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VIHOD_TED4_SEC_A", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVihodTed4SecA() {
        return temprVihodTed4SecA;
    }

    public void setTemprVihodTed4SecA(Byte temprVihodTed4SecA) {
        this.temprVihodTed4SecA = temprVihodTed4SecA;
    }

    private Byte temprVihodTed1SecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VIHOD_TED1_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVihodTed1SecB() {
        return temprVihodTed1SecB;
    }

    public void setTemprVihodTed1SecB(Byte temprVihodTed1SecB) {
        this.temprVihodTed1SecB = temprVihodTed1SecB;
    }

    private Byte temprVihodTed2SecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VIHOD_TED2_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVihodTed2SecB() {
        return temprVihodTed2SecB;
    }

    public void setTemprVihodTed2SecB(Byte temprVihodTed2SecB) {
        this.temprVihodTed2SecB = temprVihodTed2SecB;
    }

    private Byte temprVihodTed3SecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VIHOD_TED3_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVihodTed3SecB() {
        return temprVihodTed3SecB;
    }

    public void setTemprVihodTed3SecB(Byte temprVihodTed3SecB) {
        this.temprVihodTed3SecB = temprVihodTed3SecB;
    }

    private Byte temprVihodTed4SecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_VIHOD_TED4_SEC_B", nullable = true, insertable = true, updatable = true, length = 3, precision = 0)
    public Byte getTemprVihodTed4SecB() {
        return temprVihodTed4SecB;
    }

    public void setTemprVihodTed4SecB(Byte temprVihodTed4SecB) {
        this.temprVihodTed4SecB = temprVihodTed4SecB;
    }

    private Short temprBptr1SecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BPTR1_SEC_A", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTemprBptr1SecA() {
        return temprBptr1SecA;
    }

    public void setTemprBptr1SecA(Short temprBptr1SecA) {
        this.temprBptr1SecA = temprBptr1SecA;
    }

    private Short temprBptr2SecA;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BPTR2_SEC_A", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTemprBptr2SecA() {
        return temprBptr2SecA;
    }

    public void setTemprBptr2SecA(Short temprBptr2SecA) {
        this.temprBptr2SecA = temprBptr2SecA;
    }

    private Short temprBptr1SecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BPTR1_SEC_B", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTemprBptr1SecB() {
        return temprBptr1SecB;
    }

    public void setTemprBptr1SecB(Short temprBptr1SecB) {
        this.temprBptr1SecB = temprBptr1SecB;
    }

    private Short temprBptr2SecB;

    @Basic
    @javax.persistence.Column(name = "TEMPR_BPTR2_SEC_B", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public Short getTemprBptr2SecB() {
        return temprBptr2SecB;
    }

    public void setTemprBptr2SecB(Short temprBptr2SecB) {
        this.temprBptr2SecB = temprBptr2SecB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocoDataEntity that = (LocoDataEntity) o;

        if (idLocoData != that.idLocoData) return false;
        if (idLoco != null ? !idLoco.equals(that.idLoco) : that.idLoco != null) return false;
        if (naprAccumBatrSecA != null ? !naprAccumBatrSecA.equals(that.naprAccumBatrSecA) : that.naprAccumBatrSecA != null)
            return false;
        if (naprAccumBatrSecB != null ? !naprAccumBatrSecB.equals(that.naprAccumBatrSecB) : that.naprAccumBatrSecB != null)
            return false;
        if (naprContSetSecA != null ? !naprContSetSecA.equals(that.naprContSetSecA) : that.naprContSetSecA != null)
            return false;
        if (naprContSetSecB != null ? !naprContSetSecB.equals(that.naprContSetSecB) : that.naprContSetSecB != null)
            return false;
        if (recordTimeLocoData != null ? !recordTimeLocoData.equals(that.recordTimeLocoData) : that.recordTimeLocoData != null)
            return false;
        if (temprBptr1SecA != null ? !temprBptr1SecA.equals(that.temprBptr1SecA) : that.temprBptr1SecA != null)
            return false;
        if (temprBptr1SecB != null ? !temprBptr1SecB.equals(that.temprBptr1SecB) : that.temprBptr1SecB != null)
            return false;
        if (temprBptr2SecA != null ? !temprBptr2SecA.equals(that.temprBptr2SecA) : that.temprBptr2SecA != null)
            return false;
        if (temprBptr2SecB != null ? !temprBptr2SecB.equals(that.temprBptr2SecB) : that.temprBptr2SecB != null)
            return false;
        if (temprBuks1StorMashSecA != null ? !temprBuks1StorMashSecA.equals(that.temprBuks1StorMashSecA) : that.temprBuks1StorMashSecA != null)
            return false;
        if (temprBuks1StorMashSecB != null ? !temprBuks1StorMashSecB.equals(that.temprBuks1StorMashSecB) : that.temprBuks1StorMashSecB != null)
            return false;
        if (temprBuks1StorPomMashSecA != null ? !temprBuks1StorPomMashSecA.equals(that.temprBuks1StorPomMashSecA) : that.temprBuks1StorPomMashSecA != null)
            return false;
        if (temprBuks1StorPomMashSecB != null ? !temprBuks1StorPomMashSecB.equals(that.temprBuks1StorPomMashSecB) : that.temprBuks1StorPomMashSecB != null)
            return false;
        if (temprBuks2StorMashSecA != null ? !temprBuks2StorMashSecA.equals(that.temprBuks2StorMashSecA) : that.temprBuks2StorMashSecA != null)
            return false;
        if (temprBuks2StorMashSecB != null ? !temprBuks2StorMashSecB.equals(that.temprBuks2StorMashSecB) : that.temprBuks2StorMashSecB != null)
            return false;
        if (temprBuks2StorPomMashSecA != null ? !temprBuks2StorPomMashSecA.equals(that.temprBuks2StorPomMashSecA) : that.temprBuks2StorPomMashSecA != null)
            return false;
        if (temprBuks2StorPomMashSecB != null ? !temprBuks2StorPomMashSecB.equals(that.temprBuks2StorPomMashSecB) : that.temprBuks2StorPomMashSecB != null)
            return false;
        if (temprBuks3StorMashSecA != null ? !temprBuks3StorMashSecA.equals(that.temprBuks3StorMashSecA) : that.temprBuks3StorMashSecA != null)
            return false;
        if (temprBuks3StorMashSecB != null ? !temprBuks3StorMashSecB.equals(that.temprBuks3StorMashSecB) : that.temprBuks3StorMashSecB != null)
            return false;
        if (temprBuks3StorPomMashSecA != null ? !temprBuks3StorPomMashSecA.equals(that.temprBuks3StorPomMashSecA) : that.temprBuks3StorPomMashSecA != null)
            return false;
        if (temprBuks3StorPomMashSecB != null ? !temprBuks3StorPomMashSecB.equals(that.temprBuks3StorPomMashSecB) : that.temprBuks3StorPomMashSecB != null)
            return false;
        if (temprBuks4StorMashSecA != null ? !temprBuks4StorMashSecA.equals(that.temprBuks4StorMashSecA) : that.temprBuks4StorMashSecA != null)
            return false;
        if (temprBuks4StorMashSecB != null ? !temprBuks4StorMashSecB.equals(that.temprBuks4StorMashSecB) : that.temprBuks4StorMashSecB != null)
            return false;
        if (temprBuks4StorPomMashSecA != null ? !temprBuks4StorPomMashSecA.equals(that.temprBuks4StorPomMashSecA) : that.temprBuks4StorPomMashSecA != null)
            return false;
        if (temprBuks4StorPomMashSecB != null ? !temprBuks4StorPomMashSecB.equals(that.temprBuks4StorPomMashSecB) : that.temprBuks4StorPomMashSecB != null)
            return false;
        if (temprVhodTedSecA1 != null ? !temprVhodTedSecA1.equals(that.temprVhodTedSecA1) : that.temprVhodTedSecA1 != null)
            return false;
        if (temprVhodTedSecA2 != null ? !temprVhodTedSecA2.equals(that.temprVhodTedSecA2) : that.temprVhodTedSecA2 != null)
            return false;
        if (temprVhodTedSecB1 != null ? !temprVhodTedSecB1.equals(that.temprVhodTedSecB1) : that.temprVhodTedSecB1 != null)
            return false;
        if (temprVhodTedSecB2 != null ? !temprVhodTedSecB2.equals(that.temprVhodTedSecB2) : that.temprVhodTedSecB2 != null)
            return false;
        if (temprVihodTed1SecA != null ? !temprVihodTed1SecA.equals(that.temprVihodTed1SecA) : that.temprVihodTed1SecA != null)
            return false;
        if (temprVihodTed1SecB != null ? !temprVihodTed1SecB.equals(that.temprVihodTed1SecB) : that.temprVihodTed1SecB != null)
            return false;
        if (temprVihodTed2SecA != null ? !temprVihodTed2SecA.equals(that.temprVihodTed2SecA) : that.temprVihodTed2SecA != null)
            return false;
        if (temprVihodTed2SecB != null ? !temprVihodTed2SecB.equals(that.temprVihodTed2SecB) : that.temprVihodTed2SecB != null)
            return false;
        if (temprVihodTed3SecA != null ? !temprVihodTed3SecA.equals(that.temprVihodTed3SecA) : that.temprVihodTed3SecA != null)
            return false;
        if (temprVihodTed3SecB != null ? !temprVihodTed3SecB.equals(that.temprVihodTed3SecB) : that.temprVihodTed3SecB != null)
            return false;
        if (temprVihodTed4SecA != null ? !temprVihodTed4SecA.equals(that.temprVihodTed4SecA) : that.temprVihodTed4SecA != null)
            return false;
        if (temprVihodTed4SecB != null ? !temprVihodTed4SecB.equals(that.temprVihodTed4SecB) : that.temprVihodTed4SecB != null)
            return false;
        if (tokAccumBatrSecA != null ? !tokAccumBatrSecA.equals(that.tokAccumBatrSecA) : that.tokAccumBatrSecA != null)
            return false;
        if (tokAccumBatrSecB != null ? !tokAccumBatrSecB.equals(that.tokAccumBatrSecB) : that.tokAccumBatrSecB != null)
            return false;
        if (tokVozTedSecA != null ? !tokVozTedSecA.equals(that.tokVozTedSecA) : that.tokVozTedSecA != null)
            return false;
        if (tokVozTedSecB != null ? !tokVozTedSecB.equals(that.tokVozTedSecB) : that.tokVozTedSecB != null)
            return false;
        if (tokYakTed12SecA != null ? !tokYakTed12SecA.equals(that.tokYakTed12SecA) : that.tokYakTed12SecA != null)
            return false;
        if (tokYakTed12SecB != null ? !tokYakTed12SecB.equals(that.tokYakTed12SecB) : that.tokYakTed12SecB != null)
            return false;
        if (tokYakTed34SecA != null ? !tokYakTed34SecA.equals(that.tokYakTed34SecA) : that.tokYakTed34SecA != null)
            return false;
        if (tokYakTed34SecB != null ? !tokYakTed34SecB.equals(that.tokYakTed34SecB) : that.tokYakTed34SecB != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idLocoData ^ (idLocoData >>> 32));
        result = 31 * result + (idLoco != null ? idLoco.hashCode() : 0);
        result = 31 * result + (recordTimeLocoData != null ? recordTimeLocoData.hashCode() : 0);
        result = 31 * result + (naprAccumBatrSecA != null ? naprAccumBatrSecA.hashCode() : 0);
        result = 31 * result + (naprAccumBatrSecB != null ? naprAccumBatrSecB.hashCode() : 0);
        result = 31 * result + (tokAccumBatrSecA != null ? tokAccumBatrSecA.hashCode() : 0);
        result = 31 * result + (tokAccumBatrSecB != null ? tokAccumBatrSecB.hashCode() : 0);
        result = 31 * result + (tokVozTedSecA != null ? tokVozTedSecA.hashCode() : 0);
        result = 31 * result + (tokVozTedSecB != null ? tokVozTedSecB.hashCode() : 0);
        result = 31 * result + (tokYakTed12SecA != null ? tokYakTed12SecA.hashCode() : 0);
        result = 31 * result + (tokYakTed12SecB != null ? tokYakTed12SecB.hashCode() : 0);
        result = 31 * result + (tokYakTed34SecA != null ? tokYakTed34SecA.hashCode() : 0);
        result = 31 * result + (tokYakTed34SecB != null ? tokYakTed34SecB.hashCode() : 0);
        result = 31 * result + (naprContSetSecA != null ? naprContSetSecA.hashCode() : 0);
        result = 31 * result + (naprContSetSecB != null ? naprContSetSecB.hashCode() : 0);
        result = 31 * result + (temprBuks1StorMashSecA != null ? temprBuks1StorMashSecA.hashCode() : 0);
        result = 31 * result + (temprBuks1StorPomMashSecA != null ? temprBuks1StorPomMashSecA.hashCode() : 0);
        result = 31 * result + (temprBuks2StorMashSecA != null ? temprBuks2StorMashSecA.hashCode() : 0);
        result = 31 * result + (temprBuks2StorPomMashSecA != null ? temprBuks2StorPomMashSecA.hashCode() : 0);
        result = 31 * result + (temprBuks3StorMashSecA != null ? temprBuks3StorMashSecA.hashCode() : 0);
        result = 31 * result + (temprBuks3StorPomMashSecA != null ? temprBuks3StorPomMashSecA.hashCode() : 0);
        result = 31 * result + (temprBuks4StorMashSecA != null ? temprBuks4StorMashSecA.hashCode() : 0);
        result = 31 * result + (temprBuks4StorPomMashSecA != null ? temprBuks4StorPomMashSecA.hashCode() : 0);
        result = 31 * result + (temprBuks4StorPomMashSecB != null ? temprBuks4StorPomMashSecB.hashCode() : 0);
        result = 31 * result + (temprBuks4StorMashSecB != null ? temprBuks4StorMashSecB.hashCode() : 0);
        result = 31 * result + (temprBuks3StorPomMashSecB != null ? temprBuks3StorPomMashSecB.hashCode() : 0);
        result = 31 * result + (temprBuks3StorMashSecB != null ? temprBuks3StorMashSecB.hashCode() : 0);
        result = 31 * result + (temprBuks2StorPomMashSecB != null ? temprBuks2StorPomMashSecB.hashCode() : 0);
        result = 31 * result + (temprBuks2StorMashSecB != null ? temprBuks2StorMashSecB.hashCode() : 0);
        result = 31 * result + (temprBuks1StorPomMashSecB != null ? temprBuks1StorPomMashSecB.hashCode() : 0);
        result = 31 * result + (temprBuks1StorMashSecB != null ? temprBuks1StorMashSecB.hashCode() : 0);
        result = 31 * result + (temprVhodTedSecA1 != null ? temprVhodTedSecA1.hashCode() : 0);
        result = 31 * result + (temprVhodTedSecA2 != null ? temprVhodTedSecA2.hashCode() : 0);
        result = 31 * result + (temprVhodTedSecB1 != null ? temprVhodTedSecB1.hashCode() : 0);
        result = 31 * result + (temprVhodTedSecB2 != null ? temprVhodTedSecB2.hashCode() : 0);
        result = 31 * result + (temprVihodTed1SecA != null ? temprVihodTed1SecA.hashCode() : 0);
        result = 31 * result + (temprVihodTed2SecA != null ? temprVihodTed2SecA.hashCode() : 0);
        result = 31 * result + (temprVihodTed3SecA != null ? temprVihodTed3SecA.hashCode() : 0);
        result = 31 * result + (temprVihodTed4SecA != null ? temprVihodTed4SecA.hashCode() : 0);
        result = 31 * result + (temprVihodTed1SecB != null ? temprVihodTed1SecB.hashCode() : 0);
        result = 31 * result + (temprVihodTed2SecB != null ? temprVihodTed2SecB.hashCode() : 0);
        result = 31 * result + (temprVihodTed3SecB != null ? temprVihodTed3SecB.hashCode() : 0);
        result = 31 * result + (temprVihodTed4SecB != null ? temprVihodTed4SecB.hashCode() : 0);
        result = 31 * result + (temprBptr1SecA != null ? temprBptr1SecA.hashCode() : 0);
        result = 31 * result + (temprBptr2SecA != null ? temprBptr2SecA.hashCode() : 0);
        result = 31 * result + (temprBptr1SecB != null ? temprBptr1SecB.hashCode() : 0);
        result = 31 * result + (temprBptr2SecB != null ? temprBptr2SecB.hashCode() : 0);
        return result;
    }
}
