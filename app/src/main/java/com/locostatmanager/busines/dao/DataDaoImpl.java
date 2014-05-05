package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author dmitry
 */
public class DataDaoImpl extends JdbcDaoSupport implements DataDao {

    @Override
    public void add(LocoDataEntity entity) {
//               getJdbcTemplate().update("INSERT INTO LOCO (ID_LOCO, TITLE_LOCO) VALUES (?,?)",
//                new Object[]{entity.getIdLoco(), entity.getTitleLoco()});
    }

    @Override
    public List<LocoDataEntity> getAll() {

        return getJdbcTemplate().query("SELECT * FROM LOCO_DATA", new LocoDataRowMapper());
    }

    @Override
    public List<LocoDataEntity> getAfter(Timestamp date) {

        return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ?",
                new Object[]{date},
                new LocoDataRowMapper());
    }

    @Override
    public List<LocoDataEntity> getBefore(Timestamp date) {

        return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA < ?",
                new Object[]{date},
                new LocoDataRowMapper());
    }

    @Override
    public List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate) {

        return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ? AND RECORD_TIME_LOCO_DATA < ?",
                new Object[]{startDate, endDate},
                new LocoDataRowMapper());
    }

    @Override
    public List<LocoDataEntity> getAfter(Timestamp date, LocoEntity entity) {

        return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ? AND ID_LOCO = ?",
                new Object[]{date, entity.getIdLoco()},
                new LocoDataRowMapper());
    }

    @Override
    public List<LocoDataEntity> getBefore(Timestamp date, LocoEntity entity) {

        return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA < ? AND ID_LOCO = ?",
                new Object[]{date, entity.getIdLoco()},
                new LocoDataRowMapper());
    }

    @Override
    public List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate, LocoEntity entity) {

        return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ? AND RECORD_TIME_LOCO_DATA < ? AND ID_LOCO = ?",
                new Object[]{startDate, endDate, entity.getIdLoco()},
                new LocoDataRowMapper());
    }

    @Override
    public List<LocoDataEntity> getByLocomotive(LocoEntity entity) {

        return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE ID_LOCO = ?",
                new Object[]{entity.getIdLoco()},
                new LocoDataRowMapper());
    }

    public LocoDataEntity getById(String id) {

        return getJdbcTemplate().queryForObject("SELECT * FROM LOCO_DATA WHERE ID_LOCO_DATA = ?",
                new Object[]{id},
                new LocoDataRowMapper());
    }

    private class LocoDataRowMapper implements RowMapper<LocoDataEntity> {

        public LocoDataEntity mapRow(ResultSet rs, int i) throws SQLException {

            LocoDataEntity dataEntity = new LocoDataEntity();
            dataEntity.setIdLocoData(rs.getLong("ID_LOCO_DATA"));
            dataEntity.setIdLoco(rs.getString("ID_LOCO"));
            dataEntity.setRecordTimeLocoData(rs.getTimestamp("RECORD_TIME_LOCO_DATA"));
            dataEntity.setNaprAccumBatrSecA(rs.getByte("NAPR_ACCUM_BATR_SEC_A"));
            dataEntity.setNaprAccumBatrSecB(rs.getByte("NAPR_ACCUM_BATR_SEC_B"));
            dataEntity.setTokAccumBatrSecA(rs.getByte("TOK_ACCUM_BATR_SEC_A"));
            dataEntity.setTokAccumBatrSecB(rs.getByte("TOK_ACCUM_BATR_SEC_B"));
            dataEntity.setTokVozTedSecA(rs.getShort("TOK_VOZ_TED_SEC_A"));
            dataEntity.setTokVozTedSecB(rs.getShort("TOK_VOZ_TED_SEC_B"));
            dataEntity.setTokYakTed12SecA(rs.getShort("TOK_YAK_TED12_SEC_A"));
            dataEntity.setTokYakTed12SecB(rs.getShort("TOK_YAK_TED12_SEC_B"));
            dataEntity.setTokYakTed34SecA(rs.getShort("TOK_YAK_TED34_SEC_A"));
            dataEntity.setTokYakTed34SecB(rs.getShort("TOK_YAK_TED34_SEC_B"));
            dataEntity.setNaprContSetSecA(rs.getShort("NAPR_CONT_SET_SEC_A"));
            dataEntity.setNaprContSetSecB(rs.getShort("NAPR_CONT_SET_SEC_B"));
            dataEntity.setTemprBuks1StorMashSecA(rs.getByte("TEMPR_BUKS1_STOR_MASH_SEC_A"));
            dataEntity.setTemprBuks1StorPomMashSecA(rs.getByte("TEMPR_BUKS1_STOR_POM_MASH_SEC_A"));
            dataEntity.setTemprBuks2StorMashSecA(rs.getByte("TEMPR_BUKS2_STOR_MASH_SEC_A"));
            dataEntity.setTemprBuks2StorPomMashSecA(rs.getByte("TEMPR_BUKS2_STOR_POM_MASH_SEC_A"));
            dataEntity.setTemprBuks3StorMashSecA(rs.getByte("TEMPR_BUKS3_STOR_MASH_SEC_A"));
            dataEntity.setTemprBuks3StorPomMashSecA(rs.getByte("TEMPR_BUKS3_STOR_POM_MASH_SEC_A"));
            dataEntity.setTemprBuks4StorMashSecA(rs.getByte("TEMPR_BUKS4_STOR_MASH_SEC_A"));
            dataEntity.setTemprBuks4StorPomMashSecA(rs.getByte("TEMPR_BUKS4_STOR_POM_MASH_SEC_A"));
            dataEntity.setTemprBuks4StorPomMashSecB(rs.getByte("TEMPR_BUKS4_STOR_POM_MASH_SEC_B"));
            dataEntity.setTemprBuks4StorMashSecB(rs.getByte("TEMPR_BUKS4_STOR_MASH_SEC_B"));
            dataEntity.setTemprBuks3StorPomMashSecB(rs.getByte("TEMPR_BUKS3_STOR_POM_MASH_SEC_B"));
            dataEntity.setTemprBuks3StorMashSecB(rs.getByte("TEMPR_BUKS3_STOR_MASH_SEC_B"));
            dataEntity.setTemprBuks2StorPomMashSecB(rs.getByte("TEMPR_BUKS2_STOR_POM_MASH_SEC_B"));
            dataEntity.setTemprBuks2StorMashSecB(rs.getByte("TEMPR_BUKS2_STOR_MASH_SEC_B"));
            dataEntity.setTemprBuks1StorPomMashSecB(rs.getByte("TEMPR_BUKS1_STOR_POM_MASH_SEC_B"));
            dataEntity.setTemprBuks1StorMashSecB(rs.getByte("TEMPR_BUKS1_STOR_MASH_SEC_B"));
            dataEntity.setTemprVhodTedSecA1(rs.getByte("TEMPR_VHOD_TED_SEC_A1"));
            dataEntity.setTemprVhodTedSecA2(rs.getByte("TEMPR_VHOD_TED_SEC_A2"));
            dataEntity.setTemprVhodTedSecB1(rs.getByte("TEMPR_VHOD_TED_SEC_B1"));
            dataEntity.setTemprVhodTedSecB2(rs.getByte("TEMPR_VHOD_TED_SEC_B2"));
            dataEntity.setTemprVihodTed1SecA(rs.getByte("TEMPR_VIHOD_TED1_SEC_A"));
            dataEntity.setTemprVihodTed2SecA(rs.getByte("TEMPR_VIHOD_TED2_SEC_A"));
            dataEntity.setTemprVihodTed3SecA(rs.getByte("TEMPR_VIHOD_TED3_SEC_A"));
            dataEntity.setTemprVihodTed4SecA(rs.getByte("TEMPR_VIHOD_TED4_SEC_A"));
            dataEntity.setTemprVihodTed1SecB(rs.getByte("TEMPR_VIHOD_TED1_SEC_B"));
            dataEntity.setTemprVihodTed2SecB(rs.getByte("TEMPR_VIHOD_TED2_SEC_B"));
            dataEntity.setTemprVihodTed3SecB(rs.getByte("TEMPR_VIHOD_TED3_SEC_B"));
            dataEntity.setTemprVihodTed4SecB(rs.getByte("TEMPR_VIHOD_TED4_SEC_B"));
            dataEntity.setTemprBptr1SecA(rs.getShort("TEMPR_BPTR1_SEC_A"));
            dataEntity.setTemprBptr2SecA(rs.getShort("TEMPR_BPTR2_SEC_A"));
            dataEntity.setTemprBptr1SecB(rs.getShort("TEMPR_BPTR1_SEC_B"));
            dataEntity.setTemprBptr2SecB(rs.getShort("TEMPR_BPTR2_SEC_B"));
            return dataEntity;
        }
    }
}
