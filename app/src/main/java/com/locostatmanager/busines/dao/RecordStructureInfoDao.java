package com.locostatmanager.busines.dao;

import com.locostatmanager.busines.dao.entities.RecordStructureInfo;
import java.util.List;

/**
 *
 * @author dmitry
 */
public interface RecordStructureInfoDao {
    List<RecordStructureInfo> getByFsiId(String fsiId);
}
