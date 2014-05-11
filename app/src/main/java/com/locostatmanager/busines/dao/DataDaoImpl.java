package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.LocoDataEntity;
import com.locostatmanager.busines.dao.entities.LocoEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
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
    public void add(LocoDataEntity entity) throws DataAccessException {

        try {
            getJdbcTemplate().update("INSERT INTO LOCO_DATA "
                    + "(ID_LOCO_DATA,"
                    + "ID_LOCO,"
                    + "RECORD_TIME_LOCO_DATA,"
                    + "NAPR_ACCUM_BATR_SEC_A,"
                    + "NAPR_ACCUM_BATR_SEC_B,"
                    + "TOK_ACCUM_BATR_SEC_A,"
                    + "TOK_ACCUM_BATR_SEC_B,"
                    + "TOK_VOZ_TED_SEC_A,"
                    + "TOK_VOZ_TED_SEC_B,"
                    + "TOK_YAK_TED12_SEC_A,"
                    + "TOK_YAK_TED12_SEC_B,"
                    + "TOK_YAK_TED34_SEC_A,"
                    + "TOK_YAK_TED34_SEC_B,"
                    + "NAPR_CONT_SET_SEC_A,"
                    + "NAPR_CONT_SET_SEC_B,"
                    + "TEMPR_BUKS1_STOR_MASH_SEC_A,"
                    + "TEMPR_BUKS1_STOR_POM_MASH_SEC_A,"
                    + "TEMPR_BUKS2_STOR_MASH_SEC_A,"
                    + "TEMPR_BUKS2_STOR_POM_MASH_SEC_A,"
                    + "TEMPR_BUKS3_STOR_MASH_SEC_A,"
                    + "TEMPR_BUKS3_STOR_POM_MASH_SEC_A,"
                    + "TEMPR_BUKS4_STOR_MASH_SEC_A,"
                    + "TEMPR_BUKS4_STOR_POM_MASH_SEC_A,"
                    + "TEMPR_BUKS4_STOR_POM_MASH_SEC_B,"
                    + "TEMPR_BUKS4_STOR_MASH_SEC_B,"
                    + "TEMPR_BUKS3_STOR_POM_MASH_SEC_B,"
                    + "TEMPR_BUKS3_STOR_MASH_SEC_B,"
                    + "TEMPR_BUKS2_STOR_POM_MASH_SEC_B,"
                    + "TEMPR_BUKS2_STOR_MASH_SEC_B,"
                    + "TEMPR_BUKS1_STOR_POM_MASH_SEC_B,"
                    + "TEMPR_BUKS1_STOR_MASH_SEC_B,"
                    + "TEMPR_VHOD_TED_SEC_A1,"
                    + "TEMPR_VHOD_TED_SEC_A2,"
                    + "TEMPR_VHOD_TED_SEC_B1,"
                    + "TEMPR_VHOD_TED_SEC_B2,"
                    + "TEMPR_VIHOD_TED1_SEC_A,"
                    + "TEMPR_VIHOD_TED2_SEC_A,"
                    + "TEMPR_VIHOD_TED3_SEC_A,"
                    + "TEMPR_VIHOD_TED4_SEC_A,"
                    + "TEMPR_VIHOD_TED1_SEC_B,"
                    + "TEMPR_VIHOD_TED2_SEC_B,"
                    + "TEMPR_VIHOD_TED3_SEC_B,"
                    + "TEMPR_VIHOD_TED4_SEC_B,"
                    + "TEMPR_BPTR1_SEC_A,"
                    + "TEMPR_BPTR2_SEC_A,"
                    + "TEMPR_BPTR1_SEC_B,"
                    + "TEMPR_BPTR2_SEC_B) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                    new Object[]{
                        entity.getIdLocoData(),
                        entity.getIdLoco(),
                        entity.getRecordTimeLocoData(),
                        entity.getNaprAccumBatrSecA(),
                        entity.getNaprAccumBatrSecB(),
                        entity.getTokAccumBatrSecA(),
                        entity.getTokAccumBatrSecB(),
                        entity.getTokVozTedSecA(),
                        entity.getTokVozTedSecB(),
                        entity.getTokYakTed12SecA(),
                        entity.getTokYakTed12SecB(),
                        entity.getTokYakTed34SecA(),
                        entity.getTokYakTed34SecB(),
                        entity.getNaprContSetSecB(),
                        entity.getTemprBuks1StorMashSecA(),
                        entity.getTemprBuks1StorPomMashSecA(),
                        entity.getTemprBuks2StorMashSecA(),
                        entity.getTemprBuks2StorPomMashSecA(),
                        entity.getTemprBuks3StorMashSecA(),
                        entity.getTemprBuks3StorPomMashSecA(),
                        entity.getTemprBuks4StorMashSecA(),
                        entity.getTemprBuks4StorPomMashSecA(),
                        entity.getTemprBuks4StorPomMashSecB(),
                        entity.getTemprBuks4StorMashSecB(),
                        entity.getTemprBuks3StorPomMashSecB(),
                        entity.getTemprBuks3StorMashSecB(),
                        entity.getTemprBuks2StorPomMashSecB(),
                        entity.getTemprBuks2StorMashSecB(),
                        entity.getTemprBuks1StorPomMashSecB(),
                        entity.getTemprBuks1StorMashSecB(),
                        entity.getTemprVhodTedSecA1(),
                        entity.getTemprVhodTedSecA2(),
                        entity.getTemprVhodTedSecB1(),
                        entity.getTemprVhodTedSecB2(),
                        entity.getTemprVihodTed1SecA(),
                        entity.getTemprVihodTed2SecA(),
                        entity.getTemprVihodTed3SecA(),
                        entity.getTemprVihodTed4SecA(),
                        entity.getTemprVihodTed1SecB(),
                        entity.getTemprVihodTed2SecB(),
                        entity.getTemprVihodTed3SecB(),
                        entity.getTemprVihodTed4SecB(),
                        entity.getTemprBptr1SecA(),
                        entity.getTemprBptr2SecA(),
                        entity.getTemprBptr1SecB(),
                        entity.getTemprBptr2SecB()}
            );
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<LocoDataEntity> getAll() throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA", new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<LocoDataEntity> getAfter(Timestamp date) throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ?",
                    new Object[]{date},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<LocoDataEntity> getBefore(Timestamp date) throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA < ?",
                    new Object[]{date},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate) throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ? AND RECORD_TIME_LOCO_DATA < ?",
                    new Object[]{startDate, endDate},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<LocoDataEntity> getAfter(Timestamp date, LocoEntity entity) throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ? AND ID_LOCO = ?",
                    new Object[]{date, entity.getIdLoco()},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<LocoDataEntity> getBefore(Timestamp date, LocoEntity entity) throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA < ? AND ID_LOCO = ?",
                    new Object[]{date, entity.getIdLoco()},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<LocoDataEntity> getBetween(Timestamp startDate, Timestamp endDate, LocoEntity entity) throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ? AND RECORD_TIME_LOCO_DATA < ? AND ID_LOCO = ?",
                    new Object[]{startDate, endDate, entity.getIdLoco()},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public List<LocoDataEntity> getByLocomotive(LocoEntity entity) throws DataAccessException {

        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE ID_LOCO = ?",
                    new Object[]{entity.getIdLoco()},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public LocoDataEntity getById(String id) throws DataAccessException {

        try {
            return getJdbcTemplate().queryForObject("SELECT * FROM LOCO_DATA WHERE ID_LOCO_DATA = ?",
                    new Object[]{id},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }

    }

    public List<LocoDataEntity> getBetween(String startDate, String endDate, String locomotiveId) throws DataAccessException {
        try {
            return getJdbcTemplate().query("SELECT * FROM LOCO_DATA WHERE RECORD_TIME_LOCO_DATA > ? AND RECORD_TIME_LOCO_DATA < ? AND ID_LOCO = ?",
                    new Object[]{startDate, endDate, locomotiveId},
                    new LocoDataRowMapper());
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public String getRecordsCount(String LocoId) throws DataAccessException {
        try {
            return getJdbcTemplate().queryForObject("SELECT COUNT(*) FROM LOCO_DATA WHERE ID_LOCO = ?", String.class, new Object[]{LocoId});
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
    }

    public String getCount() throws DataAccessException {
        try {
            return getJdbcTemplate().queryForObject("SELECT COUNT(*) FROM LOCO_DATA", String.class);
        } catch (Exception e) {
            throw new DataAccessException(e);
        }
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
