package com.locostatmanager.busines.dao.entities;



/**
 * Created by anatoliy on 22.04.14.
 */

public class LocoEntity {
    private String idLoco;
    private String titleLoco;


    public String getIdLoco() {
        return idLoco;
    }

    public void setIdLoco(String idLoco) {
        this.idLoco = idLoco;
    }


    public String getTitleLoco() {
        return titleLoco;
    }

    public void setTitleLoco(String titleLoco) {
        this.titleLoco = titleLoco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocoEntity that = (LocoEntity) o;

        if (idLoco != null ? !idLoco.equals(that.idLoco) : that.idLoco != null) return false;
        if (titleLoco != null ? !titleLoco.equals(that.titleLoco) : that.titleLoco != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLoco != null ? idLoco.hashCode() : 0;
        result = 31 * result + (titleLoco != null ? titleLoco.hashCode() : 0);
        return result;
    }
}
